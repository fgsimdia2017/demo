// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_common_msg_def.proto

package com.demo.model.proto.trade.common;

/**
 * <pre>
 * 心跳请求
 * </pre>
 *
 * Protobuf type {@code com.demo.model.proto.trade.common.HeartReqMsg}
 */
public  final class HeartReqMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.demo.model.proto.trade.common.HeartReqMsg)
    HeartReqMsgOrBuilder {
  // Use HeartReqMsg.newBuilder() to construct.
  private HeartReqMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeartReqMsg() {
    connId_ = 0L;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private HeartReqMsg(
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
          case 8: {

            connId_ = input.readUInt64();
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
    return TradeCommonMsgDef.internal_static_com_demo_model_proto_trade_common_HeartReqMsg_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TradeCommonMsgDef.internal_static_com_demo_model_proto_trade_common_HeartReqMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            HeartReqMsg.class, Builder.class);
  }

  public static final int CONN_ID_FIELD_NUMBER = 1;
  private long connId_;
  /**
   * <pre>
   * 占位符,连接ID 
   * </pre>
   *
   * <code>optional uint64 conn_id = 1;</code>
   */
  public long getConnId() {
    return connId_;
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
    if (connId_ != 0L) {
      output.writeUInt64(1, connId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (connId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, connId_);
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
    if (!(obj instanceof HeartReqMsg)) {
      return super.equals(obj);
    }
    HeartReqMsg other = (HeartReqMsg) obj;

    boolean result = true;
    result = result && (getConnId()
        == other.getConnId());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + CONN_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getConnId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static HeartReqMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static HeartReqMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static HeartReqMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static HeartReqMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static HeartReqMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static HeartReqMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static HeartReqMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static HeartReqMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static HeartReqMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static HeartReqMsg parseFrom(
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
  public static Builder newBuilder(HeartReqMsg prototype) {
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
   * <pre>
   * 心跳请求
   * </pre>
   *
   * Protobuf type {@code com.demo.model.proto.trade.common.HeartReqMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.demo.model.proto.trade.common.HeartReqMsg)
      HeartReqMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TradeCommonMsgDef.internal_static_com_demo_model_proto_trade_common_HeartReqMsg_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TradeCommonMsgDef.internal_static_com_demo_model_proto_trade_common_HeartReqMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HeartReqMsg.class, Builder.class);
    }

    // Construct using com.demo.model.proto.trade.common.HeartReqMsg.newBuilder()
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
      connId_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TradeCommonMsgDef.internal_static_com_demo_model_proto_trade_common_HeartReqMsg_descriptor;
    }

    public HeartReqMsg getDefaultInstanceForType() {
      return HeartReqMsg.getDefaultInstance();
    }

    public HeartReqMsg build() {
      HeartReqMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public HeartReqMsg buildPartial() {
      HeartReqMsg result = new HeartReqMsg(this);
      result.connId_ = connId_;
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
      if (other instanceof HeartReqMsg) {
        return mergeFrom((HeartReqMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(HeartReqMsg other) {
      if (other == HeartReqMsg.getDefaultInstance()) return this;
      if (other.getConnId() != 0L) {
        setConnId(other.getConnId());
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
      HeartReqMsg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (HeartReqMsg) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long connId_ ;
    /**
     * <pre>
     * 占位符,连接ID 
     * </pre>
     *
     * <code>optional uint64 conn_id = 1;</code>
     */
    public long getConnId() {
      return connId_;
    }
    /**
     * <pre>
     * 占位符,连接ID 
     * </pre>
     *
     * <code>optional uint64 conn_id = 1;</code>
     */
    public Builder setConnId(long value) {
      
      connId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 占位符,连接ID 
     * </pre>
     *
     * <code>optional uint64 conn_id = 1;</code>
     */
    public Builder clearConnId() {
      
      connId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:com.demo.model.proto.trade.common.HeartReqMsg)
  }

  // @@protoc_insertion_point(class_scope:com.demo.model.proto.trade.common.HeartReqMsg)
  private static final HeartReqMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new HeartReqMsg();
  }

  public static HeartReqMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeartReqMsg>
      PARSER = new com.google.protobuf.AbstractParser<HeartReqMsg>() {
    public HeartReqMsg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new HeartReqMsg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HeartReqMsg> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<HeartReqMsg> getParserForType() {
    return PARSER;
  }

  public HeartReqMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
