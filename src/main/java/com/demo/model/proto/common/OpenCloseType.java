// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_type_def.proto

package com.demo.model.proto.common;

/**
 * Protobuf enum {@code com.demo.model.proto.common.OpenCloseType}
 */
public enum OpenCloseType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *不区分开平
   * </pre>
   *
   * <code>CLOSE_MODE_NONE = 0;</code>
   */
  CLOSE_MODE_NONE(0),
  /**
   * <pre>
   *平仓未了结
   * </pre>
   *
   * <code>CLOSE_MODE_UNFINISHED = 1;</code>
   */
  CLOSE_MODE_UNFINISHED(1),
  /**
   * <pre>
   *区分开仓和平仓
   * </pre>
   *
   * <code>CLOSE_MODE_OPENCOVER = 2;</code>
   */
  CLOSE_MODE_OPENCOVER(2),
  /**
   * <pre>
   *区分开仓、平仓和平今
   * </pre>
   *
   * <code>CLOSE_MODE_CLOSETODAAY = 3;</code>
   */
  CLOSE_MODE_CLOSETODAAY(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *不区分开平
   * </pre>
   *
   * <code>CLOSE_MODE_NONE = 0;</code>
   */
  public static final int CLOSE_MODE_NONE_VALUE = 0;
  /**
   * <pre>
   *平仓未了结
   * </pre>
   *
   * <code>CLOSE_MODE_UNFINISHED = 1;</code>
   */
  public static final int CLOSE_MODE_UNFINISHED_VALUE = 1;
  /**
   * <pre>
   *区分开仓和平仓
   * </pre>
   *
   * <code>CLOSE_MODE_OPENCOVER = 2;</code>
   */
  public static final int CLOSE_MODE_OPENCOVER_VALUE = 2;
  /**
   * <pre>
   *区分开仓、平仓和平今
   * </pre>
   *
   * <code>CLOSE_MODE_CLOSETODAAY = 3;</code>
   */
  public static final int CLOSE_MODE_CLOSETODAAY_VALUE = 3;


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
  public static OpenCloseType valueOf(int value) {
    return forNumber(value);
  }

  public static OpenCloseType forNumber(int value) {
    switch (value) {
      case 0: return CLOSE_MODE_NONE;
      case 1: return CLOSE_MODE_UNFINISHED;
      case 2: return CLOSE_MODE_OPENCOVER;
      case 3: return CLOSE_MODE_CLOSETODAAY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OpenCloseType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OpenCloseType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OpenCloseType>() {
          public OpenCloseType findValueByNumber(int number) {
            return OpenCloseType.forNumber(number);
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
        .getEnumTypes().get(14);
  }

  private static final OpenCloseType[] VALUES = values();

  public static OpenCloseType valueOf(
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

  private OpenCloseType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.common.OpenCloseType)
}

