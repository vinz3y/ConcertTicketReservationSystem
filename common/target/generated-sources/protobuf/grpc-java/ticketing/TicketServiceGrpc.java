package ticketing;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: ticketing.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TicketServiceGrpc {

  private TicketServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ticketing.TicketService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ticketing.AddConcertRequest,
      ticketing.ConcertResponse> getAddConcertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddConcert",
      requestType = ticketing.AddConcertRequest.class,
      responseType = ticketing.ConcertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ticketing.AddConcertRequest,
      ticketing.ConcertResponse> getAddConcertMethod() {
    io.grpc.MethodDescriptor<ticketing.AddConcertRequest, ticketing.ConcertResponse> getAddConcertMethod;
    if ((getAddConcertMethod = TicketServiceGrpc.getAddConcertMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getAddConcertMethod = TicketServiceGrpc.getAddConcertMethod) == null) {
          TicketServiceGrpc.getAddConcertMethod = getAddConcertMethod =
              io.grpc.MethodDescriptor.<ticketing.AddConcertRequest, ticketing.ConcertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddConcert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ticketing.AddConcertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ticketing.ConcertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("AddConcert"))
              .build();
        }
      }
    }
    return getAddConcertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ticketing.UpdateConcertRequest,
      ticketing.ConcertResponse> getUpdateConcertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConcert",
      requestType = ticketing.UpdateConcertRequest.class,
      responseType = ticketing.ConcertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ticketing.UpdateConcertRequest,
      ticketing.ConcertResponse> getUpdateConcertMethod() {
    io.grpc.MethodDescriptor<ticketing.UpdateConcertRequest, ticketing.ConcertResponse> getUpdateConcertMethod;
    if ((getUpdateConcertMethod = TicketServiceGrpc.getUpdateConcertMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getUpdateConcertMethod = TicketServiceGrpc.getUpdateConcertMethod) == null) {
          TicketServiceGrpc.getUpdateConcertMethod = getUpdateConcertMethod =
              io.grpc.MethodDescriptor.<ticketing.UpdateConcertRequest, ticketing.ConcertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateConcert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ticketing.UpdateConcertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ticketing.ConcertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("UpdateConcert"))
              .build();
        }
      }
    }
    return getUpdateConcertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ticketing.BookRequest,
      ticketing.BookingResponse> getBookTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookTicket",
      requestType = ticketing.BookRequest.class,
      responseType = ticketing.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ticketing.BookRequest,
      ticketing.BookingResponse> getBookTicketMethod() {
    io.grpc.MethodDescriptor<ticketing.BookRequest, ticketing.BookingResponse> getBookTicketMethod;
    if ((getBookTicketMethod = TicketServiceGrpc.getBookTicketMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getBookTicketMethod = TicketServiceGrpc.getBookTicketMethod) == null) {
          TicketServiceGrpc.getBookTicketMethod = getBookTicketMethod =
              io.grpc.MethodDescriptor.<ticketing.BookRequest, ticketing.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BookTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ticketing.BookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ticketing.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("BookTicket"))
              .build();
        }
      }
    }
    return getBookTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ticketing.Empty,
      ticketing.ConcertList> getGetConcertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConcerts",
      requestType = ticketing.Empty.class,
      responseType = ticketing.ConcertList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ticketing.Empty,
      ticketing.ConcertList> getGetConcertsMethod() {
    io.grpc.MethodDescriptor<ticketing.Empty, ticketing.ConcertList> getGetConcertsMethod;
    if ((getGetConcertsMethod = TicketServiceGrpc.getGetConcertsMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getGetConcertsMethod = TicketServiceGrpc.getGetConcertsMethod) == null) {
          TicketServiceGrpc.getGetConcertsMethod = getGetConcertsMethod =
              io.grpc.MethodDescriptor.<ticketing.Empty, ticketing.ConcertList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConcerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ticketing.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ticketing.ConcertList.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("GetConcerts"))
              .build();
        }
      }
    }
    return getGetConcertsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TicketServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServiceStub>() {
        @java.lang.Override
        public TicketServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServiceStub(channel, callOptions);
        }
      };
    return TicketServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TicketServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServiceBlockingStub>() {
        @java.lang.Override
        public TicketServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServiceBlockingStub(channel, callOptions);
        }
      };
    return TicketServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TicketServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServiceFutureStub>() {
        @java.lang.Override
        public TicketServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServiceFutureStub(channel, callOptions);
        }
      };
    return TicketServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addConcert(ticketing.AddConcertRequest request,
        io.grpc.stub.StreamObserver<ticketing.ConcertResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddConcertMethod(), responseObserver);
    }

    /**
     */
    default void updateConcert(ticketing.UpdateConcertRequest request,
        io.grpc.stub.StreamObserver<ticketing.ConcertResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateConcertMethod(), responseObserver);
    }

    /**
     */
    default void bookTicket(ticketing.BookRequest request,
        io.grpc.stub.StreamObserver<ticketing.BookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookTicketMethod(), responseObserver);
    }

    /**
     */
    default void getConcerts(ticketing.Empty request,
        io.grpc.stub.StreamObserver<ticketing.ConcertList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConcertsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TicketService.
   */
  public static abstract class TicketServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TicketServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TicketService.
   */
  public static final class TicketServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TicketServiceStub> {
    private TicketServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServiceStub(channel, callOptions);
    }

    /**
     */
    public void addConcert(ticketing.AddConcertRequest request,
        io.grpc.stub.StreamObserver<ticketing.ConcertResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddConcertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateConcert(ticketing.UpdateConcertRequest request,
        io.grpc.stub.StreamObserver<ticketing.ConcertResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConcertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookTicket(ticketing.BookRequest request,
        io.grpc.stub.StreamObserver<ticketing.BookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConcerts(ticketing.Empty request,
        io.grpc.stub.StreamObserver<ticketing.ConcertList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConcertsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TicketService.
   */
  public static final class TicketServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TicketServiceBlockingStub> {
    private TicketServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ticketing.ConcertResponse addConcert(ticketing.AddConcertRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddConcertMethod(), getCallOptions(), request);
    }

    /**
     */
    public ticketing.ConcertResponse updateConcert(ticketing.UpdateConcertRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConcertMethod(), getCallOptions(), request);
    }

    /**
     */
    public ticketing.BookingResponse bookTicket(ticketing.BookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public ticketing.ConcertList getConcerts(ticketing.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConcertsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TicketService.
   */
  public static final class TicketServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TicketServiceFutureStub> {
    private TicketServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ticketing.ConcertResponse> addConcert(
        ticketing.AddConcertRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddConcertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ticketing.ConcertResponse> updateConcert(
        ticketing.UpdateConcertRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConcertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ticketing.BookingResponse> bookTicket(
        ticketing.BookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ticketing.ConcertList> getConcerts(
        ticketing.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConcertsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CONCERT = 0;
  private static final int METHODID_UPDATE_CONCERT = 1;
  private static final int METHODID_BOOK_TICKET = 2;
  private static final int METHODID_GET_CONCERTS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CONCERT:
          serviceImpl.addConcert((ticketing.AddConcertRequest) request,
              (io.grpc.stub.StreamObserver<ticketing.ConcertResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONCERT:
          serviceImpl.updateConcert((ticketing.UpdateConcertRequest) request,
              (io.grpc.stub.StreamObserver<ticketing.ConcertResponse>) responseObserver);
          break;
        case METHODID_BOOK_TICKET:
          serviceImpl.bookTicket((ticketing.BookRequest) request,
              (io.grpc.stub.StreamObserver<ticketing.BookingResponse>) responseObserver);
          break;
        case METHODID_GET_CONCERTS:
          serviceImpl.getConcerts((ticketing.Empty) request,
              (io.grpc.stub.StreamObserver<ticketing.ConcertList>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddConcertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ticketing.AddConcertRequest,
              ticketing.ConcertResponse>(
                service, METHODID_ADD_CONCERT)))
        .addMethod(
          getUpdateConcertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ticketing.UpdateConcertRequest,
              ticketing.ConcertResponse>(
                service, METHODID_UPDATE_CONCERT)))
        .addMethod(
          getBookTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ticketing.BookRequest,
              ticketing.BookingResponse>(
                service, METHODID_BOOK_TICKET)))
        .addMethod(
          getGetConcertsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ticketing.Empty,
              ticketing.ConcertList>(
                service, METHODID_GET_CONCERTS)))
        .build();
  }

  private static abstract class TicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TicketServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ticketing.Ticketing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TicketService");
    }
  }

  private static final class TicketServiceFileDescriptorSupplier
      extends TicketServiceBaseDescriptorSupplier {
    TicketServiceFileDescriptorSupplier() {}
  }

  private static final class TicketServiceMethodDescriptorSupplier
      extends TicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TicketServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TicketServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TicketServiceFileDescriptorSupplier())
              .addMethod(getAddConcertMethod())
              .addMethod(getUpdateConcertMethod())
              .addMethod(getBookTicketMethod())
              .addMethod(getGetConcertsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
