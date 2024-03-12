package com.demo.utils;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.http.HttpEntity;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

/**
 * @Author huangfeng
 * @Date 2023/12/5 16:36
 * @description
 * @Version 1.0
 */
public class HttpUtils
{
    private String httpRequest(){
        return "";
    }


    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // 从文件中读取 JSON 数据
            FileReader file = new FileReader("path/to/file.json");
            // 将 JSON 文件解析为对象
            Object json = objectMapper.readValue(file, Object.class);
            JSONObject jsonObject = JSONUtil.parseObj(json);

            System.out.println(json);
        } catch (Exception e) {

        }
}}
