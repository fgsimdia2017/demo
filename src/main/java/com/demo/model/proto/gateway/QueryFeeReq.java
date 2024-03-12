// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

/**
 * <pre>
 * 查询费用请求
 * </pre>
 *
 * Protobuf type {@code com.demo.model.proto.gateway.QueryFeeReq}
 */
public  final class QueryFeeReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.demo.model.proto.gateway.QueryFeeReq)
    QueryFeeReqOrBuilder {
  // Use QueryFeeReq.newBuilder() to construct.
  private QueryFeeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryFeeReq() {
    sessionId_ = 0L;
    account_ = "";
    exchange_ = 0;
    instrCode_ = "";
    precision_ = 0;
    price_ = 0L;
    qty_ = 0L;
    direct_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private QueryFeeReq(
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
          case 26: {
            String s = input.readStringRequireUtf8();

            account_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            exchange_ = rawValue;
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            instrCode_ = s;
            break;
          }
          case 48: {

            precision_ = input.readUInt32();
            break;
          }
          case 56: {

            price_ = input.readInt64();
            break;
          }
          case 64: {

            qty_ = input.readUInt64();
            break;
          }
          case 72: {
            int rawValue = input.readEnum();

            direct_ = rawValue;
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
    return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryFeeReq_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryFeeReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            QueryFeeReq.class, Builder.class);
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

  public static final int ACCOUNT_FIELD_NUMBER = 3;
  private volatile Object account_;
  /**
   * <pre>
   * 资金账号
   * </pre>
   *
   * <code>optional string account = 3;</code>
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
   * 资金账号
   * </pre>
   *
   * <code>optional string account = 3;</code>
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

  public static final int EXCHANGE_FIELD_NUMBER = 4;
  private int exchange_;
  /**
   * <pre>
   * 交易所id
   * </pre>
   *
   * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 4;</code>
   */
  public int getExchangeValue() {
    return exchange_;
  }
  /**
   * <pre>
   * 交易所id
   * </pre>
   *
   * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 4;</code>
   */
  public com.demo.model.proto.trade.common.ExchangeType getExchange() {
    com.demo.model.proto.trade.common.ExchangeType result = com.demo.model.proto.trade.common.ExchangeType.valueOf(exchange_);
    return result == null ? com.demo.model.proto.trade.common.ExchangeType.UNRECOGNIZED : result;
  }

  public static final int INSTR_CODE_FIELD_NUMBER = 5;
  private volatile Object instrCode_;
  /**
   * <pre>
   * 证券代码
   * </pre>
   *
   * <code>optional string instr_code = 5;</code>
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
   * <pre>
   * 证券代码
   * </pre>
   *
   * <code>optional string instr_code = 5;</code>
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

  public static final int PRECISION_FIELD_NUMBER = 6;
  private int precision_;
  /**
   * <pre>
   * 精度
   * </pre>
   *
   * <code>optional uint32 precision = 6;</code>
   */
  public int getPrecision() {
    return precision_;
  }

  public static final int PRICE_FIELD_NUMBER = 7;
  private long price_;
  /**
   * <pre>
   * 价格
   * </pre>
   *
   * <code>optional int64 price = 7;</code>
   */
  public long getPrice() {
    return price_;
  }

  public static final int QTY_FIELD_NUMBER = 8;
  private long qty_;
  /**
   * <pre>
   * 量
   * </pre>
   *
   * <code>optional uint64 qty = 8;</code>
   */
  public long getQty() {
    return qty_;
  }

  public static final int DIRECT_FIELD_NUMBER = 9;
  private int direct_;
  /**
   * <pre>
   * 方向
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.BSDirectType direct = 9;</code>
   */
  public int getDirectValue() {
    return direct_;
  }
  /**
   * <pre>
   * 方向
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.BSDirectType direct = 9;</code>
   */
  public BSDirectType getDirect() {
    BSDirectType result = BSDirectType.valueOf(direct_);
    return result == null ? BSDirectType.UNRECOGNIZED : result;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, account_);
    }
    if (exchange_ != com.demo.model.proto.trade.common.ExchangeType.UNKNOWN.getNumber()) {
      output.writeEnum(4, exchange_);
    }
    if (!getInstrCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, instrCode_);
    }
    if (precision_ != 0) {
      output.writeUInt32(6, precision_);
    }
    if (price_ != 0L) {
      output.writeInt64(7, price_);
    }
    if (qty_ != 0L) {
      output.writeUInt64(8, qty_);
    }
    if (direct_ != BSDirectType.UNKNOWN_BS.getNumber()) {
      output.writeEnum(9, direct_);
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
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, account_);
    }
    if (exchange_ != com.demo.model.proto.trade.common.ExchangeType.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, exchange_);
    }
    if (!getInstrCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, instrCode_);
    }
    if (precision_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, precision_);
    }
    if (price_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, price_);
    }
    if (qty_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(8, qty_);
    }
    if (direct_ != BSDirectType.UNKNOWN_BS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(9, direct_);
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
    if (!(obj instanceof QueryFeeReq)) {
      return super.equals(obj);
    }
    QueryFeeReq other = (QueryFeeReq) obj;

    boolean result = true;
    result = result && (getSessionId()
        == other.getSessionId());
    result = result && getAccount()
        .equals(other.getAccount());
    result = result && exchange_ == other.exchange_;
    result = result && getInstrCode()
        .equals(other.getInstrCode());
    result = result && (getPrecision()
        == other.getPrecision());
    result = result && (getPrice()
        == other.getPrice());
    result = result && (getQty()
        == other.getQty());
    result = result && direct_ == other.direct_;
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
    hash = (37 * hash) + PRECISION_FIELD_NUMBER;
    hash = (53 * hash) + getPrecision();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrice());
    hash = (37 * hash) + QTY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQty());
    hash = (37 * hash) + DIRECT_FIELD_NUMBER;
    hash = (53 * hash) + direct_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static QueryFeeReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryFeeReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryFeeReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryFeeReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryFeeReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryFeeReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryFeeReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static QueryFeeReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryFeeReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryFeeReq parseFrom(
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
  public static Builder newBuilder(QueryFeeReq prototype) {
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
   * 查询费用请求
   * </pre>
   *
   * Protobuf type {@code com.demo.model.proto.gateway.QueryFeeReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.demo.model.proto.gateway.QueryFeeReq)
      QueryFeeReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryFeeReq_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryFeeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              QueryFeeReq.class, Builder.class);
    }

    // Construct using com.demo.model.proto.gateway.QueryFeeReq.newBuilder()
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

      precision_ = 0;

      price_ = 0L;

      qty_ = 0L;

      direct_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryFeeReq_descriptor;
    }

    public QueryFeeReq getDefaultInstanceForType() {
      return QueryFeeReq.getDefaultInstance();
    }

    public QueryFeeReq build() {
      QueryFeeReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public QueryFeeReq buildPartial() {
      QueryFeeReq result = new QueryFeeReq(this);
      result.sessionId_ = sessionId_;
      result.account_ = account_;
      result.exchange_ = exchange_;
      result.instrCode_ = instrCode_;
      result.precision_ = precision_;
      result.price_ = price_;
      result.qty_ = qty_;
      result.direct_ = direct_;
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
      if (other instanceof QueryFeeReq) {
        return mergeFrom((QueryFeeReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(QueryFeeReq other) {
      if (other == QueryFeeReq.getDefaultInstance()) return this;
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
      if (other.getPrecision() != 0) {
        setPrecision(other.getPrecision());
      }
      if (other.getPrice() != 0L) {
        setPrice(other.getPrice());
      }
      if (other.getQty() != 0L) {
        setQty(other.getQty());
      }
      if (other.direct_ != 0) {
        setDirectValue(other.getDirectValue());
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
      QueryFeeReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (QueryFeeReq) e.getUnfinishedMessage();
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
     * 资金账号
     * </pre>
     *
     * <code>optional string account = 3;</code>
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
     * 资金账号
     * </pre>
     *
     * <code>optional string account = 3;</code>
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
     * 资金账号
     * </pre>
     *
     * <code>optional string account = 3;</code>
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
     * 资金账号
     * </pre>
     *
     * <code>optional string account = 3;</code>
     */
    public Builder clearAccount() {
      
      account_ = getDefaultInstance().getAccount();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 资金账号
     * </pre>
     *
     * <code>optional string account = 3;</code>
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
     * <pre>
     * 交易所id
     * </pre>
     *
     * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 4;</code>
     */
    public int getExchangeValue() {
      return exchange_;
    }
    /**
     * <pre>
     * 交易所id
     * </pre>
     *
     * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 4;</code>
     */
    public Builder setExchangeValue(int value) {
      exchange_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 交易所id
     * </pre>
     *
     * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 4;</code>
     */
    public com.demo.model.proto.trade.common.ExchangeType getExchange() {
      com.demo.model.proto.trade.common.ExchangeType result = com.demo.model.proto.trade.common.ExchangeType.valueOf(exchange_);
      return result == null ? com.demo.model.proto.trade.common.ExchangeType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 交易所id
     * </pre>
     *
     * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 4;</code>
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
     * <pre>
     * 交易所id
     * </pre>
     *
     * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 4;</code>
     */
    public Builder clearExchange() {
      
      exchange_ = 0;
      onChanged();
      return this;
    }

    private Object instrCode_ = "";
    /**
     * <pre>
     * 证券代码
     * </pre>
     *
     * <code>optional string instr_code = 5;</code>
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
     * <pre>
     * 证券代码
     * </pre>
     *
     * <code>optional string instr_code = 5;</code>
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
     * <pre>
     * 证券代码
     * </pre>
     *
     * <code>optional string instr_code = 5;</code>
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
     * <pre>
     * 证券代码
     * </pre>
     *
     * <code>optional string instr_code = 5;</code>
     */
    public Builder clearInstrCode() {
      
      instrCode_ = getDefaultInstance().getInstrCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 证券代码
     * </pre>
     *
     * <code>optional string instr_code = 5;</code>
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

    private int precision_ ;
    /**
     * <pre>
     * 精度
     * </pre>
     *
     * <code>optional uint32 precision = 6;</code>
     */
    public int getPrecision() {
      return precision_;
    }
    /**
     * <pre>
     * 精度
     * </pre>
     *
     * <code>optional uint32 precision = 6;</code>
     */
    public Builder setPrecision(int value) {
      
      precision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 精度
     * </pre>
     *
     * <code>optional uint32 precision = 6;</code>
     */
    public Builder clearPrecision() {
      
      precision_ = 0;
      onChanged();
      return this;
    }

    private long price_ ;
    /**
     * <pre>
     * 价格
     * </pre>
     *
     * <code>optional int64 price = 7;</code>
     */
    public long getPrice() {
      return price_;
    }
    /**
     * <pre>
     * 价格
     * </pre>
     *
     * <code>optional int64 price = 7;</code>
     */
    public Builder setPrice(long value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 价格
     * </pre>
     *
     * <code>optional int64 price = 7;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0L;
      onChanged();
      return this;
    }

    private long qty_ ;
    /**
     * <pre>
     * 量
     * </pre>
     *
     * <code>optional uint64 qty = 8;</code>
     */
    public long getQty() {
      return qty_;
    }
    /**
     * <pre>
     * 量
     * </pre>
     *
     * <code>optional uint64 qty = 8;</code>
     */
    public Builder setQty(long value) {
      
      qty_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 量
     * </pre>
     *
     * <code>optional uint64 qty = 8;</code>
     */
    public Builder clearQty() {
      
      qty_ = 0L;
      onChanged();
      return this;
    }

    private int direct_ = 0;
    /**
     * <pre>
     * 方向
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.BSDirectType direct = 9;</code>
     */
    public int getDirectValue() {
      return direct_;
    }
    /**
     * <pre>
     * 方向
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.BSDirectType direct = 9;</code>
     */
    public Builder setDirectValue(int value) {
      direct_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 方向
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.BSDirectType direct = 9;</code>
     */
    public BSDirectType getDirect() {
      BSDirectType result = BSDirectType.valueOf(direct_);
      return result == null ? BSDirectType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 方向
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.BSDirectType direct = 9;</code>
     */
    public Builder setDirect(BSDirectType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      direct_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 方向
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.BSDirectType direct = 9;</code>
     */
    public Builder clearDirect() {
      
      direct_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.demo.model.proto.gateway.QueryFeeReq)
  }

  // @@protoc_insertion_point(class_scope:com.demo.model.proto.gateway.QueryFeeReq)
  private static final QueryFeeReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new QueryFeeReq();
  }

  public static QueryFeeReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryFeeReq>
      PARSER = new com.google.protobuf.AbstractParser<QueryFeeReq>() {
    public QueryFeeReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new QueryFeeReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryFeeReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<QueryFeeReq> getParserForType() {
    return PARSER;
  }

  public QueryFeeReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

