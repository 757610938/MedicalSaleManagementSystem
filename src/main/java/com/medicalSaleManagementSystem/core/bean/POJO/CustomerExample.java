package com.medicalSaleManagementSystem.core.bean.POJO;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustCategoryIsNull() {
            addCriterion("cust_Category is null");
            return (Criteria) this;
        }

        public Criteria andCustCategoryIsNotNull() {
            addCriterion("cust_Category is not null");
            return (Criteria) this;
        }

        public Criteria andCustCategoryEqualTo(String value) {
            addCriterion("cust_Category =", value, "custCategory");
            return (Criteria) this;
        }

        public Criteria andCustCategoryNotEqualTo(String value) {
            addCriterion("cust_Category <>", value, "custCategory");
            return (Criteria) this;
        }

        public Criteria andCustCategoryGreaterThan(String value) {
            addCriterion("cust_Category >", value, "custCategory");
            return (Criteria) this;
        }

        public Criteria andCustCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("cust_Category >=", value, "custCategory");
            return (Criteria) this;
        }

        public Criteria andCustCategoryLessThan(String value) {
            addCriterion("cust_Category <", value, "custCategory");
            return (Criteria) this;
        }

        public Criteria andCustCategoryLessThanOrEqualTo(String value) {
            addCriterion("cust_Category <=", value, "custCategory");
            return (Criteria) this;
        }

        public Criteria andCustCategoryLike(String value) {
            addCriterion("cust_Category like", value, "custCategory");
            return (Criteria) this;
        }

        public Criteria andCustCategoryNotLike(String value) {
            addCriterion("cust_Category not like", value, "custCategory");
            return (Criteria) this;
        }

        public Criteria andCustCategoryIn(List<String> values) {
            addCriterion("cust_Category in", values, "custCategory");
            return (Criteria) this;
        }

        public Criteria andCustCategoryNotIn(List<String> values) {
            addCriterion("cust_Category not in", values, "custCategory");
            return (Criteria) this;
        }

        public Criteria andCustCategoryBetween(String value1, String value2) {
            addCriterion("cust_Category between", value1, value2, "custCategory");
            return (Criteria) this;
        }

        public Criteria andCustCategoryNotBetween(String value1, String value2) {
            addCriterion("cust_Category not between", value1, value2, "custCategory");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("cust_Name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("cust_Name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("cust_Name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("cust_Name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("cust_Name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_Name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("cust_Name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("cust_Name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("cust_Name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("cust_Name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("cust_Name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("cust_Name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("cust_Name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("cust_Name not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustAddressIsNull() {
            addCriterion("cust_Address is null");
            return (Criteria) this;
        }

        public Criteria andCustAddressIsNotNull() {
            addCriterion("cust_Address is not null");
            return (Criteria) this;
        }

        public Criteria andCustAddressEqualTo(String value) {
            addCriterion("cust_Address =", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotEqualTo(String value) {
            addCriterion("cust_Address <>", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressGreaterThan(String value) {
            addCriterion("cust_Address >", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cust_Address >=", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressLessThan(String value) {
            addCriterion("cust_Address <", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressLessThanOrEqualTo(String value) {
            addCriterion("cust_Address <=", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressLike(String value) {
            addCriterion("cust_Address like", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotLike(String value) {
            addCriterion("cust_Address not like", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressIn(List<String> values) {
            addCriterion("cust_Address in", values, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotIn(List<String> values) {
            addCriterion("cust_Address not in", values, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressBetween(String value1, String value2) {
            addCriterion("cust_Address between", value1, value2, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotBetween(String value1, String value2) {
            addCriterion("cust_Address not between", value1, value2, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressIsNull() {
            addCriterion("cust_Shipping_Address is null");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressIsNotNull() {
            addCriterion("cust_Shipping_Address is not null");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressEqualTo(String value) {
            addCriterion("cust_Shipping_Address =", value, "custShippingAddress");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressNotEqualTo(String value) {
            addCriterion("cust_Shipping_Address <>", value, "custShippingAddress");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressGreaterThan(String value) {
            addCriterion("cust_Shipping_Address >", value, "custShippingAddress");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cust_Shipping_Address >=", value, "custShippingAddress");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressLessThan(String value) {
            addCriterion("cust_Shipping_Address <", value, "custShippingAddress");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressLessThanOrEqualTo(String value) {
            addCriterion("cust_Shipping_Address <=", value, "custShippingAddress");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressLike(String value) {
            addCriterion("cust_Shipping_Address like", value, "custShippingAddress");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressNotLike(String value) {
            addCriterion("cust_Shipping_Address not like", value, "custShippingAddress");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressIn(List<String> values) {
            addCriterion("cust_Shipping_Address in", values, "custShippingAddress");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressNotIn(List<String> values) {
            addCriterion("cust_Shipping_Address not in", values, "custShippingAddress");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressBetween(String value1, String value2) {
            addCriterion("cust_Shipping_Address between", value1, value2, "custShippingAddress");
            return (Criteria) this;
        }

        public Criteria andCustShippingAddressNotBetween(String value1, String value2) {
            addCriterion("cust_Shipping_Address not between", value1, value2, "custShippingAddress");
            return (Criteria) this;
        }

        public Criteria andCustTelIsNull() {
            addCriterion("cust_Tel is null");
            return (Criteria) this;
        }

        public Criteria andCustTelIsNotNull() {
            addCriterion("cust_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andCustTelEqualTo(String value) {
            addCriterion("cust_Tel =", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotEqualTo(String value) {
            addCriterion("cust_Tel <>", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelGreaterThan(String value) {
            addCriterion("cust_Tel >", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelGreaterThanOrEqualTo(String value) {
            addCriterion("cust_Tel >=", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLessThan(String value) {
            addCriterion("cust_Tel <", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLessThanOrEqualTo(String value) {
            addCriterion("cust_Tel <=", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLike(String value) {
            addCriterion("cust_Tel like", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotLike(String value) {
            addCriterion("cust_Tel not like", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelIn(List<String> values) {
            addCriterion("cust_Tel in", values, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotIn(List<String> values) {
            addCriterion("cust_Tel not in", values, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelBetween(String value1, String value2) {
            addCriterion("cust_Tel between", value1, value2, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotBetween(String value1, String value2) {
            addCriterion("cust_Tel not between", value1, value2, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeIsNull() {
            addCriterion("cust_Zip_Code is null");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeIsNotNull() {
            addCriterion("cust_Zip_Code is not null");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeEqualTo(String value) {
            addCriterion("cust_Zip_Code =", value, "custZipCode");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeNotEqualTo(String value) {
            addCriterion("cust_Zip_Code <>", value, "custZipCode");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeGreaterThan(String value) {
            addCriterion("cust_Zip_Code >", value, "custZipCode");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cust_Zip_Code >=", value, "custZipCode");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeLessThan(String value) {
            addCriterion("cust_Zip_Code <", value, "custZipCode");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeLessThanOrEqualTo(String value) {
            addCriterion("cust_Zip_Code <=", value, "custZipCode");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeLike(String value) {
            addCriterion("cust_Zip_Code like", value, "custZipCode");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeNotLike(String value) {
            addCriterion("cust_Zip_Code not like", value, "custZipCode");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeIn(List<String> values) {
            addCriterion("cust_Zip_Code in", values, "custZipCode");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeNotIn(List<String> values) {
            addCriterion("cust_Zip_Code not in", values, "custZipCode");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeBetween(String value1, String value2) {
            addCriterion("cust_Zip_Code between", value1, value2, "custZipCode");
            return (Criteria) this;
        }

        public Criteria andCustZipCodeNotBetween(String value1, String value2) {
            addCriterion("cust_Zip_Code not between", value1, value2, "custZipCode");
            return (Criteria) this;
        }

        public Criteria andCustFaxIsNull() {
            addCriterion("cust_Fax is null");
            return (Criteria) this;
        }

        public Criteria andCustFaxIsNotNull() {
            addCriterion("cust_Fax is not null");
            return (Criteria) this;
        }

        public Criteria andCustFaxEqualTo(String value) {
            addCriterion("cust_Fax =", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxNotEqualTo(String value) {
            addCriterion("cust_Fax <>", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxGreaterThan(String value) {
            addCriterion("cust_Fax >", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxGreaterThanOrEqualTo(String value) {
            addCriterion("cust_Fax >=", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxLessThan(String value) {
            addCriterion("cust_Fax <", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxLessThanOrEqualTo(String value) {
            addCriterion("cust_Fax <=", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxLike(String value) {
            addCriterion("cust_Fax like", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxNotLike(String value) {
            addCriterion("cust_Fax not like", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxIn(List<String> values) {
            addCriterion("cust_Fax in", values, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxNotIn(List<String> values) {
            addCriterion("cust_Fax not in", values, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxBetween(String value1, String value2) {
            addCriterion("cust_Fax between", value1, value2, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxNotBetween(String value1, String value2) {
            addCriterion("cust_Fax not between", value1, value2, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankIsNull() {
            addCriterion("cust_Opening_Bank is null");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankIsNotNull() {
            addCriterion("cust_Opening_Bank is not null");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankEqualTo(String value) {
            addCriterion("cust_Opening_Bank =", value, "custOpeningBank");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankNotEqualTo(String value) {
            addCriterion("cust_Opening_Bank <>", value, "custOpeningBank");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankGreaterThan(String value) {
            addCriterion("cust_Opening_Bank >", value, "custOpeningBank");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankGreaterThanOrEqualTo(String value) {
            addCriterion("cust_Opening_Bank >=", value, "custOpeningBank");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankLessThan(String value) {
            addCriterion("cust_Opening_Bank <", value, "custOpeningBank");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankLessThanOrEqualTo(String value) {
            addCriterion("cust_Opening_Bank <=", value, "custOpeningBank");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankLike(String value) {
            addCriterion("cust_Opening_Bank like", value, "custOpeningBank");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankNotLike(String value) {
            addCriterion("cust_Opening_Bank not like", value, "custOpeningBank");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankIn(List<String> values) {
            addCriterion("cust_Opening_Bank in", values, "custOpeningBank");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankNotIn(List<String> values) {
            addCriterion("cust_Opening_Bank not in", values, "custOpeningBank");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankBetween(String value1, String value2) {
            addCriterion("cust_Opening_Bank between", value1, value2, "custOpeningBank");
            return (Criteria) this;
        }

        public Criteria andCustOpeningBankNotBetween(String value1, String value2) {
            addCriterion("cust_Opening_Bank not between", value1, value2, "custOpeningBank");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberIsNull() {
            addCriterion("cust_Bank_Number is null");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberIsNotNull() {
            addCriterion("cust_Bank_Number is not null");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberEqualTo(String value) {
            addCriterion("cust_Bank_Number =", value, "custBankNumber");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberNotEqualTo(String value) {
            addCriterion("cust_Bank_Number <>", value, "custBankNumber");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberGreaterThan(String value) {
            addCriterion("cust_Bank_Number >", value, "custBankNumber");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cust_Bank_Number >=", value, "custBankNumber");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberLessThan(String value) {
            addCriterion("cust_Bank_Number <", value, "custBankNumber");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberLessThanOrEqualTo(String value) {
            addCriterion("cust_Bank_Number <=", value, "custBankNumber");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberLike(String value) {
            addCriterion("cust_Bank_Number like", value, "custBankNumber");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberNotLike(String value) {
            addCriterion("cust_Bank_Number not like", value, "custBankNumber");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberIn(List<String> values) {
            addCriterion("cust_Bank_Number in", values, "custBankNumber");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberNotIn(List<String> values) {
            addCriterion("cust_Bank_Number not in", values, "custBankNumber");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberBetween(String value1, String value2) {
            addCriterion("cust_Bank_Number between", value1, value2, "custBankNumber");
            return (Criteria) this;
        }

        public Criteria andCustBankNumberNotBetween(String value1, String value2) {
            addCriterion("cust_Bank_Number not between", value1, value2, "custBankNumber");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameIsNull() {
            addCriterion("cust_Contacts_Name is null");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameIsNotNull() {
            addCriterion("cust_Contacts_Name is not null");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameEqualTo(String value) {
            addCriterion("cust_Contacts_Name =", value, "custContactsName");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameNotEqualTo(String value) {
            addCriterion("cust_Contacts_Name <>", value, "custContactsName");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameGreaterThan(String value) {
            addCriterion("cust_Contacts_Name >", value, "custContactsName");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_Contacts_Name >=", value, "custContactsName");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameLessThan(String value) {
            addCriterion("cust_Contacts_Name <", value, "custContactsName");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameLessThanOrEqualTo(String value) {
            addCriterion("cust_Contacts_Name <=", value, "custContactsName");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameLike(String value) {
            addCriterion("cust_Contacts_Name like", value, "custContactsName");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameNotLike(String value) {
            addCriterion("cust_Contacts_Name not like", value, "custContactsName");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameIn(List<String> values) {
            addCriterion("cust_Contacts_Name in", values, "custContactsName");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameNotIn(List<String> values) {
            addCriterion("cust_Contacts_Name not in", values, "custContactsName");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameBetween(String value1, String value2) {
            addCriterion("cust_Contacts_Name between", value1, value2, "custContactsName");
            return (Criteria) this;
        }

        public Criteria andCustContactsNameNotBetween(String value1, String value2) {
            addCriterion("cust_Contacts_Name not between", value1, value2, "custContactsName");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelIsNull() {
            addCriterion("cust_Contacts_Tel is null");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelIsNotNull() {
            addCriterion("cust_Contacts_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelEqualTo(String value) {
            addCriterion("cust_Contacts_Tel =", value, "custContactsTel");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelNotEqualTo(String value) {
            addCriterion("cust_Contacts_Tel <>", value, "custContactsTel");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelGreaterThan(String value) {
            addCriterion("cust_Contacts_Tel >", value, "custContactsTel");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelGreaterThanOrEqualTo(String value) {
            addCriterion("cust_Contacts_Tel >=", value, "custContactsTel");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelLessThan(String value) {
            addCriterion("cust_Contacts_Tel <", value, "custContactsTel");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelLessThanOrEqualTo(String value) {
            addCriterion("cust_Contacts_Tel <=", value, "custContactsTel");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelLike(String value) {
            addCriterion("cust_Contacts_Tel like", value, "custContactsTel");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelNotLike(String value) {
            addCriterion("cust_Contacts_Tel not like", value, "custContactsTel");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelIn(List<String> values) {
            addCriterion("cust_Contacts_Tel in", values, "custContactsTel");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelNotIn(List<String> values) {
            addCriterion("cust_Contacts_Tel not in", values, "custContactsTel");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelBetween(String value1, String value2) {
            addCriterion("cust_Contacts_Tel between", value1, value2, "custContactsTel");
            return (Criteria) this;
        }

        public Criteria andCustContactsTelNotBetween(String value1, String value2) {
            addCriterion("cust_Contacts_Tel not between", value1, value2, "custContactsTel");
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