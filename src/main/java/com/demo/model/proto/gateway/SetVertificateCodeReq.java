// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

/**
 * Protobuf type {@code com.demo.model.proto.gateway.SetVertificateCodeReq}
 */
public  final class SetVertificateCodeReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.demo.model.proto.gateway.SetVertificateCodeReq)
    SetVertificateCodeReqOrBuilder {
  // Use SetVertificateCodeReq.newBuilder() to construct.
  private SetVertificateCodeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetVertificateCodeReq() {
    account_ = "";
    vertificateCode_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SetVertificateCodeReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            account_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            vertificateCode_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return TradeMsgDef.internal_static_com_demo_model_proto_gateway_SetVertificateCodeReq_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TradeMsgDef.internal_static_com_demo_model_proto_gateway_SetVertificateCodeReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SetVertificateCodeReq.class, Builder.class);
  }

  public static final int ACCOUNT_FIELD_NUMBER = 1;
  private volatile Object account_;
  /**
   * <code>optional string account = 1;</code>
   */
  public String getAccount() {
    Object ref = account_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      account_ = s;
      return s;
    }
  }
  /**
   * <code>optional string account = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAccountBytes() {
    Object ref = account_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      account_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERTIFICATECODE_FIELD_NUMBER = 2;
  private volatile Object vertificateCode_;
  /**
   * <code>optional string vertificateCode = 2;</code>
   */
  public String getVertificateCode() {
    Object ref = vertificateCode_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      vertificateCode_ = s;
      return s;
    }
  }
  /**
   * <code>optional string vertificateCode = 2;</code>
   */
  public com.google.protobuf.ByteString
      getVertificateCodeBytes() {
    Object ref = vertificateCode_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      vertificateCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAccountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, account_);
    }
    if (!getVertificateCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, vertificateCode_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAccountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, account_);
    }
    if (!getVertificateCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, vertificateCode_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof SetVertificateCodeReq)) {
      return super.equals(obj);
    }
    SetVertificateCodeReq other = (SetVertificateCodeReq) obj;

    boolean result = true;
    result = result && getAccount()
        .equals(other.getAccount());
    result = result && getVertificateCode()
        .equals(other.getVertificateCode());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAccount().hashCode();
    hash = (37 * hash) + VERTIFICATECODE_FIELD_NUMBER;
    hash = (53 * hash) + getVertificateCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SetVertificateCodeReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SetVertificateCodeReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SetVertificateCodeReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SetVertificateCodeReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SetVertificateCodeReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SetVertificateCodeReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SetVertificateCodeReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SetVertificateCodeReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SetVertificateCodeReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SetVertificateCodeReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(SetVertificateCodeReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.demo.model.proto.gateway.SetVertificateCodeReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.demo.model.proto.gateway.SetVertificateCodeReq)
      SetVertificateCodeReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_SetVertificateCodeReq_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_SetVertificateCodeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SetVertificateCodeReq.class, Builder.class);
    }

    // Construct using com.demo.model.proto.gateway.SetVertificateCodeReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      account_ = "";

      vertificateCode_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_SetVertificateCodeReq_descriptor;
    }

    public SetVertificateCodeReq getDefaultInstanceForType() {
      return SetVertificateCodeReq.getDefaultInstance();
    }

    public SetVertificateCodeReq build() {
      SetVertificateCodeReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public SetVertificateCodeReq buildPartial() {
      SetVertificateCodeReq result = new SetVertificateCodeReq(this);
      result.account_ = account_;
      result.vertificateCode_ = vertificateCode_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof SetVertificateCodeReq) {
        return mergeFrom((SetVertificateCodeReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SetVertificateCodeReq other) {
      if (other == SetVertificateCodeReq.getDefaultInstance()) return this;
      if (!other.getAccount().isEmpty()) {
        account_ = other.account_;
        onChanged();
      }
      if (!other.getVertificateCode().isEmpty()) {
        vertificateCode_ = other.vertificateCode_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      SetVertificateCodeReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SetVertificateCodeReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object account_ = "";
    /**
     * <code>optional string account = 1;</code>
     */
    public String getAccount() {
      Object ref = account_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        account_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string account = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAccountBytes() {
      Object ref = account_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string account = 1;</code>
     */
    public Builder setAccount(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      account_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string account = 1;</code>
     */
    public Builder clearAccount() {
      
      account_ = getDefaultInstance().getAccount();
      onChanged();
      return this;
    }
    /**
     * <code>optional string account = 1;</code>
     */
    public Builder setAccountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      account_ = value;
      onChanged();
      return this;
    }

    private Object vertificateCode_ = "";
    /**
     * <code>optional string vertificateCode = 2;</code>
     */
    public String getVertificateCode() {
      Object ref = vertificateCode_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        vertificateCode_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string vertificateCode = 2;</code>
     */
    public com.google.protobuf.ByteString
        getVertificateCodeBytes() {
      Object ref = vertificateCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        vertificateCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string vertificateCode = 2;</code>
     */
    public Builder setVertificateCode(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vertificateCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string vertificateCode = 2;</code>
     */
    public Builder clearVertificateCode() {
      
      vertificateCode_ = getDefaultInstance().getVertificateCode();
      onChanged();
      return this;
    }
    /**
     * <code>optional string vertificateCode = 2;</code>
     */
    public Builder setVertificateCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vertificateCode_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.demo.model.proto.gateway.SetVertificateCodeReq)
  }

  // @@protoc_insertion_point(class_scope:com.demo.model.proto.gateway.SetVertificateCodeReq)
  private static final SetVertificateCodeReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SetVertificateCodeReq();
  }

  public static SetVertificateCodeReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetVertificateCodeReq>
      PARSER = new com.google.protobuf.AbstractParser<SetVertificateCodeReq>() {
    public SetVertificateCodeReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetVertificateCodeReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetVertificateCodeReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SetVertificateCodeReq> getParserForType() {
    return PARSER;
  }

  public SetVertificateCodeReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

