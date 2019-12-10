package com.medicalSaleManagementSystem.core.model.entity;

import java.util.Date;

public class ReimburseRecord {
    private Integer reimburseId;

    private String reimburseNumber;

    private Date reimburseTime;

    private String userNumber;

    private String reimburseRemark;

    private String stockTakingNumber;

    public Integer getReimburseId() {
        return reimburseId;
    }

    public void setReimburseId(Integer reimburseId) {
        this.reimburseId = reimburseId;
    }

    public String getReimburseNumber() {
        return reimburseNumber;
    }

    public void setReimburseNumber(String reimburseNumber) {
        this.reimburseNumber = reimburseNumber == null ? null : reimburseNumber.trim();
    }

    public Date getReimburseTime() {
        return reimburseTime;
    }

    public void setReimburseTime(Date reimburseTime) {
        this.reimburseTime = reimburseTime;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public String getReimburseRemark() {
        return reimburseRemark;
    }

    public void setReimburseRemark(String reimburseRemark) {
        this.reimburseRemark = reimburseRemark == null ? null : reimburseRemark.trim();
    }

    public String getStockTakingNumber() {
        return stockTakingNumber;
    }

    public void setStockTakingNumber(String stockTakingNumber) {
        this.stockTakingNumber = stockTakingNumber == null ? null : stockTakingNumber.trim();
    }
}