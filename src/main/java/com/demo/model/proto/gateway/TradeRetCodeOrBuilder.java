// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface TradeRetCodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.TradeRetCode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 错误码
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.TreadeRetCode code = 1;</code>
   */
  int getCodeValue();
  /**
   * <pre>
   * 错误码
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.TreadeRetCode code = 1;</code>
   */
  TreadeRetCode getCode();

  /**
   * <pre>
   * 错误消息
   * </pre>
   *
   * <code>optional string msg = 2;</code>
   */
  String getMsg();
  /**
   * <pre>
   * 错误消息
   * </pre>
   *
   * <code>optional string msg = 2;</code>
   */
  com.google.protobuf.ByteString
      getMsgBytes();
}
