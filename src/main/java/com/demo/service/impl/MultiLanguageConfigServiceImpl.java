package com.demo.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.json.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.dao.MultiLanguageConfigRepository;
import com.demo.model.MultiLanguageConfigDo;
import com.demo.model.MultiLanguageConfigDoQO;
import com.demo.model.MultiLanguageConfigDoRO;
import com.demo.model.MultiLanguageConfigDoVO;
import com.demo.service.IMultiLanguageConfigService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @Author huangfeng
 * @Date 2023/12/29 10:00
 * @description
 * @Version 1.0
 */
@Service
public class MultiLanguageConfigServiceImpl extends ServiceImpl<MultiLanguageConfigRepository, MultiLanguageConfigDo> implements IMultiLanguageConfigService {
    @Override
    public boolean create(MultiLanguageConfigDoRO ro) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean update(MultiLanguageConfigDoRO ro) {
        return false;
    }

    @Override
    public MultiLanguageConfigDoVO getById(Long id) {
        return null;
    }

    @Override
    public List<MultiLanguageConfigDoVO> findList(MultiLanguageConfigDoQO qo) {
        List<MultiLanguageConfigDo> list = list();
        if (CollectionUtil.isEmpty(list)) {
            return Collections.emptyList();
        }
        return MultiLanguageConfigDo.build(list);
    }

    @Override
    public JSONObject getLangNameByClassifyId(MultiLanguageConfigDoQO qo) {
        return null;
    }

    @Override
    public MultiLanguageConfigDoVO findOne(MultiLanguageConfigDoQO qo) {
        return null;
    }

    @Override
    public Map<String, MultiLanguageConfigDoVO> getLangNameMap(MultiLanguageConfigDoQO qo) {
        return null;
    }
}
