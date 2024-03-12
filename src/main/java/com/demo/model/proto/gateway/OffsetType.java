// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_type_def.proto

package com.demo.model.proto.gateway;

/**
 * <pre>
 * 开平标志
 * </pre>
 *
 * Protobuf enum {@code com.demo.model.proto.gateway.OffsetType}
 */
public enum OffsetType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知的开平标志 "N"
   * </pre>
   *
   * <code>UNKNOWN_OFFSET = 0;</code>
   */
  UNKNOWN_OFFSET(0),
  /**
   * <pre>
   * 开仓
   * </pre>
   *
   * <code>OPEN = 1;</code>
   */
  OPEN(1),
  /**
   * <pre>
   * 平仓
   * </pre>
   *
   * <code>CLOSE = 2;</code>
   */
  CLOSE(2),
  /**
   * <pre>
   * 平今
   * </pre>
   *
   * <code>CLOSE_TODAY = 3;</code>
   */
  CLOSE_TODAY(3),
  /**
   * <pre>
   * 平昨
   * </pre>
   *
   * <code>CLOSE_YESTERDAY = 4;</code>
   */
  CLOSE_YESTERDAY(4),
  /**
   * <pre>
   * 强平
   * </pre>
   *
   * <code>FORCE_CLOSE = 5;</code>
   */
  FORCE_CLOSE(5),
  /**
   * <pre>
   * 强减
   * </pre>
   *
   * <code>FORCEOFF = 6;</code>
   */
  FORCEOFF(6),
  /**
   * <pre>
   * 本地强平
   * </pre>
   *
   * <code>LOCAL_FORCE_CLOSE = 7;</code>
   */
  LOCAL_FORCE_CLOSE(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知的开平标志 "N"
   * </pre>
   *
   * <code>UNKNOWN_OFFSET = 0;</code>
   */
  public static final int UNKNOWN_OFFSET_VALUE = 0;
  /**
   * <pre>
   * 开仓
   * </pre>
   *
   * <code>OPEN = 1;</code>
   */
  public static final int OPEN_VALUE = 1;
  /**
   * <pre>
   * 平仓
   * </pre>
   *
   * <code>CLOSE = 2;</code>
   */
  public static final int CLOSE_VALUE = 2;
  /**
   * <pre>
   * 平今
   * </pre>
   *
   * <code>CLOSE_TODAY = 3;</code>
   */
  public static final int CLOSE_TODAY_VALUE = 3;
  /**
   * <pre>
   * 平昨
   * </pre>
   *
   * <code>CLOSE_YESTERDAY = 4;</code>
   */
  public static final int CLOSE_YESTERDAY_VALUE = 4;
  /**
   * <pre>
   * 强平
   * </pre>
   *
   * <code>FORCE_CLOSE = 5;</code>
   */
  public static final int FORCE_CLOSE_VALUE = 5;
  /**
   * <pre>
   * 强减
   * </pre>
   *
   * <code>FORCEOFF = 6;</code>
   */
  public static final int FORCEOFF_VALUE = 6;
  /**
   * <pre>
   * 本地强平
   * </pre>
   *
   * <code>LOCAL_FORCE_CLOSE = 7;</code>
   */
  public static final int LOCAL_FORCE_CLOSE_VALUE = 7;


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
  public static OffsetType valueOf(int value) {
    return forNumber(value);
  }

  public static OffsetType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_OFFSET;
      case 1: return OPEN;
      case 2: return CLOSE;
      case 3: return CLOSE_TODAY;
      case 4: return CLOSE_YESTERDAY;
      case 5: return FORCE_CLOSE;
      case 6: return FORCEOFF;
      case 7: return LOCAL_FORCE_CLOSE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OffsetType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OffsetType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OffsetType>() {
          public OffsetType findValueByNumber(int number) {
            return OffsetType.forNumber(number);
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
        .getEnumTypes().get(3);
  }

  private static final OffsetType[] VALUES = values();

  public static OffsetType valueOf(
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

  private OffsetType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.gateway.OffsetType)
}

