// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_type_def.proto

package com.demo.model.proto.gateway;

/**
 * <pre>
 * 结算类型
 * </pre>
 *
 * Protobuf enum {@code com.demo.model.proto.gateway.SettleFlag}
 */
public enum SettleFlag
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知结算标志
   * </pre>
   *
   * <code>UNKNOWN_SETTLE_FLAG = 0;</code>
   */
  UNKNOWN_SETTLE_FLAG(0),
  /**
   * <pre>
   * 自动结算
   * </pre>
   *
   * <code>AUTO_SETTLE = 1;</code>
   */
  AUTO_SETTLE(1),
  /**
   * <pre>
   * 人工结算
   * </pre>
   *
   * <code>MANUAL_SETTLE = 2;</code>
   */
  MANUAL_SETTLE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知结算标志
   * </pre>
   *
   * <code>UNKNOWN_SETTLE_FLAG = 0;</code>
   */
  public static final int UNKNOWN_SETTLE_FLAG_VALUE = 0;
  /**
   * <pre>
   * 自动结算
   * </pre>
   *
   * <code>AUTO_SETTLE = 1;</code>
   */
  public static final int AUTO_SETTLE_VALUE = 1;
  /**
   * <pre>
   * 人工结算
   * </pre>
   *
   * <code>MANUAL_SETTLE = 2;</code>
   */
  public static final int MANUAL_SETTLE_VALUE = 2;


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
  public static SettleFlag valueOf(int value) {
    return forNumber(value);
  }

  public static SettleFlag forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_SETTLE_FLAG;
      case 1: return AUTO_SETTLE;
      case 2: return MANUAL_SETTLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SettleFlag>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SettleFlag> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SettleFlag>() {
          public SettleFlag findValueByNumber(int number) {
            return SettleFlag.forNumber(number);
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
    return TradeTypeDef.getDescriptor()
        .getEnumTypes().get(17);
  }

  private static final SettleFlag[] VALUES = values();

  public static SettleFlag valueOf(
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

  private SettleFlag(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.gateway.SettleFlag)
}
