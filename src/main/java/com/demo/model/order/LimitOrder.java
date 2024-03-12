package com.demo.model.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author huangfeng
 * @Date 2024/2/23 16:18
 * @description
 * @Version 1.0
 */
public class LimitOrder extends Order{

    public LimitOrder(String symbol, int quantity, boolean buyOrder, boolean isRobot, Double price) {
        super(symbol, quantity, buyOrder, isRobot,price);
    }

}
