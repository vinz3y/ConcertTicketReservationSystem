package com.concert.server;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;

import io.grpc.stub.StreamObserver;
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
        Concert concert = concerts.get(request.getConcertId());
        if (concert == null) {
            responseObserver.onNext(BookingResponse.newBuilder()
                .setSuccess(false)
                .setMessage("Concert not found!")
                .build());
            responseObserver.onCompleted();
            return;
        }

        // Demo: always succeed and generate booking (you may want to add logic for seat/after party count)
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

        // Replication logic for booking (optional, if needed, similar to concert replication)
        // if (!request.getIsReplication()) { ... replicate to peers ... }

        responseObserver.onNext(BookingResponse.newBuilder()
            .setSuccess(true)
            .setTicketId(bookingId)
            .setMessage("Ticket booked!")
            .build());
        responseObserver.onCompleted();
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
