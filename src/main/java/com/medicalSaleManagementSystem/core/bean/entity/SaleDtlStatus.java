package com.medicalSaleManagementSystem.core.bean.entity;

import java.util.Date;

public class SaleDtlStatus {
    private Integer saleDtlStatusId;

    private String saleDtlStatusName;

    private String saleDtlOrderid;

    private Integer saleDtlStatusAmount;

    private Date purDtlStatusDate;

    private Double saleDtlStatusSubtotal;

    private Integer whseId;

    private String purDtlStatusRemark;

    public Integer getSaleDtlStatusId() {
        return saleDtlStatusId;
    }

    public void setSaleDtlStatusId(Integer saleDtlStatusId) {
        this.saleDtlStatusId = saleDtlStatusId;
    }

    public String getSaleDtlStatusName() {
        return saleDtlStatusName;
    }

    public void setSaleDtlStatusName(String saleDtlStatusName) {
        this.saleDtlStatusName = saleDtlStatusName == null ? null : saleDtlStatusName.trim();
    }

    public String getSaleDtlOrderid() {
        return saleDtlOrderid;
    }

    public void setSaleDtlOrderid(String saleDtlOrderid) {
        this.saleDtlOrderid = saleDtlOrderid == null ? null : saleDtlOrderid.trim();
    }

    public Integer getSaleDtlStatusAmount() {
        return saleDtlStatusAmount;
    }

    public void setSaleDtlStatusAmount(Integer saleDtlStatusAmount) {
        this.saleDtlStatusAmount = saleDtlStatusAmount;
    }

    public Date getPurDtlStatusDate() {
        return purDtlStatusDate;
    }

    public void setPurDtlStatusDate(Date purDtlStatusDate) {
        this.purDtlStatusDate = purDtlStatusDate;
    }

    public Double getSaleDtlStatusSubtotal() {
        return saleDtlStatusSubtotal;
    }

    public void setSaleDtlStatusSubtotal(Double saleDtlStatusSubtotal) {
        this.saleDtlStatusSubtotal = saleDtlStatusSubtotal;
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
}