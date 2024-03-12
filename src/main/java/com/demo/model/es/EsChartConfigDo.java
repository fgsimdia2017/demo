package com.demo.model.es;

import com.demo.model.ChartConfigDo;
import com.demo.model.MultiLanguageConfigDoVO;
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
@Document(indexName = "chart_config_index")
public class EsChartConfigDo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键,自增
     */
    @Id
    @Field(type = FieldType.Long)
    private Long id;

    /**
     * 内部使用的key,用于给前端统一接口,后端根据语言类型搜索不同结构
     */

    @Field(type = FieldType.Keyword)
    private String innerKey;

    /**
     * "1:英文,2:中文:3:繁体"
     */

    @Field(type = FieldType.Integer)
    private Integer langType;

    /**
     * 标题
     */

    @Field(type = FieldType.Text,analyzer ="ik_max_word")
    private String title;

    /**
     * "标签,数组类型,如[\"btc\",\"eth\"]"
     */

    @Field(type = FieldType.Text,analyzer ="ik_max_word")
    private String tag;

    /**
     * 介绍
     */

    @MultiField(mainField = @Field(type = FieldType.Text), otherFields = {@InnerField(suffix = "search", type = FieldType.Text, analyzer = "ik_max_word")})
    private String meaning;

    /**
     * 图表key,数组:如:["ahr999","fgi"]
     */
    @Field(type = FieldType.Text,analyzer ="ik_max_word")
    private String charKey;

    /**
     * 图表value,数组如:["ahr999","贪婪恐惧指数"]
     */
    @Field(type = FieldType.Text,analyzer ="ik_max_word")
    private String charValue;

    /**
     * 关联的指标数据表的id,格式如: :[1,2,3]
     */
    @Field(type = FieldType.Keyword)
    private String indicatorIds;

    /**
     * 图表类型:默认为1:可以修改,0全动态图,不能修改
     */
    @Field(type = FieldType.Integer)
    private Integer chartType;

    /**
     * 是否关联banner,1:关联,0未关联
     */
    @Field(type = FieldType.Integer)
    private Integer linkBanner;

    /**
     *用于标记该图表支持哪些图表切换,如:["1h","1d"],表示图表1d的数据能取到1d或者1y
     */
    @Field(type = FieldType.Keyword)
    private String chartPeriods;

    /**
     * 前端如何展示:1
     */
    @Field(type = FieldType.Keyword)
    private String viewType;

    /**
     * 用于标记该图表支持哪些图表切换,如:["BTC","ETH"] 或["1h","1d"]
     */
    @Field(type = FieldType.Keyword)
    private String switchCharts;

    /**
     * 简介
     */
    @Field(type = FieldType.Keyword)
    private String intro;

    /**
     * 关联的图表数据各种key,存储json格式数据
     */
    @Field(type = FieldType.Keyword)
    private String data;

    /**
     * 保留字段
     */
    @Field(type = FieldType.Keyword)
    private String dataFormula;

    /**
     * 默认为1:为0是搜索不到
     */
    @Field(type = FieldType.Integer)
    private Integer isUseSearch;

    /**
     *创建时间
     */
    @Field(type = FieldType.Long)
    private Long createTime;

    /**
     * 更新时间
     */
    @Field(type = FieldType.Long)
    private Long updateTime;


    public static List<EsChartConfigDo> build(List<ChartConfigDo> list){
        List<EsChartConfigDo> resultList = new ArrayList<>(list.size());
        for (ChartConfigDo item:list) {
            resultList.add(build(item));
        }
        return resultList;
    }

    private static EsChartConfigDo build(ChartConfigDo item){
        EsChartConfigDo esChartConfigDo = new EsChartConfigDo();
        esChartConfigDo.setId(item.getId());
        esChartConfigDo.setInnerKey(item.getInnerKey());
        esChartConfigDo.setLangType(item.getLangType());
        esChartConfigDo.setTitle(item.getTitle());
        esChartConfigDo.setTag(item.getTag());
        esChartConfigDo.setMeaning(item.getMeaning());
        esChartConfigDo.setCharKey(item.getCharKey());
        esChartConfigDo.setCharValue(item.getCharValue());
        esChartConfigDo.setIndicatorIds(item.getIndicatorIds());
        esChartConfigDo.setSwitchCharts(item.getSwitchCharts());
        esChartConfigDo.setChartType(item.getChartType());
        esChartConfigDo.setLinkBanner(item.getLinkBanner());
        esChartConfigDo.setChartPeriods(item.getChartPeriods());
        esChartConfigDo.setViewType(item.getViewType());
        esChartConfigDo.setIntro(item.getIntro());
        esChartConfigDo.setData(item.getData());
        esChartConfigDo.setDataFormula(item.getDataFormula());
        esChartConfigDo.setIsUseSearch(item.getIsUseSearch());
        esChartConfigDo.setCreateTime(item.getCreateTime());
        esChartConfigDo.setUpdateTime(item.getUpdateTime());
        return esChartConfigDo;
    }


}
