package com.medicalSaleManagementSystem.core.bean.entity;

import java.util.Date;

public class SupplierSettleRecord {
    private Integer supplierSettleId;

    private Integer purId;

    private Integer supplierId;

    private Date supplierSettleDate;

    private Double supplierSettleMoney;

    private String supplierSettleRemark;

    public Integer getSupplierSettleId() {
        return supplierSettleId;
    }

    public void setSupplierSettleId(Integer supplierSettleId) {
        this.supplierSettleId = supplierSettleId;
    }

    public Integer getPurId() {
        return purId;
    }

    public void setPurId(Integer purId) {
        this.purId = purId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Date getSupplierSettleDate() {
        return supplierSettleDate;
    }

    public void setSupplierSettleDate(Date supplierSettleDate) {
        this.supplierSettleDate = supplierSettleDate;
    }

    public Double getSupplierSettleMoney() {
        return supplierSettleMoney;
    }

    public void setSupplierSettleMoney(Double supplierSettleMoney) {
        this.supplierSettleMoney = supplierSettleMoney;
    }

    public String getSupplierSettleRemark() {
        return supplierSettleRemark;
    }

    public void setSupplierSettleRemark(String supplierSettleRemark) {
        this.supplierSettleRemark = supplierSettleRemark == null ? null : supplierSettleRemark.trim();
    }
}