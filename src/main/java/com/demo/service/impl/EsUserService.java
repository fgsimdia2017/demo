package com.demo.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.fastjson.JSON;
import com.demo.dao.UserEsRepository;
import com.demo.model.UserEs;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @Author huangfeng
 * @Date 2023/12/19 16:42
 * @description
 * @Version 1.0
 */
@Service
@Slf4j
public class EsUserService {
    @Autowired
    private UserEsRepository userEsRepository;
    @Autowired
    private RestHighLevelClient client;
    public void save() {
        try {
            UserEs userEs = new UserEs(1L, "test", "testEmail", "fun@google.com");
            userEsRepository.save(userEs);
            UserEs userEs2 = new UserEs(2L, "funny", "2@163.com", "haha@google.com");
            userEsRepository.save(userEs2);
        } catch (Exception e) {

        }
    }

    public void update() {
        try {
            UserEs userEs = new UserEs(1L, "test", "testEmailUpdate", "fun@google.com");
            userEsRepository.save(userEs);
        } catch (Exception e) {

        }
    }

    public UserEs findById(Long id) {
        try {
            final Optional<UserEs> byId = userEsRepository.findById(id);
            return byId.orElse(null);
        } catch (Exception e) {

        }
        return null;
    }
    public Page<UserEs> findByName(String name) {
        try {
            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
            searchSourceBuilder.query(QueryBuilders.termQuery("username",name));
            SearchRequest searchRequest = new SearchRequest();
            searchRequest.indices("es_user_index");
            searchRequest.source(searchSourceBuilder);
             SearchResponse response = client.search(searchRequest, RequestOptions.DEFAULT);
             SearchHits hits = response.getHits();
             SearchHit[] hits1 = hits.getHits();
            if (CollectionUtil.isEmpty(hits)) {
                return null;
            }
        } catch (Exception e) {

        }
        return null;
    }
}
