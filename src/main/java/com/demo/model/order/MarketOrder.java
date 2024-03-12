package com.demo.model.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author huangfeng
 * @Date 2024/2/23 16:16
 * @description
 * @Version 1.0
 */
public class MarketOrder extends Order{

    public MarketOrder(String symbol, int quantity, boolean buyOrder, boolean isRobot) {
        super(symbol, quantity, buyOrder, isRobot);
    }

}
