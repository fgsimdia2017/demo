package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author huangfeng
 * @Date 2023/9/14 11:12
 * @description
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.demo.dao")
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }
}
