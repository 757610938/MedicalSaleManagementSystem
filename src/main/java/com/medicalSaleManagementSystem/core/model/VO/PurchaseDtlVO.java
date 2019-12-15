package com.medicalSaleManagementSystem.core.model.VO;

public class PurchaseDtlVO {
    private Integer purDtlId;

    private String purDtlOrderId;

    private String purOrderId;

    private Integer medicineId;

    private String medicineName;

    private Integer purDtlAmount;

    private Double purDtlPrice;

    private String purDtlStatus;

    private String purDtlRemark;

    public Integer getPurDtlId() {
        return purDtlId;
    }

    public void setPurDtlId(Integer purDtlId) {
        this.purDtlId = purDtlId;
    }

    public String getPurDtlOrderId() {
        return purDtlOrderId;
    }

    public void setPurDtlOrderId(String purDtlOrderId) {
        this.purDtlOrderId = purDtlOrderId == null ? null : purDtlOrderId.trim();
    }

    public String getPurOrderId() {
        return purOrderId;
    }

    public void setPurOrderId(String purOrderId) {
        this.purOrderId = purOrderId == null ? null : purOrderId.trim();
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

    public Integer getPurDtlAmount() {
        return purDtlAmount;
    }

    public void setPurDtlAmount(Integer purDtlAmount) {
        this.purDtlAmount = purDtlAmount;
    }

    public Double getPurDtlPrice() {
        return purDtlPrice;
    }

    public void setPurDtlPrice(Double purDtlPrice) {
        this.purDtlPrice = purDtlPrice;
    }

    public String getPurDtlStatus() {
        return purDtlStatus;
    }

    public void setPurDtlStatus(String purDtlStatus) {
        this.purDtlStatus = purDtlStatus == null ? null : purDtlStatus.trim();
    }

    public String getPurDtlRemark() {
        return purDtlRemark;
    }

    public void setPurDtlRemark(String purDtlRemark) {
        this.purDtlRemark = purDtlRemark == null ? null : purDtlRemark.trim();
    }

    @Override
    public String toString() {
        return "PurchaseDtlVO{" +
                "purDtlId=" + purDtlId +
                ", purDtlOrderId='" + purDtlOrderId + '\'' +
                ", purOrderId='" + purOrderId + '\'' +
                ", medicineId=" + medicineId +
                ", medicineName='" + medicineName + '\'' +
                ", purDtlAmount=" + purDtlAmount +
                ", purDtlPrice=" + purDtlPrice +
                ", purDtlStatus='" + purDtlStatus + '\'' +
                ", purDtlRemark='" + purDtlRemark + '\'' +
                '}';
    }
}