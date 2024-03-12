package com.demo.service.impl;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.dao.ChartConfigRepository;
import com.demo.model.ChartConfigDo;
import com.demo.model.ChartConfigDoQO;
import com.demo.model.ChartConfigDoRO;
import com.demo.model.ChartConfigDoVO;
import com.demo.service.ChartConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hf
 * @since 2024-01-03
 */
@Service
@Slf4j
public class ChartConfigServiceImpl extends ServiceImpl<ChartConfigRepository, ChartConfigDo> implements ChartConfigService {


    public List<Long> parseIndicatorDataIds(String idsStr) {
        if (StringUtils.isEmpty(idsStr)) {
            return Collections.emptyList();
        }
        try {
            JSONArray jsonArray = JSONUtil.parseArray(idsStr);
            if (jsonArray.isEmpty()) {
                return Collections.emptyList();
            }
            List<Long> list = new ArrayList<>(jsonArray.size());
            for (int i = 0; i < jsonArray.size(); i++) {
                Object item = jsonArray.get(i);
                if (null == item) {
                    continue;
                }
                list.add(Long.parseLong(item.toString()));
            }
            return list;
        } catch (Exception e) {
            log.error("解析指标id字符串失败,ids:{},error:", idsStr, e);
        }
        return Collections.emptyList();
    }

    public LambdaQueryWrapper<ChartConfigDo> getOneQuery(ChartConfigDoQO qo) {
        return Wrappers.<ChartConfigDo>lambdaQuery()
                .eq(true, ChartConfigDo::getInnerKey, qo.getInnerKey())
                .eq(true, ChartConfigDo::getLangType, qo.getLangType());
    }

    public LambdaQueryWrapper<ChartConfigDo> getBannerQuery(Integer langType, Integer limit) {
        return Wrappers.<ChartConfigDo>lambdaQuery()
                .ne(true, ChartConfigDo::getLinkBanner, 0)
                .eq(true, ChartConfigDo::getLangType, langType)
                .orderBy(true, false, ChartConfigDo::getUpdateTime)
                .last("LIMIT " + limit);
    }

    public LambdaQueryWrapper<ChartConfigDo> getQueryWrapper(ChartConfigDoQO qo) {
        return Wrappers.<ChartConfigDo>lambdaQuery()
                .eq(ObjectUtils.isNotEmpty(qo.getId()), ChartConfigDo::getId, qo.getId())
                .eq(ObjectUtils.isNotEmpty(qo.getInnerKey()), ChartConfigDo::getInnerKey, qo.getInnerKey())
                .eq(ObjectUtils.isNotEmpty(qo.getLangType()), ChartConfigDo::getLangType, qo.getLangType())
                .eq(ObjectUtils.isNotEmpty(qo.getTitle()), ChartConfigDo::getTitle, qo.getTitle())
                .eq(ObjectUtils.isNotEmpty(qo.getTag()), ChartConfigDo::getTag, qo.getTag())
                .eq(ObjectUtils.isNotEmpty(qo.getMeaning()), ChartConfigDo::getMeaning, qo.getMeaning())
                .eq(ObjectUtils.isNotEmpty(qo.getCharKey()), ChartConfigDo::getCharKey, qo.getCharKey())
                .eq(ObjectUtils.isNotEmpty(qo.getCharValue()), ChartConfigDo::getCharValue, qo.getCharValue())
                .eq(ObjectUtils.isNotEmpty(qo.getIndicatorIds()), ChartConfigDo::getIndicatorIds, qo.getIndicatorIds())
                .eq(ObjectUtils.isNotEmpty(qo.getChartType()), ChartConfigDo::getChartType, qo.getChartType())
                .eq(ObjectUtils.isNotEmpty(qo.getLinkBanner()), ChartConfigDo::getLinkBanner, qo.getLinkBanner())
                .eq(ObjectUtils.isNotEmpty(qo.getViewType()), ChartConfigDo::getViewType, qo.getViewType())
                .eq(ObjectUtils.isNotEmpty(qo.getIntro()), ChartConfigDo::getIntro, qo.getIntro())
                .eq(ObjectUtils.isNotEmpty(qo.getData()), ChartConfigDo::getData, qo.getData())
                .eq(ObjectUtils.isNotEmpty(qo.getDataFormula()), ChartConfigDo::getDataFormula, qo.getDataFormula())
                .eq(ObjectUtils.isNotEmpty(qo.getIsUseSearch()), ChartConfigDo::getIsUseSearch, qo.getIsUseSearch());
    }

    public LambdaQueryWrapper<ChartConfigDo> getLikeQueryWrapper(String searchKey, Integer langType) {
        return Wrappers.<ChartConfigDo>lambdaQuery()
                .eq(true, ChartConfigDo::getLangType, langType)
                .eq(true, ChartConfigDo::getIsUseSearch, 1)
                .and(true, query -> query
                        .like(true, ChartConfigDo::getTitle, searchKey)
                        .or()
                        .like(true, ChartConfigDo::getTag, searchKey)
                        .or()
                        .like(true, ChartConfigDo::getMeaning, searchKey));
    }

    @Override
    public boolean create(ChartConfigDoRO ro) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean update(ChartConfigDoRO ro) {
        return false;
    }

    @Override
    public ChartConfigDo getById(Long id) {
        return baseMapper.selectById(id);
    }

    @Override
    public List<ChartConfigDo> findList(ChartConfigDoQO qo) {
        return super.list(getLikeQueryWrapper(qo.getInnerKey(), qo.getLangType()));
    }

    @Override
    public ChartConfigDoVO findByName(ChartConfigDoQO qo) {
        String innerKey = qo.getInnerKey();
        return null;
    }

    @Override
    public List<ChartConfigDoVO> topBanners(ChartConfigDoQO qo) {
        return null;
    }
}
