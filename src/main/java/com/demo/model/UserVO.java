package com.demo.model;

import lombok.Data;

/**
 * @Author huangfeng
 * @Date 2023/9/14 11:28
 * @description
 * @Version 1.0
 */
@Data
public class UserVO {
    private Long id;
    private String username;
    private String email;
    private String google;

    public UserVO(Long id, String username, String email) {
        this.id = id;
        this.email = email;
        this.username = username;
    }
}
