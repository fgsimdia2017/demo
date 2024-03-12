// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface QueryHisMatchReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.QueryHisMatchReq)
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
   * 开始日期 
   * </pre>
   *
   * <code>optional string begin_date = 3;</code>
   */
  String getBeginDate();
  /**
   * <pre>
   * 开始日期 
   * </pre>
   *
   * <code>optional string begin_date = 3;</code>
   */
  com.google.protobuf.ByteString
      getBeginDateBytes();

  /**
   * <pre>
   * 结束日期 
   * </pre>
   *
   * <code>optional string end_date = 4;</code>
   */
  String getEndDate();
  /**
   * <pre>
   * 结束日期 
   * </pre>
   *
   * <code>optional string end_date = 4;</code>
   */
  com.google.protobuf.ByteString
      getEndDateBytes();
}
