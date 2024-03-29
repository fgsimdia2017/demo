// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface QueryCurrencyRspsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.QueryCurrencyRsps)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 业务处理返回信息
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
   */
  boolean hasRet();
  /**
   * <pre>
   * 业务处理返回信息
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
   */
  TradeRetCode getRet();
  /**
   * <pre>
   * 业务处理返回信息
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
   */
  TradeRetCodeOrBuilder getRetOrBuilder();

  /**
   * <pre>
   * 账号
   * </pre>
   *
   * <code>optional string account = 2;</code>
   */
  String getAccount();
  /**
   * <pre>
   * 账号
   * </pre>
   *
   * <code>optional string account = 2;</code>
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <code>repeated .com.demo.model.proto.gateway.CurrencyInfo currencys = 3;</code>
   */
  java.util.List<CurrencyInfo>
      getCurrencysList();
  /**
   * <code>repeated .com.demo.model.proto.gateway.CurrencyInfo currencys = 3;</code>
   */
  CurrencyInfo getCurrencys(int index);
  /**
   * <code>repeated .com.demo.model.proto.gateway.CurrencyInfo currencys = 3;</code>
   */
  int getCurrencysCount();
  /**
   * <code>repeated .com.demo.model.proto.gateway.CurrencyInfo currencys = 3;</code>
   */
  java.util.List<? extends CurrencyInfoOrBuilder>
      getCurrencysOrBuilderList();
  /**
   * <code>repeated .com.demo.model.proto.gateway.CurrencyInfo currencys = 3;</code>
   */
  CurrencyInfoOrBuilder getCurrencysOrBuilder(
      int index);
}
