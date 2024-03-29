// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_type_def.proto

package com.demo.model.proto.common;

public final class CommonTypeDef {
  private CommonTypeDef() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\025common_type_def.proto\022\033com.demo.model." +
      "proto.common*5\n\007RetCode\022\020\n\014UNKNOWN_CODE\020" +
      "\000\022\013\n\007SUCCESS\020\001\022\013\n\007FAILURE\020\002*4\n\tInstrType" +
      "\022\021\n\rUNKNOWN_INSTR\020\000\022\n\n\006NORMAL\020\001\022\010\n\004COMB\020" +
      "\002*\231\001\n\017InstrStatusType\022\022\n\016UNKNOWN_STATUS\020" +
      "\000\022\013\n\007STARTED\020\001\022\013\n\007TRADING\020\002\022\t\n\005PAUSE\020\003\022\014" +
      "\n\010DELIVERY\020\004\022\013\n\007EXPIRED\020\005\022\r\n\tDELISTING\020\006" +
      "\022\013\n\007SUSPEND\020\007\022\n\n\006LOCKED\020\010\022\n\n\006FUSING\020\t*:\n" +
      "\rInstrRateType\022\020\n\014UNKNOWN_RATE\020\000\022\013\n\007BY_C" +
      "OST\020\001\022\n\n\006BY_VOL\020\002*W\n\014ExchangeType\022\013\n\007UNK",
      "NOWN\020\000\022\t\n\005NYMEX\020\001\022\t\n\005COMEX\020\002\022\010\n\004CBOT\020\003\022\007" +
      "\n\003CME\020\004\022\007\n\003SGX\020\005\022\010\n\004HKEX\020\006*\223\001\n\014CurrencyT" +
      "ype\022\016\n\nCurrencyNA\020\000\022\007\n\003CNY\020\001\022\007\n\003USD\020\002\022\007\n" +
      "\003HKD\020\003\022\007\n\003EUR\020\004\022\007\n\003GBP\020\005\022\007\n\003JPY\020\006\022\007\n\003AUD" +
      "\020\007\022\007\n\003CAD\020\010\022\007\n\003CHF\020\t\022\007\n\003CNH\020\n\022\007\n\003MYR\020\013\022\007" +
      "\n\003SGD\020\014\022\007\n\003TWD\020\r*\342\001\n\014CategoryType\022\020\n\014UNK" +
      "NOWN_NONE\020\000\022\010\n\004SPOT\020\001\022\013\n\007FUTURES\020\002\022\n\n\006PO" +
      "TION\020\003\022\020\n\014SPREAD_MONTH\020\004\022\024\n\020SPREAD_COMMO" +
      "DITY\020\005\022\007\n\003BUL\020\006\022\007\n\003BER\020\007\022\007\n\003STD\020\010\022\007\n\003STG" +
      "\020\t\022\007\n\003PRT\020\n\022\017\n\013DIRECTFOREX\020\013\022\021\n\rINDIRECT",
      "FOREX\020\014\022\016\n\nCROSSFOREX\020\r\022\t\n\005INDEX\020\016\022\t\n\005ST" +
      "OCK\020\017*\364\001\n\013ProductType\022\023\n\017UNKNOWN_PRODUCT" +
      "\020\000\022\027\n\023EQUITY_INDEX_FUTURE\020\001\022\027\n\023SINGLE_ST" +
      "OCK_FUTURE\020\002\022\033\n\027FOREIGN_EXCHANGE_FUTURE\020" +
      "\003\022\030\n\024INTEREST_RATE_FUTURE\020\004\022\026\n\022COMMODITI" +
      "ES_FUTURE\020\005\022\032\n\026ENERGY_CHEMICAL_FUTURE\020\006\022" +
      "\020\n\014METAL_FUTURE\020\007\022!\n\035AGRICULTURAL_COMMOD" +
      "ITY_FUTURE\020\010*t\n\014MarketStatus\022\022\n\016UNKNOWN_" +
      "MARKET\020\000\022\022\n\016MARKET_SUSPEND\020\001\022\021\n\rBIDDING_" +
      "PRICE\020\002\022\022\n\016OPEN_QUOTATION\020\003\022\025\n\021CLOSING_Q",
      "UOTATION\020\004*m\n\022ProductTradeStatus\022\016\n\nTRAD" +
      "E_NONE\020\000\022\021\n\rTRADE_SUSPEND\020\001\022\021\n\rTRADE_BID" +
      "DING\020\002\022\021\n\rTRADE_TRADING\020\003\022\016\n\nTRADE_STOP\020" +
      "\004*B\n\013TicksDirect\022\022\n\016UNKNOWN_DIRECT\020\000\022\007\n\003" +
      "BUY\020\001\022\010\n\004SELL\020\002\022\014\n\010NO_STATE\020\003*7\n\014InstrDi" +
      "splay\022\016\n\nDISPLAY_NA\020\000\022\t\n\005ESSEN\020\001\022\014\n\010INTE" +
      "RNAT\020\002**\n\013CallPutType\022\010\n\004NONE\020\000\022\010\n\004CALL\020" +
      "\001\022\007\n\003PUT\020\002**\n\014ContractType\022\017\n\013TRADE_QUOT" +
      "E\020\000\022\t\n\005QUOTE\020\001*u\n\rOpenCloseType\022\023\n\017CLOSE" +
      "_MODE_NONE\020\000\022\031\n\025CLOSE_MODE_UNFINISHED\020\001\022",
      "\030\n\024CLOSE_MODE_OPENCOVER\020\002\022\032\n\026CLOSE_MODE_" +
      "CLOSETODAAY\020\003*<\n\rCmbDirectType\022\024\n\020CMB_DI" +
      "RECT_FIRST\020\000\022\025\n\021CMB_DIRECT_SECOND\020\001*\217\001\n\017" +
      "DeliverModeType\022\027\n\023DELIVERY_MODE_GOODS\020\000" +
      "\022\026\n\022DELIVERY_MODE_CASH\020\001\022\031\n\025DELIVERY_MOD" +
      "E_EXECUTE\020\002\022\031\n\025DELIVERY_MODE_ABANMON\020\003\022\025" +
      "\n\021DELIVERY_MODE_HKF\020\004B\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
