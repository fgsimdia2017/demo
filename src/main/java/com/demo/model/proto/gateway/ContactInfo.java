// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

/**
 * Protobuf type {@code com.demo.model.proto.gateway.ContactInfo}
 */
public  final class ContactInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.demo.model.proto.gateway.ContactInfo)
    ContactInfoOrBuilder {
  // Use ContactInfo.newBuilder() to construct.
  private ContactInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContactInfo() {
    account_ = "";
    contact_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ContactInfo(
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
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              contact_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            contact_.add(s);
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
        contact_ = contact_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return TradeMsgDef.internal_static_com_demo_model_proto_gateway_ContactInfo_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TradeMsgDef.internal_static_com_demo_model_proto_gateway_ContactInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ContactInfo.class, Builder.class);
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

  public static final int CONTACT_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList contact_;
  /**
   * <code>repeated string contact = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getContactList() {
    return contact_;
  }
  /**
   * <code>repeated string contact = 3;</code>
   */
  public int getContactCount() {
    return contact_.size();
  }
  /**
   * <code>repeated string contact = 3;</code>
   */
  public String getContact(int index) {
    return contact_.get(index);
  }
  /**
   * <code>repeated string contact = 3;</code>
   */
  public com.google.protobuf.ByteString
      getContactBytes(int index) {
    return contact_.getByteString(index);
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
    for (int i = 0; i < contact_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, contact_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < contact_.size(); i++) {
        dataSize += computeStringSizeNoTag(contact_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getContactList().size();
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
    if (!(obj instanceof ContactInfo)) {
      return super.equals(obj);
    }
    ContactInfo other = (ContactInfo) obj;

    boolean result = true;
    result = result && (hasRet() == other.hasRet());
    if (hasRet()) {
      result = result && getRet()
          .equals(other.getRet());
    }
    result = result && getAccount()
        .equals(other.getAccount());
    result = result && getContactList()
        .equals(other.getContactList());
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
    if (getContactCount() > 0) {
      hash = (37 * hash) + CONTACT_FIELD_NUMBER;
      hash = (53 * hash) + getContactList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ContactInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ContactInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ContactInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ContactInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ContactInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ContactInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ContactInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ContactInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ContactInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ContactInfo parseFrom(
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
  public static Builder newBuilder(ContactInfo prototype) {
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
   * Protobuf type {@code com.demo.model.proto.gateway.ContactInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.demo.model.proto.gateway.ContactInfo)
      ContactInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_ContactInfo_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_ContactInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ContactInfo.class, Builder.class);
    }

    // Construct using com.demo.model.proto.gateway.ContactInfo.newBuilder()
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
      if (retBuilder_ == null) {
        ret_ = null;
      } else {
        ret_ = null;
        retBuilder_ = null;
      }
      account_ = "";

      contact_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TradeMsgDef.internal_static_com_demo_model_proto_gateway_ContactInfo_descriptor;
    }

    public ContactInfo getDefaultInstanceForType() {
      return ContactInfo.getDefaultInstance();
    }

    public ContactInfo build() {
      ContactInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ContactInfo buildPartial() {
      ContactInfo result = new ContactInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (retBuilder_ == null) {
        result.ret_ = ret_;
      } else {
        result.ret_ = retBuilder_.build();
      }
      result.account_ = account_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        contact_ = contact_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.contact_ = contact_;
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
      if (other instanceof ContactInfo) {
        return mergeFrom((ContactInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ContactInfo other) {
      if (other == ContactInfo.getDefaultInstance()) return this;
      if (other.hasRet()) {
        mergeRet(other.getRet());
      }
      if (!other.getAccount().isEmpty()) {
        account_ = other.account_;
        onChanged();
      }
      if (!other.contact_.isEmpty()) {
        if (contact_.isEmpty()) {
          contact_ = other.contact_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureContactIsMutable();
          contact_.addAll(other.contact_);
        }
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
      ContactInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ContactInfo) e.getUnfinishedMessage();
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

    private com.google.protobuf.LazyStringList contact_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureContactIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        contact_ = new com.google.protobuf.LazyStringArrayList(contact_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated string contact = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getContactList() {
      return contact_.getUnmodifiableView();
    }
    /**
     * <code>repeated string contact = 3;</code>
     */
    public int getContactCount() {
      return contact_.size();
    }
    /**
     * <code>repeated string contact = 3;</code>
     */
    public String getContact(int index) {
      return contact_.get(index);
    }
    /**
     * <code>repeated string contact = 3;</code>
     */
    public com.google.protobuf.ByteString
        getContactBytes(int index) {
      return contact_.getByteString(index);
    }
    /**
     * <code>repeated string contact = 3;</code>
     */
    public Builder setContact(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureContactIsMutable();
      contact_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string contact = 3;</code>
     */
    public Builder addContact(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureContactIsMutable();
      contact_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string contact = 3;</code>
     */
    public Builder addAllContact(
        Iterable<String> values) {
      ensureContactIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, contact_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string contact = 3;</code>
     */
    public Builder clearContact() {
      contact_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string contact = 3;</code>
     */
    public Builder addContactBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureContactIsMutable();
      contact_.add(value);
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


    // @@protoc_insertion_point(builder_scope:com.demo.model.proto.gateway.ContactInfo)
  }

  // @@protoc_insertion_point(class_scope:com.demo.model.proto.gateway.ContactInfo)
  private static final ContactInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ContactInfo();
  }

  public static ContactInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContactInfo>
      PARSER = new com.google.protobuf.AbstractParser<ContactInfo>() {
    public ContactInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ContactInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ContactInfo> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ContactInfo> getParserForType() {
    return PARSER;
  }

  public ContactInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

