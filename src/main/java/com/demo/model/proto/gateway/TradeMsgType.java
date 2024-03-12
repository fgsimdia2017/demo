// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_type_def.proto

package com.demo.model.proto.gateway;

/**
 * Protobuf enum {@code com.demo.model.proto.gateway.TradeMsgType}
 */
public enum TradeMsgType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未知的消息类型
   * </pre>
   *
   * <code>UNKNOWN_MSG = 0;</code>
   */
  UNKNOWN_MSG(0),
  /**
   * <pre>
   * 心跳同步请求
   * </pre>
   *
   * <code>HEARTBEAT_REQ = 1;</code>
   */
  HEARTBEAT_REQ(1),
  /**
   * <pre>
   * 心跳同步应答
   * </pre>
   *
   * <code>HEARTBEAT_RSP = 2;</code>
   */
  HEARTBEAT_RSP(2),
  /**
   * <pre>
   * 测速请求
   * </pre>
   *
   * <code>VELOCITY_REQ = 3;</code>
   */
  VELOCITY_REQ(3),
  /**
   * <pre>
   * 测速应答
   * </pre>
   *
   * <code>VELOCITY_RSP = 4;</code>
   */
  VELOCITY_RSP(4),
  /**
   * <pre>
   *--------- 交易使用命令字----------------------------------------------------
   * </pre>
   *
   * <code>ACCOUNT_HEARTBEAT_REQ = 101;</code>
   */
  ACCOUNT_HEARTBEAT_REQ(101),
  /**
   * <pre>
   * 交易账户心跳应答
   * </pre>
   *
   * <code>ACCOUNT_HEARTBEAT_RSP = 102;</code>
   */
  ACCOUNT_HEARTBEAT_RSP(102),
  /**
   * <pre>
   * 用户登录请求
   * </pre>
   *
   * <code>LOGIN_REQ = 103;</code>
   */
  LOGIN_REQ(103),
  /**
   * <pre>
   * 用户登录应答
   * </pre>
   *
   * <code>LOGIN_RSP = 104;</code>
   */
  LOGIN_RSP(104),
  /**
   * <pre>
   * 用户登出请求
   * </pre>
   *
   * <code>LOGOUT_REQ = 105;</code>
   */
  LOGOUT_REQ(105),
  /**
   * <pre>
   * 用户登出应答
   * </pre>
   *
   * <code>LOGOUT_RSP = 106;</code>
   */
  LOGOUT_RSP(106),
  /**
   * <pre>
   * 用户修改密码请求
   * </pre>
   *
   * <code>MOD_PWD_REQ = 107;</code>
   */
  MOD_PWD_REQ(107),
  /**
   * <pre>
   * 用户修改密码应答 
   * </pre>
   *
   * <code>MOD_PWD_RSP = 108;</code>
   */
  MOD_PWD_RSP(108),
  /**
   * <code>VERTIFICATE_CODE_REQ = 109;</code>
   */
  VERTIFICATE_CODE_REQ(109),
  /**
   * <code>VERTIFICATE_CODE_RSP = 110;</code>
   */
  VERTIFICATE_CODE_RSP(110),
  /**
   * <code>SET_VERTIFICATE_CODE_REQ = 111;</code>
   */
  SET_VERTIFICATE_CODE_REQ(111),
  /**
   * <pre>
   * 用户查询类                      
   * </pre>
   *
   * <code>QUERY_LOGIN_STATUS_REQ = 120;</code>
   */
  QUERY_LOGIN_STATUS_REQ(120),
  /**
   * <pre>
   * 查询用登录状态 
   * </pre>
   *
   * <code>QUERY_LOGIN_STATUS_RSP = 121;</code>
   */
  QUERY_LOGIN_STATUS_RSP(121),
  /**
   * <pre>
   * 查询账户资金请求
   * </pre>
   *
   * <code>QUERY_BALANCE_REQ = 124;</code>
   */
  QUERY_BALANCE_REQ(124),
  /**
   * <pre>
   * 查询账户资金应答
   * </pre>
   *
   * <code>QUERY_BALANCE_RSP = 125;</code>
   */
  QUERY_BALANCE_RSP(125),
  /**
   * <pre>
   * 查询当日委托请求
   * </pre>
   *
   * <code>QUERY_ORDER_REQ = 126;</code>
   */
  QUERY_ORDER_REQ(126),
  /**
   * <pre>
   * 查询当日委托应答
   * </pre>
   *
   * <code>QUERY_ORDER_RSP = 127;</code>
   */
  QUERY_ORDER_RSP(127),
  /**
   * <pre>
   * 查询持仓汇总请求
   * </pre>
   *
   * <code>QUERY_POSITION_SUM_REQ = 128;</code>
   */
  QUERY_POSITION_SUM_REQ(128),
  /**
   * <pre>
   * 查询持仓汇总应答 
   * </pre>
   *
   * <code>QUERY_POSITION_SUM_RSP = 129;</code>
   */
  QUERY_POSITION_SUM_RSP(129),
  /**
   * <pre>
   * 查询持仓明细请求
   * </pre>
   *
   * <code>QUERY_POSITION_DETAIL_REQ = 130;</code>
   */
  QUERY_POSITION_DETAIL_REQ(130),
  /**
   * <pre>
   * 查询持仓明细应答  
   * </pre>
   *
   * <code>QUERY_POSITION_DETAIL_RSP = 131;</code>
   */
  QUERY_POSITION_DETAIL_RSP(131),
  /**
   * <pre>
   * 查询成交请求
   * </pre>
   *
   * <code>QUERY_MATCH_REQ = 132;</code>
   */
  QUERY_MATCH_REQ(132),
  /**
   * <pre>
   * 查询成交应答 
   * </pre>
   *
   * <code>QUERY_MATCH_RSP = 133;</code>
   */
  QUERY_MATCH_RSP(133),
  /**
   * <pre>
   * 查询历史委托请求
   * </pre>
   *
   * <code>QUERY_HIS_ORDER_REQ = 134;</code>
   */
  QUERY_HIS_ORDER_REQ(134),
  /**
   * <pre>
   * 查询历史委托应答
   * </pre>
   *
   * <code>QUERY_HIS_ORDER_RSP = 135;</code>
   */
  QUERY_HIS_ORDER_RSP(135),
  /**
   * <pre>
   * 查询历史成交请求
   * </pre>
   *
   * <code>QUERY_HIS_MATCH_REQ = 136;</code>
   */
  QUERY_HIS_MATCH_REQ(136),
  /**
   * <pre>
   * 查询历史成交应答
   * </pre>
   *
   * <code>QUERY_HIS_MATCH_RSP = 137;</code>
   */
  QUERY_HIS_MATCH_RSP(137),
  /**
   * <pre>
   * 查询历史持仓请求
   * </pre>
   *
   * <code>QUERY_HIS_POSITION_REQ = 139;</code>
   */
  QUERY_HIS_POSITION_REQ(139),
  /**
   * <pre>
   * 查询历史持仓应答
   * </pre>
   *
   * <code>QUERY_HIS_POSITION_RSP = 140;</code>
   */
  QUERY_HIS_POSITION_RSP(140),
  /**
   * <pre>
   * 查询费用请求
   * </pre>
   *
   * <code>QUERY_FEE_INFO_REQ = 141;</code>
   */
  QUERY_FEE_INFO_REQ(141),
  /**
   * <pre>
   * 查询费用应答
   * </pre>
   *
   * <code>QUERY_FEE_INFO_RSP = 142;</code>
   */
  QUERY_FEE_INFO_RSP(142),
  /**
   * <pre>
   * 账户保证金计算参数请求
   * </pre>
   *
   * <code>QUERY_ACCOUNT_MARGIN_RENT_REQ = 143;</code>
   */
  QUERY_ACCOUNT_MARGIN_RENT_REQ(143),
  /**
   * <pre>
   * 账户保证金计算参数应答 
   * </pre>
   *
   * <code>QUERY_ACCOUNT_MARGIN_RENT_RSP = 144;</code>
   */
  QUERY_ACCOUNT_MARGIN_RENT_RSP(144),
  /**
   * <pre>
   * 查询客户手续费计算参数请求
   * </pre>
   *
   * <code>QUERY_ACCOUNT_FEE_RENT_REQ = 145;</code>
   */
  QUERY_ACCOUNT_FEE_RENT_REQ(145),
  /**
   * <pre>
   * 查询客户手续费计算参数应答  
   * </pre>
   *
   * <code>QUERY_ACCOUNT_FEE_RENT_RSP = 146;</code>
   */
  QUERY_ACCOUNT_FEE_RENT_RSP(146),
  /**
   * <pre>
   * 查询资金请求
   * </pre>
   *
   * <code>QUERY_FREE_BALANCE_REQ = 147;</code>
   */
  QUERY_FREE_BALANCE_REQ(147),
  /**
   * <pre>
   * 查询资金应答 
   * </pre>
   *
   * <code>QUERY_FREE_BALANCE_RSP = 148;</code>
   */
  QUERY_FREE_BALANCE_RSP(148),
  /**
   * <pre>
   * 查询交易所信息请求
   * </pre>
   *
   * <code>QUERY_EXCHANGE_REQ = 149;</code>
   */
  QUERY_EXCHANGE_REQ(149),
  /**
   * <pre>
   * 查询交易所信息应答 
   * </pre>
   *
   * <code>QUERY_EXCHANGE_RSP = 150;</code>
   */
  QUERY_EXCHANGE_RSP(150),
  /**
   * <pre>
   * 查询系统中指定品种的合约信息请求
   * </pre>
   *
   * <code>QUERY_CONTRACT_REQ = 151;</code>
   */
  QUERY_CONTRACT_REQ(151),
  /**
   * <pre>
   * 查询系统中指定品种的合约信息应答
   * </pre>
   *
   * <code>QUERY_CONTRACT_RSP = 152;</code>
   */
  QUERY_CONTRACT_RSP(152),
  /**
   * <pre>
   * 查询系统品种信息请求
   * </pre>
   *
   * <code>QUERY_COMMODITY_REQ = 153;</code>
   */
  QUERY_COMMODITY_REQ(153),
  /**
   * <pre>
   * 查询系统品种信息应答
   * </pre>
   *
   * <code>QUERY_COMMODITY_RSP = 154;</code>
   */
  QUERY_COMMODITY_RSP(154),
  /**
   * <pre>
   * 查询货币信息请求
   * </pre>
   *
   * <code>QUERY_CURRENCY_REQ = 155;</code>
   */
  QUERY_CURRENCY_REQ(155),
  /**
   * <pre>
   * 查询货币信息应答
   * </pre>
   *
   * <code>QUERY_CURRENCY_RSP = 156;</code>
   */
  QUERY_CURRENCY_RSP(156),
  /**
   * <pre>
   * 用户委托请求
   * </pre>
   *
   * <code>INSERT_ORDER_REQ = 190;</code>
   */
  INSERT_ORDER_REQ(190),
  /**
   * <pre>
   * 用户委托应答 
   * </pre>
   *
   * <code>INSERT_ORDER_RSP = 191;</code>
   */
  INSERT_ORDER_RSP(191),
  /**
   * <pre>
   * 用户撤单请求
   * </pre>
   *
   * <code>CANCEL_ORDER_REQ = 192;</code>
   */
  CANCEL_ORDER_REQ(192),
  /**
   * <pre>
   * 用户撤单应答
   * </pre>
   *
   * <code>CANCEL_ORDER_RSP = 193;</code>
   */
  CANCEL_ORDER_RSP(193),
  /**
   * <pre>
   * 用户改单请求
   * </pre>
   *
   * <code>MOD_ORDER_REQ = 194;</code>
   */
  MOD_ORDER_REQ(194),
  /**
   * <pre>
   * 用户改单应答
   * </pre>
   *
   * <code>MOD_ORDER_RSP = 195;</code>
   */
  MOD_ORDER_RSP(195),
  /**
   * <pre>
   * 主推消息类
   * </pre>
   *
   * <code>PUSH_ORDER = 260;</code>
   */
  PUSH_ORDER(260),
  /**
   * <pre>
   * 成交回报，主推消息
   * </pre>
   *
   * <code>PUSH_MATCH = 261;</code>
   */
  PUSH_MATCH(261),
  /**
   * <pre>
   * 资金变动主推消息
   * </pre>
   *
   * <code>PUSH_FUND = 262;</code>
   */
  PUSH_FUND(262),
  /**
   * <pre>
   * 持仓变动主推消息
   * </pre>
   *
   * <code>PUSH_POSITION = 263;</code>
   */
  PUSH_POSITION(263),
  /**
   * <pre>
   * 持仓盈亏变动主推消息
   * </pre>
   *
   * <code>PUSH_PROFIT = 264;</code>
   */
  PUSH_PROFIT(264),
  /**
   * <pre>
   * 主推交易账户与柜台断线通知  
   * </pre>
   *
   * <code>PUSH_ACCOUNT_DISCONNECT = 265;</code>
   */
  PUSH_ACCOUNT_DISCONNECT(265),
  /**
   * <pre>
   * 持仓汇总变动推送
   * </pre>
   *
   * <code>PUSH_POSITION_SUMMARY = 266;</code>
   */
  PUSH_POSITION_SUMMARY(266),
  /**
   * <pre>
   * 合约变动推送
   * </pre>
   *
   * <code>PUSH_CONTRACT = 267;</code>
   */
  PUSH_CONTRACT(267),
  /**
   * <pre>
   * api初始化完毕推送
   * </pre>
   *
   * <code>PUSH_API_READY = 268;</code>
   */
  PUSH_API_READY(268),
  /**
   * <pre>
   * 动态认证接收方式
   * </pre>
   *
   * <code>PUSH_2FA_CONTACTINFO = 269;</code>
   */
  PUSH_2FA_CONTACTINFO(269),
  /**
   * <code>KICK_ACCOUNT = 300;</code>
   */
  KICK_ACCOUNT(300),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未知的消息类型
   * </pre>
   *
   * <code>UNKNOWN_MSG = 0;</code>
   */
  public static final int UNKNOWN_MSG_VALUE = 0;
  /**
   * <pre>
   * 心跳同步请求
   * </pre>
   *
   * <code>HEARTBEAT_REQ = 1;</code>
   */
  public static final int HEARTBEAT_REQ_VALUE = 1;
  /**
   * <pre>
   * 心跳同步应答
   * </pre>
   *
   * <code>HEARTBEAT_RSP = 2;</code>
   */
  public static final int HEARTBEAT_RSP_VALUE = 2;
  /**
   * <pre>
   * 测速请求
   * </pre>
   *
   * <code>VELOCITY_REQ = 3;</code>
   */
  public static final int VELOCITY_REQ_VALUE = 3;
  /**
   * <pre>
   * 测速应答
   * </pre>
   *
   * <code>VELOCITY_RSP = 4;</code>
   */
  public static final int VELOCITY_RSP_VALUE = 4;
  /**
   * <pre>
   *--------- 交易使用命令字----------------------------------------------------
   * </pre>
   *
   * <code>ACCOUNT_HEARTBEAT_REQ = 101;</code>
   */
  public static final int ACCOUNT_HEARTBEAT_REQ_VALUE = 101;
  /**
   * <pre>
   * 交易账户心跳应答
   * </pre>
   *
   * <code>ACCOUNT_HEARTBEAT_RSP = 102;</code>
   */
  public static final int ACCOUNT_HEARTBEAT_RSP_VALUE = 102;
  /**
   * <pre>
   * 用户登录请求
   * </pre>
   *
   * <code>LOGIN_REQ = 103;</code>
   */
  public static final int LOGIN_REQ_VALUE = 103;
  /**
   * <pre>
   * 用户登录应答
   * </pre>
   *
   * <code>LOGIN_RSP = 104;</code>
   */
  public static final int LOGIN_RSP_VALUE = 104;
  /**
   * <pre>
   * 用户登出请求
   * </pre>
   *
   * <code>LOGOUT_REQ = 105;</code>
   */
  public static final int LOGOUT_REQ_VALUE = 105;
  /**
   * <pre>
   * 用户登出应答
   * </pre>
   *
   * <code>LOGOUT_RSP = 106;</code>
   */
  public static final int LOGOUT_RSP_VALUE = 106;
  /**
   * <pre>
   * 用户修改密码请求
   * </pre>
   *
   * <code>MOD_PWD_REQ = 107;</code>
   */
  public static final int MOD_PWD_REQ_VALUE = 107;
  /**
   * <pre>
   * 用户修改密码应答 
   * </pre>
   *
   * <code>MOD_PWD_RSP = 108;</code>
   */
  public static final int MOD_PWD_RSP_VALUE = 108;
  /**
   * <code>VERTIFICATE_CODE_REQ = 109;</code>
   */
  public static final int VERTIFICATE_CODE_REQ_VALUE = 109;
  /**
   * <code>VERTIFICATE_CODE_RSP = 110;</code>
   */
  public static final int VERTIFICATE_CODE_RSP_VALUE = 110;
  /**
   * <code>SET_VERTIFICATE_CODE_REQ = 111;</code>
   */
  public static final int SET_VERTIFICATE_CODE_REQ_VALUE = 111;
  /**
   * <pre>
   * 用户查询类                      
   * </pre>
   *
   * <code>QUERY_LOGIN_STATUS_REQ = 120;</code>
   */
  public static final int QUERY_LOGIN_STATUS_REQ_VALUE = 120;
  /**
   * <pre>
   * 查询用登录状态 
   * </pre>
   *
   * <code>QUERY_LOGIN_STATUS_RSP = 121;</code>
   */
  public static final int QUERY_LOGIN_STATUS_RSP_VALUE = 121;
  /**
   * <pre>
   * 查询账户资金请求
   * </pre>
   *
   * <code>QUERY_BALANCE_REQ = 124;</code>
   */
  public static final int QUERY_BALANCE_REQ_VALUE = 124;
  /**
   * <pre>
   * 查询账户资金应答
   * </pre>
   *
   * <code>QUERY_BALANCE_RSP = 125;</code>
   */
  public static final int QUERY_BALANCE_RSP_VALUE = 125;
  /**
   * <pre>
   * 查询当日委托请求
   * </pre>
   *
   * <code>QUERY_ORDER_REQ = 126;</code>
   */
  public static final int QUERY_ORDER_REQ_VALUE = 126;
  /**
   * <pre>
   * 查询当日委托应答
   * </pre>
   *
   * <code>QUERY_ORDER_RSP = 127;</code>
   */
  public static final int QUERY_ORDER_RSP_VALUE = 127;
  /**
   * <pre>
   * 查询持仓汇总请求
   * </pre>
   *
   * <code>QUERY_POSITION_SUM_REQ = 128;</code>
   */
  public static final int QUERY_POSITION_SUM_REQ_VALUE = 128;
  /**
   * <pre>
   * 查询持仓汇总应答 
   * </pre>
   *
   * <code>QUERY_POSITION_SUM_RSP = 129;</code>
   */
  public static final int QUERY_POSITION_SUM_RSP_VALUE = 129;
  /**
   * <pre>
   * 查询持仓明细请求
   * </pre>
   *
   * <code>QUERY_POSITION_DETAIL_REQ = 130;</code>
   */
  public static final int QUERY_POSITION_DETAIL_REQ_VALUE = 130;
  /**
   * <pre>
   * 查询持仓明细应答  
   * </pre>
   *
   * <code>QUERY_POSITION_DETAIL_RSP = 131;</code>
   */
  public static final int QUERY_POSITION_DETAIL_RSP_VALUE = 131;
  /**
   * <pre>
   * 查询成交请求
   * </pre>
   *
   * <code>QUERY_MATCH_REQ = 132;</code>
   */
  public static final int QUERY_MATCH_REQ_VALUE = 132;
  /**
   * <pre>
   * 查询成交应答 
   * </pre>
   *
   * <code>QUERY_MATCH_RSP = 133;</code>
   */
  public static final int QUERY_MATCH_RSP_VALUE = 133;
  /**
   * <pre>
   * 查询历史委托请求
   * </pre>
   *
   * <code>QUERY_HIS_ORDER_REQ = 134;</code>
   */
  public static final int QUERY_HIS_ORDER_REQ_VALUE = 134;
  /**
   * <pre>
   * 查询历史委托应答
   * </pre>
   *
   * <code>QUERY_HIS_ORDER_RSP = 135;</code>
   */
  public static final int QUERY_HIS_ORDER_RSP_VALUE = 135;
  /**
   * <pre>
   * 查询历史成交请求
   * </pre>
   *
   * <code>QUERY_HIS_MATCH_REQ = 136;</code>
   */
  public static final int QUERY_HIS_MATCH_REQ_VALUE = 136;
  /**
   * <pre>
   * 查询历史成交应答
   * </pre>
   *
   * <code>QUERY_HIS_MATCH_RSP = 137;</code>
   */
  public static final int QUERY_HIS_MATCH_RSP_VALUE = 137;
  /**
   * <pre>
   * 查询历史持仓请求
   * </pre>
   *
   * <code>QUERY_HIS_POSITION_REQ = 139;</code>
   */
  public static final int QUERY_HIS_POSITION_REQ_VALUE = 139;
  /**
   * <pre>
   * 查询历史持仓应答
   * </pre>
   *
   * <code>QUERY_HIS_POSITION_RSP = 140;</code>
   */
  public static final int QUERY_HIS_POSITION_RSP_VALUE = 140;
  /**
   * <pre>
   * 查询费用请求
   * </pre>
   *
   * <code>QUERY_FEE_INFO_REQ = 141;</code>
   */
  public static final int QUERY_FEE_INFO_REQ_VALUE = 141;
  /**
   * <pre>
   * 查询费用应答
   * </pre>
   *
   * <code>QUERY_FEE_INFO_RSP = 142;</code>
   */
  public static final int QUERY_FEE_INFO_RSP_VALUE = 142;
  /**
   * <pre>
   * 账户保证金计算参数请求
   * </pre>
   *
   * <code>QUERY_ACCOUNT_MARGIN_RENT_REQ = 143;</code>
   */
  public static final int QUERY_ACCOUNT_MARGIN_RENT_REQ_VALUE = 143;
  /**
   * <pre>
   * 账户保证金计算参数应答 
   * </pre>
   *
   * <code>QUERY_ACCOUNT_MARGIN_RENT_RSP = 144;</code>
   */
  public static final int QUERY_ACCOUNT_MARGIN_RENT_RSP_VALUE = 144;
  /**
   * <pre>
   * 查询客户手续费计算参数请求
   * </pre>
   *
   * <code>QUERY_ACCOUNT_FEE_RENT_REQ = 145;</code>
   */
  public static final int QUERY_ACCOUNT_FEE_RENT_REQ_VALUE = 145;
  /**
   * <pre>
   * 查询客户手续费计算参数应答  
   * </pre>
   *
   * <code>QUERY_ACCOUNT_FEE_RENT_RSP = 146;</code>
   */
  public static final int QUERY_ACCOUNT_FEE_RENT_RSP_VALUE = 146;
  /**
   * <pre>
   * 查询资金请求
   * </pre>
   *
   * <code>QUERY_FREE_BALANCE_REQ = 147;</code>
   */
  public static final int QUERY_FREE_BALANCE_REQ_VALUE = 147;
  /**
   * <pre>
   * 查询资金应答 
   * </pre>
   *
   * <code>QUERY_FREE_BALANCE_RSP = 148;</code>
   */
  public static final int QUERY_FREE_BALANCE_RSP_VALUE = 148;
  /**
   * <pre>
   * 查询交易所信息请求
   * </pre>
   *
   * <code>QUERY_EXCHANGE_REQ = 149;</code>
   */
  public static final int QUERY_EXCHANGE_REQ_VALUE = 149;
  /**
   * <pre>
   * 查询交易所信息应答 
   * </pre>
   *
   * <code>QUERY_EXCHANGE_RSP = 150;</code>
   */
  public static final int QUERY_EXCHANGE_RSP_VALUE = 150;
  /**
   * <pre>
   * 查询系统中指定品种的合约信息请求
   * </pre>
   *
   * <code>QUERY_CONTRACT_REQ = 151;</code>
   */
  public static final int QUERY_CONTRACT_REQ_VALUE = 151;
  /**
   * <pre>
   * 查询系统中指定品种的合约信息应答
   * </pre>
   *
   * <code>QUERY_CONTRACT_RSP = 152;</code>
   */
  public static final int QUERY_CONTRACT_RSP_VALUE = 152;
  /**
   * <pre>
   * 查询系统品种信息请求
   * </pre>
   *
   * <code>QUERY_COMMODITY_REQ = 153;</code>
   */
  public static final int QUERY_COMMODITY_REQ_VALUE = 153;
  /**
   * <pre>
   * 查询系统品种信息应答
   * </pre>
   *
   * <code>QUERY_COMMODITY_RSP = 154;</code>
   */
  public static final int QUERY_COMMODITY_RSP_VALUE = 154;
  /**
   * <pre>
   * 查询货币信息请求
   * </pre>
   *
   * <code>QUERY_CURRENCY_REQ = 155;</code>
   */
  public static final int QUERY_CURRENCY_REQ_VALUE = 155;
  /**
   * <pre>
   * 查询货币信息应答
   * </pre>
   *
   * <code>QUERY_CURRENCY_RSP = 156;</code>
   */
  public static final int QUERY_CURRENCY_RSP_VALUE = 156;
  /**
   * <pre>
   * 用户委托请求
   * </pre>
   *
   * <code>INSERT_ORDER_REQ = 190;</code>
   */
  public static final int INSERT_ORDER_REQ_VALUE = 190;
  /**
   * <pre>
   * 用户委托应答 
   * </pre>
   *
   * <code>INSERT_ORDER_RSP = 191;</code>
   */
  public static final int INSERT_ORDER_RSP_VALUE = 191;
  /**
   * <pre>
   * 用户撤单请求
   * </pre>
   *
   * <code>CANCEL_ORDER_REQ = 192;</code>
   */
  public static final int CANCEL_ORDER_REQ_VALUE = 192;
  /**
   * <pre>
   * 用户撤单应答
   * </pre>
   *
   * <code>CANCEL_ORDER_RSP = 193;</code>
   */
  public static final int CANCEL_ORDER_RSP_VALUE = 193;
  /**
   * <pre>
   * 用户改单请求
   * </pre>
   *
   * <code>MOD_ORDER_REQ = 194;</code>
   */
  public static final int MOD_ORDER_REQ_VALUE = 194;
  /**
   * <pre>
   * 用户改单应答
   * </pre>
   *
   * <code>MOD_ORDER_RSP = 195;</code>
   */
  public static final int MOD_ORDER_RSP_VALUE = 195;
  /**
   * <pre>
   * 主推消息类
   * </pre>
   *
   * <code>PUSH_ORDER = 260;</code>
   */
  public static final int PUSH_ORDER_VALUE = 260;
  /**
   * <pre>
   * 成交回报，主推消息
   * </pre>
   *
   * <code>PUSH_MATCH = 261;</code>
   */
  public static final int PUSH_MATCH_VALUE = 261;
  /**
   * <pre>
   * 资金变动主推消息
   * </pre>
   *
   * <code>PUSH_FUND = 262;</code>
   */
  public static final int PUSH_FUND_VALUE = 262;
  /**
   * <pre>
   * 持仓变动主推消息
   * </pre>
   *
   * <code>PUSH_POSITION = 263;</code>
   */
  public static final int PUSH_POSITION_VALUE = 263;
  /**
   * <pre>
   * 持仓盈亏变动主推消息
   * </pre>
   *
   * <code>PUSH_PROFIT = 264;</code>
   */
  public static final int PUSH_PROFIT_VALUE = 264;
  /**
   * <pre>
   * 主推交易账户与柜台断线通知  
   * </pre>
   *
   * <code>PUSH_ACCOUNT_DISCONNECT = 265;</code>
   */
  public static final int PUSH_ACCOUNT_DISCONNECT_VALUE = 265;
  /**
   * <pre>
   * 持仓汇总变动推送
   * </pre>
   *
   * <code>PUSH_POSITION_SUMMARY = 266;</code>
   */
  public static final int PUSH_POSITION_SUMMARY_VALUE = 266;
  /**
   * <pre>
   * 合约变动推送
   * </pre>
   *
   * <code>PUSH_CONTRACT = 267;</code>
   */
  public static final int PUSH_CONTRACT_VALUE = 267;
  /**
   * <pre>
   * api初始化完毕推送
   * </pre>
   *
   * <code>PUSH_API_READY = 268;</code>
   */
  public static final int PUSH_API_READY_VALUE = 268;
  /**
   * <pre>
   * 动态认证接收方式
   * </pre>
   *
   * <code>PUSH_2FA_CONTACTINFO = 269;</code>
   */
  public static final int PUSH_2FA_CONTACTINFO_VALUE = 269;
  /**
   * <code>KICK_ACCOUNT = 300;</code>
   */
  public static final int KICK_ACCOUNT_VALUE = 300;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static TradeMsgType valueOf(int value) {
    return forNumber(value);
  }

  public static TradeMsgType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_MSG;
      case 1: return HEARTBEAT_REQ;
      case 2: return HEARTBEAT_RSP;
      case 3: return VELOCITY_REQ;
      case 4: return VELOCITY_RSP;
      case 101: return ACCOUNT_HEARTBEAT_REQ;
      case 102: return ACCOUNT_HEARTBEAT_RSP;
      case 103: return LOGIN_REQ;
      case 104: return LOGIN_RSP;
      case 105: return LOGOUT_REQ;
      case 106: return LOGOUT_RSP;
      case 107: return MOD_PWD_REQ;
      case 108: return MOD_PWD_RSP;
      case 109: return VERTIFICATE_CODE_REQ;
      case 110: return VERTIFICATE_CODE_RSP;
      case 111: return SET_VERTIFICATE_CODE_REQ;
      case 120: return QUERY_LOGIN_STATUS_REQ;
      case 121: return QUERY_LOGIN_STATUS_RSP;
      case 124: return QUERY_BALANCE_REQ;
      case 125: return QUERY_BALANCE_RSP;
      case 126: return QUERY_ORDER_REQ;
      case 127: return QUERY_ORDER_RSP;
      case 128: return QUERY_POSITION_SUM_REQ;
      case 129: return QUERY_POSITION_SUM_RSP;
      case 130: return QUERY_POSITION_DETAIL_REQ;
      case 131: return QUERY_POSITION_DETAIL_RSP;
      case 132: return QUERY_MATCH_REQ;
      case 133: return QUERY_MATCH_RSP;
      case 134: return QUERY_HIS_ORDER_REQ;
      case 135: return QUERY_HIS_ORDER_RSP;
      case 136: return QUERY_HIS_MATCH_REQ;
      case 137: return QUERY_HIS_MATCH_RSP;
      case 139: return QUERY_HIS_POSITION_REQ;
      case 140: return QUERY_HIS_POSITION_RSP;
      case 141: return QUERY_FEE_INFO_REQ;
      case 142: return QUERY_FEE_INFO_RSP;
      case 143: return QUERY_ACCOUNT_MARGIN_RENT_REQ;
      case 144: return QUERY_ACCOUNT_MARGIN_RENT_RSP;
      case 145: return QUERY_ACCOUNT_FEE_RENT_REQ;
      case 146: return QUERY_ACCOUNT_FEE_RENT_RSP;
      case 147: return QUERY_FREE_BALANCE_REQ;
      case 148: return QUERY_FREE_BALANCE_RSP;
      case 149: return QUERY_EXCHANGE_REQ;
      case 150: return QUERY_EXCHANGE_RSP;
      case 151: return QUERY_CONTRACT_REQ;
      case 152: return QUERY_CONTRACT_RSP;
      case 153: return QUERY_COMMODITY_REQ;
      case 154: return QUERY_COMMODITY_RSP;
      case 155: return QUERY_CURRENCY_REQ;
      case 156: return QUERY_CURRENCY_RSP;
      case 190: return INSERT_ORDER_REQ;
      case 191: return INSERT_ORDER_RSP;
      case 192: return CANCEL_ORDER_REQ;
      case 193: return CANCEL_ORDER_RSP;
      case 194: return MOD_ORDER_REQ;
      case 195: return MOD_ORDER_RSP;
      case 260: return PUSH_ORDER;
      case 261: return PUSH_MATCH;
      case 262: return PUSH_FUND;
      case 263: return PUSH_POSITION;
      case 264: return PUSH_PROFIT;
      case 265: return PUSH_ACCOUNT_DISCONNECT;
      case 266: return PUSH_POSITION_SUMMARY;
      case 267: return PUSH_CONTRACT;
      case 268: return PUSH_API_READY;
      case 269: return PUSH_2FA_CONTACTINFO;
      case 300: return KICK_ACCOUNT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TradeMsgType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TradeMsgType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TradeMsgType>() {
          public TradeMsgType findValueByNumber(int number) {
            return TradeMsgType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return TradeTypeDef.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final TradeMsgType[] VALUES = values();

  public static TradeMsgType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TradeMsgType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.gateway.TradeMsgType)
}
