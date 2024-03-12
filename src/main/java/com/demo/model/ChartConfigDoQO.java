package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
/**
* <p>
* QO
* </p>
*
* @author hf
* @since 2024-01-03
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ChartConfigDoQO implements Serializable{


    private Long id;

    private String innerKey;

    private Integer langType;

    private String title;


    private String tag;

    private String meaning;


    private String charKey;


    private String charValue;


    private String indicatorIds;


    private Integer chartType;


    private Integer linkBanner;


    private String viewType;


    private String switchCharts;


    private String chartPeriods;


    private String intro;


    private String data;


    private String dataFormula;


    private Integer isUseSearch;


    private Long createTime;

    private Long updateTime;

}