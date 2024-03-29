// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_msg_def.proto

package com.demo.model.proto.common;

/**
 * <pre>
 * 交易时间片定义
 * </pre>
 *
 * Protobuf type {@code com.demo.model.proto.common.TradingTimespin}
 */
public  final class TradingTimespin extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.demo.model.proto.common.TradingTimespin)
    TradingTimespinOrBuilder {
  // Use TradingTimespin.newBuilder() to construct.
  private TradingTimespin(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TradingTimespin() {
    start_ = 0;
    end_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TradingTimespin(
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

            start_ = input.readUInt32();
            break;
          }
          case 16: {

            end_ = input.readUInt32();
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
    return CommonMsgDef.internal_static_com_demo_model_proto_common_TradingTimespin_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return CommonMsgDef.internal_static_com_demo_model_proto_common_TradingTimespin_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            TradingTimespin.class, Builder.class);
  }

  public static final int START_FIELD_NUMBER = 1;
  private int start_;
  /**
   * <pre>
   * 开始时间 101010 10:10:10 
   * </pre>
   *
   * <code>optional uint32 start = 1;</code>
   */
  public int getStart() {
    return start_;
  }

  public static final int END_FIELD_NUMBER = 2;
  private int end_;
  /**
   * <pre>
   * 结束时间 101010 10:10:10 
   * </pre>
   *
   * <code>optional uint32 end = 2;</code>
   */
  public int getEnd() {
    return end_;
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
    if (start_ != 0) {
      output.writeUInt32(1, start_);
    }
    if (end_ != 0) {
      output.writeUInt32(2, end_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (start_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, start_);
    }
    if (end_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, end_);
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
    if (!(obj instanceof TradingTimespin)) {
      return super.equals(obj);
    }
    TradingTimespin other = (TradingTimespin) obj;

    boolean result = true;
    result = result && (getStart()
        == other.getStart());
    result = result && (getEnd()
        == other.getEnd());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + getStart();
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + getEnd();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static TradingTimespin parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TradingTimespin parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TradingTimespin parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TradingTimespin parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TradingTimespin parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TradingTimespin parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static TradingTimespin parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static TradingTimespin parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static TradingTimespin parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TradingTimespin parseFrom(
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
  public static Builder newBuilder(TradingTimespin prototype) {
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
   * 交易时间片定义
   * </pre>
   *
   * Protobuf type {@code com.demo.model.proto.common.TradingTimespin}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.demo.model.proto.common.TradingTimespin)
      TradingTimespinOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CommonMsgDef.internal_static_com_demo_model_proto_common_TradingTimespin_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CommonMsgDef.internal_static_com_demo_model_proto_common_TradingTimespin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TradingTimespin.class, Builder.class);
    }

    // Construct using com.demo.model.proto.common.TradingTimespin.newBuilder()
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
      start_ = 0;

      end_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return CommonMsgDef.internal_static_com_demo_model_proto_common_TradingTimespin_descriptor;
    }

    public TradingTimespin getDefaultInstanceForType() {
      return TradingTimespin.getDefaultInstance();
    }

    public TradingTimespin build() {
      TradingTimespin result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public TradingTimespin buildPartial() {
      TradingTimespin result = new TradingTimespin(this);
      result.start_ = start_;
      result.end_ = end_;
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
      if (other instanceof TradingTimespin) {
        return mergeFrom((TradingTimespin)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(TradingTimespin other) {
      if (other == TradingTimespin.getDefaultInstance()) return this;
      if (other.getStart() != 0) {
        setStart(other.getStart());
      }
      if (other.getEnd() != 0) {
        setEnd(other.getEnd());
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
      TradingTimespin parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (TradingTimespin) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int start_ ;
    /**
     * <pre>
     * 开始时间 101010 10:10:10 
     * </pre>
     *
     * <code>optional uint32 start = 1;</code>
     */
    public int getStart() {
      return start_;
    }
    /**
     * <pre>
     * 开始时间 101010 10:10:10 
     * </pre>
     *
     * <code>optional uint32 start = 1;</code>
     */
    public Builder setStart(int value) {
      
      start_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 开始时间 101010 10:10:10 
     * </pre>
     *
     * <code>optional uint32 start = 1;</code>
     */
    public Builder clearStart() {
      
      start_ = 0;
      onChanged();
      return this;
    }

    private int end_ ;
    /**
     * <pre>
     * 结束时间 101010 10:10:10 
     * </pre>
     *
     * <code>optional uint32 end = 2;</code>
     */
    public int getEnd() {
      return end_;
    }
    /**
     * <pre>
     * 结束时间 101010 10:10:10 
     * </pre>
     *
     * <code>optional uint32 end = 2;</code>
     */
    public Builder setEnd(int value) {
      
      end_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 结束时间 101010 10:10:10 
     * </pre>
     *
     * <code>optional uint32 end = 2;</code>
     */
    public Builder clearEnd() {
      
      end_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.demo.model.proto.common.TradingTimespin)
  }

  // @@protoc_insertion_point(class_scope:com.demo.model.proto.common.TradingTimespin)
  private static final TradingTimespin DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TradingTimespin();
  }

  public static TradingTimespin getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TradingTimespin>
      PARSER = new com.google.protobuf.AbstractParser<TradingTimespin>() {
    public TradingTimespin parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TradingTimespin(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TradingTimespin> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<TradingTimespin> getParserForType() {
    return PARSER;
  }

  public TradingTimespin getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

