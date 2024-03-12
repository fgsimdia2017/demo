// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_common_type_def.proto

package com.demo.model.proto.trade.common;

/**
 * <pre>
 * 市场状态
 * </pre>
 *
 * Protobuf enum {@code com.demo.model.proto.trade.common.MarketStatus}
 */
public enum MarketStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知
   * </pre>
   *
   * <code>UNKNOWN_MARKET = 0;</code>
   */
  UNKNOWN_MARKET(0),
  /**
   * <pre>
   * 休市
   * </pre>
   *
   * <code>MARKET_SUSPEND = 1;</code>
   */
  MARKET_SUSPEND(1),
  /**
   * <pre>
   * 竞价
   * </pre>
   *
   * <code>BIDDING_PRICE = 2;</code>
   */
  BIDDING_PRICE(2),
  /**
   * <pre>
   * 开盘
   * </pre>
   *
   * <code>OPEN_QUOTATION = 3;</code>
   */
  OPEN_QUOTATION(3),
  /**
   * <pre>
   * 收盘
   * </pre>
   *
   * <code>CLOSING_QUOTATION = 4;</code>
   */
  CLOSING_QUOTATION(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知
   * </pre>
   *
   * <code>UNKNOWN_MARKET = 0;</code>
   */
  public static final int UNKNOWN_MARKET_VALUE = 0;
  /**
   * <pre>
   * 休市
   * </pre>
   *
   * <code>MARKET_SUSPEND = 1;</code>
   */
  public static final int MARKET_SUSPEND_VALUE = 1;
  /**
   * <pre>
   * 竞价
   * </pre>
   *
   * <code>BIDDING_PRICE = 2;</code>
   */
  public static final int BIDDING_PRICE_VALUE = 2;
  /**
   * <pre>
   * 开盘
   * </pre>
   *
   * <code>OPEN_QUOTATION = 3;</code>
   */
  public static final int OPEN_QUOTATION_VALUE = 3;
  /**
   * <pre>
   * 收盘
   * </pre>
   *
   * <code>CLOSING_QUOTATION = 4;</code>
   */
  public static final int CLOSING_QUOTATION_VALUE = 4;


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
  public static MarketStatus valueOf(int value) {
    return forNumber(value);
  }

  public static MarketStatus forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_MARKET;
      case 1: return MARKET_SUSPEND;
      case 2: return BIDDING_PRICE;
      case 3: return OPEN_QUOTATION;
      case 4: return CLOSING_QUOTATION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MarketStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MarketStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MarketStatus>() {
          public MarketStatus findValueByNumber(int number) {
            return MarketStatus.forNumber(number);
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
    return TradeCommonTypeDef.getDescriptor()
        .getEnumTypes().get(8);
  }

  private static final MarketStatus[] VALUES = values();

  public static MarketStatus valueOf(
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

  private MarketStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.trade.common.MarketStatus)
}

