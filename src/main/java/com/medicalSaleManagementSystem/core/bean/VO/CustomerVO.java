package com.medicalSaleManagementSystem.core.bean.VO;

public class CustomerVO {
    private Integer custId;

    private String custCategory;

    private String custName;

    private String custAddress;

    private String custShippingAddress;

    private String custTel;

    private String custZipCode;

    private String custFax;

    private String custOpeningBank;

    private String custBankNumber;

    private String custContactsName;

    private String custContactsTel;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustCategory() {
        return custCategory;
    }

    public void setCustCategory(String custCategory) {
        this.custCategory = custCategory == null ? null : custCategory.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress == null ? null : custAddress.trim();
    }

    public String getCustShippingAddress() {
        return custShippingAddress;
    }

    public void setCustShippingAddress(String custShippingAddress) {
        this.custShippingAddress = custShippingAddress == null ? null : custShippingAddress.trim();
    }

    public String getCustTel() {
        return custTel;
    }

    public void setCustTel(String custTel) {
        this.custTel = custTel == null ? null : custTel.trim();
    }

    public String getCustZipCode() {
        return custZipCode;
    }

    public void setCustZipCode(String custZipCode) {
        this.custZipCode = custZipCode == null ? null : custZipCode.trim();
    }

    public String getCustFax() {
        return custFax;
    }

    public void setCustFax(String custFax) {
        this.custFax = custFax == null ? null : custFax.trim();
    }

    public String getCustOpeningBank() {
        return custOpeningBank;
    }

    public void setCustOpeningBank(String custOpeningBank) {
        this.custOpeningBank = custOpeningBank == null ? null : custOpeningBank.trim();
    }

    public String getCustBankNumber() {
        return custBankNumber;
    }

    public void setCustBankNumber(String custBankNumber) {
        this.custBankNumber = custBankNumber == null ? null : custBankNumber.trim();
    }

    public String getCustContactsName() {
        return custContactsName;
    }

    public void setCustContactsName(String custContactsName) {
        this.custContactsName = custContactsName == null ? null : custContactsName.trim();
    }

    public String getCustContactsTel() {
        return custContactsTel;
    }

    public void setCustContactsTel(String custContactsTel) {
        this.custContactsTel = custContactsTel == null ? null : custContactsTel.trim();
    }
}