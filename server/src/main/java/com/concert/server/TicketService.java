package com.concert.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ticketing.*;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class TicketService {
    public static void main(String[] args) throws Exception {
        int port = 50051;
     // Allow port override from command line
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        }

        //Other nodes
        List<String> peerList = Arrays.asList(args).subList(1, args.length); 

        //State Maps
        ConcurrentHashMap<String, Concert> concerts = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, Booking> bookings = new ConcurrentHashMap<>();

        if (!peerList.isEmpty()) {
            boolean synced = false;
            for (String peer : peerList) {
                try {
                    ManagedChannel channel = ManagedChannelBuilder.forTarget(peer).usePlaintext().build();
                    TicketServiceGrpc.TicketServiceBlockingStub stub = TicketServiceGrpc.newBlockingStub(channel);
                    FullState state = stub.syncState(Empty.newBuilder().build());
                    for (Concert c : state.getConcertsList()) {
                        concerts.put(c.getConcertId(), c);
                    }
                    for (Booking b : state.getBookingsList()) {
                        bookings.put(b.getBookingId(), b);
                    }
                    channel.shutdown();
                    System.out.println("State synchronized from peer: " + peer);
                    synced = true;
                    break; 
                } catch (Exception e) {
                    System.err.println("Could not sync state from peer " + peer + ": " + e.getMessage());
                }
            }
            if (!synced) {
                System.err.println("Could not sync from any peer. Starting with empty state.");
            }
        } else {
            System.out.println("No peers provided. This is the first node, starting with empty state.");
        }

        //Pass the peer list, concerts, and bookings to your service implementation
        TicketServiceImpl service = new TicketServiceImpl(peerList, concerts, bookings);

        //Start the gRPC server as usual
        Server server = ServerBuilder.forPort(port)
                .addService(service)
                .build();

        System.out.println("Server started on port " + port);
        server.start();
        server.awaitTermination();
    }
}
