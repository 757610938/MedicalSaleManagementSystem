package com.medicalSaleManagementSystem.core.model.entity;

import java.util.Date;

public class OutstockApplyRecord {
    private Integer outstockApplyId;

    private String outstockDtlNumber;

    private Date outstockTime;

    private Integer userNumber;

    private String outstockApplyCategory;

    private String outstockApplyRemark;

    private Integer medicineId;

    private Integer outstockAmount;

    public Integer getOutstockApplyId() {
        return outstockApplyId;
    }

    public void setOutstockApplyId(Integer outstockApplyId) {
        this.outstockApplyId = outstockApplyId;
    }

    public String getOutstockDtlNumber() {
        return outstockDtlNumber;
    }

    public void setOutstockDtlNumber(String outstockDtlNumber) {
        this.outstockDtlNumber = outstockDtlNumber == null ? null : outstockDtlNumber.trim();
    }

    public Date getOutstockTime() {
        return outstockTime;
    }

    public void setOutstockTime(Date outstockTime) {
        this.outstockTime = outstockTime;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public String getOutstockApplyCategory() {
        return outstockApplyCategory;
    }

    public void setOutstockApplyCategory(String outstockApplyCategory) {
        this.outstockApplyCategory = outstockApplyCategory == null ? null : outstockApplyCategory.trim();
    }

    public String getOutstockApplyRemark() {
        return outstockApplyRemark;
    }

    public void setOutstockApplyRemark(String outstockApplyRemark) {
        this.outstockApplyRemark = outstockApplyRemark == null ? null : outstockApplyRemark.trim();
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public Integer getOutstockAmount() {
        return outstockAmount;
    }

    public void setOutstockAmount(Integer outstockAmount) {
        this.outstockAmount = outstockAmount;
    }
}