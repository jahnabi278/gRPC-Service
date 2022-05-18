package com.demo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: demo.proto")
public final class demoServiceGrpc {

  private demoServiceGrpc() {}

  public static final String SERVICE_NAME = "demoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.demo.grpc.demoRequest,
      com.demo.grpc.demoResponse> getDemoInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "demoInsert",
      requestType = com.demo.grpc.demoRequest.class,
      responseType = com.demo.grpc.demoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demo.grpc.demoRequest,
      com.demo.grpc.demoResponse> getDemoInsertMethod() {
    io.grpc.MethodDescriptor<com.demo.grpc.demoRequest, com.demo.grpc.demoResponse> getDemoInsertMethod;
    if ((getDemoInsertMethod = demoServiceGrpc.getDemoInsertMethod) == null) {
      synchronized (demoServiceGrpc.class) {
        if ((getDemoInsertMethod = demoServiceGrpc.getDemoInsertMethod) == null) {
          demoServiceGrpc.getDemoInsertMethod = getDemoInsertMethod =
              io.grpc.MethodDescriptor.<com.demo.grpc.demoRequest, com.demo.grpc.demoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "demoInsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.grpc.demoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.grpc.demoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new demoServiceMethodDescriptorSupplier("demoInsert"))
              .build();
        }
      }
    }
    return getDemoInsertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static demoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<demoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<demoServiceStub>() {
        @java.lang.Override
        public demoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new demoServiceStub(channel, callOptions);
        }
      };
    return demoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static demoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<demoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<demoServiceBlockingStub>() {
        @java.lang.Override
        public demoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new demoServiceBlockingStub(channel, callOptions);
        }
      };
    return demoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static demoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<demoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<demoServiceFutureStub>() {
        @java.lang.Override
        public demoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new demoServiceFutureStub(channel, callOptions);
        }
      };
    return demoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class demoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void demoInsert(com.demo.grpc.demoRequest request,
        io.grpc.stub.StreamObserver<com.demo.grpc.demoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDemoInsertMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDemoInsertMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.demo.grpc.demoRequest,
                com.demo.grpc.demoResponse>(
                  this, METHODID_DEMO_INSERT)))
          .build();
    }
  }

  /**
   */
  public static final class demoServiceStub extends io.grpc.stub.AbstractAsyncStub<demoServiceStub> {
    private demoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected demoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new demoServiceStub(channel, callOptions);
    }

    /**
     */
    public void demoInsert(com.demo.grpc.demoRequest request,
        io.grpc.stub.StreamObserver<com.demo.grpc.demoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDemoInsertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class demoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<demoServiceBlockingStub> {
    private demoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected demoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new demoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.demo.grpc.demoResponse demoInsert(com.demo.grpc.demoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDemoInsertMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class demoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<demoServiceFutureStub> {
    private demoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected demoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new demoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demo.grpc.demoResponse> demoInsert(
        com.demo.grpc.demoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDemoInsertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEMO_INSERT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final demoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(demoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEMO_INSERT:
          serviceImpl.demoInsert((com.demo.grpc.demoRequest) request,
              (io.grpc.stub.StreamObserver<com.demo.grpc.demoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class demoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    demoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.demo.grpc.Demo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("demoService");
    }
  }

  private static final class demoServiceFileDescriptorSupplier
      extends demoServiceBaseDescriptorSupplier {
    demoServiceFileDescriptorSupplier() {}
  }

  private static final class demoServiceMethodDescriptorSupplier
      extends demoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    demoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (demoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new demoServiceFileDescriptorSupplier())
              .addMethod(getDemoInsertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
