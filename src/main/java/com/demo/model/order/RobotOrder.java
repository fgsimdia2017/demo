package com.demo.model.order;

import com.demo.model.match.MatchingEngine;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @Author huangfeng
 * @Date 2024/2/23 16:47
 * @description
 * @Version 1.0
 */

public class RobotOrder extends Order{
    private static final double MAX_PRICE_DEVIATION = 0.001; // 最大价格偏差
    private Random random;


    public void placeOrder(String symbol, boolean isBuyOrder) {
        double currentPrice = getCurrentPrice(symbol, isBuyOrder); // 获取当前价格
        double price = currentPrice * (1.0 + (random.nextDouble() - 0.5) * MAX_PRICE_DEVIATION); // 在当前价格上加上最大价格偏差，生成随机价格
        int quantity = random.nextInt(100); // 生成随机数量
        LimitOrder robotOrder = new LimitOrder(symbol, quantity, isBuyOrder, true,price); // 创建机器人订单
        MatchingEngine.submitOrder(robotOrder); // 提交机器人订单给匹配引擎
    }

    private double getCurrentPrice(String symbol, boolean isBuyOrder) {
        PriorityQueue<LimitOrder> limitOrders = isBuyOrder ? MatchingEngine.sellLimitOrders : MatchingEngine.buyLimitOrders;
        if (limitOrders.isEmpty()) {
            return 100.0; // 如果盘口为空，返回默认价格100
        }
        LimitOrder limitOrder = limitOrders.peek();
        return limitOrder.getPrice(); // 返回盘口的最佳价格
    }

    @Override
    public int compareTo(Order o) {
        return 0;
    }

    private int price;

    public RobotOrder(String symbol, int quantity, boolean buyOrder, int price) {
        super(symbol, quantity, buyOrder, true);
        this.price = price;
    }
    public RobotOrder() {
        super();
    }

    public LimitOrder toLimitOrder() {
        return new LimitOrder(getSymbol(), getQuantity(), isBuyOrder(), true, getPrice());
    }
}
