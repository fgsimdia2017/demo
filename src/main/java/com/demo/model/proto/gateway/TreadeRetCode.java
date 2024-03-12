// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade_type_def.proto

package com.demo.model.proto.gateway;

/**
 * <pre>
 * 业务处理相关错误码
 * </pre>
 *
 * Protobuf enum {@code com.demo.model.proto.gateway.TreadeRetCode}
 */
public enum TreadeRetCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SUCCESSED = 0;</code>
   */
  SUCCESSED(0),
  /**
   * <pre>
   * 解析请要信息失败
   * </pre>
   *
   * <code>PARSE_PROTO_FAILED = 9998;</code>
   */
  PARSE_PROTO_FAILED(9998),
  /**
   * <pre>
   * session校验失败
   * </pre>
   *
   * <code>VERIFY_SESSION_FAILED = 9997;</code>
   */
  VERIFY_SESSION_FAILED(9997),
  /**
   * <pre>
   * 用户未登陆
   * </pre>
   *
   * <code>ACCOUNT_NOT_LOGIN = 9996;</code>
   */
  ACCOUNT_NOT_LOGIN(9996),
  /**
   * <pre>
   * esunny api 未初始化
   * </pre>
   *
   * <code>API_NOT_READY = 9995;</code>
   */
  API_NOT_READY(9995),
  /**
   * <pre>
   * 心跳超时
   * </pre>
   *
   * <code>ACCOUNT_LOGIN_TIMEOUT = 9994;</code>
   */
  ACCOUNT_LOGIN_TIMEOUT(9994),
  /**
   * <pre>
   * 未定义请求类型 
   * </pre>
   *
   * <code>UNDEFINE_REQUEST_TYPE = 9993;</code>
   */
  UNDEFINE_REQUEST_TYPE(9993),
  /**
   * <pre>
   * 未定义响应类型 
   * </pre>
   *
   * <code>UNDEFINE_RESPONSE_TYPE = 9992;</code>
   */
  UNDEFINE_RESPONSE_TYPE(9992),
  /**
   * <pre>
   * 未定义推送类型 
   * </pre>
   *
   * <code>UNDEFINE_RETURN_TYPE = 9991;</code>
   */
  UNDEFINE_RETURN_TYPE(9991),
  /**
   * <pre>
   * esunny 错误类型
   * </pre>
   *
   * <code>ESUNNY_FRONT_SERVER_ERROR = 9990;</code>
   */
  ESUNNY_FRONT_SERVER_ERROR(9990),
  /**
   * <pre>
   * 需要动态认证
   * </pre>
   *
   * <code>ESUNNY_ERROR_NEED_2FA = 10003;</code>
   */
  ESUNNY_ERROR_NEED_2FA(10003),
  /**
   * <pre>
   * 没有绑定二次认证信息
   * </pre>
   *
   * <code>ESUNNY_ERROR_NO_CONTACT = 10016;</code>
   */
  ESUNNY_ERROR_NO_CONTACT(10016),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SUCCESSED = 0;</code>
   */
  public static final int SUCCESSED_VALUE = 0;
  /**
   * <pre>
   * 解析请要信息失败
   * </pre>
   *
   * <code>PARSE_PROTO_FAILED = 9998;</code>
   */
  public static final int PARSE_PROTO_FAILED_VALUE = 9998;
  /**
   * <pre>
   * session校验失败
   * </pre>
   *
   * <code>VERIFY_SESSION_FAILED = 9997;</code>
   */
  public static final int VERIFY_SESSION_FAILED_VALUE = 9997;
  /**
   * <pre>
   * 用户未登陆
   * </pre>
   *
   * <code>ACCOUNT_NOT_LOGIN = 9996;</code>
   */
  public static final int ACCOUNT_NOT_LOGIN_VALUE = 9996;
  /**
   * <pre>
   * esunny api 未初始化
   * </pre>
   *
   * <code>API_NOT_READY = 9995;</code>
   */
  public static final int API_NOT_READY_VALUE = 9995;
  /**
   * <pre>
   * 心跳超时
   * </pre>
   *
   * <code>ACCOUNT_LOGIN_TIMEOUT = 9994;</code>
   */
  public static final int ACCOUNT_LOGIN_TIMEOUT_VALUE = 9994;
  /**
   * <pre>
   * 未定义请求类型 
   * </pre>
   *
   * <code>UNDEFINE_REQUEST_TYPE = 9993;</code>
   */
  public static final int UNDEFINE_REQUEST_TYPE_VALUE = 9993;
  /**
   * <pre>
   * 未定义响应类型 
   * </pre>
   *
   * <code>UNDEFINE_RESPONSE_TYPE = 9992;</code>
   */
  public static final int UNDEFINE_RESPONSE_TYPE_VALUE = 9992;
  /**
   * <pre>
   * 未定义推送类型 
   * </pre>
   *
   * <code>UNDEFINE_RETURN_TYPE = 9991;</code>
   */
  public static final int UNDEFINE_RETURN_TYPE_VALUE = 9991;
  /**
   * <pre>
   * esunny 错误类型
   * </pre>
   *
   * <code>ESUNNY_FRONT_SERVER_ERROR = 9990;</code>
   */
  public static final int ESUNNY_FRONT_SERVER_ERROR_VALUE = 9990;
  /**
   * <pre>
   * 需要动态认证
   * </pre>
   *
   * <code>ESUNNY_ERROR_NEED_2FA = 10003;</code>
   */
  public static final int ESUNNY_ERROR_NEED_2FA_VALUE = 10003;
  /**
   * <pre>
   * 没有绑定二次认证信息
   * </pre>
   *
   * <code>ESUNNY_ERROR_NO_CONTACT = 10016;</code>
   */
  public static final int ESUNNY_ERROR_NO_CONTACT_VALUE = 10016;


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
  public static TreadeRetCode valueOf(int value) {
    return forNumber(value);
  }

  public static TreadeRetCode forNumber(int value) {
    switch (value) {
      case 0: return SUCCESSED;
      case 9998: return PARSE_PROTO_FAILED;
      case 9997: return VERIFY_SESSION_FAILED;
      case 9996: return ACCOUNT_NOT_LOGIN;
      case 9995: return API_NOT_READY;
      case 9994: return ACCOUNT_LOGIN_TIMEOUT;
      case 9993: return UNDEFINE_REQUEST_TYPE;
      case 9992: return UNDEFINE_RESPONSE_TYPE;
      case 9991: return UNDEFINE_RETURN_TYPE;
      case 9990: return ESUNNY_FRONT_SERVER_ERROR;
      case 10003: return ESUNNY_ERROR_NEED_2FA;
      case 10016: return ESUNNY_ERROR_NO_CONTACT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TreadeRetCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TreadeRetCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TreadeRetCode>() {
          public TreadeRetCode findValueByNumber(int number) {
            return TreadeRetCode.forNumber(number);
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
        .getEnumTypes().get(1);
  }

  private static final TreadeRetCode[] VALUES = values();

  public static TreadeRetCode valueOf(
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

  private TreadeRetCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.demo.model.proto.gateway.TreadeRetCode)
}

