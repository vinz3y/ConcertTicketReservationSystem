package com.concert.server;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import io.grpc.stub.StreamObserver;
import ticketing.*; // Import your generated gRPC/model classes


public class TicketServiceImpl extends TicketServiceGrpc.TicketServiceImplBase {

	private final ConcurrentHashMap<String, Concert> concerts = new ConcurrentHashMap<>();
    private final AtomicInteger ticketIdGenerator = new AtomicInteger(1000);
    
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
        // Find concert
        Concert concert = concerts.get(request.getConcertId());
        if (concert == null) {
            responseObserver.onNext(BookingResponse.newBuilder()
                .setSuccess(false)
                .setMessage("Concert not found!")
                .build());
            responseObserver.onCompleted();
            return;
        }
        synchronized (concert) {
            String ticketId = "T" + ticketIdGenerator.incrementAndGet();
            responseObserver.onNext(BookingResponse.newBuilder()
                .setSuccess(true)
                .setTicketId(ticketId)
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
    }
}
