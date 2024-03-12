package com.demo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
* <p>
* RO
* </p>
*
* @author hf
* @since 2023-12-12
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class MultiLanguageConfigDoRO  implements Serializable{
    private static final long serialVersionUID = 1L;


    private Long id;


    private Integer classifyId;


    private String nameKey;


    private Integer langType;


    private String data;


    private String otherData;


    private Long createTime;


    private Long updateTime;

}