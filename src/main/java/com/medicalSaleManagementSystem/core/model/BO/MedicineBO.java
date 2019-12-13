package com.medicalSaleManagementSystem.core.model.BO;

import java.util.Date;

public class MedicineBO {
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

    private String supplierName;

    private String medicinePicture;

    private String medicineStockAmount;

    private String medicineCountry;

    private Double medicinePurchasePrice;

    private Double medicineRetailPrice;

    private Double medicineWholesalePrice;

    private Integer stockAmount;

    private String whseName;

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
        this.medicineApprovalNumber = medicineApprovalNumber;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineEnglishName() {
        return medicineEnglishName;
    }

    public void setMedicineEnglishName(String medicineEnglishName) {
        this.medicineEnglishName = medicineEnglishName;
    }

    public String getMedicineDosageformCategory() {
        return medicineDosageformCategory;
    }

    public void setMedicineDosageformCategory(String medicineDosageformCategory) {
        this.medicineDosageformCategory = medicineDosageformCategory;
    }

    public String getMedicineManufacturer() {
        return medicineManufacturer;
    }

    public void setMedicineManufacturer(String medicineManufacturer) {
        this.medicineManufacturer = medicineManufacturer;
    }

    public String getMedicineSpecification() {
        return medicineSpecification;
    }

    public void setMedicineSpecification(String medicineSpecification) {
        this.medicineSpecification = medicineSpecification;
    }

    public String getMedicineManufacturingAddress() {
        return medicineManufacturingAddress;
    }

    public void setMedicineManufacturingAddress(String medicineManufacturingAddress) {
        this.medicineManufacturingAddress = medicineManufacturingAddress;
    }

    public String getMedicineCategory() {
        return medicineCategory;
    }

    public void setMedicineCategory(String medicineCategory) {
        this.medicineCategory = medicineCategory;
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
        this.medicineOriginalApprovalNumber = medicineOriginalApprovalNumber;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getMedicinePicture() {
        return medicinePicture;
    }

    public void setMedicinePicture(String medicinePicture) {
        this.medicinePicture = medicinePicture;
    }

    public String getMedicineStockAmount() {
        return medicineStockAmount;
    }

    public void setMedicineStockAmount(String medicineStockAmount) {
        this.medicineStockAmount = medicineStockAmount;
    }

    public String getMedicineCountry() {
        return medicineCountry;
    }

    public void setMedicineCountry(String medicineCountry) {
        this.medicineCountry = medicineCountry;
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

    @Override
    public String toString() {
        return "MedicineBO{" +
                "medicineId=" + medicineId +
                ", medicineApprovalNumber='" + medicineApprovalNumber + '\'' +
                ", medicineName='" + medicineName + '\'' +
                ", medicineEnglishName='" + medicineEnglishName + '\'' +
                ", medicineDosageformCategory='" + medicineDosageformCategory + '\'' +
                ", medicineManufacturer='" + medicineManufacturer + '\'' +
                ", medicineSpecification='" + medicineSpecification + '\'' +
                ", medicineManufacturingAddress='" + medicineManufacturingAddress + '\'' +
                ", medicineCategory='" + medicineCategory + '\'' +
                ", medicineApprovaldate=" + medicineApprovaldate +
                ", medicineOriginalApprovalNumber='" + medicineOriginalApprovalNumber + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", medicinePicture='" + medicinePicture + '\'' +
                ", medicineStockAmount='" + medicineStockAmount + '\'' +
                ", medicineCountry='" + medicineCountry + '\'' +
                ", medicinePurchasePrice=" + medicinePurchasePrice +
                ", medicineRetailPrice=" + medicineRetailPrice +
                ", medicineWholesalePrice=" + medicineWholesalePrice +
                ", stockAmount=" + stockAmount +
                ", whseName='" + whseName + '\'' +
                '}';
    }
}