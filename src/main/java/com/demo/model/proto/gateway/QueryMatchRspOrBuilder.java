// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface QueryMatchRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.QueryMatchRsp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 业务处理返回信
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
   */
  boolean hasRet();
  /**
   * <pre>
   * 业务处理返回信
   * </pre>
   *
   * <code>optional .com.demo.model.proto.gateway.TradeRetCode ret = 1;</code>
   */
  TradeRetCode getRet();
  /**
   * <pre>
   * 业务处理返回信
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

  /**
   * <pre>
   * 成交信息
   * </pre>
   *
   * <code>repeated .com.demo.model.proto.gateway.MatchInfo matchs = 3;</code>
   */
  java.util.List<MatchInfo>
      getMatchsList();
  /**
   * <pre>
   * 成交信息
   * </pre>
   *
   * <code>repeated .com.demo.model.proto.gateway.MatchInfo matchs = 3;</code>
   */
  MatchInfo getMatchs(int index);
  /**
   * <pre>
   * 成交信息
   * </pre>
   *
   * <code>repeated .com.demo.model.proto.gateway.MatchInfo matchs = 3;</code>
   */
  int getMatchsCount();
  /**
   * <pre>
   * 成交信息
   * </pre>
   *
   * <code>repeated .com.demo.model.proto.gateway.MatchInfo matchs = 3;</code>
   */
  java.util.List<? extends MatchInfoOrBuilder>
      getMatchsOrBuilderList();
  /**
   * <pre>
   * 成交信息
   * </pre>
   *
   * <code>repeated .com.demo.model.proto.gateway.MatchInfo matchs = 3;</code>
   */
  MatchInfoOrBuilder getMatchsOrBuilder(
      int index);
}
