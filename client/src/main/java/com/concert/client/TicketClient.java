package com.concert.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ticketing.*;

public class TicketClient {
    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";
        int port = args.length > 1 ? Integer.parseInt(args[1]) : 50051;
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
            .usePlaintext()
            .build();
        TicketServiceGrpc.TicketServiceBlockingStub stub = TicketServiceGrpc.newBlockingStub(channel);

        // Add two concerts
        AddConcertRequest addConcert1 = AddConcertRequest.newBuilder()
                .setConcertId("concert-001")
                .setTitle("Rock Night")
                .addSeatTiers(SeatTier.newBuilder().setName("Regular").setQuantity(50).setPrice(1000).build())
                .addSeatTiers(SeatTier.newBuilder().setName("VIP").setQuantity(10).setPrice(3000).build())
                .setAfterPartyTickets(10)
                .build();
        ConcertResponse resp1 = stub.addConcert(addConcert1);
        System.out.println("Add concert 1: " + resp1.getMessage());

        AddConcertRequest addConcert2 = AddConcertRequest.newBuilder()
                .setConcertId("concert-002")
                .setTitle("Jazz Evening")
                .addSeatTiers(SeatTier.newBuilder().setName("Regular").setQuantity(100).setPrice(1500).build())
                .addSeatTiers(SeatTier.newBuilder().setName("VIP").setQuantity(20).setPrice(3500).build())
                .setAfterPartyTickets(15)
                .build();
        ConcertResponse resp2 = stub.addConcert(addConcert2);
        System.out.println("Add concert 2: " + resp2.getMessage());

        // Book a ticket (with after-party, atomic combo)
        BookRequest comboBooking = BookRequest.newBuilder()
                .setConcertId("concert-001")
                .setUserId("user1")
                .setSeatType("VIP")
                .setQuantity(1)
                .setWantsAfterParty(true)
                .build();
        BookingResponse comboResp = stub.bookTicket(comboBooking);
        System.out.println("Booking combo: " + comboResp.getMessage());

        // Try to overbook after-party tickets (simulate atomicity failure)
        for (int i = 0; i < 15; i++) {
            BookRequest overbook = BookRequest.newBuilder()
                    .setConcertId("concert-001")
                    .setUserId("user" + (i+2))
                    .setSeatType("VIP")
                    .setQuantity(1)
                    .setWantsAfterParty(true)
                    .build();
            BookingResponse overbookResp = stub.bookTicket(overbook);
            System.out.println("Overbook attempt " + (i+1) + ": " + overbookResp.getMessage());
        }

        // Update concert seat tier quantity (Clerk: add more VIP seats)
        UpdateConcertRequest updateReq = UpdateConcertRequest.newBuilder()
                .setConcertId("concert-001")
                .addSeatTiers(SeatTier.newBuilder().setName("Regular").setQuantity(50).setPrice(1000).build())
                .addSeatTiers(SeatTier.newBuilder().setName("VIP").setQuantity(20).setPrice(3000).build()) // Add more VIP seats
                .setAfterPartyTickets(10)
                .build();
        ConcertResponse updateResp = stub.updateConcert(updateReq);
        System.out.println("Concert updated: " + updateResp.getMessage());

        // Book bulk tickets (Coordinator)
        BookRequest bulkBooking = BookRequest.newBuilder()
                .setConcertId("concert-001")
                .setUserId("group1")
                .setSeatType("Regular")
                .setQuantity(10)
                .setWantsAfterParty(true)
                .build();
        BookingResponse bulkResp = stub.bookTicket(bulkBooking);
        System.out.println("Bulk booking: " + bulkResp.getMessage());

        // List all concerts (on this node)
        ConcertList concerts = stub.getConcerts(Empty.newBuilder().build());
        System.out.println("All concerts: " + concerts.getConcertsList());

        channel.shutdown();
    }
}
