package com.medicalSaleManagementSystem.core.model.BO;

/**
 * Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
 * FileName: Test.java
 *
 * @author 林贤钦
 * @version 1.00
 * @Date 2019/12/16
 */
public class StockBo {
    private Integer stockId;
    private Integer medicineId;
    private Integer whseId;
    private Integer stockAmount;
    private String whseName;
    private String whseAddress;
    private String userNumber;
    private String medicineName;
    private String medicineCategory;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public Integer getWhseId() {
        return whseId;
    }

    public void setWhseId(Integer whseId) {
        this.whseId = whseId;
    }

    public Integer getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(Integer stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getWhseName() {
        return whseName;
    }

    public void setWhseName(String whseName) {
        this.whseName = whseName;
    }

    public String getWhseAddress() {
        return whseAddress;
    }

    public void setWhseAddress(String whseAddress) {
        this.whseAddress = whseAddress;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineCategory() {
        return medicineCategory;
    }

    public void setMedicineCategory(String medicineCategory) {
        this.medicineCategory = medicineCategory;
    }

    @Override
    public String toString() {
        return "StockBo{" +
                "stockId=" + stockId +
                ", medicineId=" + medicineId +
                ", whseId=" + whseId +
                ", stockAmount=" + stockAmount +
                ", whseName='" + whseName + '\'' +
                ", whseAddress='" + whseAddress + '\'' +
                ", userNumber='" + userNumber + '\'' +
                ", medicineName='" + medicineName + '\'' +
                ", medicineCategory='" + medicineCategory + '\'' +
                '}';
    }
}
