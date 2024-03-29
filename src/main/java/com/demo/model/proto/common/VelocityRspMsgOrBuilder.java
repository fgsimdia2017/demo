// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_msg_def.proto

package com.demo.model.proto.common;

public interface VelocityRspMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.common.VelocityRspMsg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 开始测速时间辍 精确到ms
   * </pre>
   *
   * <code>optional uint64 start_time = 1;</code>
   */
  long getStartTime();

  /**
   * <pre>
   * 接收到消息的时间 精确到ms
   * </pre>
   *
   * <code>optional uint64 recv_time = 2;</code>
   */
  long getRecvTime();

  /**
   * <pre>
   * 发送时间 精确到ms
   * </pre>
   *
   * <code>optional uint64 send_time = 3;</code>
   */
  long getSendTime();
}
