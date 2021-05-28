package service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: go_robot.proto")
public final class GoRobotGrpc {

  private GoRobotGrpc() {}

  public static final String SERVICE_NAME = "service.GoRobot";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.GoRobotOuterClass.Point,
      service.GoRobotOuterClass.Empty> getMouseMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MouseMove",
      requestType = service.GoRobotOuterClass.Point.class,
      responseType = service.GoRobotOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.GoRobotOuterClass.Point,
      service.GoRobotOuterClass.Empty> getMouseMoveMethod() {
    io.grpc.MethodDescriptor<service.GoRobotOuterClass.Point, service.GoRobotOuterClass.Empty> getMouseMoveMethod;
    if ((getMouseMoveMethod = GoRobotGrpc.getMouseMoveMethod) == null) {
      synchronized (GoRobotGrpc.class) {
        if ((getMouseMoveMethod = GoRobotGrpc.getMouseMoveMethod) == null) {
          GoRobotGrpc.getMouseMoveMethod = getMouseMoveMethod =
              io.grpc.MethodDescriptor.<service.GoRobotOuterClass.Point, service.GoRobotOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MouseMove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.Point.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GoRobotMethodDescriptorSupplier("MouseMove"))
              .build();
        }
      }
    }
    return getMouseMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseButton,
      service.GoRobotOuterClass.Empty> getMouseClickMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MouseClick",
      requestType = service.GoRobotOuterClass.MouseButton.class,
      responseType = service.GoRobotOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseButton,
      service.GoRobotOuterClass.Empty> getMouseClickMethod() {
    io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseButton, service.GoRobotOuterClass.Empty> getMouseClickMethod;
    if ((getMouseClickMethod = GoRobotGrpc.getMouseClickMethod) == null) {
      synchronized (GoRobotGrpc.class) {
        if ((getMouseClickMethod = GoRobotGrpc.getMouseClickMethod) == null) {
          GoRobotGrpc.getMouseClickMethod = getMouseClickMethod =
              io.grpc.MethodDescriptor.<service.GoRobotOuterClass.MouseButton, service.GoRobotOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MouseClick"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.MouseButton.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GoRobotMethodDescriptorSupplier("MouseClick"))
              .build();
        }
      }
    }
    return getMouseClickMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseButton,
      service.GoRobotOuterClass.Empty> getMouseDoubleClickMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MouseDoubleClick",
      requestType = service.GoRobotOuterClass.MouseButton.class,
      responseType = service.GoRobotOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseButton,
      service.GoRobotOuterClass.Empty> getMouseDoubleClickMethod() {
    io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseButton, service.GoRobotOuterClass.Empty> getMouseDoubleClickMethod;
    if ((getMouseDoubleClickMethod = GoRobotGrpc.getMouseDoubleClickMethod) == null) {
      synchronized (GoRobotGrpc.class) {
        if ((getMouseDoubleClickMethod = GoRobotGrpc.getMouseDoubleClickMethod) == null) {
          GoRobotGrpc.getMouseDoubleClickMethod = getMouseDoubleClickMethod =
              io.grpc.MethodDescriptor.<service.GoRobotOuterClass.MouseButton, service.GoRobotOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MouseDoubleClick"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.MouseButton.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GoRobotMethodDescriptorSupplier("MouseDoubleClick"))
              .build();
        }
      }
    }
    return getMouseDoubleClickMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseButton,
      service.GoRobotOuterClass.Empty> getMousePressedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MousePressed",
      requestType = service.GoRobotOuterClass.MouseButton.class,
      responseType = service.GoRobotOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseButton,
      service.GoRobotOuterClass.Empty> getMousePressedMethod() {
    io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseButton, service.GoRobotOuterClass.Empty> getMousePressedMethod;
    if ((getMousePressedMethod = GoRobotGrpc.getMousePressedMethod) == null) {
      synchronized (GoRobotGrpc.class) {
        if ((getMousePressedMethod = GoRobotGrpc.getMousePressedMethod) == null) {
          GoRobotGrpc.getMousePressedMethod = getMousePressedMethod =
              io.grpc.MethodDescriptor.<service.GoRobotOuterClass.MouseButton, service.GoRobotOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MousePressed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.MouseButton.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GoRobotMethodDescriptorSupplier("MousePressed"))
              .build();
        }
      }
    }
    return getMousePressedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseButton,
      service.GoRobotOuterClass.Empty> getMouseReleasedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MouseReleased",
      requestType = service.GoRobotOuterClass.MouseButton.class,
      responseType = service.GoRobotOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseButton,
      service.GoRobotOuterClass.Empty> getMouseReleasedMethod() {
    io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseButton, service.GoRobotOuterClass.Empty> getMouseReleasedMethod;
    if ((getMouseReleasedMethod = GoRobotGrpc.getMouseReleasedMethod) == null) {
      synchronized (GoRobotGrpc.class) {
        if ((getMouseReleasedMethod = GoRobotGrpc.getMouseReleasedMethod) == null) {
          GoRobotGrpc.getMouseReleasedMethod = getMouseReleasedMethod =
              io.grpc.MethodDescriptor.<service.GoRobotOuterClass.MouseButton, service.GoRobotOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MouseReleased"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.MouseButton.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GoRobotMethodDescriptorSupplier("MouseReleased"))
              .build();
        }
      }
    }
    return getMouseReleasedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseScrolledRequest,
      service.GoRobotOuterClass.Empty> getMouseScrolledUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MouseScrolledUp",
      requestType = service.GoRobotOuterClass.MouseScrolledRequest.class,
      responseType = service.GoRobotOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseScrolledRequest,
      service.GoRobotOuterClass.Empty> getMouseScrolledUpMethod() {
    io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseScrolledRequest, service.GoRobotOuterClass.Empty> getMouseScrolledUpMethod;
    if ((getMouseScrolledUpMethod = GoRobotGrpc.getMouseScrolledUpMethod) == null) {
      synchronized (GoRobotGrpc.class) {
        if ((getMouseScrolledUpMethod = GoRobotGrpc.getMouseScrolledUpMethod) == null) {
          GoRobotGrpc.getMouseScrolledUpMethod = getMouseScrolledUpMethod =
              io.grpc.MethodDescriptor.<service.GoRobotOuterClass.MouseScrolledRequest, service.GoRobotOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MouseScrolledUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.MouseScrolledRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GoRobotMethodDescriptorSupplier("MouseScrolledUp"))
              .build();
        }
      }
    }
    return getMouseScrolledUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseScrolledRequest,
      service.GoRobotOuterClass.Empty> getMouseScrolledDownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MouseScrolledDown",
      requestType = service.GoRobotOuterClass.MouseScrolledRequest.class,
      responseType = service.GoRobotOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseScrolledRequest,
      service.GoRobotOuterClass.Empty> getMouseScrolledDownMethod() {
    io.grpc.MethodDescriptor<service.GoRobotOuterClass.MouseScrolledRequest, service.GoRobotOuterClass.Empty> getMouseScrolledDownMethod;
    if ((getMouseScrolledDownMethod = GoRobotGrpc.getMouseScrolledDownMethod) == null) {
      synchronized (GoRobotGrpc.class) {
        if ((getMouseScrolledDownMethod = GoRobotGrpc.getMouseScrolledDownMethod) == null) {
          GoRobotGrpc.getMouseScrolledDownMethod = getMouseScrolledDownMethod =
              io.grpc.MethodDescriptor.<service.GoRobotOuterClass.MouseScrolledRequest, service.GoRobotOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MouseScrolledDown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.MouseScrolledRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new GoRobotMethodDescriptorSupplier("MouseScrolledDown"))
              .build();
        }
      }
    }
    return getMouseScrolledDownMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.GoRobotOuterClass.CaptureScreenRequest,
      service.GoRobotOuterClass.CaptureScreenResponse> getCaptureScreenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CaptureScreen",
      requestType = service.GoRobotOuterClass.CaptureScreenRequest.class,
      responseType = service.GoRobotOuterClass.CaptureScreenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<service.GoRobotOuterClass.CaptureScreenRequest,
      service.GoRobotOuterClass.CaptureScreenResponse> getCaptureScreenMethod() {
    io.grpc.MethodDescriptor<service.GoRobotOuterClass.CaptureScreenRequest, service.GoRobotOuterClass.CaptureScreenResponse> getCaptureScreenMethod;
    if ((getCaptureScreenMethod = GoRobotGrpc.getCaptureScreenMethod) == null) {
      synchronized (GoRobotGrpc.class) {
        if ((getCaptureScreenMethod = GoRobotGrpc.getCaptureScreenMethod) == null) {
          GoRobotGrpc.getCaptureScreenMethod = getCaptureScreenMethod =
              io.grpc.MethodDescriptor.<service.GoRobotOuterClass.CaptureScreenRequest, service.GoRobotOuterClass.CaptureScreenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CaptureScreen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.CaptureScreenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GoRobotOuterClass.CaptureScreenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GoRobotMethodDescriptorSupplier("CaptureScreen"))
              .build();
        }
      }
    }
    return getCaptureScreenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GoRobotStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoRobotStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoRobotStub>() {
        @java.lang.Override
        public GoRobotStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoRobotStub(channel, callOptions);
        }
      };
    return GoRobotStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GoRobotBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoRobotBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoRobotBlockingStub>() {
        @java.lang.Override
        public GoRobotBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoRobotBlockingStub(channel, callOptions);
        }
      };
    return GoRobotBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GoRobotFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GoRobotFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GoRobotFutureStub>() {
        @java.lang.Override
        public GoRobotFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GoRobotFutureStub(channel, callOptions);
        }
      };
    return GoRobotFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GoRobotImplBase implements io.grpc.BindableService {

    /**
     */
    public void mouseMove(service.GoRobotOuterClass.Point request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMouseMoveMethod(), responseObserver);
    }

