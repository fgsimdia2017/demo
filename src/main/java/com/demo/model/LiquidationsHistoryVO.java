package com.demo.model;


import com.demo.utils.BigDecimalUtil;
import lombok.Builder;

import java.math.BigDecimal;

/**
 * @Author huangfeng
 * @Date 2023/12/22 10:44
 * @description
 * @Version 1.0
 */
@Builder
public class LiquidationsHistoryVO {

    private String exchangeName;

    private String allVol;


    private String buyVolUsd;


    private String sellVolUsd;


    private String buyPercent;


    private String sellPercent;


    private String buyTurnoverNumberPercent;


    private String sellTurnoverNumberPercent;

    private String period;

    public LiquidationsHistoryVO() {

    }

    public LiquidationsHistoryVO(String exchangeName, String allVol, String buyVolUsd, String sellVolUsd, String buyPercent, String sellPercent, String buyTurnoverNumberPercent, String sellTurnoverNumberPercent, String period) {
        this.exchangeName = exchangeName;
        this.allVol = allVol;
        this.buyVolUsd = buyVolUsd;
        this.sellVolUsd = sellVolUsd;
        this.buyPercent = buyPercent;
        this.sellPercent = sellPercent;
        this.buyTurnoverNumberPercent = buyTurnoverNumberPercent;
        this.sellTurnoverNumberPercent = sellTurnoverNumberPercent;
        this.period = period;
    }

   /* public static LiquidationsHistoryVO buildDefaultData(String period) {
        return LiquidationsHistoryVO.builder()
                .allVol("22706669.86")
                .buyVolUsd("475123.96285")
                .sellVolUsd("1795545.90177")
                .buyPercent("0.209")
                .sellPercent("0.791")
                .buyTurnoverNumberPercent("0.2805")
                .sellTurnoverNumberPercent("0.7195")
                .period(period)
                .build();
    }*/

    public static LiquidationsHistoryVO buildVo(LiquidationsHistoryRO ro,String period) {
        BigDecimal allVol = BigDecimalUtil.bigDecimal2Add(ro.getBuyVolUsd(), ro.getSellVolUsd());
        return LiquidationsHistoryVO.builder()
                .allVol(allVol.toPlainString())
                .buyVolUsd(BigDecimalUtil.bigDecimal2String(ro.getBuyVolUsd()))
                .sellVolUsd(BigDecimalUtil.bigDecimal2String(ro.getSellVolUsd()))
                .buyPercent(BigDecimalUtil.divide(ro.getBuyVolUsd(),allVol))
                .sellPercent(BigDecimalUtil.divide(ro.getSellVolUsd(),allVol))
                .buyTurnoverNumberPercent(BigDecimalUtil.divide(ro.getBuyTurnoverNumber(),ro.getTurnoverNumber()))
                .sellTurnoverNumberPercent(BigDecimalUtil.divide(ro.getSellTurnoverNumber(),ro.getTurnoverNumber()))
                .period(period)
                .build();
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getAllVol() {
        return allVol;
    }

    public void setAllVol(String allVol) {
        this.allVol = allVol;
    }

    public String getBuyVolUsd() {
        return buyVolUsd;
    }

    public void setBuyVolUsd(String buyVolUsd) {
        this.buyVolUsd = buyVolUsd;
    }

    public String getSellVolUsd() {
        return sellVolUsd;
    }

    public void setSellVolUsd(String sellVolUsd) {
        this.sellVolUsd = sellVolUsd;
    }

    public String getBuyPercent() {
        return buyPercent;
    }

    public void setBuyPercent(String buyPercent) {
        this.buyPercent = buyPercent;
    }

    public String getSellPercent() {
        return sellPercent;
    }

    public void setSellPercent(String sellPercent) {
        this.sellPercent = sellPercent;
    }

    public String getBuyTurnoverNumberPercent() {
        return buyTurnoverNumberPercent;
    }

    public void setBuyTurnoverNumberPercent(String buyTurnoverNumberPercent) {
        this.buyTurnoverNumberPercent = buyTurnoverNumberPercent;
    }

    public String getSellTurnoverNumberPercent() {
        return sellTurnoverNumberPercent;
    }

    public void setSellTurnoverNumberPercent(String sellTurnoverNumberPercent) {
        this.sellTurnoverNumberPercent = sellTurnoverNumberPercent;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
