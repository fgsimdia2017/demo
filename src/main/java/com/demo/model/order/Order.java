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

public abstract  class Order implements Comparable<Order> {
    private String symbol;
    private int quantity;
    private boolean buyOrder;
    private boolean isRobot;
    private Double price;
    public Order(String symbol, int quantity, boolean buyOrder, boolean isRobot) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.buyOrder = buyOrder;
        this.isRobot = isRobot;
    }
    public Order() {

    }
    public Order(String symbol, int quantity, boolean buyOrder, boolean isRobot,Double price) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.buyOrder = buyOrder;
        this.isRobot = isRobot;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity(int quantity) {
        this.quantity -= quantity;
    }

    public boolean isBuyOrder() {
        return buyOrder;
    }

    public boolean isRobot() {
        return isRobot;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Order other) {
        // 实现比较逻辑，根据具体情况重写该方法
        return 0;
    }
}
