// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface ModOrderRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.ModOrderRsp)
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
   * 账户ID
   * </pre>
   *
   * <code>optional string account = 2;</code>
   */
  String getAccount();
  /**
   * <pre>
   * 账户ID
   * </pre>
   *
   * <code>optional string account = 2;</code>
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <pre>
   * 合约ID
   * </pre>
   *
   * <code>optional string instr_code = 3;</code>
   */
  String getInstrCode();
  /**
   * <pre>
   * 合约ID
   * </pre>
   *
   * <code>optional string instr_code = 3;</code>
   */
  com.google.protobuf.ByteString
      getInstrCodeBytes();

  /**
   * <pre>
   * 交易所id
   * </pre>
   *
   * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 4;</code>
   */
  int getExchangeValue();
  /**
   * <pre>
   * 交易所id
   * </pre>
   *
   * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange = 4;</code>
   */
  com.demo.model.proto.trade.common.ExchangeType getExchange();

  /**
   * <pre>
   * 委托序号
   * </pre>
   *
   * <code>optional string order_no = 5;</code>
   */
  String getOrderNo();
  /**
   * <pre>
   * 委托序号
   * </pre>
   *
   * <code>optional string order_no = 5;</code>
   */
  com.google.protobuf.ByteString
      getOrderNoBytes();

  /**
   * <pre>
   * 委托价格
   * </pre>
   *
   * <code>optional int64 order_price = 6;</code>
   */
  long getOrderPrice();

  /**
   * <pre>
   * 委托数量
   * </pre>
   *
   * <code>optional uint32 order_qty = 7;</code>
   */
  int getOrderQty();

  /**
   * <pre>
   * 委托状态
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.OrderStatusType order_state = 8;</code>
   */
  int getOrderStateValue();
  /**
   * <pre>
   * 委托状态
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.OrderStatusType order_state = 8;</code>
   */
  OrderStatusType getOrderState();

  /**
   * <pre>
   * 精度
   * </pre>
   *
   * <code>optional uint32 precision = 9;</code>
   */
  int getPrecision();
}
