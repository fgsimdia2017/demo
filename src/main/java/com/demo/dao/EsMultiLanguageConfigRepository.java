package com.demo.dao;

import com.demo.model.EsMultiLanguageConfigDo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author huangfeng
 * @Date 2023/12/29 10:31
 * @description
 * @Version 1.0
 */
public interface EsMultiLanguageConfigRepository extends ElasticsearchRepository<EsMultiLanguageConfigDo, Long> {
}
