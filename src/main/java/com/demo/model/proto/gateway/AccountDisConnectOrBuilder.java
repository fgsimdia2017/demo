// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface AccountDisConnectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.AccountDisConnect)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 账户
   * </pre>
   *
   * <code>optional string account = 1;</code>
   */
  String getAccount();
  /**
   * <pre>
   * 账户
   * </pre>
   *
   * <code>optional string account = 1;</code>
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <pre>
   * 断线状态 
   * </pre>
   *
   * <code>optional bool is_disconnect = 2;</code>
   */
  boolean getIsDisconnect();

  /**
   * <pre>
   * 断线时间戳
   * </pre>
   *
   * <code>optional uint64 disconn_date_time = 3;</code>
   */
  long getDisconnDateTime();
}
