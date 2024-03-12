// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_type_def.proto

package com.demo.model.proto.common;

/**
 * Protobuf enum {@code com.demo.model.proto.common.RetCode}
 */
public enum RetCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_CODE = 0;</code>
   */
  UNKNOWN_CODE(0),
  /**
   * <code>SUCCESS = 1;</code>
   */
  SUCCESS(1),
  /**
   * <code>FAILURE = 2;</code>
   */
  FAILURE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_CODE = 0;</code>
   */
  public static final int UNKNOWN_CODE_VALUE = 0;
  /**
   * <code>SUCCESS = 1;</code>
   */
  public static final int SUCCESS_VALUE = 1;
  /**
   * <code>FAILURE = 2;</code>
   */
  public static final int FAILURE_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static RetCode valueOf(int value) {
    return forNumber(value);
  }

  public static RetCode forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_CODE;
      case 1: return SUCCESS;
      case 2: return FAILURE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RetCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RetCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RetCode>() {
          public RetCode findValueByNumber(int number) {
            return RetCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return CommonTypeDef.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final RetCode[] VALUES = values();

  public static RetCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private RetCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.common.RetCode)
}

