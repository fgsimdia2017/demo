package com.demo.dao;

import com.demo.model.es.EsChartConfigDo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author huangfeng
 * @Date 2024/1/5 17:33
 * @description
 * @Version 1.0
 */
public interface EsChartConfigRepository extends ElasticsearchRepository<EsChartConfigDo, Long> {
}
