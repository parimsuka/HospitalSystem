// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hospitalystem.proto

package com.example.hospital;

/**
 * Protobuf type {@code hospital.CreateHospitalResponse}
 */
public final class CreateHospitalResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hospital.CreateHospitalResponse)
    CreateHospitalResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateHospitalResponse.newBuilder() to construct.
  private CreateHospitalResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateHospitalResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateHospitalResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.hospital.Hospitalystem.internal_static_hospital_CreateHospitalResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.hospital.Hospitalystem.internal_static_hospital_CreateHospitalResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.hospital.CreateHospitalResponse.class, com.example.hospital.CreateHospitalResponse.Builder.class);
  }

  private int bitField0_;
  public static final int HOSPITAL_FIELD_NUMBER = 1;
  private com.example.hospital.HospitalProto hospital_;
  /**
   * <code>optional .hospital.HospitalProto hospital = 1;</code>
   * @return Whether the hospital field is set.
   */
  @java.lang.Override
  public boolean hasHospital() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .hospital.HospitalProto hospital = 1;</code>
   * @return The hospital.
   */
  @java.lang.Override
  public com.example.hospital.HospitalProto getHospital() {
    return hospital_ == null ? com.example.hospital.HospitalProto.getDefaultInstance() : hospital_;
  }
  /**
   * <code>optional .hospital.HospitalProto hospital = 1;</code>
   */
  @java.lang.Override
  public com.example.hospital.HospitalProtoOrBuilder getHospitalOrBuilder() {
    return hospital_ == null ? com.example.hospital.HospitalProto.getDefaultInstance() : hospital_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getHospital());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHospital());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.hospital.CreateHospitalResponse)) {
      return super.equals(obj);
    }
    com.example.hospital.CreateHospitalResponse other = (com.example.hospital.CreateHospitalResponse) obj;

    if (hasHospital() != other.hasHospital()) return false;
    if (hasHospital()) {
      if (!getHospital()
          .equals(other.getHospital())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHospital()) {
      hash = (37 * hash) + HOSPITAL_FIELD_NUMBER;
      hash = (53 * hash) + getHospital().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.hospital.CreateHospitalResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.hospital.CreateHospitalResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.hospital.CreateHospitalResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.hospital.CreateHospitalResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.hospital.CreateHospitalResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.hospital.CreateHospitalResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.hospital.CreateHospitalResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.hospital.CreateHospitalResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.hospital.CreateHospitalResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.hospital.CreateHospitalResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.hospital.CreateHospitalResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.hospital.CreateHospitalResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.hospital.CreateHospitalResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code hospital.CreateHospitalResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hospital.CreateHospitalResponse)
      com.example.hospital.CreateHospitalResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.hospital.Hospitalystem.internal_static_hospital_CreateHospitalResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.hospital.Hospitalystem.internal_static_hospital_CreateHospitalResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.hospital.CreateHospitalResponse.class, com.example.hospital.CreateHospitalResponse.Builder.class);
    }

    // Construct using com.example.hospital.CreateHospitalResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getHospitalFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      hospital_ = null;
      if (hospitalBuilder_ != null) {
        hospitalBuilder_.dispose();
        hospitalBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.hospital.Hospitalystem.internal_static_hospital_CreateHospitalResponse_descriptor;
    }

    @java.lang.Override
    public com.example.hospital.CreateHospitalResponse getDefaultInstanceForType() {
      return com.example.hospital.CreateHospitalResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.hospital.CreateHospitalResponse build() {
      com.example.hospital.CreateHospitalResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.hospital.CreateHospitalResponse buildPartial() {
      com.example.hospital.CreateHospitalResponse result = new com.example.hospital.CreateHospitalResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.hospital.CreateHospitalResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hospital_ = hospitalBuilder_ == null
            ? hospital_
            : hospitalBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.hospital.CreateHospitalResponse) {
        return mergeFrom((com.example.hospital.CreateHospitalResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.hospital.CreateHospitalResponse other) {
      if (other == com.example.hospital.CreateHospitalResponse.getDefaultInstance()) return this;
      if (other.hasHospital()) {
        mergeHospital(other.getHospital());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getHospitalFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.example.hospital.HospitalProto hospital_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.hospital.HospitalProto, com.example.hospital.HospitalProto.Builder, com.example.hospital.HospitalProtoOrBuilder> hospitalBuilder_;
    /**
     * <code>optional .hospital.HospitalProto hospital = 1;</code>
     * @return Whether the hospital field is set.
     */
    public boolean hasHospital() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .hospital.HospitalProto hospital = 1;</code>
     * @return The hospital.
     */
    public com.example.hospital.HospitalProto getHospital() {
      if (hospitalBuilder_ == null) {
        return hospital_ == null ? com.example.hospital.HospitalProto.getDefaultInstance() : hospital_;
      } else {
        return hospitalBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .hospital.HospitalProto hospital = 1;</code>
     */
    public Builder setHospital(com.example.hospital.HospitalProto value) {
      if (hospitalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hospital_ = value;
      } else {
        hospitalBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .hospital.HospitalProto hospital = 1;</code>
     */
    public Builder setHospital(
        com.example.hospital.HospitalProto.Builder builderForValue) {
      if (hospitalBuilder_ == null) {
        hospital_ = builderForValue.build();
      } else {
        hospitalBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .hospital.HospitalProto hospital = 1;</code>
     */
    public Builder mergeHospital(com.example.hospital.HospitalProto value) {
      if (hospitalBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          hospital_ != null &&
          hospital_ != com.example.hospital.HospitalProto.getDefaultInstance()) {
          getHospitalBuilder().mergeFrom(value);
        } else {
          hospital_ = value;
        }
      } else {
        hospitalBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .hospital.HospitalProto hospital = 1;</code>
     */
    public Builder clearHospital() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hospital_ = null;
      if (hospitalBuilder_ != null) {
        hospitalBuilder_.dispose();
        hospitalBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .hospital.HospitalProto hospital = 1;</code>
     */
    public com.example.hospital.HospitalProto.Builder getHospitalBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHospitalFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .hospital.HospitalProto hospital = 1;</code>
     */
    public com.example.hospital.HospitalProtoOrBuilder getHospitalOrBuilder() {
      if (hospitalBuilder_ != null) {
        return hospitalBuilder_.getMessageOrBuilder();
      } else {
        return hospital_ == null ?
            com.example.hospital.HospitalProto.getDefaultInstance() : hospital_;
      }
    }
    /**
     * <code>optional .hospital.HospitalProto hospital = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.hospital.HospitalProto, com.example.hospital.HospitalProto.Builder, com.example.hospital.HospitalProtoOrBuilder> 
        getHospitalFieldBuilder() {
      if (hospitalBuilder_ == null) {
        hospitalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.hospital.HospitalProto, com.example.hospital.HospitalProto.Builder, com.example.hospital.HospitalProtoOrBuilder>(
                getHospital(),
                getParentForChildren(),
                isClean());
        hospital_ = null;
      }
      return hospitalBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:hospital.CreateHospitalResponse)
  }

  // @@protoc_insertion_point(class_scope:hospital.CreateHospitalResponse)
  private static final com.example.hospital.CreateHospitalResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.hospital.CreateHospitalResponse();
  }

  public static com.example.hospital.CreateHospitalResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateHospitalResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateHospitalResponse>() {
    @java.lang.Override
    public CreateHospitalResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CreateHospitalResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateHospitalResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.hospital.CreateHospitalResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
