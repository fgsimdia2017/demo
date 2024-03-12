// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

/**
 * <pre>
 * 查询账户手续费计算参数
 * </pre>
 *
 * Protobuf type {@code com.demo.model.proto.gateway.QueryAccountFeeRentReq}
 */
public  final class QueryAccountFeeRentReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.demo.model.proto.gateway.QueryAccountFeeRentReq)
    QueryAccountFeeRentReqOrBuilder {
  // Use QueryAccountFeeRentReq.newBuilder() to construct.
  private QueryAccountFeeRentReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAccountFeeRentReq() {
    sessionId_ = 0L;
    account_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private QueryAccountFeeRentReq(
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

            sessionId_ = input.readUInt64();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            account_ = s;
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
    return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryAccountFeeRentReq_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryAccountFeeRentReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            QueryAccountFeeRentReq.class, Builder.class);
  }

  public static final int SESSION_ID_FIELD_NUMBER = 1;
  private long sessionId_;
  /**
   * <pre>
   * 会话ID
   * </pre>
   *
   * <code>optional uint64 session_id = 1;</code>
   */
  public long getSessionId() {
    return sessionId_;
  }

  public static final int ACCOUNT_FIELD_NUMBER = 2;
  private volatile Object account_;
  /**
   * <pre>
   * 账户
   * </pre>
   *
   * <code>optional string account = 2;</code>
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
   * <pre>
   * 账户
   * </pre>
   *
   * <code>optional string account = 2;</code>
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
    if (sessionId_ != 0L) {
      output.writeUInt64(1, sessionId_);
    }
    if (!getAccountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, account_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sessionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, sessionId_);
    }
    if (!getAccountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, account_);
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
    if (!(obj instanceof QueryAccountFeeRentReq)) {
      return super.equals(obj);
    }
    QueryAccountFeeRentReq other = (QueryAccountFeeRentReq) obj;

    boolean result = true;
    result = result && (getSessionId()
        == other.getSessionId());
    result = result && getAccount()
        .equals(other.getAccount());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SESSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSessionId());
    hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAccount().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static QueryAccountFeeRentReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryAccountFeeRentReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryAccountFeeRentReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryAccountFeeRentReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryAccountFeeRentReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryAccountFeeRentReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryAccountFeeRentReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static QueryAccountFeeRentReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryAccountFeeRentReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryAccountFeeRentReq parseFrom(
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
  public static Builder newBuilder(QueryAccountFeeRentReq prototype) {
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
   * 查询账户手续费计算参数
   * </pre>
   *
   * Protobuf type {@code com.demo.model.proto.gateway.QueryAccountFeeRentReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.demo.model.proto.gateway.QueryAccountFeeRentReq)
      QueryAccountFeeRentReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryAccountFeeRentReq_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryAccountFeeRentReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              QueryAccountFeeRentReq.class, Builder.class);
    }

    // Construct using com.demo.model.proto.gateway.QueryAccountFeeRentReq.newBuilder()
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
      sessionId_ = 0L;

      account_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryAccountFeeRentReq_descriptor;
    }

    public QueryAccountFeeRentReq getDefaultInstanceForType() {
      return QueryAccountFeeRentReq.getDefaultInstance();
    }

    public QueryAccountFeeRentReq build() {
      QueryAccountFeeRentReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public QueryAccountFeeRentReq buildPartial() {
      QueryAccountFeeRentReq result = new QueryAccountFeeRentReq(this);
      result.sessionId_ = sessionId_;
      result.account_ = account_;
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
      if (other instanceof QueryAccountFeeRentReq) {
        return mergeFrom((QueryAccountFeeRentReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(QueryAccountFeeRentReq other) {
      if (other == QueryAccountFeeRentReq.getDefaultInstance()) return this;
      if (other.getSessionId() != 0L) {
        setSessionId(other.getSessionId());
      }
      if (!other.getAccount().isEmpty()) {
        account_ = other.account_;
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
      QueryAccountFeeRentReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (QueryAccountFeeRentReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long sessionId_ ;
    /**
     * <pre>
     * 会话ID
     * </pre>
     *
     * <code>optional uint64 session_id = 1;</code>
     */
    public long getSessionId() {
      return sessionId_;
    }
    /**
     * <pre>
     * 会话ID
     * </pre>
     *
     * <code>optional uint64 session_id = 1;</code>
     */
    public Builder setSessionId(long value) {
      
      sessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 会话ID
     * </pre>
     *
     * <code>optional uint64 session_id = 1;</code>
     */
    public Builder clearSessionId() {
      
      sessionId_ = 0L;
      onChanged();
      return this;
    }

    private Object account_ = "";
    /**
     * <pre>
     * 账户
     * </pre>
     *
     * <code>optional string account = 2;</code>
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
     * <pre>
     * 账户
     * </pre>
     *
     * <code>optional string account = 2;</code>
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
     * <pre>
     * 账户
     * </pre>
     *
     * <code>optional string account = 2;</code>
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
     * <pre>
     * 账户
     * </pre>
     *
     * <code>optional string account = 2;</code>
     */
    public Builder clearAccount() {
      
      account_ = getDefaultInstance().getAccount();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 账户
     * </pre>
     *
     * <code>optional string account = 2;</code>
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
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.demo.model.proto.gateway.QueryAccountFeeRentReq)
  }

  // @@protoc_insertion_point(class_scope:com.demo.model.proto.gateway.QueryAccountFeeRentReq)
  private static final QueryAccountFeeRentReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new QueryAccountFeeRentReq();
  }

  public static QueryAccountFeeRentReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAccountFeeRentReq>
      PARSER = new com.google.protobuf.AbstractParser<QueryAccountFeeRentReq>() {
    public QueryAccountFeeRentReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new QueryAccountFeeRentReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryAccountFeeRentReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<QueryAccountFeeRentReq> getParserForType() {
    return PARSER;
  }

  public QueryAccountFeeRentReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

