package com.demo.service;

import cn.hutool.json.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.model.MultiLanguageConfigDo;
import com.demo.model.MultiLanguageConfigDoQO;
import com.demo.model.MultiLanguageConfigDoRO;
import com.demo.model.MultiLanguageConfigDoVO;

import java.util.List;
import java.util.Map;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hf
 * @since 2023-12-12
 */
public interface IMultiLanguageConfigService extends IService<MultiLanguageConfigDo> {
    boolean create(MultiLanguageConfigDoRO ro);

    boolean delete(Long id);

    boolean update(MultiLanguageConfigDoRO ro);

    MultiLanguageConfigDoVO getById(Long id);

    List<MultiLanguageConfigDoVO> findList(MultiLanguageConfigDoQO qo);


    JSONObject getLangNameByClassifyId(MultiLanguageConfigDoQO qo);

    MultiLanguageConfigDoVO findOne(MultiLanguageConfigDoQO qo);

    Map<String,MultiLanguageConfigDoVO> getLangNameMap(MultiLanguageConfigDoQO qo);
}
