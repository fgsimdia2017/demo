// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface ModPassWordReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.ModPassWordReq)
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

  /**
   * <pre>
   * 原密码
   * </pre>
   *
   * <code>optional string old_pwd = 3;</code>
   */
  String getOldPwd();
  /**
   * <pre>
   * 原密码
   * </pre>
   *
   * <code>optional string old_pwd = 3;</code>
   */
  com.google.protobuf.ByteString
      getOldPwdBytes();

  /**
   * <pre>
   * 新密码
   * </pre>
   *
   * <code>optional string new_pwd = 4;</code>
   */
  String getNewPwd();
  /**
   * <pre>
   * 新密码
   * </pre>
   *
   * <code>optional string new_pwd = 4;</code>
   */
  com.google.protobuf.ByteString
      getNewPwdBytes();
}
