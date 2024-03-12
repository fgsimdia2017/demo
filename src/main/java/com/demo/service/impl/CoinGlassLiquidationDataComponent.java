package com.demo.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import com.demo.model.KlinePeriodEnum;
import com.demo.model.LiquidationsHistoryRO;
import com.demo.model.LiquidationsHistoryVO;
import com.demo.utils.BigDecimalUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Author huangfeng
 * @Date 2023/12/22 11:23
 * @description
 * @Version 1.0
 */
@Slf4j
@Component
public class CoinGlassLiquidationDataComponent {

    public static LiquidationsHistoryVO convertData(String body, String period){
        if (StrUtil.isEmpty(period)) {
            return null;
        }
        LiquidationsHistoryRO ro = parse2LiquidationsHistoryRO(body, period);
        if (null == ro) {
            return null;
        }
        return LiquidationsHistoryVO.buildVo(ro,period);
    }

    private static LiquidationsHistoryRO parse2LiquidationsHistoryRO(String body,String period) {
        if (StrUtil.isBlank(body)) {
            return null;
        }
        if (KlinePeriodEnum.PERIOD_1DAY.getType().equals(period)) {
            return parseOtherPeriod2RO(body, period);
        }
        return parseDay2RO(body);
    }

    private static LiquidationsHistoryRO parseOtherPeriod2RO(String body,String period) {
        if (StrUtil.isBlank(body)) {
            return null;
        }
        try {
            JSONObject jsonObject = JSONUtil.parseObj(body);
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            if (JSONUtil.isNull(jsonArray)) {
                return null;
            }
            JSONObject listJson = (JSONObject) jsonArray.get(0);
            JSONArray list = listJson.getJSONArray("list");
            if (JSONUtil.isNull(list)) {
                return null;
            }
            return JSONUtil.toBean(list.get(0).toString(), LiquidationsHistoryRO.class);
        } catch (Exception e) {
            log.error("解析粒度:{}爆仓信息异常:",period,e);
            return null;
        }
    }

    private static LiquidationsHistoryRO parseDay2RO(String body) {
        if (StrUtil.isBlank(body)) {
            return null;
        }
        try {
            JSONObject jsonObject = JSONUtil.parseObj(body);
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            if (JSONUtil.isNull(jsonArray)) {
                return null;
            }
            JSONObject listJson = (JSONObject) jsonArray.get(0);
            JSONArray list = listJson.getJSONArray("list");
            if (JSONUtil.isNull(list)) {
                return null;
            }
            int size= Math.min(list.size(), 2);
            LiquidationsHistoryRO freshDataRO = JSONUtil.toBean(list.get(0).toString(), LiquidationsHistoryRO.class);
            if (size == 1) {
                return freshDataRO;
            }
            LiquidationsHistoryRO secondDataRO = JSONUtil.toBean(list.get(1).toString(), LiquidationsHistoryRO.class);
            return mergeData(freshDataRO,secondDataRO);
        } catch (Exception e) {
            log.error("解析12h爆仓信息异常:",e);
            return null;
        }
    }

    /**
     * 将两条数据合并成一条(如12h的两条爆仓信息合并为1条一天的爆仓数据)
     * @param freshDataRO
     * @param secondDataRO
     * @return
     */
    private static LiquidationsHistoryRO mergeData(LiquidationsHistoryRO freshDataRO, LiquidationsHistoryRO secondDataRO){
        if (null == freshDataRO && null == secondDataRO) {
            return null;
        }
        if (null == freshDataRO) {
            return secondDataRO;
        }
        if (null == secondDataRO) {
            return freshDataRO;
        }
        String exchangeName = freshDataRO.getExchangeName();
        BigDecimal buyVolUsd = freshDataRO.getBuyVolUsd();
        BigDecimal sellVolUsd = freshDataRO.getSellVolUsd();
        BigDecimal turnoverNumber = freshDataRO.getTurnoverNumber();
        BigDecimal buyTurnoverNumber = freshDataRO.getBuyTurnoverNumber();
        BigDecimal sellTurnoverNumber = freshDataRO.getSellTurnoverNumber();


        BigDecimal buyVolUsdSec = secondDataRO.getBuyVolUsd();
        BigDecimal sellVolUsdSec = secondDataRO.getSellVolUsd();
        BigDecimal turnoverNumberSec = secondDataRO.getTurnoverNumber();
        BigDecimal buyTurnoverNumberSec = secondDataRO.getBuyTurnoverNumber();
        BigDecimal sellTurnoverNumberSec = secondDataRO.getSellTurnoverNumber();

        return LiquidationsHistoryRO
                .builder()
                .exchangeName(exchangeName)
                .buyVolUsd(BigDecimalUtil.bigDecimal2Add(buyVolUsd,buyVolUsdSec))
                .sellVolUsd(BigDecimalUtil.bigDecimal2Add(sellVolUsd,sellVolUsdSec))
                .turnoverNumber(BigDecimalUtil.bigDecimal2Add(turnoverNumber,turnoverNumberSec))
                .buyTurnoverNumber(BigDecimalUtil.bigDecimal2Add(buyTurnoverNumber,buyTurnoverNumberSec))
                .sellTurnoverNumber(BigDecimalUtil.bigDecimal2Add(sellTurnoverNumber,sellTurnoverNumberSec))
                .build();
    }
}
