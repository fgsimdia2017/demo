// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_msg_def.proto

package com.demo.model.proto.gateway;

public interface QueryAccountMarginRentRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.gateway.QueryAccountMarginRentRsp)
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

  /**
   * <code>repeated .com.demo.model.proto.gateway.AccountMarginRentInfo margin_infos = 3;</code>
   */
  java.util.List<AccountMarginRentInfo>
      getMarginInfosList();
  /**
   * <code>repeated .com.demo.model.proto.gateway.AccountMarginRentInfo margin_infos = 3;</code>
   */
  AccountMarginRentInfo getMarginInfos(int index);
  /**
   * <code>repeated .com.demo.model.proto.gateway.AccountMarginRentInfo margin_infos = 3;</code>
   */
  int getMarginInfosCount();
  /**
   * <code>repeated .com.demo.model.proto.gateway.AccountMarginRentInfo margin_infos = 3;</code>
   */
  java.util.List<? extends AccountMarginRentInfoOrBuilder>
      getMarginInfosOrBuilderList();
  /**
   * <code>repeated .com.demo.model.proto.gateway.AccountMarginRentInfo margin_infos = 3;</code>
   */
  AccountMarginRentInfoOrBuilder getMarginInfosOrBuilder(
      int index);
}
