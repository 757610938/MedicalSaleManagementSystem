package com.medicalSaleManagementSystem.core.model.DO;

public class SupplierDO {
    private Integer supplierId;

    private String supplierName;

    private String supplierAddress;

    private String supplierZipcode;

    private String supplierTel;

    private String supplierFax;

    private String supplierOpeningBank;

    private String supplierBanknumber;

    private String supplierWarehouse;

    private String supplierWarehoustel;

    private String supplierContactsname;

    private String supplierContactstel;

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

    public String getSupplierBanknumber() {
        return supplierBanknumber;
    }

    public void setSupplierBanknumber(String supplierBanknumber) {
        this.supplierBanknumber = supplierBanknumber == null ? null : supplierBanknumber.trim();
    }

    public String getSupplierWarehouse() {
        return supplierWarehouse;
    }

    public void setSupplierWarehouse(String supplierWarehouse) {
        this.supplierWarehouse = supplierWarehouse == null ? null : supplierWarehouse.trim();
    }

    public String getSupplierWarehoustel() {
        return supplierWarehoustel;
    }

    public void setSupplierWarehoustel(String supplierWarehoustel) {
        this.supplierWarehoustel = supplierWarehoustel == null ? null : supplierWarehoustel.trim();
    }

    public String getSupplierContactsname() {
        return supplierContactsname;
    }

    public void setSupplierContactsname(String supplierContactsname) {
        this.supplierContactsname = supplierContactsname == null ? null : supplierContactsname.trim();
    }

    public String getSupplierContactstel() {
        return supplierContactstel;
    }

    public void setSupplierContactstel(String supplierContactstel) {
        this.supplierContactstel = supplierContactstel == null ? null : supplierContactstel.trim();
    }
}