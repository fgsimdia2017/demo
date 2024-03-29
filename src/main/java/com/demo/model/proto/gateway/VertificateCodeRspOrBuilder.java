// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface VertificateCodeRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.VertificateCodeRsp)
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
   * <code>optional string secondSerialID = 3;</code>
   */
  String getSecondSerialID();
  /**
   * <code>optional string secondSerialID = 3;</code>
   */
  com.google.protobuf.ByteString
      getSecondSerialIDBytes();

  /**
   * <pre>
   * valid times(minute)
   * </pre>
   *
   * <code>optional uint32 effective = 4;</code>
   */
  int getEffective();
}
