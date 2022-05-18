package com.demo.grpc.service;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class DemoServer {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.out.println("starting server");
		Server server = ServerBuilder.forPort(8086).addService(new Demo_Service()).build();
		
		server.start();
		
		System.out.println("server started on port:"+server.getPort());
		
		server.awaitTermination();
	}

}
