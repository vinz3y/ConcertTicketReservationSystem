package com.concert.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ticketing.*;

public class TicketClient {
	public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
            .usePlaintext()
            .build();

        TicketServiceGrpc.TicketServiceBlockingStub stub = TicketServiceGrpc.newBlockingStub(channel);

        //Add a concert
        AddConcertRequest addConcertReq = AddConcertRequest.newBuilder()
                .setConcertId("concert-001")
                .setTitle("Rock Night")
                .addSeatTiers(SeatTier.newBuilder().setName("Regular").setQuantity(50).setPrice(1000).build())
                .addSeatTiers(SeatTier.newBuilder().setName("VIP").setQuantity(10).setPrice(3000).build())
                .setAfterPartyTickets(10)
                .build();

        ConcertResponse addConcertResp = stub.addConcert(addConcertReq);
        System.out.println("Add concert: " + addConcertResp.getMessage());

        //Book a ticket (combo)
        BookRequest bookReq = BookRequest.newBuilder()
                .setConcertId("concert-001")
                .setUserId("user1")
                .setSeatType("VIP")
                .setQuantity(1)
                .setWantsAfterParty(true)
                .build();

        BookingResponse bookingResp = stub.bookTicket(bookReq);
        System.out.println("Booking: " + bookingResp.getMessage());

        //List concerts
        ConcertList concerts = stub.getConcerts(Empty.newBuilder().build());
        System.out.println("All concerts: " + concerts.getConcertsList());

        channel.shutdown();
    }
}
