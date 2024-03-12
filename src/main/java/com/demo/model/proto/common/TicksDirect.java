// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_type_def.proto

package com.demo.model.proto.common;

/**
 * <pre>
 * 成交买卖方向
 * </pre>
 *
 * Protobuf enum {@code com.demo.model.proto.common.TicksDirect}
 */
public enum TicksDirect
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知
   * </pre>
   *
   * <code>UNKNOWN_DIRECT = 0;</code>
   */
  UNKNOWN_DIRECT(0),
  /**
   * <pre>
   * 买盘
   * </pre>
   *
   * <code>BUY = 1;</code>
   */
  BUY(1),
  /**
   * <pre>
   * 卖盘
   * </pre>
   *
   * <code>SELL = 2;</code>
   */
  SELL(2),
  /**
   * <pre>
   * 无状态
   * </pre>
   *
   * <code>NO_STATE = 3;</code>
   */
  NO_STATE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知
   * </pre>
   *
   * <code>UNKNOWN_DIRECT = 0;</code>
   */
  public static final int UNKNOWN_DIRECT_VALUE = 0;
  /**
   * <pre>
   * 买盘
   * </pre>
   *
   * <code>BUY = 1;</code>
   */
  public static final int BUY_VALUE = 1;
  /**
   * <pre>
   * 卖盘
   * </pre>
   *
   * <code>SELL = 2;</code>
   */
  public static final int SELL_VALUE = 2;
  /**
   * <pre>
   * 无状态
   * </pre>
   *
   * <code>NO_STATE = 3;</code>
   */
  public static final int NO_STATE_VALUE = 3;


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
  public static TicksDirect valueOf(int value) {
    return forNumber(value);
  }

  public static TicksDirect forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_DIRECT;
      case 1: return BUY;
      case 2: return SELL;
      case 3: return NO_STATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TicksDirect>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TicksDirect> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TicksDirect>() {
          public TicksDirect findValueByNumber(int number) {
            return TicksDirect.forNumber(number);
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
        .getEnumTypes().get(10);
  }

  private static final TicksDirect[] VALUES = values();

  public static TicksDirect valueOf(
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

  private TicksDirect(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.common.TicksDirect)
}

