package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author huangfeng
 * @Date 2023/12/22 13:53
 * @description
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LiquidationsHistoryRO {
    private String exchangeName;
    private BigDecimal turnoverNumber;
    private BigDecimal buyTurnoverNumber;
    private BigDecimal sellTurnoverNumber;
    private BigDecimal buyVolUsd;
    private BigDecimal sellVolUsd;
}
