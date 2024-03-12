package com.demo.service.impl;

import cn.hutool.json.JSONObject;
import com.demo.model.EsMultiLanguageConfigDo;
import com.demo.model.MultiLanguageConfigDoQO;
import com.demo.model.MultiLanguageConfigDoRO;
import com.demo.model.MultiLanguageConfigDoVO;

import java.util.List;

/**
 * @Author huangfeng
 * @Date 2023/12/29 10:19
 * @description
 * @Version 1.0
 */
public interface IEsMultiLanguageConfigService {
    boolean create(MultiLanguageConfigDoRO ro);

    boolean delete(Long id);
    void deleteAll();
    boolean update(MultiLanguageConfigDoRO ro);

    void saveAll2Es();

    MultiLanguageConfigDoVO getById(Long id);

    List<MultiLanguageConfigDoVO> findList(MultiLanguageConfigDoQO qo);


    JSONObject getLangNameByClassifyId(MultiLanguageConfigDoQO qo);

    List<EsMultiLanguageConfigDo> find(MultiLanguageConfigDoQO qo);
}
