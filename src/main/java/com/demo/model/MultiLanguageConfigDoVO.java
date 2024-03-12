package com.demo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
* <p>
* VO
* </p>
*
* @author hf
* @since 2023-12-12
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class MultiLanguageConfigDoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    private Long id;


    private Integer classifyId;


    private String nameKey;


    private Integer langType;


    private String data;


    private String otherData;

    /**
     * 数组 ["ahr999","fgi"]
     */

    private String chartKey;

    /**
     * 数组 ["ahr999","贪婪恐惧指数"]
     */

    private String chartValue;

    private Long createTime;


    private Long updateTime;

    public static List<EsMultiLanguageConfigDo> build(List<MultiLanguageConfigDoVO> list){
        List<EsMultiLanguageConfigDo> resultList = new ArrayList<>(list.size());
        for (MultiLanguageConfigDoVO item:list) {
            resultList.add(build(item));
        }
        return resultList;
    }

    public static EsMultiLanguageConfigDo build(MultiLanguageConfigDoVO vo){
        EsMultiLanguageConfigDo esMultiLanguageConfigDo = new EsMultiLanguageConfigDo();
        esMultiLanguageConfigDo.setId(vo.getId());
        esMultiLanguageConfigDo.setClassifyId(vo.getClassifyId());
        esMultiLanguageConfigDo.setNameKey(vo.getNameKey());
        esMultiLanguageConfigDo.setLangType(vo.getLangType());
        esMultiLanguageConfigDo.setData(vo.getData());
        esMultiLanguageConfigDo.setOtherData(vo.getOtherData());
        esMultiLanguageConfigDo.setChartKey(vo.getChartKey());
        esMultiLanguageConfigDo.setChartValue(vo.getChartValue());
        esMultiLanguageConfigDo.setCreateTime(vo.getCreateTime());
        esMultiLanguageConfigDo.setUpdateTime(vo.getUpdateTime());
        return esMultiLanguageConfigDo;
    }

}