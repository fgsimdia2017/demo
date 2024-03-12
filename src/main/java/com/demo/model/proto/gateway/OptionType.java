// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_type_def.proto

package com.demo.model.proto.gateway;

/**
 * <pre>
 * 期权类型
 * </pre>
 *
 * Protobuf enum {@code com.demo.model.proto.gateway.OptionType}
 */
public enum OptionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知期权类型 
   * </pre>
   *
   * <code>UNKNOWN_OPT = 0;</code>
   */
  UNKNOWN_OPT(0),
  /**
   * <pre>
   * 看涨期权
   * </pre>
   *
   * <code>CALL = 1;</code>
   */
  CALL(1),
  /**
   * <pre>
   * 看跌期权
   * </pre>
   *
   * <code>PUT = 2;</code>
   */
  PUT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知期权类型 
   * </pre>
   *
   * <code>UNKNOWN_OPT = 0;</code>
   */
  public static final int UNKNOWN_OPT_VALUE = 0;
  /**
   * <pre>
   * 看涨期权
   * </pre>
   *
   * <code>CALL = 1;</code>
   */
  public static final int CALL_VALUE = 1;
  /**
   * <pre>
   * 看跌期权
   * </pre>
   *
   * <code>PUT = 2;</code>
   */
  public static final int PUT_VALUE = 2;


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
  public static OptionType valueOf(int value) {
    return forNumber(value);
  }

  public static OptionType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_OPT;
      case 1: return CALL;
      case 2: return PUT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OptionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OptionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OptionType>() {
          public OptionType findValueByNumber(int number) {
            return OptionType.forNumber(number);
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
        .getEnumTypes().get(13);
  }

  private static final OptionType[] VALUES = values();

  public static OptionType valueOf(
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

  private OptionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.gateway.OptionType)
}
