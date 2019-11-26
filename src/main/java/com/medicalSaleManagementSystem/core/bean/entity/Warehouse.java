package com.medicalSaleManagementSystem.core.bean.entity;

public class Warehouse {
    private Integer whseId;

    private Integer medicineId;

    private Integer whseAmount;

    public Integer getWhseId() {
        return whseId;
    }

    public void setWhseId(Integer whseId) {
        this.whseId = whseId;
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public Integer getWhseAmount() {
        return whseAmount;
    }

    public void setWhseAmount(Integer whseAmount) {
        this.whseAmount = whseAmount;
    }
}