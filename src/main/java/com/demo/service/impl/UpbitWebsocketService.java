package com.demo.service.impl;

import cn.hutool.json.JSONUtil;
import com.demo.model.UserVO;
import com.demo.service.AbstractWebsocketService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author huangfeng
 * @Date 2023/12/19 14:49
 * @description
 * @Version 1.0
 */
@Component
public class UpbitWebsocketService extends AbstractWebsocketService {
    @Override
    public boolean subContent() {
        //连接upbit
        linkedDeque.push(new UserVO(1L,"upbit","A"));
        return true;
    }

    @Override
    public void send2kafka() {
        // 一次取1000条出来
        List<UserVO> list = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            if (linkedDeque.isEmpty()) {
                break;
            }
            list.add(linkedDeque.poll());
        }
        //send list 2 kafka
        System.out.println("upbit的数据推送到kafka:{}"+ JSONUtil.toJsonStr(list));
    }

    @Override
    public void retrySub() {
        // 重连 ,需要维护会话
    }
}
