package com.demo.model.robot;

import com.demo.model.order.RobotOrder;

import javax.annotation.PostConstruct;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author huangfeng
 * @Date 2024/2/23 16:47
 * @description
 * @Version 1.0
 */
public class Robot {


  //  @PostConstruct
    public void autoPlaceOrders() {
        RobotOrder robotOrder = new RobotOrder();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // 每秒下一个买单和一个卖单
                robotOrder.placeOrder("BTCUSD", true); // 下一个买单
                robotOrder.placeOrder("BTCUSD", false); // 下一个卖单
            }
        }, 0, 1000); // 延迟0毫秒后开始执行，每隔1000毫秒执行一次
    }
}
