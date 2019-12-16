package com.medicalSaleManagementSystem.core.model.entity;

public class Stock {
    private Integer stockId;

    private Integer medicineId;

    private Integer whseId;

    private Integer stockAmount;

    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", medicineId=" + medicineId +
                ", whseId=" + whseId +
                ", stockAmount=" + stockAmount +
                '}';
    }

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
}