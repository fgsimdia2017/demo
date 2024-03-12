// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface QueryExchangeRspsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.QueryExchangeRsps)
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
   * <code>repeated .com.demo.model.proto.gateway.ExchangeInfo exchanges = 3;</code>
   */
  java.util.List<ExchangeInfo>
      getExchangesList();
  /**
   * <code>repeated .com.demo.model.proto.gateway.ExchangeInfo exchanges = 3;</code>
   */
  ExchangeInfo getExchanges(int index);
  /**
   * <code>repeated .com.demo.model.proto.gateway.ExchangeInfo exchanges = 3;</code>
   */
  int getExchangesCount();
  /**
   * <code>repeated .com.demo.model.proto.gateway.ExchangeInfo exchanges = 3;</code>
   */
  java.util.List<? extends ExchangeInfoOrBuilder>
      getExchangesOrBuilderList();
  /**
   * <code>repeated .com.demo.model.proto.gateway.ExchangeInfo exchanges = 3;</code>
   */
  ExchangeInfoOrBuilder getExchangesOrBuilder(
      int index);
}
