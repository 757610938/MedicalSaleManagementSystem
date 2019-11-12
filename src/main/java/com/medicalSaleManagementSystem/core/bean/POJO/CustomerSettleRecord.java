package com.medicalSaleManagementSystem.core.bean.POJO;

import java.util.Date;

public class CustomerSettleRecord {
    private Integer custSettleId;

    private Integer saleId;

    private Integer custId;

    private Date custSettleDate;

    private Double custSettleMoney;

    private String custSettleRemark;

    public Integer getCustSettleId() {
        return custSettleId;
    }

    public void setCustSettleId(Integer custSettleId) {
        this.custSettleId = custSettleId;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Date getCustSettleDate() {
        return custSettleDate;
    }

    public void setCustSettleDate(Date custSettleDate) {
        this.custSettleDate = custSettleDate;
    }

    public Double getCustSettleMoney() {
        return custSettleMoney;
    }

    public void setCustSettleMoney(Double custSettleMoney) {
        this.custSettleMoney = custSettleMoney;
    }

    public String getCustSettleRemark() {
        return custSettleRemark;
    }

    public void setCustSettleRemark(String custSettleRemark) {
        this.custSettleRemark = custSettleRemark == null ? null : custSettleRemark.trim();
    }
}