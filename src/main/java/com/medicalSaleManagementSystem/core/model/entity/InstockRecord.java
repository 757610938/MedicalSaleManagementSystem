package com.medicalSaleManagementSystem.core.model.entity;

import java.util.Date;

public class InstockRecord {
    private Integer instockId;

    private String instockNumber;

    private String instockCategory;

    private String userNumber;

    private Date instockTime;

    private Integer instockDtlId;

    private String instockRemark;

    public Integer getInstockId() {
        return instockId;
    }

    public void setInstockId(Integer instockId) {
        this.instockId = instockId;
    }

    public String getInstockNumber() {
        return instockNumber;
    }

    public void setInstockNumber(String instockNumber) {
        this.instockNumber = instockNumber == null ? null : instockNumber.trim();
    }

    public String getInstockCategory() {
        return instockCategory;
    }

    public void setInstockCategory(String instockCategory) {
        this.instockCategory = instockCategory == null ? null : instockCategory.trim();
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public Date getInstockTime() {
        return instockTime;
    }

    public void setInstockTime(Date instockTime) {
        this.instockTime = instockTime;
    }

    public Integer getInstockDtlId() {
        return instockDtlId;
    }

    public void setInstockDtlId(Integer instockDtlId) {
        this.instockDtlId = instockDtlId;
    }

    public String getInstockRemark() {
        return instockRemark;
    }

    public void setInstockRemark(String instockRemark) {
        this.instockRemark = instockRemark == null ? null : instockRemark.trim();
    }
}