package com.demo.service.impl;

import cn.hutool.json.JSONUtil;
import com.demo.model.UserVO;
import com.demo.service.AbstractWebsocketService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author huangfeng
 * @Date 2023/12/19 15:21
 * @description
 * @Version 1.0
 */
@Component
public class OKexWebsocketService extends AbstractWebsocketService {
    @Override
    public boolean subContent() {
        //连接okex
        if (linkedDeque.size()>Integer.MAX_VALUE/2){
            //清空一下,或者不放到内存中
        }
        linkedDeque.push(new UserVO(1L,"okex","A"));
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
        System.out.println("okex的数据推送到kafka:{}"+ JSONUtil.toJsonStr(list));
        //send list 2 kafka
    }

    @Override
    public void retrySub() {

    }
}
