package com.example.hospital;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: hospitalystem.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HospitalServiceGrpc {

  private HospitalServiceGrpc() {}

  public static final String SERVICE_NAME = "hospital.HospitalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.hospital.CreateHospitalRequest,
      com.example.hospital.CreateHospitalResponse> getCreateHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHospital",
      requestType = com.example.hospital.CreateHospitalRequest.class,
      responseType = com.example.hospital.CreateHospitalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hospital.CreateHospitalRequest,
      com.example.hospital.CreateHospitalResponse> getCreateHospitalMethod() {
    io.grpc.MethodDescriptor<com.example.hospital.CreateHospitalRequest, com.example.hospital.CreateHospitalResponse> getCreateHospitalMethod;
    if ((getCreateHospitalMethod = HospitalServiceGrpc.getCreateHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getCreateHospitalMethod = HospitalServiceGrpc.getCreateHospitalMethod) == null) {
          HospitalServiceGrpc.getCreateHospitalMethod = getCreateHospitalMethod =
              io.grpc.MethodDescriptor.<com.example.hospital.CreateHospitalRequest, com.example.hospital.CreateHospitalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.CreateHospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.CreateHospitalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("CreateHospital"))
              .build();
        }
      }
    }
    return getCreateHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.hospital.HospitalProto,
      com.example.hospital.HospitalProto> getUpdateHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHospital",
      requestType = com.example.hospital.HospitalProto.class,
      responseType = com.example.hospital.HospitalProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hospital.HospitalProto,
      com.example.hospital.HospitalProto> getUpdateHospitalMethod() {
    io.grpc.MethodDescriptor<com.example.hospital.HospitalProto, com.example.hospital.HospitalProto> getUpdateHospitalMethod;
    if ((getUpdateHospitalMethod = HospitalServiceGrpc.getUpdateHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getUpdateHospitalMethod = HospitalServiceGrpc.getUpdateHospitalMethod) == null) {
          HospitalServiceGrpc.getUpdateHospitalMethod = getUpdateHospitalMethod =
              io.grpc.MethodDescriptor.<com.example.hospital.HospitalProto, com.example.hospital.HospitalProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.HospitalProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.HospitalProto.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("UpdateHospital"))
              .build();
        }
      }
    }
    return getUpdateHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.hospital.DeleteHospitalRequest,
      com.example.hospital.DeleteHospitalResponse> getDeleteHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHospital",
      requestType = com.example.hospital.DeleteHospitalRequest.class,
      responseType = com.example.hospital.DeleteHospitalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hospital.DeleteHospitalRequest,
      com.example.hospital.DeleteHospitalResponse> getDeleteHospitalMethod() {
    io.grpc.MethodDescriptor<com.example.hospital.DeleteHospitalRequest, com.example.hospital.DeleteHospitalResponse> getDeleteHospitalMethod;
    if ((getDeleteHospitalMethod = HospitalServiceGrpc.getDeleteHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getDeleteHospitalMethod = HospitalServiceGrpc.getDeleteHospitalMethod) == null) {
          HospitalServiceGrpc.getDeleteHospitalMethod = getDeleteHospitalMethod =
              io.grpc.MethodDescriptor.<com.example.hospital.DeleteHospitalRequest, com.example.hospital.DeleteHospitalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.DeleteHospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.DeleteHospitalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("DeleteHospital"))
              .build();
        }
      }
    }
    return getDeleteHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.hospital.GetHospitalRequest,
      com.example.hospital.GetHospitalResponse> getGetHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHospital",
      requestType = com.example.hospital.GetHospitalRequest.class,
      responseType = com.example.hospital.GetHospitalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hospital.GetHospitalRequest,
      com.example.hospital.GetHospitalResponse> getGetHospitalMethod() {
    io.grpc.MethodDescriptor<com.example.hospital.GetHospitalRequest, com.example.hospital.GetHospitalResponse> getGetHospitalMethod;
    if ((getGetHospitalMethod = HospitalServiceGrpc.getGetHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getGetHospitalMethod = HospitalServiceGrpc.getGetHospitalMethod) == null) {
          HospitalServiceGrpc.getGetHospitalMethod = getGetHospitalMethod =
              io.grpc.MethodDescriptor.<com.example.hospital.GetHospitalRequest, com.example.hospital.GetHospitalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.GetHospitalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.GetHospitalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("GetHospital"))
              .build();
        }
      }
    }
    return getGetHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.hospital.CreatePatientRequest,
      com.example.hospital.CreatePatientResponse> getCreatePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePatient",
      requestType = com.example.hospital.CreatePatientRequest.class,
      responseType = com.example.hospital.CreatePatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hospital.CreatePatientRequest,
      com.example.hospital.CreatePatientResponse> getCreatePatientMethod() {
    io.grpc.MethodDescriptor<com.example.hospital.CreatePatientRequest, com.example.hospital.CreatePatientResponse> getCreatePatientMethod;
    if ((getCreatePatientMethod = HospitalServiceGrpc.getCreatePatientMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getCreatePatientMethod = HospitalServiceGrpc.getCreatePatientMethod) == null) {
          HospitalServiceGrpc.getCreatePatientMethod = getCreatePatientMethod =
              io.grpc.MethodDescriptor.<com.example.hospital.CreatePatientRequest, com.example.hospital.CreatePatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.CreatePatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.CreatePatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("CreatePatient"))
              .build();
        }
      }
    }
    return getCreatePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.hospital.PatientProto,
      com.example.hospital.PatientProto> getUpdatePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePatient",
      requestType = com.example.hospital.PatientProto.class,
      responseType = com.example.hospital.PatientProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hospital.PatientProto,
      com.example.hospital.PatientProto> getUpdatePatientMethod() {
    io.grpc.MethodDescriptor<com.example.hospital.PatientProto, com.example.hospital.PatientProto> getUpdatePatientMethod;
    if ((getUpdatePatientMethod = HospitalServiceGrpc.getUpdatePatientMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getUpdatePatientMethod = HospitalServiceGrpc.getUpdatePatientMethod) == null) {
          HospitalServiceGrpc.getUpdatePatientMethod = getUpdatePatientMethod =
              io.grpc.MethodDescriptor.<com.example.hospital.PatientProto, com.example.hospital.PatientProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.PatientProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.PatientProto.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("UpdatePatient"))
              .build();
        }
      }
    }
    return getUpdatePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.hospital.DeletePatientRequest,
      com.example.hospital.DeletePatientResponse> getDeletePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePatient",
      requestType = com.example.hospital.DeletePatientRequest.class,
      responseType = com.example.hospital.DeletePatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hospital.DeletePatientRequest,
      com.example.hospital.DeletePatientResponse> getDeletePatientMethod() {
    io.grpc.MethodDescriptor<com.example.hospital.DeletePatientRequest, com.example.hospital.DeletePatientResponse> getDeletePatientMethod;
    if ((getDeletePatientMethod = HospitalServiceGrpc.getDeletePatientMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getDeletePatientMethod = HospitalServiceGrpc.getDeletePatientMethod) == null) {
          HospitalServiceGrpc.getDeletePatientMethod = getDeletePatientMethod =
              io.grpc.MethodDescriptor.<com.example.hospital.DeletePatientRequest, com.example.hospital.DeletePatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.DeletePatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.DeletePatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("DeletePatient"))
              .build();
        }
      }
    }
    return getDeletePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.hospital.GetPatientRequest,
      com.example.hospital.GetPatientResponse> getGetPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPatient",
      requestType = com.example.hospital.GetPatientRequest.class,
      responseType = com.example.hospital.GetPatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hospital.GetPatientRequest,
      com.example.hospital.GetPatientResponse> getGetPatientMethod() {
    io.grpc.MethodDescriptor<com.example.hospital.GetPatientRequest, com.example.hospital.GetPatientResponse> getGetPatientMethod;
    if ((getGetPatientMethod = HospitalServiceGrpc.getGetPatientMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getGetPatientMethod = HospitalServiceGrpc.getGetPatientMethod) == null) {
          HospitalServiceGrpc.getGetPatientMethod = getGetPatientMethod =
              io.grpc.MethodDescriptor.<com.example.hospital.GetPatientRequest, com.example.hospital.GetPatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.GetPatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.GetPatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("GetPatient"))
              .build();
        }
      }
    }
    return getGetPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.hospital.RegisterPatientRequest,
      com.example.hospital.RegisterPatientResponse> getRegisterPatientInHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPatientInHospital",
      requestType = com.example.hospital.RegisterPatientRequest.class,
      responseType = com.example.hospital.RegisterPatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hospital.RegisterPatientRequest,
      com.example.hospital.RegisterPatientResponse> getRegisterPatientInHospitalMethod() {
    io.grpc.MethodDescriptor<com.example.hospital.RegisterPatientRequest, com.example.hospital.RegisterPatientResponse> getRegisterPatientInHospitalMethod;
    if ((getRegisterPatientInHospitalMethod = HospitalServiceGrpc.getRegisterPatientInHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getRegisterPatientInHospitalMethod = HospitalServiceGrpc.getRegisterPatientInHospitalMethod) == null) {
          HospitalServiceGrpc.getRegisterPatientInHospitalMethod = getRegisterPatientInHospitalMethod =
              io.grpc.MethodDescriptor.<com.example.hospital.RegisterPatientRequest, com.example.hospital.RegisterPatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPatientInHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.RegisterPatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.RegisterPatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("RegisterPatientInHospital"))
              .build();
        }
      }
    }
    return getRegisterPatientInHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.hospital.RegisterPatientRequest,
      com.example.hospital.RegisterPatientResponse> getUnRegisterPatientInHospitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnRegisterPatientInHospital",
      requestType = com.example.hospital.RegisterPatientRequest.class,
      responseType = com.example.hospital.RegisterPatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.hospital.RegisterPatientRequest,
      com.example.hospital.RegisterPatientResponse> getUnRegisterPatientInHospitalMethod() {
    io.grpc.MethodDescriptor<com.example.hospital.RegisterPatientRequest, com.example.hospital.RegisterPatientResponse> getUnRegisterPatientInHospitalMethod;
    if ((getUnRegisterPatientInHospitalMethod = HospitalServiceGrpc.getUnRegisterPatientInHospitalMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getUnRegisterPatientInHospitalMethod = HospitalServiceGrpc.getUnRegisterPatientInHospitalMethod) == null) {
          HospitalServiceGrpc.getUnRegisterPatientInHospitalMethod = getUnRegisterPatientInHospitalMethod =
              io.grpc.MethodDescriptor.<com.example.hospital.RegisterPatientRequest, com.example.hospital.RegisterPatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnRegisterPatientInHospital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.RegisterPatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.RegisterPatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("UnRegisterPatientInHospital"))
              .build();
        }
      }
    }
    return getUnRegisterPatientInHospitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.hospital.AverageAgeResponse> getGetAverageAgeBySexAndMonthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAverageAgeBySexAndMonth",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.example.hospital.AverageAgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.hospital.AverageAgeResponse> getGetAverageAgeBySexAndMonthMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.example.hospital.AverageAgeResponse> getGetAverageAgeBySexAndMonthMethod;
    if ((getGetAverageAgeBySexAndMonthMethod = HospitalServiceGrpc.getGetAverageAgeBySexAndMonthMethod) == null) {
      synchronized (HospitalServiceGrpc.class) {
        if ((getGetAverageAgeBySexAndMonthMethod = HospitalServiceGrpc.getGetAverageAgeBySexAndMonthMethod) == null) {
          HospitalServiceGrpc.getGetAverageAgeBySexAndMonthMethod = getGetAverageAgeBySexAndMonthMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.example.hospital.AverageAgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAverageAgeBySexAndMonth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.hospital.AverageAgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HospitalServiceMethodDescriptorSupplier("GetAverageAgeBySexAndMonth"))
              .build();
        }
      }
    }
    return getGetAverageAgeBySexAndMonthMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HospitalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalServiceStub>() {
        @java.lang.Override
        public HospitalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalServiceStub(channel, callOptions);
        }
      };
    return HospitalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HospitalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalServiceBlockingStub>() {
        @java.lang.Override
        public HospitalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalServiceBlockingStub(channel, callOptions);
        }
      };
    return HospitalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HospitalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HospitalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HospitalServiceFutureStub>() {
        @java.lang.Override
        public HospitalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HospitalServiceFutureStub(channel, callOptions);
        }
      };
    return HospitalServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HospitalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createHospital(com.example.hospital.CreateHospitalRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.CreateHospitalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHospitalMethod(), responseObserver);
    }

    /**
     */
    public void updateHospital(com.example.hospital.HospitalProto request,
        io.grpc.stub.StreamObserver<com.example.hospital.HospitalProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHospitalMethod(), responseObserver);
    }

    /**
     */
    public void deleteHospital(com.example.hospital.DeleteHospitalRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.DeleteHospitalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHospitalMethod(), responseObserver);
    }

    /**
     */
    public void getHospital(com.example.hospital.GetHospitalRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.GetHospitalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHospitalMethod(), responseObserver);
    }

    /**
     */
    public void createPatient(com.example.hospital.CreatePatientRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.CreatePatientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePatientMethod(), responseObserver);
    }

    /**
     */
    public void updatePatient(com.example.hospital.PatientProto request,
        io.grpc.stub.StreamObserver<com.example.hospital.PatientProto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePatientMethod(), responseObserver);
    }

    /**
     */
    public void deletePatient(com.example.hospital.DeletePatientRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.DeletePatientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePatientMethod(), responseObserver);
    }

    /**
     */
    public void getPatient(com.example.hospital.GetPatientRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.GetPatientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPatientMethod(), responseObserver);
    }

    /**
     */
    public void registerPatientInHospital(com.example.hospital.RegisterPatientRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.RegisterPatientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterPatientInHospitalMethod(), responseObserver);
    }

    /**
     */
    public void unRegisterPatientInHospital(com.example.hospital.RegisterPatientRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.RegisterPatientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnRegisterPatientInHospitalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Special Request
     * </pre>
     */
    public void getAverageAgeBySexAndMonth(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.hospital.AverageAgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAverageAgeBySexAndMonthMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.hospital.CreateHospitalRequest,
                com.example.hospital.CreateHospitalResponse>(
                  this, METHODID_CREATE_HOSPITAL)))
          .addMethod(
            getUpdateHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.hospital.HospitalProto,
                com.example.hospital.HospitalProto>(
                  this, METHODID_UPDATE_HOSPITAL)))
          .addMethod(
            getDeleteHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.hospital.DeleteHospitalRequest,
                com.example.hospital.DeleteHospitalResponse>(
                  this, METHODID_DELETE_HOSPITAL)))
          .addMethod(
            getGetHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.hospital.GetHospitalRequest,
                com.example.hospital.GetHospitalResponse>(
                  this, METHODID_GET_HOSPITAL)))
          .addMethod(
            getCreatePatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.hospital.CreatePatientRequest,
                com.example.hospital.CreatePatientResponse>(
                  this, METHODID_CREATE_PATIENT)))
          .addMethod(
            getUpdatePatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.hospital.PatientProto,
                com.example.hospital.PatientProto>(
                  this, METHODID_UPDATE_PATIENT)))
          .addMethod(
            getDeletePatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.hospital.DeletePatientRequest,
                com.example.hospital.DeletePatientResponse>(
                  this, METHODID_DELETE_PATIENT)))
          .addMethod(
            getGetPatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.hospital.GetPatientRequest,
                com.example.hospital.GetPatientResponse>(
                  this, METHODID_GET_PATIENT)))
          .addMethod(
            getRegisterPatientInHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.hospital.RegisterPatientRequest,
                com.example.hospital.RegisterPatientResponse>(
                  this, METHODID_REGISTER_PATIENT_IN_HOSPITAL)))
          .addMethod(
            getUnRegisterPatientInHospitalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.hospital.RegisterPatientRequest,
                com.example.hospital.RegisterPatientResponse>(
                  this, METHODID_UN_REGISTER_PATIENT_IN_HOSPITAL)))
          .addMethod(
            getGetAverageAgeBySexAndMonthMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.example.hospital.AverageAgeResponse>(
                  this, METHODID_GET_AVERAGE_AGE_BY_SEX_AND_MONTH)))
          .build();
    }
  }

  /**
   */
  public static final class HospitalServiceStub extends io.grpc.stub.AbstractAsyncStub<HospitalServiceStub> {
    private HospitalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalServiceStub(channel, callOptions);
    }

    /**
     */
    public void createHospital(com.example.hospital.CreateHospitalRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.CreateHospitalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateHospital(com.example.hospital.HospitalProto request,
        io.grpc.stub.StreamObserver<com.example.hospital.HospitalProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHospital(com.example.hospital.DeleteHospitalRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.DeleteHospitalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHospital(com.example.hospital.GetHospitalRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.GetHospitalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPatient(com.example.hospital.CreatePatientRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.CreatePatientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePatient(com.example.hospital.PatientProto request,
        io.grpc.stub.StreamObserver<com.example.hospital.PatientProto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePatient(com.example.hospital.DeletePatientRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.DeletePatientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPatient(com.example.hospital.GetPatientRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.GetPatientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerPatientInHospital(com.example.hospital.RegisterPatientRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.RegisterPatientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterPatientInHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unRegisterPatientInHospital(com.example.hospital.RegisterPatientRequest request,
        io.grpc.stub.StreamObserver<com.example.hospital.RegisterPatientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnRegisterPatientInHospitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Special Request
     * </pre>
     */
    public void getAverageAgeBySexAndMonth(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.hospital.AverageAgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAverageAgeBySexAndMonthMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HospitalServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HospitalServiceBlockingStub> {
    private HospitalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.hospital.CreateHospitalResponse createHospital(com.example.hospital.CreateHospitalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.hospital.HospitalProto updateHospital(com.example.hospital.HospitalProto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.hospital.DeleteHospitalResponse deleteHospital(com.example.hospital.DeleteHospitalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.hospital.GetHospitalResponse getHospital(com.example.hospital.GetHospitalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.hospital.CreatePatientResponse createPatient(com.example.hospital.CreatePatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.hospital.PatientProto updatePatient(com.example.hospital.PatientProto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.hospital.DeletePatientResponse deletePatient(com.example.hospital.DeletePatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.hospital.GetPatientResponse getPatient(com.example.hospital.GetPatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.hospital.RegisterPatientResponse registerPatientInHospital(com.example.hospital.RegisterPatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterPatientInHospitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.hospital.RegisterPatientResponse unRegisterPatientInHospital(com.example.hospital.RegisterPatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnRegisterPatientInHospitalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Special Request
     * </pre>
     */
    public com.example.hospital.AverageAgeResponse getAverageAgeBySexAndMonth(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAverageAgeBySexAndMonthMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HospitalServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HospitalServiceFutureStub> {
    private HospitalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HospitalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HospitalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hospital.CreateHospitalResponse> createHospital(
        com.example.hospital.CreateHospitalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hospital.HospitalProto> updateHospital(
        com.example.hospital.HospitalProto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hospital.DeleteHospitalResponse> deleteHospital(
        com.example.hospital.DeleteHospitalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hospital.GetHospitalResponse> getHospital(
        com.example.hospital.GetHospitalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hospital.CreatePatientResponse> createPatient(
        com.example.hospital.CreatePatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hospital.PatientProto> updatePatient(
        com.example.hospital.PatientProto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hospital.DeletePatientResponse> deletePatient(
        com.example.hospital.DeletePatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hospital.GetPatientResponse> getPatient(
        com.example.hospital.GetPatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hospital.RegisterPatientResponse> registerPatientInHospital(
        com.example.hospital.RegisterPatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterPatientInHospitalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hospital.RegisterPatientResponse> unRegisterPatientInHospital(
        com.example.hospital.RegisterPatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnRegisterPatientInHospitalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Special Request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.hospital.AverageAgeResponse> getAverageAgeBySexAndMonth(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAverageAgeBySexAndMonthMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_HOSPITAL = 0;
  private static final int METHODID_UPDATE_HOSPITAL = 1;
  private static final int METHODID_DELETE_HOSPITAL = 2;
  private static final int METHODID_GET_HOSPITAL = 3;
  private static final int METHODID_CREATE_PATIENT = 4;
  private static final int METHODID_UPDATE_PATIENT = 5;
  private static final int METHODID_DELETE_PATIENT = 6;
  private static final int METHODID_GET_PATIENT = 7;
  private static final int METHODID_REGISTER_PATIENT_IN_HOSPITAL = 8;
  private static final int METHODID_UN_REGISTER_PATIENT_IN_HOSPITAL = 9;
  private static final int METHODID_GET_AVERAGE_AGE_BY_SEX_AND_MONTH = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HospitalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HospitalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_HOSPITAL:
          serviceImpl.createHospital((com.example.hospital.CreateHospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.example.hospital.CreateHospitalResponse>) responseObserver);
          break;
        case METHODID_UPDATE_HOSPITAL:
          serviceImpl.updateHospital((com.example.hospital.HospitalProto) request,
              (io.grpc.stub.StreamObserver<com.example.hospital.HospitalProto>) responseObserver);
          break;
        case METHODID_DELETE_HOSPITAL:
          serviceImpl.deleteHospital((com.example.hospital.DeleteHospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.example.hospital.DeleteHospitalResponse>) responseObserver);
          break;
        case METHODID_GET_HOSPITAL:
          serviceImpl.getHospital((com.example.hospital.GetHospitalRequest) request,
              (io.grpc.stub.StreamObserver<com.example.hospital.GetHospitalResponse>) responseObserver);
          break;
        case METHODID_CREATE_PATIENT:
          serviceImpl.createPatient((com.example.hospital.CreatePatientRequest) request,
              (io.grpc.stub.StreamObserver<com.example.hospital.CreatePatientResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PATIENT:
          serviceImpl.updatePatient((com.example.hospital.PatientProto) request,
              (io.grpc.stub.StreamObserver<com.example.hospital.PatientProto>) responseObserver);
          break;
        case METHODID_DELETE_PATIENT:
          serviceImpl.deletePatient((com.example.hospital.DeletePatientRequest) request,
              (io.grpc.stub.StreamObserver<com.example.hospital.DeletePatientResponse>) responseObserver);
          break;
        case METHODID_GET_PATIENT:
          serviceImpl.getPatient((com.example.hospital.GetPatientRequest) request,
              (io.grpc.stub.StreamObserver<com.example.hospital.GetPatientResponse>) responseObserver);
          break;
        case METHODID_REGISTER_PATIENT_IN_HOSPITAL:
          serviceImpl.registerPatientInHospital((com.example.hospital.RegisterPatientRequest) request,
              (io.grpc.stub.StreamObserver<com.example.hospital.RegisterPatientResponse>) responseObserver);
          break;
        case METHODID_UN_REGISTER_PATIENT_IN_HOSPITAL:
          serviceImpl.unRegisterPatientInHospital((com.example.hospital.RegisterPatientRequest) request,
              (io.grpc.stub.StreamObserver<com.example.hospital.RegisterPatientResponse>) responseObserver);
          break;
        case METHODID_GET_AVERAGE_AGE_BY_SEX_AND_MONTH:
          serviceImpl.getAverageAgeBySexAndMonth((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.hospital.AverageAgeResponse>) responseObserver);
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

  private static abstract class HospitalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HospitalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.hospital.Hospitalystem.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HospitalService");
    }
  }

  private static final class HospitalServiceFileDescriptorSupplier
      extends HospitalServiceBaseDescriptorSupplier {
    HospitalServiceFileDescriptorSupplier() {}
  }

  private static final class HospitalServiceMethodDescriptorSupplier
      extends HospitalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HospitalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HospitalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HospitalServiceFileDescriptorSupplier())
              .addMethod(getCreateHospitalMethod())
              .addMethod(getUpdateHospitalMethod())
              .addMethod(getDeleteHospitalMethod())
              .addMethod(getGetHospitalMethod())
              .addMethod(getCreatePatientMethod())
              .addMethod(getUpdatePatientMethod())
              .addMethod(getDeletePatientMethod())
              .addMethod(getGetPatientMethod())
              .addMethod(getRegisterPatientInHospitalMethod())
              .addMethod(getUnRegisterPatientInHospitalMethod())
              .addMethod(getGetAverageAgeBySexAndMonthMethod())
              .build();
        }
      }
    }
    return result;
  }
}
