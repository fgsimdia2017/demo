package com.demo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.model.ChartConfigDo;
import com.demo.model.ChartConfigDoQO;
import com.demo.model.ChartConfigDoRO;
import com.demo.model.ChartConfigDoVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hf
 * @since 2024-01-03
 */
public interface ChartConfigService extends IService<ChartConfigDo> {
    boolean create(ChartConfigDoRO ro);

    boolean delete(Long id);

    boolean update(ChartConfigDoRO ro);

    ChartConfigDo getById(Long id);

    List<ChartConfigDo> findList(ChartConfigDoQO qo);

    ChartConfigDoVO findByName(ChartConfigDoQO qo);

    List<ChartConfigDoVO> topBanners(ChartConfigDoQO qo);
}
