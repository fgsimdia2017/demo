// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

/**
 * Protobuf type {@code com.demo.model.proto.gateway.QueryCommodityRsps}
 */
public  final class QueryCommodityRsps extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.demo.model.proto.gateway.QueryCommodityRsps)
    QueryCommodityRspsOrBuilder {
  // Use QueryCommodityRsps.newBuilder() to construct.
  private QueryCommodityRsps(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryCommodityRsps() {
    account_ = "";
    commoditys_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private QueryCommodityRsps(
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
            TradeRetCode.Builder subBuilder = null;
            if (ret_ != null) {
              subBuilder = ret_.toBuilder();
            }
            ret_ = input.readMessage(TradeRetCode.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ret_);
              ret_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            account_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              commoditys_ = new java.util.ArrayList<CommodityInfo>();
              mutable_bitField0_ |= 0x00000004;
            }
            commoditys_.add(
                input.readMessage(CommodityInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        commoditys_ = java.util.Collections.unmodifiableList(commoditys_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryCommodityRsps_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryCommodityRsps_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            QueryCommodityRsps.class, Builder.class);
  }

  private int bitField0_;
  public static final int RET_FIELD_NUMBER = 1;
  private TradeRetCode ret_;
  /**
   * <pre>
   * 业务处理返回信息 
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
   */
  public boolean hasRet() {
    return ret_ != null;
  }
  /**
   * <pre>
   * 业务处理返回信息 
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
   */
  public TradeRetCode getRet() {
    return ret_ == null ? TradeRetCode.getDefaultInstance() : ret_;
  }
  /**
   * <pre>
   * 业务处理返回信息 
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
   */
  public TradeRetCodeOrBuilder getRetOrBuilder() {
    return getRet();
  }

  public static final int ACCOUNT_FIELD_NUMBER = 2;
  private volatile Object account_;
  /**
   * <pre>
   * 账号
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
   * 账号
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

  public static final int COMMODITYS_FIELD_NUMBER = 3;
  private java.util.List<CommodityInfo> commoditys_;
  /**
   * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
   */
  public java.util.List<CommodityInfo> getCommoditysList() {
    return commoditys_;
  }
  /**
   * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
   */
  public java.util.List<? extends CommodityInfoOrBuilder>
      getCommoditysOrBuilderList() {
    return commoditys_;
  }
  /**
   * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
   */
  public int getCommoditysCount() {
    return commoditys_.size();
  }
  /**
   * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
   */
  public CommodityInfo getCommoditys(int index) {
    return commoditys_.get(index);
  }
  /**
   * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
   */
  public CommodityInfoOrBuilder getCommoditysOrBuilder(
      int index) {
    return commoditys_.get(index);
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
    if (ret_ != null) {
      output.writeMessage(1, getRet());
    }
    if (!getAccountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, account_);
    }
    for (int i = 0; i < commoditys_.size(); i++) {
      output.writeMessage(3, commoditys_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ret_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRet());
    }
    if (!getAccountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, account_);
    }
    for (int i = 0; i < commoditys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, commoditys_.get(i));
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
    if (!(obj instanceof QueryCommodityRsps)) {
      return super.equals(obj);
    }
    QueryCommodityRsps other = (QueryCommodityRsps) obj;

    boolean result = true;
    result = result && (hasRet() == other.hasRet());
    if (hasRet()) {
      result = result && getRet()
          .equals(other.getRet());
    }
    result = result && getAccount()
        .equals(other.getAccount());
    result = result && getCommoditysList()
        .equals(other.getCommoditysList());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasRet()) {
      hash = (37 * hash) + RET_FIELD_NUMBER;
      hash = (53 * hash) + getRet().hashCode();
    }
    hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAccount().hashCode();
    if (getCommoditysCount() > 0) {
      hash = (37 * hash) + COMMODITYS_FIELD_NUMBER;
      hash = (53 * hash) + getCommoditysList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static QueryCommodityRsps parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryCommodityRsps parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryCommodityRsps parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryCommodityRsps parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryCommodityRsps parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryCommodityRsps parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryCommodityRsps parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static QueryCommodityRsps parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryCommodityRsps parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryCommodityRsps parseFrom(
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
  public static Builder newBuilder(QueryCommodityRsps prototype) {
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
   * Protobuf type {@code com.demo.model.proto.gateway.QueryCommodityRsps}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.demo.model.proto.gateway.QueryCommodityRsps)
      QueryCommodityRspsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryCommodityRsps_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryCommodityRsps_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              QueryCommodityRsps.class, Builder.class);
    }

    // Construct using com.demo.model.proto.gateway.QueryCommodityRsps.newBuilder()
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
        getCommoditysFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (retBuilder_ == null) {
        ret_ = null;
      } else {
        ret_ = null;
        retBuilder_ = null;
      }
      account_ = "";

      if (commoditysBuilder_ == null) {
        commoditys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        commoditysBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_QueryCommodityRsps_descriptor;
    }

    public QueryCommodityRsps getDefaultInstanceForType() {
      return QueryCommodityRsps.getDefaultInstance();
    }

    public QueryCommodityRsps build() {
      QueryCommodityRsps result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public QueryCommodityRsps buildPartial() {
      QueryCommodityRsps result = new QueryCommodityRsps(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (retBuilder_ == null) {
        result.ret_ = ret_;
      } else {
        result.ret_ = retBuilder_.build();
      }
      result.account_ = account_;
      if (commoditysBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          commoditys_ = java.util.Collections.unmodifiableList(commoditys_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.commoditys_ = commoditys_;
      } else {
        result.commoditys_ = commoditysBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof QueryCommodityRsps) {
        return mergeFrom((QueryCommodityRsps)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(QueryCommodityRsps other) {
      if (other == QueryCommodityRsps.getDefaultInstance()) return this;
      if (other.hasRet()) {
        mergeRet(other.getRet());
      }
      if (!other.getAccount().isEmpty()) {
        account_ = other.account_;
        onChanged();
      }
      if (commoditysBuilder_ == null) {
        if (!other.commoditys_.isEmpty()) {
          if (commoditys_.isEmpty()) {
            commoditys_ = other.commoditys_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureCommoditysIsMutable();
            commoditys_.addAll(other.commoditys_);
          }
          onChanged();
        }
      } else {
        if (!other.commoditys_.isEmpty()) {
          if (commoditysBuilder_.isEmpty()) {
            commoditysBuilder_.dispose();
            commoditysBuilder_ = null;
            commoditys_ = other.commoditys_;
            bitField0_ = (bitField0_ & ~0x00000004);
            commoditysBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCommoditysFieldBuilder() : null;
          } else {
            commoditysBuilder_.addAllMessages(other.commoditys_);
          }
        }
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
      QueryCommodityRsps parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (QueryCommodityRsps) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private TradeRetCode ret_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        TradeRetCode, TradeRetCode.Builder, TradeRetCodeOrBuilder> retBuilder_;
    /**
     * <pre>
     * 业务处理返回信息 
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
     */
    public boolean hasRet() {
      return retBuilder_ != null || ret_ != null;
    }
    /**
     * <pre>
     * 业务处理返回信息 
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
     */
    public TradeRetCode getRet() {
      if (retBuilder_ == null) {
        return ret_ == null ? TradeRetCode.getDefaultInstance() : ret_;
      } else {
        return retBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 业务处理返回信息 
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
     */
    public Builder setRet(TradeRetCode value) {
      if (retBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ret_ = value;
        onChanged();
      } else {
        retBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 业务处理返回信息 
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
     */
    public Builder setRet(
        TradeRetCode.Builder builderForValue) {
      if (retBuilder_ == null) {
        ret_ = builderForValue.build();
        onChanged();
      } else {
        retBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 业务处理返回信息 
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
     */
    public Builder mergeRet(TradeRetCode value) {
      if (retBuilder_ == null) {
        if (ret_ != null) {
          ret_ =
            TradeRetCode.newBuilder(ret_).mergeFrom(value).buildPartial();
        } else {
          ret_ = value;
        }
        onChanged();
      } else {
        retBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 业务处理返回信息 
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
     */
    public Builder clearRet() {
      if (retBuilder_ == null) {
        ret_ = null;
        onChanged();
      } else {
        ret_ = null;
        retBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 业务处理返回信息 
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
     */
    public TradeRetCode.Builder getRetBuilder() {
      
      onChanged();
      return getRetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 业务处理返回信息 
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
     */
    public TradeRetCodeOrBuilder getRetOrBuilder() {
      if (retBuilder_ != null) {
        return retBuilder_.getMessageOrBuilder();
      } else {
        return ret_ == null ?
            TradeRetCode.getDefaultInstance() : ret_;
      }
    }
    /**
     * <pre>
     * 业务处理返回信息 
     * </pre>
     *
     * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        TradeRetCode, TradeRetCode.Builder, TradeRetCodeOrBuilder>
        getRetFieldBuilder() {
      if (retBuilder_ == null) {
        retBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            TradeRetCode, TradeRetCode.Builder, TradeRetCodeOrBuilder>(
                getRet(),
                getParentForChildren(),
                isClean());
        ret_ = null;
      }
      return retBuilder_;
    }

    private Object account_ = "";
    /**
     * <pre>
     * 账号
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
     * 账号
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
     * 账号
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
     * 账号
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
     * 账号
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

    private java.util.List<CommodityInfo> commoditys_ =
      java.util.Collections.emptyList();
    private void ensureCommoditysIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        commoditys_ = new java.util.ArrayList<CommodityInfo>(commoditys_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        CommodityInfo, CommodityInfo.Builder, CommodityInfoOrBuilder> commoditysBuilder_;

    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public java.util.List<CommodityInfo> getCommoditysList() {
      if (commoditysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(commoditys_);
      } else {
        return commoditysBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public int getCommoditysCount() {
      if (commoditysBuilder_ == null) {
        return commoditys_.size();
      } else {
        return commoditysBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public CommodityInfo getCommoditys(int index) {
      if (commoditysBuilder_ == null) {
        return commoditys_.get(index);
      } else {
        return commoditysBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public Builder setCommoditys(
        int index, CommodityInfo value) {
      if (commoditysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommoditysIsMutable();
        commoditys_.set(index, value);
        onChanged();
      } else {
        commoditysBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public Builder setCommoditys(
        int index, CommodityInfo.Builder builderForValue) {
      if (commoditysBuilder_ == null) {
        ensureCommoditysIsMutable();
        commoditys_.set(index, builderForValue.build());
        onChanged();
      } else {
        commoditysBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public Builder addCommoditys(CommodityInfo value) {
      if (commoditysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommoditysIsMutable();
        commoditys_.add(value);
        onChanged();
      } else {
        commoditysBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public Builder addCommoditys(
        int index, CommodityInfo value) {
      if (commoditysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommoditysIsMutable();
        commoditys_.add(index, value);
        onChanged();
      } else {
        commoditysBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public Builder addCommoditys(
        CommodityInfo.Builder builderForValue) {
      if (commoditysBuilder_ == null) {
        ensureCommoditysIsMutable();
        commoditys_.add(builderForValue.build());
        onChanged();
      } else {
        commoditysBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public Builder addCommoditys(
        int index, CommodityInfo.Builder builderForValue) {
      if (commoditysBuilder_ == null) {
        ensureCommoditysIsMutable();
        commoditys_.add(index, builderForValue.build());
        onChanged();
      } else {
        commoditysBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public Builder addAllCommoditys(
        Iterable<? extends CommodityInfo> values) {
      if (commoditysBuilder_ == null) {
        ensureCommoditysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, commoditys_);
        onChanged();
      } else {
        commoditysBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public Builder clearCommoditys() {
      if (commoditysBuilder_ == null) {
        commoditys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        commoditysBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public Builder removeCommoditys(int index) {
      if (commoditysBuilder_ == null) {
        ensureCommoditysIsMutable();
        commoditys_.remove(index);
        onChanged();
      } else {
        commoditysBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public CommodityInfo.Builder getCommoditysBuilder(
        int index) {
      return getCommoditysFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public CommodityInfoOrBuilder getCommoditysOrBuilder(
        int index) {
      if (commoditysBuilder_ == null) {
        return commoditys_.get(index);  } else {
        return commoditysBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public java.util.List<? extends CommodityInfoOrBuilder>
         getCommoditysOrBuilderList() {
      if (commoditysBuilder_ != null) {
        return commoditysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(commoditys_);
      }
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public CommodityInfo.Builder addCommoditysBuilder() {
      return getCommoditysFieldBuilder().addBuilder(
          CommodityInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public CommodityInfo.Builder addCommoditysBuilder(
        int index) {
      return getCommoditysFieldBuilder().addBuilder(
          index, CommodityInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .com.demo.model.proto.gateway.CommodityInfo commoditys = 3;</code>
     */
    public java.util.List<CommodityInfo.Builder>
         getCommoditysBuilderList() {
      return getCommoditysFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        CommodityInfo, CommodityInfo.Builder, CommodityInfoOrBuilder>
        getCommoditysFieldBuilder() {
      if (commoditysBuilder_ == null) {
        commoditysBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            CommodityInfo, CommodityInfo.Builder, CommodityInfoOrBuilder>(
                commoditys_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        commoditys_ = null;
      }
      return commoditysBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.demo.model.proto.gateway.QueryCommodityRsps)
  }

  // @@protoc_insertion_point(class_scope:com.demo.model.proto.gateway.QueryCommodityRsps)
  private static final QueryCommodityRsps DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new QueryCommodityRsps();
  }

  public static QueryCommodityRsps getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryCommodityRsps>
      PARSER = new com.google.protobuf.AbstractParser<QueryCommodityRsps>() {
    public QueryCommodityRsps parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new QueryCommodityRsps(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryCommodityRsps> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<QueryCommodityRsps> getParserForType() {
    return PARSER;
  }

  public QueryCommodityRsps getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
