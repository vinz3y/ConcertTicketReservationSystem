package com.concert.server;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;

import io.grpc.stub.StreamObserver;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ticketing.*; // Import your generated gRPC/model classes


public class TicketServiceImpl extends TicketServiceGrpc.TicketServiceImplBase {

	private final ConcurrentHashMap<String, Concert> concerts;
    private final AtomicInteger ticketIdGenerator = new AtomicInteger(1000);
    private final ConcurrentHashMap<String, Booking> bookings ;
    private final List<String> peerAddresses;
    
    public TicketServiceImpl(List<String> peerAddresses, ConcurrentHashMap<String, Concert> concerts, ConcurrentHashMap<String, Booking> bookings) {
        this.peerAddresses = peerAddresses;
        this.concerts = concerts;
        this.bookings = bookings;
    }
    
    @Override
    public void addConcert(AddConcertRequest request, StreamObserver<ConcertResponse> responseObserver) {
    	
    	if (!request.getIsReplication()) {
            replicateAddConcertToPeers(request);
        }
    	
        // Build a Concert object from the request
        Concert concert = Concert.newBuilder()
                .setConcertId(request.getConcertId())
                .setTitle(request.getTitle())
                .addAllTiers(request.getSeatTiersList())
                .setAfterPartyRemaining(request.getAfterPartyTickets())
                .build();
        // Add to the map
        concerts.put(request.getConcertId(), concert);

        ConcertResponse response = ConcertResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Concert added: " + request.getTitle())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
    private void replicateAddConcertToPeers(AddConcertRequest request) {
        for (String peer : peerAddresses) {
            try {
                ManagedChannel channel = ManagedChannelBuilder.forTarget(peer).usePlaintext().build();
                TicketServiceGrpc.TicketServiceBlockingStub stub = TicketServiceGrpc.newBlockingStub(channel);
                // Set replication flag to true
                AddConcertRequest replicated = request.toBuilder().setIsReplication(true).build();
                stub.addConcert(replicated);
                channel.shutdown();
            } catch (Exception e) {
                System.err.println("Replication to " + peer + " failed: " + e.getMessage());
            }
        }
    }
    
    private void replicateBookingToPeers(BookRequest request) {
        for (String peer : peerAddresses) {
            try {
                ManagedChannel channel = ManagedChannelBuilder.forTarget(peer).usePlaintext().build();
                TicketServiceGrpc.TicketServiceBlockingStub stub = TicketServiceGrpc.newBlockingStub(channel);
                BookRequest replicated = request.toBuilder().setIsReplication(true).build();
                stub.bookTicket(replicated);
                channel.shutdown();
            } catch (Exception e) {
                System.err.println("Replication to " + peer + " failed: " + e.getMessage());
            }
        }
    }

    @Override
    public void updateConcert(UpdateConcertRequest request, StreamObserver<ConcertResponse> responseObserver) {
        Concert existing = concerts.get(request.getConcertId());
        if (existing == null) {
            responseObserver.onNext(ConcertResponse.newBuilder()
                .setSuccess(false)
                .setMessage("Concert not found!")
                .build());
            responseObserver.onCompleted();
            return;
        }
        // Update concert fields
        Concert updated = existing.toBuilder()
                .clearTiers().addAllTiers(request.getSeatTiersList())
                .setAfterPartyRemaining(request.getAfterPartyTickets())
                .build();
        concerts.put(request.getConcertId(), updated);
        responseObserver.onNext(ConcertResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Concert updated")
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void bookTicket(BookRequest request, StreamObserver<BookingResponse> responseObserver) {
        
        if (!request.getIsReplication()) {
            replicateBookingToPeers(request);
        }

        synchronized (concerts) {
            Concert concert = concerts.get(request.getConcertId());
            if (concert == null) {
                responseObserver.onNext(BookingResponse.newBuilder()
                    .setSuccess(false)
                    .setMessage("Concert not found!")
                    .build());
                responseObserver.onCompleted();
                return;
            }

            // Check seat availability and after-party availability
            int tierIndex = -1;
            for (int i = 0; i < concert.getTiersCount(); i++) {
                if (concert.getTiers(i).getName().equals(request.getSeatType())) {
                    tierIndex = i;
                    break;
                }
            }
            if (tierIndex == -1 || concert.getTiers(tierIndex).getQuantity() < request.getQuantity()) {
                responseObserver.onNext(BookingResponse.newBuilder()
                    .setSuccess(false)
                    .setMessage("Not enough seats available!")
                    .build());
                responseObserver.onCompleted();
                return;
            }
            if (request.getWantsAfterParty() && concert.getAfterPartyRemaining() < request.getQuantity()) {
                responseObserver.onNext(BookingResponse.newBuilder()
                    .setSuccess(false)
                    .setMessage("Not enough after-party tickets available!")
                    .build());
                responseObserver.onCompleted();
                return;
            }

            // All checks passed; now update quantities
            Concert.Builder concertBuilder = concert.toBuilder();
            SeatTier.Builder tierBuilder = concert.getTiers(tierIndex).toBuilder();
            tierBuilder.setQuantity(tierBuilder.getQuantity() - request.getQuantity());
            concertBuilder.setTiers(tierIndex, tierBuilder);

            if (request.getWantsAfterParty()) {
                concertBuilder.setAfterPartyRemaining(concert.getAfterPartyRemaining() - request.getQuantity());
            }
            Concert updatedConcert = concertBuilder.build();
            concerts.put(request.getConcertId(), updatedConcert);

            String bookingId = "B" + System.currentTimeMillis();
            Booking booking = Booking.newBuilder()
                .setBookingId(bookingId)
                .setUserId(request.getUserId())
                .setConcertId(request.getConcertId())
                .setSeatType(request.getSeatType())
                .setQuantity(request.getQuantity())
                .setAfterParty(request.getWantsAfterParty())
                .build();
            bookings.put(bookingId, booking);

            responseObserver.onNext(BookingResponse.newBuilder()
                .setSuccess(true)
                .setTicketId(bookingId)
                .setMessage("Ticket booked!")
                .build());
            responseObserver.onCompleted();
        }
    }


    @Override
    public void getConcerts(Empty request, StreamObserver<ConcertList> responseObserver) {
        ConcertList.Builder builder = ConcertList.newBuilder();
        builder.addAllConcerts(concerts.values());
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    };
    
    @Override
    public void syncState(ticketing.Empty request, io.grpc.stub.StreamObserver<ticketing.FullState> responseObserver) {
        FullState.Builder builder = FullState.newBuilder();
        builder.addAllConcerts(concerts.values());
        builder.addAllBookings(bookings.values());
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
    
}
