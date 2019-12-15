package com.medicalSaleManagementSystem.core.model.DTO;

import java.util.Date;

public class PurchaseDtlStatusDTO {
    private Integer purDtlStatusId;

    private String purDtlStatusName;

    private Integer purDtlStatusAmount;

    private String purDtlOrderid;

    private Date purDtlStatusDate;

    private Double purDtlStatusSubtotal;

    private Integer whseId;

    private String purDtlStatusRemark;

    private Double purDtlStatusPrice;

    public Integer getPurDtlStatusId() {
        return purDtlStatusId;
    }

    public void setPurDtlStatusId(Integer purDtlStatusId) {
        this.purDtlStatusId = purDtlStatusId;
    }

    public String getPurDtlStatusName() {
        return purDtlStatusName;
    }

    public void setPurDtlStatusName(String purDtlStatusName) {
        this.purDtlStatusName = purDtlStatusName == null ? null : purDtlStatusName.trim();
    }

    public Integer getPurDtlStatusAmount() {
        return purDtlStatusAmount;
    }

    public void setPurDtlStatusAmount(Integer purDtlStatusAmount) {
        this.purDtlStatusAmount = purDtlStatusAmount;
    }

    public String getPurDtlOrderid() {
        return purDtlOrderid;
    }

    public void setPurDtlOrderid(String purDtlOrderid) {
        this.purDtlOrderid = purDtlOrderid == null ? null : purDtlOrderid.trim();
    }

    public Date getPurDtlStatusDate() {
        return purDtlStatusDate;
    }

    public void setPurDtlStatusDate(Date purDtlStatusDate) {
        this.purDtlStatusDate = purDtlStatusDate;
    }

    public Double getPurDtlStatusSubtotal() {
        return purDtlStatusSubtotal;
    }

    public void setPurDtlStatusSubtotal(Double purDtlStatusSubtotal) {
        this.purDtlStatusSubtotal = purDtlStatusSubtotal;
    }

    public Integer getWhseId() {
        return whseId;
    }

    public void setWhseId(Integer whseId) {
        this.whseId = whseId;
    }

    public String getPurDtlStatusRemark() {
        return purDtlStatusRemark;
    }

    public void setPurDtlStatusRemark(String purDtlStatusRemark) {
        this.purDtlStatusRemark = purDtlStatusRemark == null ? null : purDtlStatusRemark.trim();
    }

    public Double getPurDtlStatusPrice() {
        return purDtlStatusPrice;
    }

    public void setPurDtlStatusPrice(Double purDtlStatusPrice) {
        this.purDtlStatusPrice = purDtlStatusPrice;
    }
}