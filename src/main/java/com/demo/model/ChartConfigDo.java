package com.demo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author hf
 * @since 2024-01-03
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("s_chart_config")
public class ChartConfigDo implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 内部使用的key,用于给前端统一接口,后端根据语言类型搜索不同结构
     */

    @TableField("inner_key")
    private String innerKey;

    /**
     * 1:英文,2:中文:3:繁体
     */

    @TableField("lang_type")
    private Integer langType;

    /**
     * 标题
     */

    @TableField("title")
    private String title;

    /**
     * 标签,数组类型,如["btc","eth"]
     */

    @TableField("tag")
    private String tag;

    /**
     * 介绍
     */

    @TableField("meaning")
    private String meaning;

    /**
     * 图表key,数组:如:["ahr999","fgi"]
     */

    @TableField("char_key")
    private String charKey;

    /**
     * 图表value,数组如:["ahr999","贪婪恐惧指数"]
     */

    @TableField("char_value")
    private String charValue;

    /**
     * 关联的指标数据表的id,格式如: :[1,2,3]
     */

    @TableField("indicator_ids")
    private String indicatorIds;

    /**
     * 图表类型:默认为1:可以修改,0全动态图,不能修改
     */

    @TableField("chart_type")
    private Integer chartType;

    /**
     * 是否关联banner,1:关联,0未关联
     */

    @TableField("link_banner")
    private Integer linkBanner;

    /**
     * 前端如何展示:1
     */

    @TableField("view_type")
    private String viewType;


    /**
     * "用于标记该图表支持哪些图表切换,如:[\"BTC\",\"ETH\"] 或[\"1h\",\"1d\"]"
     */
    @TableField("switch_charts")
    private String switchCharts;

    /**
     * "用于标记该图表支持哪些图表切换,如:[\"1h\",\"1d\"],表示图表1d的数据能取到1d或者1y"
     */
    @TableField("chart_periods")
    private String chartPeriods;

    /**
     * 简介
     */

    @TableField("intro")
    private String intro;

    /**
     * 关联的图表数据各种key,存储json格式数据
     */

    @TableField("data")
    private String data;

    /**
     * 保留字段
     */

    @TableField("data_formula")
    private String dataFormula;

    /**
     * 默认为1:为0是搜索不到
     */

    @TableField("is_use_search")
    private Integer isUseSearch;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Long createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Long updateTime;

}
