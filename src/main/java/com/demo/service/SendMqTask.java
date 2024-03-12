package com.demo.service;

import cn.hutool.core.thread.ThreadFactoryBuilder;
import com.demo.service.impl.OKexWebsocketService;
import com.demo.service.impl.UpbitWebsocketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * @Author huangfeng
 * @Date 2023/12/19 15:28
 * @description
 * @Version 1.0
 */
@Component
@Slf4j
public class SendMqTask {
    @Autowired
    private UpbitWebsocketService upbitWebsocketService;
    @Autowired
    private OKexWebsocketService oKexWebsocketService;

   // @PostConstruct
    public void sendData() {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNamePrefix("my-test-pool-%d").build();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1, threadFactory);
        System.out.println("startTime: " + System.currentTimeMillis());
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("beginTime: " + System.currentTimeMillis());
            try {
                sendAllMq();
            } catch (Exception e) {
            }
            System.out.println("endTime: " + System.currentTimeMillis());
        }, 2, 5, TimeUnit.SECONDS);
    }

    public void sendAllMq() {
        List<AbstractWebsocketService> list = new ArrayList<>(2);
        list.add(upbitWebsocketService);
        list.add(oKexWebsocketService);
        log.info("执行发送数据任务");
        for (int i = 0; i < list.size(); i++) {
            AbstractWebsocketService abstractWebsocketService = list.get(i);
            abstractWebsocketService.push();
        }
    }
}
