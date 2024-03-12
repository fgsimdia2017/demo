package com.demo.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.demo.dao.EsChartConfigRepository;
import com.demo.model.ChartConfigDo;
import com.demo.model.ChartConfigDoQO;
import com.demo.model.es.EsChartConfigDo;
import com.demo.service.ChartConfigService;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.core.TimeValue;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author huangfeng
 * @Date 2024/1/5 16:55
 * @description
 * @Version 1.0
 */
@Slf4j
@Service
public class EsCharConfigServiceImpl {
    @Autowired
    private ChartConfigService chartConfigService;
    @Autowired
    private EsChartConfigRepository esChartConfigRepository;
    @Autowired
    private RestHighLevelClient client;

    public void saveAll() {
        List<ChartConfigDo> list = chartConfigService.getBaseMapper().selectList(Wrappers.lambdaQuery());
        if (CollectionUtil.isEmpty(list)) {
            return;
        }
        List<EsChartConfigDo> esChartConfigDoList = EsChartConfigDo.build(list);
        esChartConfigRepository.saveAll(esChartConfigDoList);
    }

    public List<String> find(ChartConfigDoQO qo) {
        String nameKey = qo.getInnerKey();
        Integer langType = qo.getLangType();
        SearchRequest searchRequest = new SearchRequest("chart_config_index");
        SearchSourceBuilder builder = new SearchSourceBuilder();
        builder.fetchSource(new String[]{"innerKey"}, null);
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        boolQueryBuilder
                .must(QueryBuilders.termQuery("langType", langType))//
              //  .must(QueryBuilders.multiMatchQuery(nameKey, "title", "tag", "chartValue"))
                .must(QueryBuilders.matchQuery("meaning.search",nameKey));

        builder.query(boolQueryBuilder);
        builder.timeout(new TimeValue(6, TimeUnit.SECONDS));
        searchRequest.source(builder);
        try {
            SearchResponse search = client.search(searchRequest, RequestOptions.DEFAULT);
            SearchHit[] hits = search.getHits().getHits();
            List<String> list = new ArrayList<>(hits.length);
            for (SearchHit hit : hits) {
                String sourceAsString = hit.getSourceAsString();
                list.add(sourceAsString);
            }
            return list;
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    public List<String> findFuzzy(ChartConfigDoQO qo) {
        String nameKey = qo.getInnerKey();
        Integer langType = qo.getLangType();
        SearchRequest searchRequest = new SearchRequest("chart_config_index");
        SearchSourceBuilder builder = new SearchSourceBuilder();
        builder.fetchSource(new String[]{"innerKey"}, null);
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery()
                .must(QueryBuilders.termQuery("langType", langType))
                .must(QueryBuilders.boolQuery()
                        .should(QueryBuilders.fuzzyQuery("title", nameKey))
                        .should(QueryBuilders.fuzzyQuery("tag", nameKey))
                        .should(QueryBuilders.fuzzyQuery("meaning", nameKey)));


        builder.query(boolQueryBuilder);
        builder.timeout(new TimeValue(6, TimeUnit.SECONDS));
        searchRequest.source(builder);
        try {
            SearchResponse search = client.search(searchRequest, RequestOptions.DEFAULT);
            SearchHit[] hits = search.getHits().getHits();
            List<String> list = new ArrayList<>(hits.length);
            for (SearchHit hit : hits) {
                String sourceAsString = hit.getSourceAsString();
                list.add(sourceAsString);
            }
            return list;
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }
}
