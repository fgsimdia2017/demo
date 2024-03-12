// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_msg_def.proto

package com.demo.model.proto.common;

public interface InstrBaseInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.common.InstrBaseInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 合约类型 
   * </pre>
   *
   * <code>optional .com.demo.model.proto.common.InstrType instr_type = 1;</code>
   */
  int getInstrTypeValue();
  /**
   * <pre>
   * 合约类型 
   * </pre>
   *
   * <code>optional .com.demo.model.proto.common.InstrType instr_type = 1;</code>
   */
  InstrType getInstrType();

  /**
   * <pre>
   * 交易所
   * </pre>
   *
   * <code>optional .com.demo.model.proto.common.ExchangeType exchange = 2;</code>
   */
  int getExchangeValue();
  /**
   * <pre>
   * 交易所
   * </pre>
   *
   * <code>optional .com.demo.model.proto.common.ExchangeType exchange = 2;</code>
   */
  ExchangeType getExchange();

  /**
   * <pre>
   * 合约序列
   * </pre>
   *
   * <code>optional string series_id = 3;</code>
   */
  String getSeriesId();
  /**
   * <pre>
   * 合约序列
   * </pre>
   *
   * <code>optional string series_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getSeriesIdBytes();

  /**
   * <pre>
   * 合约代码
   * </pre>
   *
   * <code>optional string instr_code = 4;</code>
   */
  String getInstrCode();
  /**
   * <pre>
   * 合约代码
   * </pre>
   *
   * <code>optional string instr_code = 4;</code>
   */
  com.google.protobuf.ByteString
      getInstrCodeBytes();

  /**
   * <pre>
   * 国标类型合约代码
   * </pre>
   *
   * <code>optional string internal_code = 5;</code>
   */
  String getInternalCode();
  /**
   * <pre>
   * 国标类型合约代码
   * </pre>
   *
   * <code>optional string internal_code = 5;</code>
   */
  com.google.protobuf.ByteString
      getInternalCodeBytes();

  /**
   * <pre>
   * 柜台类型合约代码
   * </pre>
   *
   * <code>optional string counter_code = 6;</code>
   */
  String getCounterCode();
  /**
   * <pre>
   * 柜台类型合约代码
   * </pre>
   *
   * <code>optional string counter_code = 6;</code>
   */
  com.google.protobuf.ByteString
      getCounterCodeBytes();

  /**
   * <pre>
   * 品种简体简称
   * </pre>
   *
   * <code>optional string cn_simple_name = 7;</code>
   */
  String getCnSimpleName();
  /**
   * <pre>
   * 品种简体简称
   * </pre>
   *
   * <code>optional string cn_simple_name = 7;</code>
   */
  com.google.protobuf.ByteString
      getCnSimpleNameBytes();

  /**
   * <pre>
   * 品种繁体简称
   * </pre>
   *
   * <code>optional string tc_simple_name = 8;</code>
   */
  String getTcSimpleName();
  /**
   * <pre>
   * 品种繁体简称
   * </pre>
   *
   * <code>optional string tc_simple_name = 8;</code>
   */
  com.google.protobuf.ByteString
      getTcSimpleNameBytes();

  /**
   * <pre>
   * 品种英文简称
   * </pre>
   *
   * <code>optional string en_simple_name = 9;</code>
   */
  String getEnSimpleName();
  /**
   * <pre>
   * 品种英文简称
   * </pre>
   *
   * <code>optional string en_simple_name = 9;</code>
   */
  com.google.protobuf.ByteString
      getEnSimpleNameBytes();

  /**
   * <pre>
   * 品种简体全称
   * </pre>
   *
   * <code>optional string cn_full_name = 10;</code>
   */
  String getCnFullName();
  /**
   * <pre>
   * 品种简体全称
   * </pre>
   *
   * <code>optional string cn_full_name = 10;</code>
   */
  com.google.protobuf.ByteString
      getCnFullNameBytes();

  /**
   * <pre>
   * 品种繁体全称 
   * </pre>
   *
   * <code>optional string tc_full_name = 11;</code>
   */
  String getTcFullName();
  /**
   * <pre>
   * 品种繁体全称 
   * </pre>
   *
   * <code>optional string tc_full_name = 11;</code>
   */
  com.google.protobuf.ByteString
      getTcFullNameBytes();

  /**
   * <pre>
   * 品种英文全称
   * </pre>
   *
   * <code>optional string en_full_name = 12;</code>
   */
  String getEnFullName();
  /**
   * <pre>
   * 品种英文全称
   * </pre>
   *
   * <code>optional string en_full_name = 12;</code>
   */
  com.google.protobuf.ByteString
      getEnFullNameBytes();

  /**
   * <pre>
   * 结算币种
   * </pre>
   *
   * <code>optional .com.demo.model.proto.common.CurrencyType settle_currency = 13;</code>
   */
  int getSettleCurrencyValue();
  /**
   * <pre>
   * 结算币种
   * </pre>
   *
   * <code>optional .com.demo.model.proto.common.CurrencyType settle_currency = 13;</code>
   */
  CurrencyType getSettleCurrency();

  /**
   * <pre>
   * 交易币种
   * </pre>
   *
   * <code>optional .com.demo.model.proto.common.CurrencyType trade_currency = 14;</code>
   */
  int getTradeCurrencyValue();
  /**
   * <pre>
   * 交易币种
   * </pre>
   *
   * <code>optional .com.demo.model.proto.common.CurrencyType trade_currency = 14;</code>
   */
  CurrencyType getTradeCurrency();
}
