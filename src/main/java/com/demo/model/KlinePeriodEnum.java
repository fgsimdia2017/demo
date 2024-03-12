package com.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * @Author huangfeng
 * @Date 2023/10/7 15:32
 * @description
 * @Version 1.0
 */
@Getter
public enum KlinePeriodEnum {
    /**
     * 粒度类型
     */
    PERIOD_1M("1m", "1分钟"),
    PERIOD_5M("5m", "5m"),
    PERIOD_15M("15m", "15m"),
    PERIOD_1H("1h", "1h"),
    PERIOD_4H("4h", "4h"),
    PERIOD_1DAY("1d", "1d"),
    PERIOD_1WEEK("1w", "1w"),
    PERIOD_1MONTH("1mo", "1mo"),
    PERIOD_1P("1p", "1个季度"),
    PERIOD_1YEAR("1y", "1年");

    KlinePeriodEnum(String type, String detail) {
        this.type = type;
        this.detail = detail;
    }

    /**
     * 类型
     */
    private final String type;

    /**
     * 描述
     */
    private final String detail;

    public static boolean isLegal(String period) {
        if (StringUtils.isEmpty(period)) {
            return false;
        }
        for (KlinePeriodEnum obj : KlinePeriodEnum.values()) {
            if (obj.type.equals(period)) {
                return true;
            }
        }
        return false;
    }

}
