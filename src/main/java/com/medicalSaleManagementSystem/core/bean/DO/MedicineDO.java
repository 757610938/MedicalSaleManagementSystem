package com.medicalSaleManagementSystem.core.bean.DO;

import java.util.Date;

public class MedicineDO {
    private Integer medicineId;

    private String medicineApprovalNumber;

    private String medicineName;

    private String medicineEnglishName;

    private String medicineDosageformCategory;

    private String medicineManufacturer;

    private String medicineSpecification;

    private String medicineManufacturingAddress;

    private String medicineCategory;

    private Date medicineApprovaldate;

    private String medicineOriginalApprovalNumber;

    private Integer medicineSuppliersId;

    private String medicinePicture;

    private String medicineStockAmount;

    private Double medicinePurchasePrice;

    private Double medicineRetailPrice;

    private Double medicineWholesalePrice;

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineApprovalNumber() {
        return medicineApprovalNumber;
    }

    public void setMedicineApprovalNumber(String medicineApprovalNumber) {
        this.medicineApprovalNumber = medicineApprovalNumber == null ? null : medicineApprovalNumber.trim();
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName == null ? null : medicineName.trim();
    }

    public String getMedicineEnglishName() {
        return medicineEnglishName;
    }

    public void setMedicineEnglishName(String medicineEnglishName) {
        this.medicineEnglishName = medicineEnglishName == null ? null : medicineEnglishName.trim();
    }

    public String getMedicineDosageformCategory() {
        return medicineDosageformCategory;
    }

    public void setMedicineDosageformCategory(String medicineDosageformCategory) {
        this.medicineDosageformCategory = medicineDosageformCategory == null ? null : medicineDosageformCategory.trim();
    }

    public String getMedicineManufacturer() {
        return medicineManufacturer;
    }

    public void setMedicineManufacturer(String medicineManufacturer) {
        this.medicineManufacturer = medicineManufacturer == null ? null : medicineManufacturer.trim();
    }

    public String getMedicineSpecification() {
        return medicineSpecification;
    }

    public void setMedicineSpecification(String medicineSpecification) {
        this.medicineSpecification = medicineSpecification == null ? null : medicineSpecification.trim();
    }

    public String getMedicineManufacturingAddress() {
        return medicineManufacturingAddress;
    }

    public void setMedicineManufacturingAddress(String medicineManufacturingAddress) {
        this.medicineManufacturingAddress = medicineManufacturingAddress == null ? null : medicineManufacturingAddress.trim();
    }

    public String getMedicineCategory() {
        return medicineCategory;
    }

    public void setMedicineCategory(String medicineCategory) {
        this.medicineCategory = medicineCategory == null ? null : medicineCategory.trim();
    }

    public Date getMedicineApprovaldate() {
        return medicineApprovaldate;
    }

    public void setMedicineApprovaldate(Date medicineApprovaldate) {
        this.medicineApprovaldate = medicineApprovaldate;
    }

    public String getMedicineOriginalApprovalNumber() {
        return medicineOriginalApprovalNumber;
    }

    public void setMedicineOriginalApprovalNumber(String medicineOriginalApprovalNumber) {
        this.medicineOriginalApprovalNumber = medicineOriginalApprovalNumber == null ? null : medicineOriginalApprovalNumber.trim();
    }

    public Integer getMedicineSuppliersId() {
        return medicineSuppliersId;
    }

    public void setMedicineSuppliersId(Integer medicineSuppliersId) {
        this.medicineSuppliersId = medicineSuppliersId;
    }

    public String getMedicinePicture() {
        return medicinePicture;
    }

    public void setMedicinePicture(String medicinePicture) {
        this.medicinePicture = medicinePicture == null ? null : medicinePicture.trim();
    }

    public String getMedicineStockAmount() {
        return medicineStockAmount;
    }

    public void setMedicineStockAmount(String medicineStockAmount) {
        this.medicineStockAmount = medicineStockAmount == null ? null : medicineStockAmount.trim();
    }

    public Double getMedicinePurchasePrice() {
        return medicinePurchasePrice;
    }

    public void setMedicinePurchasePrice(Double medicinePurchasePrice) {
        this.medicinePurchasePrice = medicinePurchasePrice;
    }

    public Double getMedicineRetailPrice() {
        return medicineRetailPrice;
    }

    public void setMedicineRetailPrice(Double medicineRetailPrice) {
        this.medicineRetailPrice = medicineRetailPrice;
    }

    public Double getMedicineWholesalePrice() {
        return medicineWholesalePrice;
    }

    public void setMedicineWholesalePrice(Double medicineWholesalePrice) {
        this.medicineWholesalePrice = medicineWholesalePrice;
    }
}