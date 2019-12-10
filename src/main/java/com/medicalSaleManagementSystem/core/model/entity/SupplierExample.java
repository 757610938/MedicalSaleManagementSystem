package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_Name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_Name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_Name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_Name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_Name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_Name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_Name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_Name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_Name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_Name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_Name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_Name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_Name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_Name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressIsNull() {
            addCriterion("supplier_Address is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressIsNotNull() {
            addCriterion("supplier_Address is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressEqualTo(String value) {
            addCriterion("supplier_Address =", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotEqualTo(String value) {
            addCriterion("supplier_Address <>", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressGreaterThan(String value) {
            addCriterion("supplier_Address >", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_Address >=", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressLessThan(String value) {
            addCriterion("supplier_Address <", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressLessThanOrEqualTo(String value) {
            addCriterion("supplier_Address <=", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressLike(String value) {
            addCriterion("supplier_Address like", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotLike(String value) {
            addCriterion("supplier_Address not like", value, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressIn(List<String> values) {
            addCriterion("supplier_Address in", values, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotIn(List<String> values) {
            addCriterion("supplier_Address not in", values, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressBetween(String value1, String value2) {
            addCriterion("supplier_Address between", value1, value2, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierAddressNotBetween(String value1, String value2) {
            addCriterion("supplier_Address not between", value1, value2, "supplierAddress");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeIsNull() {
            addCriterion("supplier_Zipcode is null");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeIsNotNull() {
            addCriterion("supplier_Zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeEqualTo(String value) {
            addCriterion("supplier_Zipcode =", value, "supplierZipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeNotEqualTo(String value) {
            addCriterion("supplier_Zipcode <>", value, "supplierZipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeGreaterThan(String value) {
            addCriterion("supplier_Zipcode >", value, "supplierZipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_Zipcode >=", value, "supplierZipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeLessThan(String value) {
            addCriterion("supplier_Zipcode <", value, "supplierZipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeLessThanOrEqualTo(String value) {
            addCriterion("supplier_Zipcode <=", value, "supplierZipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeLike(String value) {
            addCriterion("supplier_Zipcode like", value, "supplierZipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeNotLike(String value) {
            addCriterion("supplier_Zipcode not like", value, "supplierZipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeIn(List<String> values) {
            addCriterion("supplier_Zipcode in", values, "supplierZipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeNotIn(List<String> values) {
            addCriterion("supplier_Zipcode not in", values, "supplierZipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeBetween(String value1, String value2) {
            addCriterion("supplier_Zipcode between", value1, value2, "supplierZipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierZipcodeNotBetween(String value1, String value2) {
            addCriterion("supplier_Zipcode not between", value1, value2, "supplierZipcode");
            return (Criteria) this;
        }

        public Criteria andSupplierTelIsNull() {
            addCriterion("supplier_Tel is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTelIsNotNull() {
            addCriterion("supplier_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTelEqualTo(String value) {
            addCriterion("supplier_Tel =", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelNotEqualTo(String value) {
            addCriterion("supplier_Tel <>", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelGreaterThan(String value) {
            addCriterion("supplier_Tel >", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_Tel >=", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelLessThan(String value) {
            addCriterion("supplier_Tel <", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelLessThanOrEqualTo(String value) {
            addCriterion("supplier_Tel <=", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelLike(String value) {
            addCriterion("supplier_Tel like", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelNotLike(String value) {
            addCriterion("supplier_Tel not like", value, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelIn(List<String> values) {
            addCriterion("supplier_Tel in", values, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelNotIn(List<String> values) {
            addCriterion("supplier_Tel not in", values, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelBetween(String value1, String value2) {
            addCriterion("supplier_Tel between", value1, value2, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierTelNotBetween(String value1, String value2) {
            addCriterion("supplier_Tel not between", value1, value2, "supplierTel");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxIsNull() {
            addCriterion("supplier_Fax is null");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxIsNotNull() {
            addCriterion("supplier_Fax is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxEqualTo(String value) {
            addCriterion("supplier_Fax =", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxNotEqualTo(String value) {
            addCriterion("supplier_Fax <>", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxGreaterThan(String value) {
            addCriterion("supplier_Fax >", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_Fax >=", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxLessThan(String value) {
            addCriterion("supplier_Fax <", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxLessThanOrEqualTo(String value) {
            addCriterion("supplier_Fax <=", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxLike(String value) {
            addCriterion("supplier_Fax like", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxNotLike(String value) {
            addCriterion("supplier_Fax not like", value, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxIn(List<String> values) {
            addCriterion("supplier_Fax in", values, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxNotIn(List<String> values) {
            addCriterion("supplier_Fax not in", values, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxBetween(String value1, String value2) {
            addCriterion("supplier_Fax between", value1, value2, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierFaxNotBetween(String value1, String value2) {
            addCriterion("supplier_Fax not between", value1, value2, "supplierFax");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankIsNull() {
            addCriterion("supplier_Opening_bank is null");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankIsNotNull() {
            addCriterion("supplier_Opening_bank is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankEqualTo(String value) {
            addCriterion("supplier_Opening_bank =", value, "supplierOpeningBank");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankNotEqualTo(String value) {
            addCriterion("supplier_Opening_bank <>", value, "supplierOpeningBank");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankGreaterThan(String value) {
            addCriterion("supplier_Opening_bank >", value, "supplierOpeningBank");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_Opening_bank >=", value, "supplierOpeningBank");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankLessThan(String value) {
            addCriterion("supplier_Opening_bank <", value, "supplierOpeningBank");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankLessThanOrEqualTo(String value) {
            addCriterion("supplier_Opening_bank <=", value, "supplierOpeningBank");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankLike(String value) {
            addCriterion("supplier_Opening_bank like", value, "supplierOpeningBank");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankNotLike(String value) {
            addCriterion("supplier_Opening_bank not like", value, "supplierOpeningBank");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankIn(List<String> values) {
            addCriterion("supplier_Opening_bank in", values, "supplierOpeningBank");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankNotIn(List<String> values) {
            addCriterion("supplier_Opening_bank not in", values, "supplierOpeningBank");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankBetween(String value1, String value2) {
            addCriterion("supplier_Opening_bank between", value1, value2, "supplierOpeningBank");
            return (Criteria) this;
        }

        public Criteria andSupplierOpeningBankNotBetween(String value1, String value2) {
            addCriterion("supplier_Opening_bank not between", value1, value2, "supplierOpeningBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberIsNull() {
            addCriterion("supplier_Bank_number is null");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberIsNotNull() {
            addCriterion("supplier_Bank_number is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberEqualTo(String value) {
            addCriterion("supplier_Bank_number =", value, "supplierBankNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberNotEqualTo(String value) {
            addCriterion("supplier_Bank_number <>", value, "supplierBankNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberGreaterThan(String value) {
            addCriterion("supplier_Bank_number >", value, "supplierBankNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_Bank_number >=", value, "supplierBankNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberLessThan(String value) {
            addCriterion("supplier_Bank_number <", value, "supplierBankNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberLessThanOrEqualTo(String value) {
            addCriterion("supplier_Bank_number <=", value, "supplierBankNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberLike(String value) {
            addCriterion("supplier_Bank_number like", value, "supplierBankNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberNotLike(String value) {
            addCriterion("supplier_Bank_number not like", value, "supplierBankNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberIn(List<String> values) {
            addCriterion("supplier_Bank_number in", values, "supplierBankNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberNotIn(List<String> values) {
            addCriterion("supplier_Bank_number not in", values, "supplierBankNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberBetween(String value1, String value2) {
            addCriterion("supplier_Bank_number between", value1, value2, "supplierBankNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierBankNumberNotBetween(String value1, String value2) {
            addCriterion("supplier_Bank_number not between", value1, value2, "supplierBankNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseIsNull() {
            addCriterion("supplier_Warehouse is null");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseIsNotNull() {
            addCriterion("supplier_Warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseEqualTo(String value) {
            addCriterion("supplier_Warehouse =", value, "supplierWarehouse");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseNotEqualTo(String value) {
            addCriterion("supplier_Warehouse <>", value, "supplierWarehouse");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseGreaterThan(String value) {
            addCriterion("supplier_Warehouse >", value, "supplierWarehouse");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_Warehouse >=", value, "supplierWarehouse");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseLessThan(String value) {
            addCriterion("supplier_Warehouse <", value, "supplierWarehouse");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseLessThanOrEqualTo(String value) {
            addCriterion("supplier_Warehouse <=", value, "supplierWarehouse");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseLike(String value) {
            addCriterion("supplier_Warehouse like", value, "supplierWarehouse");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseNotLike(String value) {
            addCriterion("supplier_Warehouse not like", value, "supplierWarehouse");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseIn(List<String> values) {
            addCriterion("supplier_Warehouse in", values, "supplierWarehouse");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseNotIn(List<String> values) {
            addCriterion("supplier_Warehouse not in", values, "supplierWarehouse");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseBetween(String value1, String value2) {
            addCriterion("supplier_Warehouse between", value1, value2, "supplierWarehouse");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehouseNotBetween(String value1, String value2) {
            addCriterion("supplier_Warehouse not between", value1, value2, "supplierWarehouse");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelIsNull() {
            addCriterion("supplier_Warehous_Tel is null");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelIsNotNull() {
            addCriterion("supplier_Warehous_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelEqualTo(String value) {
            addCriterion("supplier_Warehous_Tel =", value, "supplierWarehousTel");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelNotEqualTo(String value) {
            addCriterion("supplier_Warehous_Tel <>", value, "supplierWarehousTel");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelGreaterThan(String value) {
            addCriterion("supplier_Warehous_Tel >", value, "supplierWarehousTel");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_Warehous_Tel >=", value, "supplierWarehousTel");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelLessThan(String value) {
            addCriterion("supplier_Warehous_Tel <", value, "supplierWarehousTel");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelLessThanOrEqualTo(String value) {
            addCriterion("supplier_Warehous_Tel <=", value, "supplierWarehousTel");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelLike(String value) {
            addCriterion("supplier_Warehous_Tel like", value, "supplierWarehousTel");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelNotLike(String value) {
            addCriterion("supplier_Warehous_Tel not like", value, "supplierWarehousTel");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelIn(List<String> values) {
            addCriterion("supplier_Warehous_Tel in", values, "supplierWarehousTel");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelNotIn(List<String> values) {
            addCriterion("supplier_Warehous_Tel not in", values, "supplierWarehousTel");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelBetween(String value1, String value2) {
            addCriterion("supplier_Warehous_Tel between", value1, value2, "supplierWarehousTel");
            return (Criteria) this;
        }

        public Criteria andSupplierWarehousTelNotBetween(String value1, String value2) {
            addCriterion("supplier_Warehous_Tel not between", value1, value2, "supplierWarehousTel");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameIsNull() {
            addCriterion("supplier_Contacts_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameIsNotNull() {
            addCriterion("supplier_Contacts_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameEqualTo(String value) {
            addCriterion("supplier_Contacts_name =", value, "supplierContactsName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameNotEqualTo(String value) {
            addCriterion("supplier_Contacts_name <>", value, "supplierContactsName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameGreaterThan(String value) {
            addCriterion("supplier_Contacts_name >", value, "supplierContactsName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_Contacts_name >=", value, "supplierContactsName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameLessThan(String value) {
            addCriterion("supplier_Contacts_name <", value, "supplierContactsName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_Contacts_name <=", value, "supplierContactsName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameLike(String value) {
            addCriterion("supplier_Contacts_name like", value, "supplierContactsName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameNotLike(String value) {
            addCriterion("supplier_Contacts_name not like", value, "supplierContactsName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameIn(List<String> values) {
            addCriterion("supplier_Contacts_name in", values, "supplierContactsName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameNotIn(List<String> values) {
            addCriterion("supplier_Contacts_name not in", values, "supplierContactsName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameBetween(String value1, String value2) {
            addCriterion("supplier_Contacts_name between", value1, value2, "supplierContactsName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsNameNotBetween(String value1, String value2) {
            addCriterion("supplier_Contacts_name not between", value1, value2, "supplierContactsName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelIsNull() {
            addCriterion("supplier_Contacts_tel is null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelIsNotNull() {
            addCriterion("supplier_Contacts_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelEqualTo(String value) {
            addCriterion("supplier_Contacts_tel =", value, "supplierContactsTel");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelNotEqualTo(String value) {
            addCriterion("supplier_Contacts_tel <>", value, "supplierContactsTel");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelGreaterThan(String value) {
            addCriterion("supplier_Contacts_tel >", value, "supplierContactsTel");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_Contacts_tel >=", value, "supplierContactsTel");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelLessThan(String value) {
            addCriterion("supplier_Contacts_tel <", value, "supplierContactsTel");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelLessThanOrEqualTo(String value) {
            addCriterion("supplier_Contacts_tel <=", value, "supplierContactsTel");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelLike(String value) {
            addCriterion("supplier_Contacts_tel like", value, "supplierContactsTel");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelNotLike(String value) {
            addCriterion("supplier_Contacts_tel not like", value, "supplierContactsTel");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelIn(List<String> values) {
            addCriterion("supplier_Contacts_tel in", values, "supplierContactsTel");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelNotIn(List<String> values) {
            addCriterion("supplier_Contacts_tel not in", values, "supplierContactsTel");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelBetween(String value1, String value2) {
            addCriterion("supplier_Contacts_tel between", value1, value2, "supplierContactsTel");
            return (Criteria) this;
        }

        public Criteria andSupplierContactsTelNotBetween(String value1, String value2) {
            addCriterion("supplier_Contacts_tel not between", value1, value2, "supplierContactsTel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}