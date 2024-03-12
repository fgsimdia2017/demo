package com.demo.dao;

import com.demo.model.UserEs;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author huangfeng
 * @Date 2023/12/20 10:37
 * @description
 * @Version 1.0
 */
public interface UserEsRepository extends ElasticsearchRepository<UserEs, Long>{
}
