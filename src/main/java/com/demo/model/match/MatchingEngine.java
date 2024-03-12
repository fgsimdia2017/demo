package com.demo.model.match;

import com.demo.model.order.LimitOrder;
import com.demo.model.order.MarketOrder;
import com.demo.model.order.Order;
import com.demo.model.order.RobotOrder;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author huangfeng
 * @Date 2024/2/23 16:23
 * @description
 * @Version 1.0
 */
public class MatchingEngine {
    public static PriorityQueue<LimitOrder> buyLimitOrders;
    public static PriorityQueue<LimitOrder> sellLimitOrders;
    public static Queue<MarketOrder> buyMarketOrders;
    public static Queue<MarketOrder> sellMarketOrders;

    public static void submitOrder(Order order) {
        if (order instanceof LimitOrder) {
            submitLimitOrder((LimitOrder) order);
        } else if (order instanceof MarketOrder) {
            submitMarketOrder((MarketOrder) order);
        } else if (order instanceof RobotOrder) {
            submitRobotOrder((RobotOrder) order);
        }
        matchOrders();
    }

    private static void submitLimitOrder(LimitOrder order) {
        if (order.isBuyOrder()) {
            buyLimitOrders.add(order);
        } else {
            sellLimitOrders.add(order);
        }
    }

    private static void submitMarketOrder(MarketOrder order) {
        if (order.isBuyOrder()) {
            buyMarketOrders.add(order);
        } else {
            sellMarketOrders.add(order);
        }
    }

    private static void submitRobotOrder(RobotOrder order) {
        if (order.isBuyOrder()) {
            buyLimitOrders.add(order.toLimitOrder());
        } else {
            sellLimitOrders.add(order.toLimitOrder());
        }
    }

    private static void matchOrders() {
        while (canMatchOrders()) {
            Order buyOrder = getNextBuyOrder();
            Order sellOrder = getNextSellOrder();

            if (buyOrder.getPrice() >= sellOrder.getPrice()) {
                // 撮合交易
                int quantity = Math.min(buyOrder.getQuantity(), sellOrder.getQuantity());
                buyOrder.reduceQuantity(quantity);
                sellOrder.reduceQuantity(quantity);

                if (buyOrder.getQuantity() > 0) {
                    addBuyOrder(buyOrder);
                }
                if (sellOrder.getQuantity() > 0) {
                    addSellOrder(sellOrder);
                }
            } else {
                addBuyOrder(buyOrder);
                addSellOrder(sellOrder);
                break;
            }
        }
    }

    private static boolean canMatchOrders() {
        return (!buyLimitOrders.isEmpty() && !sellLimitOrders.isEmpty()) || (!buyMarketOrders.isEmpty() && !sellLimitOrders.isEmpty()) || (!buyLimitOrders.isEmpty() && !sellMarketOrders.isEmpty());
    }

    private static Order getNextBuyOrder() {
        if (!buyLimitOrders.isEmpty() && !buyMarketOrders.isEmpty() && buyMarketOrders.peek().getPrice() <= buyLimitOrders.peek().getPrice()) {
            return buyMarketOrders.poll();
        }
        return buyLimitOrders.peek();
    }

    private static Order getNextSellOrder() {
        if (!sellLimitOrders.isEmpty() && !sellMarketOrders.isEmpty() && sellMarketOrders.peek().getPrice() >= sellLimitOrders.peek().getPrice()) {
            return sellMarketOrders.poll();
        }
        return sellLimitOrders.peek();
    }

    private static void addBuyOrder(Order order) {
        if (order instanceof LimitOrder) {
            buyLimitOrders.add((LimitOrder) order);
        } else if (order instanceof MarketOrder) {
            buyMarketOrders.add((MarketOrder) order);
        } else if (order instanceof RobotOrder) {
            buyLimitOrders.add(((RobotOrder) order).toLimitOrder());
        }
    }

    private static void addSellOrder(Order order) {
        if (order instanceof LimitOrder) {
            sellLimitOrders.add((LimitOrder) order);
        } else if (order instanceof MarketOrder) {
            sellMarketOrders.add((MarketOrder) order);
        } else if (order instanceof RobotOrder) {
            sellLimitOrders.add(((RobotOrder) order).toLimitOrder());
        }
    }
}

