package com.medicalSaleManagementSystem.core.model.entity;

import java.util.Date;

public class StockTakingRecord {
    private Integer stockTakingId;

    private String stockTakingNumber;

    private Date takingTimer;

    private String userNumber;

    private String takingRemark;

    private Integer whseId;

    private String stockTakingDtlId;

    public Integer getStockTakingId() {
        return stockTakingId;
    }

    public void setStockTakingId(Integer stockTakingId) {
        this.stockTakingId = stockTakingId;
    }

    public String getStockTakingNumber() {
        return stockTakingNumber;
    }

    public void setStockTakingNumber(String stockTakingNumber) {
        this.stockTakingNumber = stockTakingNumber == null ? null : stockTakingNumber.trim();
    }

    public Date getTakingTimer() {
        return takingTimer;
    }

    public void setTakingTimer(Date takingTimer) {
        this.takingTimer = takingTimer;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public String getTakingRemark() {
        return takingRemark;
    }

    public void setTakingRemark(String takingRemark) {
        this.takingRemark = takingRemark == null ? null : takingRemark.trim();
    }

    public Integer getWhseId() {
        return whseId;
    }

    public void setWhseId(Integer whseId) {
        this.whseId = whseId;
    }

    public String getStockTakingDtlId() {
        return stockTakingDtlId;
    }

    public void setStockTakingDtlId(String stockTakingDtlId) {
        this.stockTakingDtlId = stockTakingDtlId == null ? null : stockTakingDtlId.trim();
    }
}