    /**
     */
    public void mouseClick(service.GoRobotOuterClass.MouseButton request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMouseClickMethod(), responseObserver);
    }

    /**
     */
    public void mouseDoubleClick(service.GoRobotOuterClass.MouseButton request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMouseDoubleClickMethod(), responseObserver);
    }

    /**
     */
    public void mousePressed(service.GoRobotOuterClass.MouseButton request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMousePressedMethod(), responseObserver);
    }

    /**
     */
    public void mouseReleased(service.GoRobotOuterClass.MouseButton request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMouseReleasedMethod(), responseObserver);
    }

    /**
     */
    public void mouseScrolledUp(service.GoRobotOuterClass.MouseScrolledRequest request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMouseScrolledUpMethod(), responseObserver);
    }

    /**
     */
    public void mouseScrolledDown(service.GoRobotOuterClass.MouseScrolledRequest request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMouseScrolledDownMethod(), responseObserver);
    }

    /**
     */
    public void captureScreen(service.GoRobotOuterClass.CaptureScreenRequest request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.CaptureScreenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCaptureScreenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMouseMoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                service.GoRobotOuterClass.Point,
                service.GoRobotOuterClass.Empty>(
                  this, METHODID_MOUSE_MOVE)))
          .addMethod(
            getMouseClickMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                service.GoRobotOuterClass.MouseButton,
                service.GoRobotOuterClass.Empty>(
                  this, METHODID_MOUSE_CLICK)))
          .addMethod(
            getMouseDoubleClickMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                service.GoRobotOuterClass.MouseButton,
                service.GoRobotOuterClass.Empty>(
                  this, METHODID_MOUSE_DOUBLE_CLICK)))
          .addMethod(
            getMousePressedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                service.GoRobotOuterClass.MouseButton,
                service.GoRobotOuterClass.Empty>(
                  this, METHODID_MOUSE_PRESSED)))
          .addMethod(
            getMouseReleasedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                service.GoRobotOuterClass.MouseButton,
                service.GoRobotOuterClass.Empty>(
                  this, METHODID_MOUSE_RELEASED)))
          .addMethod(
            getMouseScrolledUpMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                service.GoRobotOuterClass.MouseScrolledRequest,
                service.GoRobotOuterClass.Empty>(
                  this, METHODID_MOUSE_SCROLLED_UP)))
          .addMethod(
            getMouseScrolledDownMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                service.GoRobotOuterClass.MouseScrolledRequest,
                service.GoRobotOuterClass.Empty>(
                  this, METHODID_MOUSE_SCROLLED_DOWN)))
          .addMethod(
            getCaptureScreenMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                service.GoRobotOuterClass.CaptureScreenRequest,
                service.GoRobotOuterClass.CaptureScreenResponse>(
                  this, METHODID_CAPTURE_SCREEN)))
          .build();
    }
  }

  /**
   */
  public static final class GoRobotStub extends io.grpc.stub.AbstractAsyncStub<GoRobotStub> {
    private GoRobotStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoRobotStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoRobotStub(channel, callOptions);
    }

    /**
     */
    public void mouseMove(service.GoRobotOuterClass.Point request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMouseMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mouseClick(service.GoRobotOuterClass.MouseButton request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMouseClickMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mouseDoubleClick(service.GoRobotOuterClass.MouseButton request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMouseDoubleClickMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mousePressed(service.GoRobotOuterClass.MouseButton request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMousePressedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mouseReleased(service.GoRobotOuterClass.MouseButton request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMouseReleasedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mouseScrolledUp(service.GoRobotOuterClass.MouseScrolledRequest request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMouseScrolledUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mouseScrolledDown(service.GoRobotOuterClass.MouseScrolledRequest request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMouseScrolledDownMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void captureScreen(service.GoRobotOuterClass.CaptureScreenRequest request,
        io.grpc.stub.StreamObserver<service.GoRobotOuterClass.CaptureScreenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getCaptureScreenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GoRobotBlockingStub extends io.grpc.stub.AbstractBlockingStub<GoRobotBlockingStub> {
    private GoRobotBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoRobotBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoRobotBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.GoRobotOuterClass.Empty mouseMove(service.GoRobotOuterClass.Point request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMouseMoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.GoRobotOuterClass.Empty mouseClick(service.GoRobotOuterClass.MouseButton request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMouseClickMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.GoRobotOuterClass.Empty mouseDoubleClick(service.GoRobotOuterClass.MouseButton request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMouseDoubleClickMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.GoRobotOuterClass.Empty mousePressed(service.GoRobotOuterClass.MouseButton request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMousePressedMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.GoRobotOuterClass.Empty mouseReleased(service.GoRobotOuterClass.MouseButton request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMouseReleasedMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.GoRobotOuterClass.Empty mouseScrolledUp(service.GoRobotOuterClass.MouseScrolledRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMouseScrolledUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.GoRobotOuterClass.Empty mouseScrolledDown(service.GoRobotOuterClass.MouseScrolledRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMouseScrolledDownMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<service.GoRobotOuterClass.CaptureScreenResponse> captureScreen(
        service.GoRobotOuterClass.CaptureScreenRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getCaptureScreenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GoRobotFutureStub extends io.grpc.stub.AbstractFutureStub<GoRobotFutureStub> {
    private GoRobotFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoRobotFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GoRobotFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.GoRobotOuterClass.Empty> mouseMove(
        service.GoRobotOuterClass.Point request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMouseMoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.GoRobotOuterClass.Empty> mouseClick(
        service.GoRobotOuterClass.MouseButton request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMouseClickMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.GoRobotOuterClass.Empty> mouseDoubleClick(
        service.GoRobotOuterClass.MouseButton request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMouseDoubleClickMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.GoRobotOuterClass.Empty> mousePressed(
        service.GoRobotOuterClass.MouseButton request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMousePressedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.GoRobotOuterClass.Empty> mouseReleased(
        service.GoRobotOuterClass.MouseButton request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMouseReleasedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.GoRobotOuterClass.Empty> mouseScrolledUp(
        service.GoRobotOuterClass.MouseScrolledRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMouseScrolledUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.GoRobotOuterClass.Empty> mouseScrolledDown(
        service.GoRobotOuterClass.MouseScrolledRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMouseScrolledDownMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MOUSE_MOVE = 0;
  private static final int METHODID_MOUSE_CLICK = 1;
  private static final int METHODID_MOUSE_DOUBLE_CLICK = 2;
  private static final int METHODID_MOUSE_PRESSED = 3;
  private static final int METHODID_MOUSE_RELEASED = 4;
  private static final int METHODID_MOUSE_SCROLLED_UP = 5;
  private static final int METHODID_MOUSE_SCROLLED_DOWN = 6;
  private static final int METHODID_CAPTURE_SCREEN = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GoRobotImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GoRobotImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MOUSE_MOVE:
          serviceImpl.mouseMove((service.GoRobotOuterClass.Point) request,
              (io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty>) responseObserver);
          break;
        case METHODID_MOUSE_CLICK:
          serviceImpl.mouseClick((service.GoRobotOuterClass.MouseButton) request,
              (io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty>) responseObserver);
          break;
        case METHODID_MOUSE_DOUBLE_CLICK:
          serviceImpl.mouseDoubleClick((service.GoRobotOuterClass.MouseButton) request,
              (io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty>) responseObserver);
          break;
        case METHODID_MOUSE_PRESSED:
          serviceImpl.mousePressed((service.GoRobotOuterClass.MouseButton) request,
              (io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty>) responseObserver);
          break;
        case METHODID_MOUSE_RELEASED:
          serviceImpl.mouseReleased((service.GoRobotOuterClass.MouseButton) request,
              (io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty>) responseObserver);
          break;
        case METHODID_MOUSE_SCROLLED_UP:
          serviceImpl.mouseScrolledUp((service.GoRobotOuterClass.MouseScrolledRequest) request,
              (io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty>) responseObserver);
          break;
        case METHODID_MOUSE_SCROLLED_DOWN:
          serviceImpl.mouseScrolledDown((service.GoRobotOuterClass.MouseScrolledRequest) request,
              (io.grpc.stub.StreamObserver<service.GoRobotOuterClass.Empty>) responseObserver);
          break;
        case METHODID_CAPTURE_SCREEN:
          serviceImpl.captureScreen((service.GoRobotOuterClass.CaptureScreenRequest) request,
              (io.grpc.stub.StreamObserver<service.GoRobotOuterClass.CaptureScreenResponse>) responseObserver);
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

  private static abstract class GoRobotBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GoRobotBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.GoRobotOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GoRobot");
    }
  }

  private static final class GoRobotFileDescriptorSupplier
      extends GoRobotBaseDescriptorSupplier {
    GoRobotFileDescriptorSupplier() {}
  }

  private static final class GoRobotMethodDescriptorSupplier
      extends GoRobotBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GoRobotMethodDescriptorSupplier(String methodName) {
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
      synchronized (GoRobotGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GoRobotFileDescriptorSupplier())
              .addMethod(getMouseMoveMethod())
              .addMethod(getMouseClickMethod())
              .addMethod(getMouseDoubleClickMethod())
              .addMethod(getMousePressedMethod())
              .addMethod(getMouseReleasedMethod())
              .addMethod(getMouseScrolledUpMethod())
              .addMethod(getMouseScrolledDownMethod())
              .addMethod(getCaptureScreenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
