// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_type_def.proto

package com.demo.model.proto.common;

/**
 * Protobuf enum {@code com.demo.model.proto.common.DeliverModeType}
 */
public enum DeliverModeType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *实物交割
   * </pre>
   *
   * <code>DELIVERY_MODE_GOODS = 0;</code>
   */
  DELIVERY_MODE_GOODS(0),
  /**
   * <pre>
   *现金交割
   * </pre>
   *
   * <code>DELIVERY_MODE_CASH = 1;</code>
   */
  DELIVERY_MODE_CASH(1),
  /**
   * <pre>
   *期权行权
   * </pre>
   *
   * <code>DELIVERY_MODE_EXECUTE = 2;</code>
   */
  DELIVERY_MODE_EXECUTE(2),
  /**
   * <pre>
   *期权放弃
   * </pre>
   *
   * <code>DELIVERY_MODE_ABANMON = 3;</code>
   */
  DELIVERY_MODE_ABANMON(3),
  /**
   * <pre>
   *港交所行权
   * </pre>
   *
   * <code>DELIVERY_MODE_HKF = 4;</code>
   */
  DELIVERY_MODE_HKF(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *实物交割
   * </pre>
   *
   * <code>DELIVERY_MODE_GOODS = 0;</code>
   */
  public static final int DELIVERY_MODE_GOODS_VALUE = 0;
  /**
   * <pre>
   *现金交割
   * </pre>
   *
   * <code>DELIVERY_MODE_CASH = 1;</code>
   */
  public static final int DELIVERY_MODE_CASH_VALUE = 1;
  /**
   * <pre>
   *期权行权
   * </pre>
   *
   * <code>DELIVERY_MODE_EXECUTE = 2;</code>
   */
  public static final int DELIVERY_MODE_EXECUTE_VALUE = 2;
  /**
   * <pre>
   *期权放弃
   * </pre>
   *
   * <code>DELIVERY_MODE_ABANMON = 3;</code>
   */
  public static final int DELIVERY_MODE_ABANMON_VALUE = 3;
  /**
   * <pre>
   *港交所行权
   * </pre>
   *
   * <code>DELIVERY_MODE_HKF = 4;</code>
   */
  public static final int DELIVERY_MODE_HKF_VALUE = 4;


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
  public static DeliverModeType valueOf(int value) {
    return forNumber(value);
  }

  public static DeliverModeType forNumber(int value) {
    switch (value) {
      case 0: return DELIVERY_MODE_GOODS;
      case 1: return DELIVERY_MODE_CASH;
      case 2: return DELIVERY_MODE_EXECUTE;
      case 3: return DELIVERY_MODE_ABANMON;
      case 4: return DELIVERY_MODE_HKF;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeliverModeType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DeliverModeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DeliverModeType>() {
          public DeliverModeType findValueByNumber(int number) {
            return DeliverModeType.forNumber(number);
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
        .getEnumTypes().get(16);
  }

  private static final DeliverModeType[] VALUES = values();

  public static DeliverModeType valueOf(
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

  private DeliverModeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.common.DeliverModeType)
}

