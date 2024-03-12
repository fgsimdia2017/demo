package com.demo.utils;

import org.springframework.util.StringUtils;

import java.math.BigDecimal;

/**
 * @Author huangfeng
 * @Date 2023/9/27 15:25
 * @description
 * @Version 1.0
 */
public class BigDecimalUtil {
    private BigDecimalUtil() {

    }

    public static String bigDecimal2String(BigDecimal value) {
        if (null == value) {
            return "";
        }
        return value.toPlainString();
    }


    public static String divide(String value,Long otherValue) {
        if (null == otherValue || otherValue == 0) {
            return "0";
        }
        if (StringUtils.isEmpty(value) || "0".equals(value)) {
            return "0";
        }
       return new BigDecimal(value).divide(new BigDecimal(otherValue), 2, BigDecimal.ROUND_UP).toPlainString();
    }

    public static String divide(BigDecimal value,BigDecimal otherValue) {
        if (null == value || null == otherValue) {
            return "0";
        }
        if(otherValue.compareTo(BigDecimal.ZERO) <= 0){
            return "0";
        }
        return value.divide(otherValue, 2, BigDecimal.ROUND_UP).toPlainString();
    }

    public static BigDecimal bigDecimal2Add(BigDecimal first, BigDecimal other) {
        if (null == first) {
            first = new BigDecimal("0");
        }
        if (null == other) {
            other = new BigDecimal("0");
        }
        return first.add(other);
    }
}
