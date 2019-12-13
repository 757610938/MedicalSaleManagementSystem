package com.medicalSaleManagementSystem.core.model.DTO;

public class SupplierDTO {
    private Integer supplierId;

    private String supplierName;

    private String supplierAddress;

    private String supplierZipcode;

    private String supplierTel;

    private String supplierFax;

    private String supplierOpeningBank;

    private String supplierBankNumber;

    private String supplierWarehouse;

    private String supplierWarehousTel;

    private String supplierContactsName;

    private String supplierContactsTel;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress == null ? null : supplierAddress.trim();
    }

    public String getSupplierZipcode() {
        return supplierZipcode;
    }

    public void setSupplierZipcode(String supplierZipcode) {
        this.supplierZipcode = supplierZipcode == null ? null : supplierZipcode.trim();
    }

    public String getSupplierTel() {
        return supplierTel;
    }

    public void setSupplierTel(String supplierTel) {
        this.supplierTel = supplierTel == null ? null : supplierTel.trim();
    }

    public String getSupplierFax() {
        return supplierFax;
    }

    public void setSupplierFax(String supplierFax) {
        this.supplierFax = supplierFax == null ? null : supplierFax.trim();
    }

    public String getSupplierOpeningBank() {
        return supplierOpeningBank;
    }

    public void setSupplierOpeningBank(String supplierOpeningBank) {
        this.supplierOpeningBank = supplierOpeningBank == null ? null : supplierOpeningBank.trim();
    }

    public String getSupplierBankNumber() {
        return supplierBankNumber;
    }

    public void setSupplierBankNumber(String supplierBankNumber) {
        this.supplierBankNumber = supplierBankNumber == null ? null : supplierBankNumber.trim();
    }

    public String getSupplierWarehouse() {
        return supplierWarehouse;
    }

    public void setSupplierWarehouse(String supplierWarehouse) {
        this.supplierWarehouse = supplierWarehouse == null ? null : supplierWarehouse.trim();
    }

    public String getSupplierWarehousTel() {
        return supplierWarehousTel;
    }

    public void setSupplierWarehousTel(String supplierWarehousTel) {
        this.supplierWarehousTel = supplierWarehousTel == null ? null : supplierWarehousTel.trim();
    }

    public String getSupplierContactsName() {
        return supplierContactsName;
    }

    public void setSupplierContactsName(String supplierContactsName) {
        this.supplierContactsName = supplierContactsName == null ? null : supplierContactsName.trim();
    }

    public String getSupplierContactsTel() {
        return supplierContactsTel;
    }

    public void setSupplierContactsTel(String supplierContactsTel) {
        this.supplierContactsTel = supplierContactsTel == null ? null : supplierContactsTel.trim();
    }
}