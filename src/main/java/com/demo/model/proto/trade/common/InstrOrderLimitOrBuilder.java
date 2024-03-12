// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_common_msg_def.proto

package com.demo.model.proto.trade.common;

public interface InstrOrderLimitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.demo.model.proto.trade.common.InstrOrderLimit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 最大下单量
   * </pre>
   *
   * <code>optional uint32 max_order_qty = 1;</code>
   */
  int getMaxOrderQty();

  /**
   * <pre>
   * 最小下单量 
   * </pre>
   *
   * <code>optional uint32 min_order_qty = 2;</code>
   */
  int getMinOrderQty();
}
