// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

/**
 * <pre>
 * 查询持仓汇总
 * </pre>
 *
 * Protobuf type {@code com.demo.model.proto.gateway.QueryPositionSummaryReq}
 */
public  final class QueryPositionSummaryReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.demo.model.proto.gateway.QueryPositionSummaryReq)
    QueryPositionSummaryReqOrBuilder {
  // Use QueryPositionSummaryReq.newBuilder() to construct.
  private QueryPositionSummaryReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryPositionSummaryReq() {
    sessionId_ = 0L;
    account_ = "";
    exchange_ = 0;
    instrCode_ = "";
    pageNum_ = 0;
    requestNum_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private QueryPositionSummaryReq(
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
          case 24: {
            int rawValue = input.readEnum();

            exchange_ = rawValue;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            instrCode_ = s;
            break;
          }
          case 40: {

            pageNum_ = input.readUInt32();
            break;
          }
          case 48: {

            requestNum_ = input.readUInt32();
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
    return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryPositionSummaryReq_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryPositionSummaryReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            QueryPositionSummaryReq.class, Builder.class);
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

  public static final int EXCHANGE_FIELD_NUMBER = 3;
  private int exchange_;
  /**
   * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 3;</code>
   */
  public int getExchangeValue() {
    return exchange_;
  }
  /**
   * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 3;</code>
   */
  public com.demo.model.proto.trade.common.ExchangeType getExchange() {
    com.demo.model.proto.trade.common.ExchangeType result = com.demo.model.proto.trade.common.ExchangeType.valueOf(exchange_);
    return result == null ? com.demo.model.proto.trade.common.ExchangeType.UNRECOGNIZED : result;
  }

  public static final int INSTR_CODE_FIELD_NUMBER = 4;
  private volatile Object instrCode_;
  /**
   * <code>optional string instr_code = 4;</code>
   */
  public String getInstrCode() {
    Object ref = instrCode_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      instrCode_ = s;
      return s;
    }
  }
  /**
   * <code>optional string instr_code = 4;</code>
   */
  public com.google.protobuf.ByteString
      getInstrCodeBytes() {
    Object ref = instrCode_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      instrCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_NUM_FIELD_NUMBER = 5;
  private int pageNum_;
  /**
   * <pre>
   * 页码
   * </pre>
   *
   * <code>optional uint32 page_num = 5;</code>
   */
  public int getPageNum() {
    return pageNum_;
  }

  public static final int REQUEST_NUM_FIELD_NUMBER = 6;
  private int requestNum_;
  /**
   * <pre>
   * 请求行数
   * </pre>
   *
   * <code>optional uint32 request_num = 6;</code>
   */
  public int getRequestNum() {
    return requestNum_;
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
    if (exchange_ != com.demo.model.proto.trade.common.ExchangeType.UNKNOWN.getNumber()) {
      output.writeEnum(3, exchange_);
    }
    if (!getInstrCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, instrCode_);
    }
    if (pageNum_ != 0) {
      output.writeUInt32(5, pageNum_);
    }
    if (requestNum_ != 0) {
      output.writeUInt32(6, requestNum_);
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
    if (exchange_ != com.demo.model.proto.trade.common.ExchangeType.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, exchange_);
    }
    if (!getInstrCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, instrCode_);
    }
    if (pageNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, pageNum_);
    }
    if (requestNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, requestNum_);
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
    if (!(obj instanceof QueryPositionSummaryReq)) {
      return super.equals(obj);
    }
    QueryPositionSummaryReq other = (QueryPositionSummaryReq) obj;

    boolean result = true;
    result = result && (getSessionId()
        == other.getSessionId());
    result = result && getAccount()
        .equals(other.getAccount());
    result = result && exchange_ == other.exchange_;
    result = result && getInstrCode()
        .equals(other.getInstrCode());
    result = result && (getPageNum()
        == other.getPageNum());
    result = result && (getRequestNum()
        == other.getRequestNum());
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
    hash = (37 * hash) + EXCHANGE_FIELD_NUMBER;
    hash = (53 * hash) + exchange_;
    hash = (37 * hash) + INSTR_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getInstrCode().hashCode();
    hash = (37 * hash) + PAGE_NUM_FIELD_NUMBER;
    hash = (53 * hash) + getPageNum();
    hash = (37 * hash) + REQUEST_NUM_FIELD_NUMBER;
    hash = (53 * hash) + getRequestNum();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static QueryPositionSummaryReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryPositionSummaryReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryPositionSummaryReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryPositionSummaryReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryPositionSummaryReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryPositionSummaryReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryPositionSummaryReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static QueryPositionSummaryReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryPositionSummaryReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryPositionSummaryReq parseFrom(
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
  public static Builder newBuilder(QueryPositionSummaryReq prototype) {
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
   * 查询持仓汇总
   * </pre>
   *
   * Protobuf type {@code com.demo.model.proto.gateway.QueryPositionSummaryReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.demo.model.proto.gateway.QueryPositionSummaryReq)
      QueryPositionSummaryReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryPositionSummaryReq_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryPositionSummaryReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              QueryPositionSummaryReq.class, Builder.class);
    }

    // Construct using com.demo.model.proto.gateway.QueryPositionSummaryReq.newBuilder()
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

      exchange_ = 0;

      instrCode_ = "";

      pageNum_ = 0;

      requestNum_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryPositionSummaryReq_descriptor;
    }

    public QueryPositionSummaryReq getDefaultInstanceForType() {
      return QueryPositionSummaryReq.getDefaultInstance();
    }

    public QueryPositionSummaryReq build() {
      QueryPositionSummaryReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public QueryPositionSummaryReq buildPartial() {
      QueryPositionSummaryReq result = new QueryPositionSummaryReq(this);
      result.sessionId_ = sessionId_;
      result.account_ = account_;
      result.exchange_ = exchange_;
      result.instrCode_ = instrCode_;
      result.pageNum_ = pageNum_;
      result.requestNum_ = requestNum_;
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
      if (other instanceof QueryPositionSummaryReq) {
        return mergeFrom((QueryPositionSummaryReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(QueryPositionSummaryReq other) {
      if (other == QueryPositionSummaryReq.getDefaultInstance()) return this;
      if (other.getSessionId() != 0L) {
        setSessionId(other.getSessionId());
      }
      if (!other.getAccount().isEmpty()) {
        account_ = other.account_;
        onChanged();
      }
      if (other.exchange_ != 0) {
        setExchangeValue(other.getExchangeValue());
      }
      if (!other.getInstrCode().isEmpty()) {
        instrCode_ = other.instrCode_;
        onChanged();
      }
      if (other.getPageNum() != 0) {
        setPageNum(other.getPageNum());
      }
      if (other.getRequestNum() != 0) {
        setRequestNum(other.getRequestNum());
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
      QueryPositionSummaryReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (QueryPositionSummaryReq) e.getUnfinishedMessage();
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
     * <code>optional string account = 2;</code>
     */
    public Builder clearAccount() {
      
      account_ = getDefaultInstance().getAccount();
      onChanged();
      return this;
    }
    /**
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

    private int exchange_ = 0;
    /**
     * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 3;</code>
     */
    public int getExchangeValue() {
      return exchange_;
    }
    /**
     * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 3;</code>
     */
    public Builder setExchangeValue(int value) {
      exchange_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 3;</code>
     */
    public com.demo.model.proto.trade.common.ExchangeType getExchange() {
      com.demo.model.proto.trade.common.ExchangeType result = com.demo.model.proto.trade.common.ExchangeType.valueOf(exchange_);
      return result == null ? com.demo.model.proto.trade.common.ExchangeType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 3;</code>
     */
    public Builder setExchange(com.demo.model.proto.trade.common.ExchangeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      exchange_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 3;</code>
     */
    public Builder clearExchange() {
      
      exchange_ = 0;
      onChanged();
      return this;
    }

    private Object instrCode_ = "";
    /**
     * <code>optional string instr_code = 4;</code>
     */
    public String getInstrCode() {
      Object ref = instrCode_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        instrCode_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string instr_code = 4;</code>
     */
    public com.google.protobuf.ByteString
        getInstrCodeBytes() {
      Object ref = instrCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        instrCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string instr_code = 4;</code>
     */
    public Builder setInstrCode(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instrCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string instr_code = 4;</code>
     */
    public Builder clearInstrCode() {
      
      instrCode_ = getDefaultInstance().getInstrCode();
      onChanged();
      return this;
    }
    /**
     * <code>optional string instr_code = 4;</code>
     */
    public Builder setInstrCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instrCode_ = value;
      onChanged();
      return this;
    }

    private int pageNum_ ;
    /**
     * <pre>
     * 页码
     * </pre>
     *
     * <code>optional uint32 page_num = 5;</code>
     */
    public int getPageNum() {
      return pageNum_;
    }
    /**
     * <pre>
     * 页码
     * </pre>
     *
     * <code>optional uint32 page_num = 5;</code>
     */
    public Builder setPageNum(int value) {
      
      pageNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 页码
     * </pre>
     *
     * <code>optional uint32 page_num = 5;</code>
     */
    public Builder clearPageNum() {
      
      pageNum_ = 0;
      onChanged();
      return this;
    }

    private int requestNum_ ;
    /**
     * <pre>
     * 请求行数
     * </pre>
     *
     * <code>optional uint32 request_num = 6;</code>
     */
    public int getRequestNum() {
      return requestNum_;
    }
    /**
     * <pre>
     * 请求行数
     * </pre>
     *
     * <code>optional uint32 request_num = 6;</code>
     */
    public Builder setRequestNum(int value) {
      
      requestNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 请求行数
     * </pre>
     *
     * <code>optional uint32 request_num = 6;</code>
     */
    public Builder clearRequestNum() {
      
      requestNum_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.demo.model.proto.gateway.QueryPositionSummaryReq)
  }

  // @@protoc_insertion_point(class_scope:com.demo.model.proto.gateway.QueryPositionSummaryReq)
  private static final QueryPositionSummaryReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new QueryPositionSummaryReq();
  }

  public static QueryPositionSummaryReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryPositionSummaryReq>
      PARSER = new com.google.protobuf.AbstractParser<QueryPositionSummaryReq>() {
    public QueryPositionSummaryReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new QueryPositionSummaryReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryPositionSummaryReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<QueryPositionSummaryReq> getParserForType() {
    return PARSER;
  }

  public QueryPositionSummaryReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

