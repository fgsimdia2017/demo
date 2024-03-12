package com.demo.service;

import com.demo.model.UserVO;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @Author huangfeng
 * @Date 2023/12/19 14:29
 * @description
 * @Version 1.0
 */
public abstract class AbstractWebsocketService {
    protected ConcurrentLinkedDeque<UserVO> linkedDeque = new ConcurrentLinkedDeque<>();

    public void push() {
        boolean subSuccess = subContent();
        if (subSuccess) {
            send2kafka();
        } else {
            retrySub();
        }
    }

    public abstract boolean subContent();

    public abstract void send2kafka();

    public abstract void retrySub();
}
