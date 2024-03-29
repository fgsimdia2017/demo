// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_type_def.proto

package com.demo.model.proto.gateway;

/**
 * <pre>
 * 期权定价方式
 * </pre>
 *
 * Protobuf enum {@code com.demo.model.proto.gateway.OptionStrikeType}
 */
public enum OptionStrikeType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知的定价方式
   * </pre>
   *
   * <code>UNKNOWN_STRIKE = 0;</code>
   */
  UNKNOWN_STRIKE(0),
  /**
   * <pre>
   * 欧式定价
   * </pre>
   *
   * <code>CONTINENTAL = 1;</code>
   */
  CONTINENTAL(1),
  /**
   * <pre>
   * 美式
   * </pre>
   *
   * <code>AMERICAN = 2;</code>
   */
  AMERICAN(2),
  /**
   * <pre>
   * 百慕大
   * </pre>
   *
   * <code>BERMUDA = 3;</code>
   */
  BERMUDA(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知的定价方式
   * </pre>
   *
   * <code>UNKNOWN_STRIKE = 0;</code>
   */
  public static final int UNKNOWN_STRIKE_VALUE = 0;
  /**
   * <pre>
   * 欧式定价
   * </pre>
   *
   * <code>CONTINENTAL = 1;</code>
   */
  public static final int CONTINENTAL_VALUE = 1;
  /**
   * <pre>
   * 美式
   * </pre>
   *
   * <code>AMERICAN = 2;</code>
   */
  public static final int AMERICAN_VALUE = 2;
  /**
   * <pre>
   * 百慕大
   * </pre>
   *
   * <code>BERMUDA = 3;</code>
   */
  public static final int BERMUDA_VALUE = 3;


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
  public static OptionStrikeType valueOf(int value) {
    return forNumber(value);
  }

  public static OptionStrikeType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_STRIKE;
      case 1: return CONTINENTAL;
      case 2: return AMERICAN;
      case 3: return BERMUDA;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OptionStrikeType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OptionStrikeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OptionStrikeType>() {
          public OptionStrikeType findValueByNumber(int number) {
            return OptionStrikeType.forNumber(number);
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
        .getEnumTypes().get(14);
  }

  private static final OptionStrikeType[] VALUES = values();

  public static OptionStrikeType valueOf(
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

  private OptionStrikeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.gateway.OptionStrikeType)
}

