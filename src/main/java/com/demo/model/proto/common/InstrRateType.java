// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_type_def.proto

package com.demo.model.proto.common;

/**
 * <pre>
 * 保证金收取方式
 * </pre>
 *
 * Protobuf enum {@code com.demo.model.proto.common.InstrRateType}
 */
public enum InstrRateType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知 
   * </pre>
   *
   * <code>UNKNOWN_RATE = 0;</code>
   */
  UNKNOWN_RATE(0),
  /**
   * <pre>
   * 按金额收取    
   * </pre>
   *
   * <code>BY_COST = 1;</code>
   */
  BY_COST(1),
  /**
   * <pre>
   * 按手数收取
   * </pre>
   *
   * <code>BY_VOL = 2;</code>
   */
  BY_VOL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知 
   * </pre>
   *
   * <code>UNKNOWN_RATE = 0;</code>
   */
  public static final int UNKNOWN_RATE_VALUE = 0;
  /**
   * <pre>
   * 按金额收取    
   * </pre>
   *
   * <code>BY_COST = 1;</code>
   */
  public static final int BY_COST_VALUE = 1;
  /**
   * <pre>
   * 按手数收取
   * </pre>
   *
   * <code>BY_VOL = 2;</code>
   */
  public static final int BY_VOL_VALUE = 2;


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
  public static InstrRateType valueOf(int value) {
    return forNumber(value);
  }

  public static InstrRateType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_RATE;
      case 1: return BY_COST;
      case 2: return BY_VOL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InstrRateType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InstrRateType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InstrRateType>() {
          public InstrRateType findValueByNumber(int number) {
            return InstrRateType.forNumber(number);
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
        .getEnumTypes().get(3);
  }

  private static final InstrRateType[] VALUES = values();

  public static InstrRateType valueOf(
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

  private InstrRateType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.common.InstrRateType)
}

