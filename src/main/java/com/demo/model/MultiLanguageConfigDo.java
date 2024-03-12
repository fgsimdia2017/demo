package com.demo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author hf
 * @since 2023-12-12
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("s_multi_language_config")
public class MultiLanguageConfigDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键,自增
     */

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 1:多指标大分类 2:多指标中指标列表类 3:宏观指标名称类
     */

    @TableField("classify_id")
    private Integer classifyId;

    /**
     * 关联其它表中的索引字段或者主键
     */

    @TableField("name_key")
    private String nameKey;

    /**
     * 1:英文,2中文,3繁体
     */

    @TableField("lang_type")
    private Integer langType;

    /**
     * 对应的语言内容:使用json字段,方便拓展
     */

    @TableField("data")
    private String data;

    /**
     * 冗余字段,方便拓展
     */

    @TableField("other_data")
    private String otherData;

    /**
     * 数组 ["ahr999","fgi"]
     */
    @TableField("chart_key")
    private String chartKey;

    /**
     * 数组 ["ahr999","贪婪恐惧指数"]
     */
    @TableField("chart_value")
    private String chartValue;

    @TableField("create_time")
    private Long createTime;

    @TableField("update_time")
    private Long updateTime;

    /**
     * 创建时间
     */

    /**
     * 更新时间
     */

    public static List<MultiLanguageConfigDoVO> build(List<MultiLanguageConfigDo> list){
        List<MultiLanguageConfigDoVO> resultList = new ArrayList<>(list.size());
        for (MultiLanguageConfigDo item:list) {
            resultList.add(build(item));
        }
        return resultList;
    }

    public static MultiLanguageConfigDoVO build(MultiLanguageConfigDo configDo){
        MultiLanguageConfigDoVO vo = new MultiLanguageConfigDoVO();
        vo.setId(configDo.getId());
        vo.setClassifyId(configDo.getClassifyId());
        vo.setNameKey(configDo.getNameKey());
        vo.setLangType(configDo.getLangType());
        vo.setData(configDo.getData());
        vo.setOtherData(configDo.getOtherData());
        vo.setChartKey(configDo.getChartKey());
        vo.setChartValue(configDo.getChartValue());
        vo.setCreateTime(configDo.getCreateTime());
        vo.setUpdateTime(configDo.getUpdateTime());
        return vo;
    }

}
