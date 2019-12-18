package com.medicalSaleManagementSystem.core.model.BO;

public class SaleDtlBO {
    private Integer saleDtlId;

    private String saleDtlOrderId;

    private String saleOrderId;

    private Integer medicineId;

    private String medicineName;

    private Double saleDtlPrice;

    private Integer saleDtlTotalAmount;

    private String saleDtlStatus;

    private String saleDtlRemark;

    public Integer getSaleDtlId() {
        return saleDtlId;
    }

    public void setSaleDtlId(Integer saleDtlId) {
        this.saleDtlId = saleDtlId;
    }

    public String getSaleDtlOrderId() {
        return saleDtlOrderId;
    }

    public void setSaleDtlOrderId(String saleDtlOrderId) {
        this.saleDtlOrderId = saleDtlOrderId == null ? null : saleDtlOrderId.trim();
    }

    public String getSaleOrderId() {
        return saleOrderId;
    }

    public void setSaleOrderId(String saleOrderId) {
        this.saleOrderId = saleOrderId == null ? null : saleOrderId.trim();
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName == null ? null : medicineName.trim();
    }

    public Double getSaleDtlPrice() {
        return saleDtlPrice;
    }

    public void setSaleDtlPrice(Double saleDtlPrice) {
        this.saleDtlPrice = saleDtlPrice;
    }

    public Integer getSaleDtlTotalAmount() {
        return saleDtlTotalAmount;
    }

    public void setSaleDtlTotalAmount(Integer saleDtlTotalAmount) {
        this.saleDtlTotalAmount = saleDtlTotalAmount;
    }

    public String getSaleDtlStatus() {
        return saleDtlStatus;
    }

    public void setSaleDtlStatus(String saleDtlStatus) {
        this.saleDtlStatus = saleDtlStatus == null ? null : saleDtlStatus.trim();
    }

    public String getSaleDtlRemark() {
        return saleDtlRemark;
    }

    public void setSaleDtlRemark(String saleDtlRemark) {
        this.saleDtlRemark = saleDtlRemark == null ? null : saleDtlRemark.trim();
    }
}