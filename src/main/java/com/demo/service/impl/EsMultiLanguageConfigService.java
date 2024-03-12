package com.demo.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.db.handler.BeanHandler;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.demo.dao.EsMultiLanguageConfigRepository;
import com.demo.model.EsMultiLanguageConfigDo;
import com.demo.model.MultiLanguageConfigDoQO;
import com.demo.model.MultiLanguageConfigDoRO;
import com.demo.model.MultiLanguageConfigDoVO;
import com.demo.service.IMultiLanguageConfigService;
import org.apache.lucene.search.TotalHits;
import org.apache.lucene.search.join.ScoreMode;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.Strings;
import org.elasticsearch.common.document.DocumentField;
import org.elasticsearch.core.TimeValue;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.NestedQueryBuilder;
import org.elasticsearch.index.query.Operator;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @Author huangfeng
 * @Date 2023/12/29 10:21
 * @description
 * @Version 1.0
 */
@Service
public class EsMultiLanguageConfigService implements IEsMultiLanguageConfigService {
    @Autowired
    private IMultiLanguageConfigService multiLanguageConfigService;
    @Autowired
    private EsMultiLanguageConfigRepository esMultiLanguageConfigRepository;
    @Autowired
    private RestHighLevelClient client;

    @Override
    public boolean create(MultiLanguageConfigDoRO ro) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        esMultiLanguageConfigRepository.deleteById(id);
        return true;
    }

    @Override
    public void deleteAll() {
        esMultiLanguageConfigRepository.deleteAll();
    }

    @Override
    public boolean update(MultiLanguageConfigDoRO ro) {
        return false;
    }

    @Override
    public void saveAll2Es() {
        List<MultiLanguageConfigDoVO> list = multiLanguageConfigService.findList(new MultiLanguageConfigDoQO());
        List<EsMultiLanguageConfigDo> esEntityList = MultiLanguageConfigDoVO.build(list);
        esMultiLanguageConfigRepository.saveAll(esEntityList);
    }

    @Override
    public MultiLanguageConfigDoVO getById(Long id) {
        Optional<EsMultiLanguageConfigDo> optionResult = esMultiLanguageConfigRepository.findById(id);
        return optionResult.map(EsMultiLanguageConfigDo::build).orElse(null);
    }

    @Override
    public List<MultiLanguageConfigDoVO> findList(MultiLanguageConfigDoQO qo) {
        return null;
    }

    @Override
    public JSONObject getLangNameByClassifyId(MultiLanguageConfigDoQO qo) {
        return null;
    }

    @Override
    public List<EsMultiLanguageConfigDo> find(MultiLanguageConfigDoQO qo) {
        Integer classifyId = qo.getClassifyId();
        Integer langType = qo.getLangType();
        String nameKey = qo.getNameKey();
        return searchEsMultiLangConfig(nameKey);
    }

    private List<EsMultiLanguageConfigDo> searchEsMultiLangConfig(String name) {
        SearchRequest searchRequest = new SearchRequest("content_information_index");
        searchRequest.source().query(QueryBuilders.multiMatchQuery("Total_Crypto_Market_Cap", "nameKey", "data", "otherData", "chartKey"));
        try {
            SearchResponse search = client.search(searchRequest, RequestOptions.DEFAULT);
            SearchHit[] hits = search.getHits().getHits();
            List<EsMultiLanguageConfigDo> list = new ArrayList<>();
            for (SearchHit hit : hits) {
                final String sourceAsString = hit.getSourceAsString();
                final EsMultiLanguageConfigDo bean = JSONUtil.toBean(sourceAsString, EsMultiLanguageConfigDo.class);
                list.add(bean);
            }
            return list;
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }
}
