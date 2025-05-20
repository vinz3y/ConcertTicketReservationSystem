package com.concert.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class TicketService {
    public static void main(String[] args) throws Exception {
        int port = 50051;
        Server server = ServerBuilder.forPort(port)
                .addService(new TicketServiceImpl())
                .build();

        System.out.println("Server started on port " + port);
        server.start();
        server.awaitTermination();
    }
}
