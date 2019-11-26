package com.medicalSaleManagementSystem.core.bean.entity;

public class Sale {
    private Integer saleId;

    private String saleOrderid;

    private Integer custId;

    private Integer empId;

    private Double saleTotalMoney;

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public String getSaleOrderid() {
        return saleOrderid;
    }

    public void setSaleOrderid(String saleOrderid) {
        this.saleOrderid = saleOrderid == null ? null : saleOrderid.trim();
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Double getSaleTotalMoney() {
        return saleTotalMoney;
    }

    public void setSaleTotalMoney(Double saleTotalMoney) {
        this.saleTotalMoney = saleTotalMoney;
    }
}