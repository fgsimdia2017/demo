package com.demo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.List;
/**
* <p>
* QO
* </p>
*
* @author hf
* @since 2023-12-12
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class MultiLanguageConfigDoQO implements Serializable{


    private List<Long> idList;

    private Long id;


    private Integer classifyId;


    private String nameKey;


    private List<String> nameKeyList;

    private Integer langType;


    private String data;


    private String otherData;


    private Long createTime;


    private Long updateTime;

}