package com.medicalSaleManagementSystem.core.model.BO;

import java.util.Date;
import java.util.List;

public class SaleBO {
    List<SaleDtlBO> saleDtlList;
    private Integer saleId;

    private String saleOrderId;

    private Integer custId;

    private String userNumber;

    private Double saleTotalMoney;

    private String saleStatus;

    private Date saleDate;

    private String saleRemark;

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public String getSaleOrderId() {
        return saleOrderId;
    }

    public void setSaleOrderId(String saleOrderId) {
        this.saleOrderId = saleOrderId == null ? null : saleOrderId.trim();
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public Double getSaleTotalMoney() {
        return saleTotalMoney;
    }

    public void setSaleTotalMoney(Double saleTotalMoney) {
        this.saleTotalMoney = saleTotalMoney;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus == null ? null : saleStatus.trim();
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public String getSaleRemark() {
        return saleRemark;
    }

    public void setSaleRemark(String saleRemark) {
        this.saleRemark = saleRemark == null ? null : saleRemark.trim();
    }

    public List<SaleDtlBO> getSaleDtlList() {
        return saleDtlList;
    }

    public void setSaleDtlList(List<SaleDtlBO> saleDtlList) {
        this.saleDtlList = saleDtlList;
    }

    @Override
    public String toString() {
        return "SaleBO{" +
                "saleDtlList=" + saleDtlList +
                ", saleId=" + saleId +
                ", saleOrderId='" + saleOrderId + '\'' +
                ", custId=" + custId +
                ", userNumber='" + userNumber + '\'' +
                ", saleTotalMoney=" + saleTotalMoney +
                ", saleStatus='" + saleStatus + '\'' +
                ", saleDate=" + saleDate +
                ", saleRemark='" + saleRemark + '\'' +
                '}';
    }
}