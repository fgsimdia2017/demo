// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface ExchangeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.ExchangeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 交易所编码
   * </pre>
   *
   * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange_no = 1;</code>
   */
  int getExchangeNoValue();
  /**
   * <pre>
   * 交易所编码
   * </pre>
   *
   * <code>optional .com.demo.model.proto.trade.common.ExchangeType exchange_no = 1;</code>
   */
  com.demo.model.proto.trade.common.ExchangeType getExchangeNo();

  /**
   * <pre>
   * 交易所名称
   * </pre>
   *
   * <code>optional string exchange_name = 2;</code>
   */
  String getExchangeName();
  /**
   * <pre>
   * 交易所名称
   * </pre>
   *
   * <code>optional string exchange_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getExchangeNameBytes();
}
