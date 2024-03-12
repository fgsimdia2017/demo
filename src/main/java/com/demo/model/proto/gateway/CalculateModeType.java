// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_type_def.proto

package com.demo.model.proto.gateway;

/**
 * <pre>
 * 保证金计算方法
 * </pre>
 *
 * Protobuf enum {@code com.demo.model.proto.gateway.CalculateModeType}
 */
public enum CalculateModeType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_TYPE = 0;</code>
   */
  UNKNOWN_TYPE(0),
  /**
   * <pre>
   * 比例+定额（仅限手续费）大于0.01部分为定额，小于0.01部分为比例，如：0.001为比例收取1%
   * </pre>
   *
   * <code>COMBINE = 1;</code>
   */
  COMBINE(1),
  /**
   * <pre>
   * 比例
   * </pre>
   *
   * <code>PERCENTAGE = 2;</code>
   */
  PERCENTAGE(2),
  /**
   * <pre>
   * 定额
   * </pre>
   *
   * <code>QUOTA = 3;</code>
   */
  QUOTA(3),
  /**
   * <pre>
   * 差值比例
   * </pre>
   *
   * <code>CHAPERCENTAGE = 4;</code>
   */
  CHAPERCENTAGE(4),
  /**
   * <pre>
   * 差值定额
   * </pre>
   *
   * <code>CHAQUOTA = 5;</code>
   */
  CHAQUOTA(5),
  /**
   * <pre>
   * 折扣
   * </pre>
   *
   * <code>DISCOUNT = 6;</code>
   */
  DISCOUNT(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_TYPE = 0;</code>
   */
  public static final int UNKNOWN_TYPE_VALUE = 0;
  /**
   * <pre>
   * 比例+定额（仅限手续费）大于0.01部分为定额，小于0.01部分为比例，如：0.001为比例收取1%
   * </pre>
   *
   * <code>COMBINE = 1;</code>
   */
  public static final int COMBINE_VALUE = 1;
  /**
   * <pre>
   * 比例
   * </pre>
   *
   * <code>PERCENTAGE = 2;</code>
   */
  public static final int PERCENTAGE_VALUE = 2;
  /**
   * <pre>
   * 定额
   * </pre>
   *
   * <code>QUOTA = 3;</code>
   */
  public static final int QUOTA_VALUE = 3;
  /**
   * <pre>
   * 差值比例
   * </pre>
   *
   * <code>CHAPERCENTAGE = 4;</code>
   */
  public static final int CHAPERCENTAGE_VALUE = 4;
  /**
   * <pre>
   * 差值定额
   * </pre>
   *
   * <code>CHAQUOTA = 5;</code>
   */
  public static final int CHAQUOTA_VALUE = 5;
  /**
   * <pre>
   * 折扣
   * </pre>
   *
   * <code>DISCOUNT = 6;</code>
   */
  public static final int DISCOUNT_VALUE = 6;


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
  public static CalculateModeType valueOf(int value) {
    return forNumber(value);
  }

  public static CalculateModeType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_TYPE;
      case 1: return COMBINE;
      case 2: return PERCENTAGE;
      case 3: return QUOTA;
      case 4: return CHAPERCENTAGE;
      case 5: return CHAQUOTA;
      case 6: return DISCOUNT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CalculateModeType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CalculateModeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CalculateModeType>() {
          public CalculateModeType findValueByNumber(int number) {
            return CalculateModeType.forNumber(number);
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
        .getEnumTypes().get(6);
  }

  private static final CalculateModeType[] VALUES = values();

  public static CalculateModeType valueOf(
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

  private CalculateModeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.gateway.CalculateModeType)
}

