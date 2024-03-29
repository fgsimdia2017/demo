// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface APIReadyRtnOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.APIReadyRtn)
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
   * 账户
   * </pre>
   *
   * <code>optional string account = 2;</code>
   */
  String getAccount();
  /**
   * <pre>
   * 账户
   * </pre>
   *
   * <code>optional string account = 2;</code>
   */
  com.google.protobuf.ByteString
      getAccountBytes();
}
