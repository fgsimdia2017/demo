// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_type_def.proto

package com.demo.model.proto.gateway;

/**
 * <pre>
 * 买卖方向 BuySellDirectType
 * </pre>
 *
 * Protobuf enum {@code com.demo.model.proto.gateway.BSDirectType}
 */
public enum BSDirectType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知的买卖方向
   * </pre>
   *
   * <code>UNKNOWN_BS = 0;</code>
   */
  UNKNOWN_BS(0),
  /**
   * <pre>
   * 买
   * </pre>
   *
   * <code>BUY = 1;</code>
   */
  BUY(1),
  /**
   * <pre>
   * 卖 
   * </pre>
   *
   * <code>SELL = 2;</code>
   */
  SELL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知的买卖方向
   * </pre>
   *
   * <code>UNKNOWN_BS = 0;</code>
   */
  public static final int UNKNOWN_BS_VALUE = 0;
  /**
   * <pre>
   * 买
   * </pre>
   *
   * <code>BUY = 1;</code>
   */
  public static final int BUY_VALUE = 1;
  /**
   * <pre>
   * 卖 
   * </pre>
   *
   * <code>SELL = 2;</code>
   */
  public static final int SELL_VALUE = 2;


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
  public static BSDirectType valueOf(int value) {
    return forNumber(value);
  }

  public static BSDirectType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_BS;
      case 1: return BUY;
      case 2: return SELL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BSDirectType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BSDirectType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BSDirectType>() {
          public BSDirectType findValueByNumber(int number) {
            return BSDirectType.forNumber(number);
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
        .getEnumTypes().get(19);
  }

  private static final BSDirectType[] VALUES = values();

  public static BSDirectType valueOf(
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

  private BSDirectType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.gateway.BSDirectType)
}

