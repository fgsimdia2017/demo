// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_type_def.proto

package com.demo.model.proto.common;

/**
 * <pre>
 * 合约类型
 * </pre>
 *
 * Protobuf enum {@code com.demo.model.proto.common.InstrType}
 */
public enum InstrType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知类型
   * </pre>
   *
   * <code>UNKNOWN_INSTR = 0;</code>
   */
  UNKNOWN_INSTR(0),
  /**
   * <pre>
   * 普通合约
   * </pre>
   *
   * <code>NORMAL = 1;</code>
   */
  NORMAL(1),
  /**
   * <pre>
   * 组合合约
   * </pre>
   *
   * <code>COMB = 2;</code>
   */
  COMB(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知类型
   * </pre>
   *
   * <code>UNKNOWN_INSTR = 0;</code>
   */
  public static final int UNKNOWN_INSTR_VALUE = 0;
  /**
   * <pre>
   * 普通合约
   * </pre>
   *
   * <code>NORMAL = 1;</code>
   */
  public static final int NORMAL_VALUE = 1;
  /**
   * <pre>
   * 组合合约
   * </pre>
   *
   * <code>COMB = 2;</code>
   */
  public static final int COMB_VALUE = 2;


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
  public static InstrType valueOf(int value) {
    return forNumber(value);
  }

  public static InstrType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_INSTR;
      case 1: return NORMAL;
      case 2: return COMB;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InstrType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InstrType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InstrType>() {
          public InstrType findValueByNumber(int number) {
            return InstrType.forNumber(number);
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
        .getEnumTypes().get(1);
  }

  private static final InstrType[] VALUES = values();

  public static InstrType valueOf(
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

  private InstrType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.common.InstrType)
}
