package com.medicalSaleManagementSystem.core.model.entity;

import java.util.Date;

public class InstockApplyRecord {
    private Integer instockApplyId;

    private String instockApplyNumber;

    private Integer instockDtlId;

    private Date applyTime;

    private String userNumber;

    private String instockApplyCategory;

    private String instockApplyRemark;

    public Integer getInstockApplyId() {
        return instockApplyId;
    }

    public void setInstockApplyId(Integer instockApplyId) {
        this.instockApplyId = instockApplyId;
    }

    public String getInstockApplyNumber() {
        return instockApplyNumber;
    }

    public void setInstockApplyNumber(String instockApplyNumber) {
        this.instockApplyNumber = instockApplyNumber == null ? null : instockApplyNumber.trim();
    }

    public Integer getInstockDtlId() {
        return instockDtlId;
    }

    public void setInstockDtlId(Integer instockDtlId) {
        this.instockDtlId = instockDtlId;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public String getInstockApplyCategory() {
        return instockApplyCategory;
    }

    public void setInstockApplyCategory(String instockApplyCategory) {
        this.instockApplyCategory = instockApplyCategory == null ? null : instockApplyCategory.trim();
    }

    public String getInstockApplyRemark() {
        return instockApplyRemark;
    }

    public void setInstockApplyRemark(String instockApplyRemark) {
        this.instockApplyRemark = instockApplyRemark == null ? null : instockApplyRemark.trim();
    }
}