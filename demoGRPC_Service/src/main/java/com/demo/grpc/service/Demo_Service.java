package com.demo.grpc.service;

import com.demo.grpc.demoRequest;
import com.demo.grpc.demoResponse;
import com.demo.grpc.demoServiceGrpc.demoServiceImplBase;
import com.mysql.operations.DB_Operations;

import io.grpc.stub.StreamObserver;

public class Demo_Service extends demoServiceImplBase {
	
	DB_Operations db_Operations = new DB_Operations();

	@Override
	public void demoInsert(demoRequest request, StreamObserver<demoResponse> responseObserver) {
		
		demoResponse.Builder response = demoResponse.newBuilder();
		
		int rowsAffected = db_Operations.insertInDB(request.getId(), request.getLabel());
		
		if(rowsAffected > 0) {
			
			response.setErrorCode(0).setErrorMessage("successfully inserted");
		} else {
			response.setErrorCode(1).setErrorMessage("insertion failed");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}

	
}
