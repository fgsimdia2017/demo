package com.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.InnerField;
import org.springframework.data.elasticsearch.annotations.MultiField;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author huangfeng
 * @Date 2023/12/29 10:11
 * @description
 * @Version 1.0
 */

@Getter
@Setter
@Accessors(chain = true)
@Document(indexName = "content_information_index")
public class EsMultiLanguageConfigDo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键,自增
     */
    @Id
    @Field(type = FieldType.Long)
    private Long id;

    /**
     * 1:多指标大分类 2:多指标中指标列表类 3:宏观指标名称类
     */

    @Field(type = FieldType.Integer)
    private Integer classifyId;

    /**
     * 关联其它表中的索引字段或者主键
     */

    @Field(type = FieldType.Keyword,analyzer ="ik_max_word")
    private String nameKey;

    /**
     * 1:英文,2中文,3繁体
     */

    @Field(type = FieldType.Integer)
    private Integer langType;

    /**
     * 对应的语言内容:标题
     */

    @Field(type = FieldType.Keyword,analyzer ="ik_max_word")
    private String data;

    /**
     * 冗余字段,方便拓展
     */

    @MultiField(mainField = @Field(type = FieldType.Text), otherFields = {@InnerField(suffix = "search", type = FieldType.Text, analyzer = "ik_max_word")})
    private String otherData;

    /**
     * 数组 ["ahr999","fgi"]
     */
    @Field(type = FieldType.Keyword,analyzer ="ik_max_word")
    private String chartKey;

    /**
     * 数组 ["ahr999","贪婪恐惧指数"]
     */
    @Field(type = FieldType.Keyword,analyzer ="ik_max_word")
    private String chartValue;

    @Field(type = FieldType.Long)
    private Long createTime;


    @Field(type = FieldType.Long)
    private Long updateTime;

    public static List<MultiLanguageConfigDoVO> build(List<EsMultiLanguageConfigDo> list){
        List<MultiLanguageConfigDoVO> resultList = new ArrayList<>(list.size());
        for (EsMultiLanguageConfigDo item:list) {
            resultList.add(build(item));
        }
        return resultList;
    }

    public static MultiLanguageConfigDoVO build(EsMultiLanguageConfigDo configDo){
        MultiLanguageConfigDoVO esMultiLanguageConfigVo = new MultiLanguageConfigDoVO();
        esMultiLanguageConfigVo.setId(configDo.getId());
        esMultiLanguageConfigVo.setClassifyId(configDo.getClassifyId());
        esMultiLanguageConfigVo.setNameKey(configDo.getNameKey());
        esMultiLanguageConfigVo.setLangType(configDo.getLangType());
        esMultiLanguageConfigVo.setData(configDo.getData());
        esMultiLanguageConfigVo.setOtherData(configDo.getOtherData());
        esMultiLanguageConfigVo.setChartKey(configDo.getChartKey());
        esMultiLanguageConfigVo.setChartValue(configDo.getChartValue());
        esMultiLanguageConfigVo.setCreateTime(configDo.getCreateTime());
        esMultiLanguageConfigVo.setUpdateTime(configDo.getUpdateTime());
        return esMultiLanguageConfigVo;
    }
}
