// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface UsrLogoutReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.UsrLogoutReq)
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
   * <pre>
   * 站点
   * </pre>
   *
   * <code>optional string site = 3;</code>
   */
  String getSite();
  /**
   * <pre>
   * 站点
   * </pre>
   *
   * <code>optional string site = 3;</code>
   */
  com.google.protobuf.ByteString
      getSiteBytes();
}
