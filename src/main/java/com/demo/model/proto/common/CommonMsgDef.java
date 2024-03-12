// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_msg_def.proto

package com.demo.model.proto.common;

public final class CommonMsgDef {
  private CommonMsgDef() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_HeartReqMsg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_HeartReqMsg_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_HeartRspMsg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_HeartRspMsg_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_VelocityReqMsg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_VelocityReqMsg_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_VelocityRspMsg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_VelocityRspMsg_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_TradingTimespin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_TradingTimespin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_InstrOrderLimit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_InstrOrderLimit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_InstrBaseInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_InstrBaseInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_ProductInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_ProductInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_InstrumentInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_InstrumentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_StockInstr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_StockInstr_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_FutureInstr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_FutureInstr_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_OptionInstr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_OptionInstr_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_ForexInstr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_ForexInstr_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_demo_model_proto_common_InstrumentInfos_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_demo_model_proto_common_InstrumentInfos_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\024common_msg_def.proto\022\033com.demo.model.p" +
      "roto.common\032\025common_type_def.proto\"\036\n\013He" +
      "artReqMsg\022\017\n\007conn_id\030\001 \001(\004\"\036\n\013HeartRspMs" +
      "g\022\017\n\007conn_id\030\001 \001(\004\"$\n\016VelocityReqMsg\022\022\n\n" +
      "start_time\030\001 \001(\004\"J\n\016VelocityRspMsg\022\022\n\nst" +
      "art_time\030\001 \001(\004\022\021\n\trecv_time\030\002 \001(\004\022\021\n\tsen" +
      "d_time\030\003 \001(\004\"-\n\017TradingTimespin\022\r\n\005start" +
      "\030\001 \001(\r\022\013\n\003end\030\002 \001(\r\"?\n\017InstrOrderLimit\022\025" +
      "\n\rmax_order_qty\030\001 \001(\r\022\025\n\rmin_order_qty\030\002" +
      " \001(\r\"\355\003\n\rInstrBaseInfo\022:\n\ninstr_type\030\001 \001",
      "(\0162&.com.demo.model.proto.common.InstrTy" +
      "pe\022;\n\010exchange\030\002 \001(\0162).com.demo.model.pr" +
      "oto.common.ExchangeType\022\021\n\tseries_id\030\003 \001" +
      "(\t\022\022\n\ninstr_code\030\004 \001(\t\022\025\n\rinternal_code\030" +
      "\005 \001(\t\022\024\n\014counter_code\030\006 \001(\t\022\026\n\016cn_simple" +
      "_name\030\007 \001(\t\022\026\n\016tc_simple_name\030\010 \001(\t\022\026\n\016e" +
      "n_simple_name\030\t \001(\t\022\024\n\014cn_full_name\030\n \001(" +
      "\t\022\024\n\014tc_full_name\030\013 \001(\t\022\024\n\014en_full_name\030" +
      "\014 \001(\t\022B\n\017settle_currency\030\r \001(\0162).com.dem" +
      "o.model.proto.common.CurrencyType\022A\n\016tra",
      "de_currency\030\016 \001(\0162).com.demo.model.proto" +
      ".common.CurrencyType\"\271\003\n\013ProductInfo\022@\n\r" +
      "category_type\030\001 \001(\0162).com.demo.model.pro" +
      "to.common.CategoryType\022>\n\014product_type\030\002" +
      " \001(\0162(.com.demo.model.proto.common.Produ" +
      "ctType\022\014\n\004code\030\003 \001(\t\022\026\n\016cn_simple_name\030\004" +
      " \001(\t\022\026\n\016tc_simple_name\030\005 \001(\t\022\026\n\016en_simpl" +
      "e_name\030\006 \001(\t\022\024\n\014cn_full_name\030\007 \001(\t\022\024\n\014tc" +
      "_full_name\030\010 \001(\t\022\024\n\014en_full_name\030\t \001(\t\022\020" +
      "\n\010timespin\030\n \001(\t\022A\n\013call_market\030\013 \003(\0132,.",
      "com.demo.model.proto.common.TradingTimes" +
      "pin\022;\n\005trade\030\014 \003(\0132,.com.demo.model.prot" +
      "o.common.TradingTimespin\"\363\004\n\016InstrumentI" +
      "nfo\0228\n\004base\030\001 \001(\0132*.com.demo.model.proto" +
      ".common.InstrBaseInfo\0226\n\004proc\030\002 \001(\0132(.co" +
      "m.demo.model.proto.common.ProductInfo\022\020\n" +
      "\010lot_size\030\003 \001(\r\022\022\n\nprice_tick\030\004 \001(\004\022\022\n\nd" +
      "enoinator\030\005 \001(\004\022\022\n\ntrade_able\030\006 \001(\010\022\021\n\tp" +
      "recision\030\007 \001(\r\022<\n\006status\030\010 \001(\0162,.com.dem" +
      "o.model.proto.common.InstrStatusType\022\023\n\013",
      "create_date\030\t \001(\t\022\021\n\topen_date\030\n \001(\t\022\024\n\014" +
      "update_stamp\030\013 \001(\004\022\034\n\024price_tick_precisi" +
      "on\030\r \001(\r\0228\n\005stock\030\036 \001(\0132\'.com.demo.model" +
      ".proto.common.StockInstrH\000\022:\n\006future\030\037 \001" +
      "(\0132(.com.demo.model.proto.common.FutureI" +
      "nstrH\000\0227\n\003opt\030  \001(\0132(.com.demo.model.pro" +
      "to.common.OptionInstrH\000\0228\n\005forex\030! \001(\0132\'" +
      ".com.demo.model.proto.common.ForexInstrH" +
      "\000B\013\n\tinstrData\"\035\n\nStockInstr\022\017\n\007reserve\030" +
      "\001 \001(\r\"\251\004\n\013FutureInstr\022D\n\020margin_rate_typ",
      "e\030\001 \001(\0162*.com.demo.model.proto.common.In" +
      "strRateType\022\023\n\013long_margin\030\002 \001(\004\022\024\n\014shor" +
      "t_margin\030\003 \001(\004\022F\n\020market_order_qty\030\004 \001(\013" +
      "2,.com.demo.model.proto.common.InstrOrde" +
      "rLimit\022E\n\017limit_order_qty\030\005 \001(\0132,.com.de" +
      "mo.model.proto.common.InstrOrderLimit\022\033\n" +
      "\023contract_multiplier\030\006 \001(\004\022\024\n\014deliver_ye" +
      "ar\030\007 \001(\r\022\025\n\rdeliver_month\030\010 \001(\r\022\021\n\tis_en" +
      "able\030\t \001(\010\022\027\n\017is_master_instr\030\n \001(\010\022\025\n\rr" +
      "elated_instr\030\013 \001(\t\022\027\n\017last_trade_date\030\014 ",
      "\001(\t\022\023\n\013notify_date\030\r \001(\t\022\023\n\013expire_date\030" +
      "\016 \001(\t\022\024\n\014expire_month\030\017 \001(\r\022\032\n\022begin_del" +
      "iver_date\030\020 \001(\t\022\030\n\020end_deliver_date\030\021 \001(" +
      "\t\"\332\004\n\013OptionInstr\022\027\n\017underlying_code\030\001 \001" +
      "(\t\022F\n\023underlying_exchange\030\002 \001(\0162).com.de" +
      "mo.model.proto.common.ExchangeType\022D\n\020ma" +
      "rgin_rate_type\030\003 \001(\0162*.com.demo.model.pr" +
      "oto.common.InstrRateType\022\023\n\013long_margin\030" +
      "\004 \001(\004\022\024\n\014short_margin\030\005 \001(\004\022F\n\020market_or" +
      "der_qty\030\006 \001(\0132,.com.demo.model.proto.com",
      "mon.InstrOrderLimit\022E\n\017limit_order_qty\030\007" +
      " \001(\0132,.com.demo.model.proto.common.Instr" +
      "OrderLimit\022\033\n\023contract_multiplier\030\010 \001(\004\022" +
      "\024\n\014deliver_year\030\t \001(\r\022\025\n\rdeliver_month\030\n" +
      " \001(\r\022\021\n\tis_enable\030\013 \001(\010\022\027\n\017last_trade_da" +
      "te\030\r \001(\t\022\023\n\013notify_date\030\016 \001(\t\022\023\n\013expire_" +
      "date\030\017 \001(\t\022\024\n\014expire_month\030\020 \001(\r\022\032\n\022begi" +
      "n_deliver_date\030\021 \001(\t\022\030\n\020end_deliver_date" +
      "\030\022 \001(\t\"\035\n\nForexInstr\022\017\n\007reserve\030\001 \001(\r\"M\n" +
      "\017InstrumentInfos\022:\n\005infos\030\001 \003(\0132+.com.de",
      "mo.model.proto.common.InstrumentInfoB\002P\001" +
      "b\006proto3"
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
          CommonTypeDef.getDescriptor(),
        }, assigner);
    internal_static_com_demo_model_proto_common_HeartReqMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_demo_model_proto_common_HeartReqMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_HeartReqMsg_descriptor,
        new String[] { "ConnId", });
    internal_static_com_demo_model_proto_common_HeartRspMsg_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_demo_model_proto_common_HeartRspMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_HeartRspMsg_descriptor,
        new String[] { "ConnId", });
    internal_static_com_demo_model_proto_common_VelocityReqMsg_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_demo_model_proto_common_VelocityReqMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_VelocityReqMsg_descriptor,
        new String[] { "StartTime", });
    internal_static_com_demo_model_proto_common_VelocityRspMsg_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_demo_model_proto_common_VelocityRspMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_VelocityRspMsg_descriptor,
        new String[] { "StartTime", "RecvTime", "SendTime", });
    internal_static_com_demo_model_proto_common_TradingTimespin_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_demo_model_proto_common_TradingTimespin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_TradingTimespin_descriptor,
        new String[] { "Start", "End", });
    internal_static_com_demo_model_proto_common_InstrOrderLimit_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_demo_model_proto_common_InstrOrderLimit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_InstrOrderLimit_descriptor,
        new String[] { "MaxOrderQty", "MinOrderQty", });
    internal_static_com_demo_model_proto_common_InstrBaseInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_demo_model_proto_common_InstrBaseInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_InstrBaseInfo_descriptor,
        new String[] { "InstrType", "Exchange", "SeriesId", "InstrCode", "InternalCode", "CounterCode", "CnSimpleName", "TcSimpleName", "EnSimpleName", "CnFullName", "TcFullName", "EnFullName", "SettleCurrency", "TradeCurrency", });
    internal_static_com_demo_model_proto_common_ProductInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_demo_model_proto_common_ProductInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_ProductInfo_descriptor,
        new String[] { "CategoryType", "ProductType", "Code", "CnSimpleName", "TcSimpleName", "EnSimpleName", "CnFullName", "TcFullName", "EnFullName", "Timespin", "CallMarket", "Trade", });
    internal_static_com_demo_model_proto_common_InstrumentInfo_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_demo_model_proto_common_InstrumentInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_InstrumentInfo_descriptor,
        new String[] { "Base", "Proc", "LotSize", "PriceTick", "Denoinator", "TradeAble", "Precision", "Status", "CreateDate", "OpenDate", "UpdateStamp", "PriceTickPrecision", "Stock", "Future", "Opt", "Forex", "InstrData", });
    internal_static_com_demo_model_proto_common_StockInstr_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_demo_model_proto_common_StockInstr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_StockInstr_descriptor,
        new String[] { "Reserve", });
    internal_static_com_demo_model_proto_common_FutureInstr_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_demo_model_proto_common_FutureInstr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_FutureInstr_descriptor,
        new String[] { "MarginRateType", "LongMargin", "ShortMargin", "MarketOrderQty", "LimitOrderQty", "ContractMultiplier", "DeliverYear", "DeliverMonth", "IsEnable", "IsMasterInstr", "RelatedInstr", "LastTradeDate", "NotifyDate", "ExpireDate", "ExpireMonth", "BeginDeliverDate", "EndDeliverDate", });
    internal_static_com_demo_model_proto_common_OptionInstr_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_com_demo_model_proto_common_OptionInstr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_OptionInstr_descriptor,
        new String[] { "UnderlyingCode", "UnderlyingExchange", "MarginRateType", "LongMargin", "ShortMargin", "MarketOrderQty", "LimitOrderQty", "ContractMultiplier", "DeliverYear", "DeliverMonth", "IsEnable", "LastTradeDate", "NotifyDate", "ExpireDate", "ExpireMonth", "BeginDeliverDate", "EndDeliverDate", });
    internal_static_com_demo_model_proto_common_ForexInstr_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_com_demo_model_proto_common_ForexInstr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_ForexInstr_descriptor,
        new String[] { "Reserve", });
    internal_static_com_demo_model_proto_common_InstrumentInfos_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_com_demo_model_proto_common_InstrumentInfos_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_demo_model_proto_common_InstrumentInfos_descriptor,
        new String[] { "Infos", });
    CommonTypeDef.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
