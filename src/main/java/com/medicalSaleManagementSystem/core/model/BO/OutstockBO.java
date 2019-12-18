package com.medicalSaleManagementSystem.core.model.BO;

import java.util.Date;
import java.util.List;

public class OutstockBO {

    private List<OutstockDtlBO> outstockDtlList;

    private Integer outstockId;

    private String outstockNumber;

    private String outstockCategory;

    private Date outstockTime;

    private String userNumber;

    private String outstockRemark;

    private Integer outstockDtlId;

    @Override
    public String toString() {
        return "OutstockBO{" +
                "outstockDtlList=" + outstockDtlList +
                ", outstockId=" + outstockId +
                ", outstockNumber='" + outstockNumber + '\'' +
                ", outstockCategory='" + outstockCategory + '\'' +
                ", outstockTime=" + outstockTime +
                ", userNumber='" + userNumber + '\'' +
                ", outstockRemark='" + outstockRemark + '\'' +
                ", outstockDtlId=" + outstockDtlId +
                '}';
    }

    public List<OutstockDtlBO> getOutstockDtlList() {
        return outstockDtlList;
    }

    public void setOutstockDtlList(List<OutstockDtlBO> outstockDtlList) {
        this.outstockDtlList = outstockDtlList;
    }

    public Integer getOutstockId() {
        return outstockId;
    }

    public void setOutstockId(Integer outstockId) {
        this.outstockId = outstockId;
    }

    public String getOutstockNumber() {
        return outstockNumber;
    }

    public void setOutstockNumber(String outstockNumber) {
        this.outstockNumber = outstockNumber== null ? null : outstockNumber.trim();;
    }

    public String getOutstockCategory() {
        return outstockCategory;
    }

    public void setOutstockCategory(String outstockCategory) {
        this.outstockCategory = outstockCategory== null ? null : outstockCategory.trim();;
    }

    public Date getOutstockTime() {
        return outstockTime;
    }

    public void setOutstockTime(Date outstockTime) {
        this.outstockTime = outstockTime;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber== null ? null : userNumber.trim();;
    }

    public String getOutstockRemark() {
        return outstockRemark;
    }

    public void setOutstockRemark(String outstockRemark) {
        this.outstockRemark = outstockRemark== null ? null : outstockRemark.trim();;
    }

    public Integer getOutstockDtlId() {
        return outstockDtlId;
    }

    public void setOutstockDtlId(Integer outstockDtlId) {
        this.outstockDtlId = outstockDtlId;
    }
}
