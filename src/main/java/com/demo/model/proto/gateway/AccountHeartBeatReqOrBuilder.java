// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface AccountHeartBeatReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.AccountHeartBeatReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 会话ID
   * </pre>
   *
   * <code>optional uint64 session_id = 1;</code>
   */
  long getSessionId();

  /**
   * <pre>
   * 资金账号
   * </pre>
   *
   * <code>optional string account = 2;</code>
   */
  String getAccount();
  /**
   * <pre>
   * 资金账号
   * </pre>
   *
   * <code>optional string account = 2;</code>
   */
  com.google.protobuf.ByteString
      getAccountBytes();
}
