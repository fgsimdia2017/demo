package com.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @Author huangfeng
 * @Date 2023/12/19 16:43
 * @description
 * @Version 1.0
 */
@Data
@Document(indexName = "es_user_index")
public class UserEs implements Serializable {
    @Id
    @Field(type = FieldType.Long)
    private Long id;

    @Field(type = FieldType.Keyword, analyzer = "ik_max_word")
    private String username;
    @Field(type = FieldType.Keyword, analyzer = "ik_max_word")
    private String email;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String google;

    public UserEs() {

    }

    public UserEs(Long id, String username, String email, String google) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.google = google;
    }
}
