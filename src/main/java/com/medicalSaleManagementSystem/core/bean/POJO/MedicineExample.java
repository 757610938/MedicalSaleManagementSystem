package com.medicalSaleManagementSystem.core.bean.POJO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineExample() {
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

        public Criteria andMedicineIdIsNull() {
            addCriterion("medicine_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIsNotNull() {
            addCriterion("medicine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineIdEqualTo(Integer value) {
            addCriterion("medicine_id =", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotEqualTo(Integer value) {
            addCriterion("medicine_id <>", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdGreaterThan(Integer value) {
            addCriterion("medicine_id >", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicine_id >=", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdLessThan(Integer value) {
            addCriterion("medicine_id <", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdLessThanOrEqualTo(Integer value) {
            addCriterion("medicine_id <=", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIn(List<Integer> values) {
            addCriterion("medicine_id in", values, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotIn(List<Integer> values) {
            addCriterion("medicine_id not in", values, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdBetween(Integer value1, Integer value2) {
            addCriterion("medicine_id between", value1, value2, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medicine_id not between", value1, value2, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberIsNull() {
            addCriterion("medicine_Approval_Number is null");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberIsNotNull() {
            addCriterion("medicine_Approval_Number is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberEqualTo(String value) {
            addCriterion("medicine_Approval_Number =", value, "medicineApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberNotEqualTo(String value) {
            addCriterion("medicine_Approval_Number <>", value, "medicineApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberGreaterThan(String value) {
            addCriterion("medicine_Approval_Number >", value, "medicineApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_Approval_Number >=", value, "medicineApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberLessThan(String value) {
            addCriterion("medicine_Approval_Number <", value, "medicineApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberLessThanOrEqualTo(String value) {
            addCriterion("medicine_Approval_Number <=", value, "medicineApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberLike(String value) {
            addCriterion("medicine_Approval_Number like", value, "medicineApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberNotLike(String value) {
            addCriterion("medicine_Approval_Number not like", value, "medicineApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberIn(List<String> values) {
            addCriterion("medicine_Approval_Number in", values, "medicineApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberNotIn(List<String> values) {
            addCriterion("medicine_Approval_Number not in", values, "medicineApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberBetween(String value1, String value2) {
            addCriterion("medicine_Approval_Number between", value1, value2, "medicineApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovalNumberNotBetween(String value1, String value2) {
            addCriterion("medicine_Approval_Number not between", value1, value2, "medicineApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineNameIsNull() {
            addCriterion("medicine_Name is null");
            return (Criteria) this;
        }

        public Criteria andMedicineNameIsNotNull() {
            addCriterion("medicine_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineNameEqualTo(String value) {
            addCriterion("medicine_Name =", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameNotEqualTo(String value) {
            addCriterion("medicine_Name <>", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameGreaterThan(String value) {
            addCriterion("medicine_Name >", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_Name >=", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameLessThan(String value) {
            addCriterion("medicine_Name <", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameLessThanOrEqualTo(String value) {
            addCriterion("medicine_Name <=", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameLike(String value) {
            addCriterion("medicine_Name like", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameNotLike(String value) {
            addCriterion("medicine_Name not like", value, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameIn(List<String> values) {
            addCriterion("medicine_Name in", values, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameNotIn(List<String> values) {
            addCriterion("medicine_Name not in", values, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameBetween(String value1, String value2) {
            addCriterion("medicine_Name between", value1, value2, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineNameNotBetween(String value1, String value2) {
            addCriterion("medicine_Name not between", value1, value2, "medicineName");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameIsNull() {
            addCriterion("medicine_English_Name is null");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameIsNotNull() {
            addCriterion("medicine_English_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameEqualTo(String value) {
            addCriterion("medicine_English_Name =", value, "medicineEnglishName");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameNotEqualTo(String value) {
            addCriterion("medicine_English_Name <>", value, "medicineEnglishName");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameGreaterThan(String value) {
            addCriterion("medicine_English_Name >", value, "medicineEnglishName");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_English_Name >=", value, "medicineEnglishName");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameLessThan(String value) {
            addCriterion("medicine_English_Name <", value, "medicineEnglishName");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("medicine_English_Name <=", value, "medicineEnglishName");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameLike(String value) {
            addCriterion("medicine_English_Name like", value, "medicineEnglishName");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameNotLike(String value) {
            addCriterion("medicine_English_Name not like", value, "medicineEnglishName");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameIn(List<String> values) {
            addCriterion("medicine_English_Name in", values, "medicineEnglishName");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameNotIn(List<String> values) {
            addCriterion("medicine_English_Name not in", values, "medicineEnglishName");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameBetween(String value1, String value2) {
            addCriterion("medicine_English_Name between", value1, value2, "medicineEnglishName");
            return (Criteria) this;
        }

        public Criteria andMedicineEnglishNameNotBetween(String value1, String value2) {
            addCriterion("medicine_English_Name not between", value1, value2, "medicineEnglishName");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryIsNull() {
            addCriterion("medicine_Dosageform_Category is null");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryIsNotNull() {
            addCriterion("medicine_Dosageform_Category is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryEqualTo(String value) {
            addCriterion("medicine_Dosageform_Category =", value, "medicineDosageformCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryNotEqualTo(String value) {
            addCriterion("medicine_Dosageform_Category <>", value, "medicineDosageformCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryGreaterThan(String value) {
            addCriterion("medicine_Dosageform_Category >", value, "medicineDosageformCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_Dosageform_Category >=", value, "medicineDosageformCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryLessThan(String value) {
            addCriterion("medicine_Dosageform_Category <", value, "medicineDosageformCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryLessThanOrEqualTo(String value) {
            addCriterion("medicine_Dosageform_Category <=", value, "medicineDosageformCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryLike(String value) {
            addCriterion("medicine_Dosageform_Category like", value, "medicineDosageformCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryNotLike(String value) {
            addCriterion("medicine_Dosageform_Category not like", value, "medicineDosageformCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryIn(List<String> values) {
            addCriterion("medicine_Dosageform_Category in", values, "medicineDosageformCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryNotIn(List<String> values) {
            addCriterion("medicine_Dosageform_Category not in", values, "medicineDosageformCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryBetween(String value1, String value2) {
            addCriterion("medicine_Dosageform_Category between", value1, value2, "medicineDosageformCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineDosageformCategoryNotBetween(String value1, String value2) {
            addCriterion("medicine_Dosageform_Category not between", value1, value2, "medicineDosageformCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerIsNull() {
            addCriterion("medicine_Manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerIsNotNull() {
            addCriterion("medicine_Manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerEqualTo(String value) {
            addCriterion("medicine_Manufacturer =", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerNotEqualTo(String value) {
            addCriterion("medicine_Manufacturer <>", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerGreaterThan(String value) {
            addCriterion("medicine_Manufacturer >", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_Manufacturer >=", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerLessThan(String value) {
            addCriterion("medicine_Manufacturer <", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerLessThanOrEqualTo(String value) {
            addCriterion("medicine_Manufacturer <=", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerLike(String value) {
            addCriterion("medicine_Manufacturer like", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerNotLike(String value) {
            addCriterion("medicine_Manufacturer not like", value, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerIn(List<String> values) {
            addCriterion("medicine_Manufacturer in", values, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerNotIn(List<String> values) {
            addCriterion("medicine_Manufacturer not in", values, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerBetween(String value1, String value2) {
            addCriterion("medicine_Manufacturer between", value1, value2, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturerNotBetween(String value1, String value2) {
            addCriterion("medicine_Manufacturer not between", value1, value2, "medicineManufacturer");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationIsNull() {
            addCriterion("medicine_Specification is null");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationIsNotNull() {
            addCriterion("medicine_Specification is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationEqualTo(String value) {
            addCriterion("medicine_Specification =", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationNotEqualTo(String value) {
            addCriterion("medicine_Specification <>", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationGreaterThan(String value) {
            addCriterion("medicine_Specification >", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_Specification >=", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationLessThan(String value) {
            addCriterion("medicine_Specification <", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationLessThanOrEqualTo(String value) {
            addCriterion("medicine_Specification <=", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationLike(String value) {
            addCriterion("medicine_Specification like", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationNotLike(String value) {
            addCriterion("medicine_Specification not like", value, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationIn(List<String> values) {
            addCriterion("medicine_Specification in", values, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationNotIn(List<String> values) {
            addCriterion("medicine_Specification not in", values, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationBetween(String value1, String value2) {
            addCriterion("medicine_Specification between", value1, value2, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineSpecificationNotBetween(String value1, String value2) {
            addCriterion("medicine_Specification not between", value1, value2, "medicineSpecification");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressIsNull() {
            addCriterion("medicine_Manufacturing_Address is null");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressIsNotNull() {
            addCriterion("medicine_Manufacturing_Address is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressEqualTo(String value) {
            addCriterion("medicine_Manufacturing_Address =", value, "medicineManufacturingAddress");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressNotEqualTo(String value) {
            addCriterion("medicine_Manufacturing_Address <>", value, "medicineManufacturingAddress");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressGreaterThan(String value) {
            addCriterion("medicine_Manufacturing_Address >", value, "medicineManufacturingAddress");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_Manufacturing_Address >=", value, "medicineManufacturingAddress");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressLessThan(String value) {
            addCriterion("medicine_Manufacturing_Address <", value, "medicineManufacturingAddress");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressLessThanOrEqualTo(String value) {
            addCriterion("medicine_Manufacturing_Address <=", value, "medicineManufacturingAddress");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressLike(String value) {
            addCriterion("medicine_Manufacturing_Address like", value, "medicineManufacturingAddress");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressNotLike(String value) {
            addCriterion("medicine_Manufacturing_Address not like", value, "medicineManufacturingAddress");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressIn(List<String> values) {
            addCriterion("medicine_Manufacturing_Address in", values, "medicineManufacturingAddress");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressNotIn(List<String> values) {
            addCriterion("medicine_Manufacturing_Address not in", values, "medicineManufacturingAddress");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressBetween(String value1, String value2) {
            addCriterion("medicine_Manufacturing_Address between", value1, value2, "medicineManufacturingAddress");
            return (Criteria) this;
        }

        public Criteria andMedicineManufacturingAddressNotBetween(String value1, String value2) {
            addCriterion("medicine_Manufacturing_Address not between", value1, value2, "medicineManufacturingAddress");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryIsNull() {
            addCriterion("medicine_Category is null");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryIsNotNull() {
            addCriterion("medicine_Category is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryEqualTo(String value) {
            addCriterion("medicine_Category =", value, "medicineCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryNotEqualTo(String value) {
            addCriterion("medicine_Category <>", value, "medicineCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryGreaterThan(String value) {
            addCriterion("medicine_Category >", value, "medicineCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_Category >=", value, "medicineCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryLessThan(String value) {
            addCriterion("medicine_Category <", value, "medicineCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryLessThanOrEqualTo(String value) {
            addCriterion("medicine_Category <=", value, "medicineCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryLike(String value) {
            addCriterion("medicine_Category like", value, "medicineCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryNotLike(String value) {
            addCriterion("medicine_Category not like", value, "medicineCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryIn(List<String> values) {
            addCriterion("medicine_Category in", values, "medicineCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryNotIn(List<String> values) {
            addCriterion("medicine_Category not in", values, "medicineCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryBetween(String value1, String value2) {
            addCriterion("medicine_Category between", value1, value2, "medicineCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineCategoryNotBetween(String value1, String value2) {
            addCriterion("medicine_Category not between", value1, value2, "medicineCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovaldateIsNull() {
            addCriterion("medicine_Approvaldate is null");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovaldateIsNotNull() {
            addCriterion("medicine_Approvaldate is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovaldateEqualTo(Date value) {
            addCriterion("medicine_Approvaldate =", value, "medicineApprovaldate");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovaldateNotEqualTo(Date value) {
            addCriterion("medicine_Approvaldate <>", value, "medicineApprovaldate");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovaldateGreaterThan(Date value) {
            addCriterion("medicine_Approvaldate >", value, "medicineApprovaldate");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("medicine_Approvaldate >=", value, "medicineApprovaldate");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovaldateLessThan(Date value) {
            addCriterion("medicine_Approvaldate <", value, "medicineApprovaldate");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovaldateLessThanOrEqualTo(Date value) {
            addCriterion("medicine_Approvaldate <=", value, "medicineApprovaldate");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovaldateIn(List<Date> values) {
            addCriterion("medicine_Approvaldate in", values, "medicineApprovaldate");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovaldateNotIn(List<Date> values) {
            addCriterion("medicine_Approvaldate not in", values, "medicineApprovaldate");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovaldateBetween(Date value1, Date value2) {
            addCriterion("medicine_Approvaldate between", value1, value2, "medicineApprovaldate");
            return (Criteria) this;
        }

        public Criteria andMedicineApprovaldateNotBetween(Date value1, Date value2) {
            addCriterion("medicine_Approvaldate not between", value1, value2, "medicineApprovaldate");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberIsNull() {
            addCriterion("medicine_Original_Approval_Number is null");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberIsNotNull() {
            addCriterion("medicine_Original_Approval_Number is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberEqualTo(String value) {
            addCriterion("medicine_Original_Approval_Number =", value, "medicineOriginalApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberNotEqualTo(String value) {
            addCriterion("medicine_Original_Approval_Number <>", value, "medicineOriginalApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberGreaterThan(String value) {
            addCriterion("medicine_Original_Approval_Number >", value, "medicineOriginalApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_Original_Approval_Number >=", value, "medicineOriginalApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberLessThan(String value) {
            addCriterion("medicine_Original_Approval_Number <", value, "medicineOriginalApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberLessThanOrEqualTo(String value) {
            addCriterion("medicine_Original_Approval_Number <=", value, "medicineOriginalApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberLike(String value) {
            addCriterion("medicine_Original_Approval_Number like", value, "medicineOriginalApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberNotLike(String value) {
            addCriterion("medicine_Original_Approval_Number not like", value, "medicineOriginalApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberIn(List<String> values) {
            addCriterion("medicine_Original_Approval_Number in", values, "medicineOriginalApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberNotIn(List<String> values) {
            addCriterion("medicine_Original_Approval_Number not in", values, "medicineOriginalApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberBetween(String value1, String value2) {
            addCriterion("medicine_Original_Approval_Number between", value1, value2, "medicineOriginalApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineOriginalApprovalNumberNotBetween(String value1, String value2) {
            addCriterion("medicine_Original_Approval_Number not between", value1, value2, "medicineOriginalApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andMedicineSuppliersIdIsNull() {
            addCriterion("medicine_Suppliers_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicineSuppliersIdIsNotNull() {
            addCriterion("medicine_Suppliers_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineSuppliersIdEqualTo(Integer value) {
            addCriterion("medicine_Suppliers_id =", value, "medicineSuppliersId");
            return (Criteria) this;
        }

        public Criteria andMedicineSuppliersIdNotEqualTo(Integer value) {
            addCriterion("medicine_Suppliers_id <>", value, "medicineSuppliersId");
            return (Criteria) this;
        }

        public Criteria andMedicineSuppliersIdGreaterThan(Integer value) {
            addCriterion("medicine_Suppliers_id >", value, "medicineSuppliersId");
            return (Criteria) this;
        }

        public Criteria andMedicineSuppliersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicine_Suppliers_id >=", value, "medicineSuppliersId");
            return (Criteria) this;
        }

        public Criteria andMedicineSuppliersIdLessThan(Integer value) {
            addCriterion("medicine_Suppliers_id <", value, "medicineSuppliersId");
            return (Criteria) this;
        }

        public Criteria andMedicineSuppliersIdLessThanOrEqualTo(Integer value) {
            addCriterion("medicine_Suppliers_id <=", value, "medicineSuppliersId");
            return (Criteria) this;
        }

        public Criteria andMedicineSuppliersIdIn(List<Integer> values) {
            addCriterion("medicine_Suppliers_id in", values, "medicineSuppliersId");
            return (Criteria) this;
        }

        public Criteria andMedicineSuppliersIdNotIn(List<Integer> values) {
            addCriterion("medicine_Suppliers_id not in", values, "medicineSuppliersId");
            return (Criteria) this;
        }

        public Criteria andMedicineSuppliersIdBetween(Integer value1, Integer value2) {
            addCriterion("medicine_Suppliers_id between", value1, value2, "medicineSuppliersId");
            return (Criteria) this;
        }

        public Criteria andMedicineSuppliersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medicine_Suppliers_id not between", value1, value2, "medicineSuppliersId");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureIsNull() {
            addCriterion("medicine_Picture is null");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureIsNotNull() {
            addCriterion("medicine_Picture is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureEqualTo(String value) {
            addCriterion("medicine_Picture =", value, "medicinePicture");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureNotEqualTo(String value) {
            addCriterion("medicine_Picture <>", value, "medicinePicture");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureGreaterThan(String value) {
            addCriterion("medicine_Picture >", value, "medicinePicture");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_Picture >=", value, "medicinePicture");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureLessThan(String value) {
            addCriterion("medicine_Picture <", value, "medicinePicture");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureLessThanOrEqualTo(String value) {
            addCriterion("medicine_Picture <=", value, "medicinePicture");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureLike(String value) {
            addCriterion("medicine_Picture like", value, "medicinePicture");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureNotLike(String value) {
            addCriterion("medicine_Picture not like", value, "medicinePicture");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureIn(List<String> values) {
            addCriterion("medicine_Picture in", values, "medicinePicture");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureNotIn(List<String> values) {
            addCriterion("medicine_Picture not in", values, "medicinePicture");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureBetween(String value1, String value2) {
            addCriterion("medicine_Picture between", value1, value2, "medicinePicture");
            return (Criteria) this;
        }

        public Criteria andMedicinePictureNotBetween(String value1, String value2) {
            addCriterion("medicine_Picture not between", value1, value2, "medicinePicture");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountIsNull() {
            addCriterion("medicine_Stock_Amount is null");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountIsNotNull() {
            addCriterion("medicine_Stock_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountEqualTo(String value) {
            addCriterion("medicine_Stock_Amount =", value, "medicineStockAmount");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountNotEqualTo(String value) {
            addCriterion("medicine_Stock_Amount <>", value, "medicineStockAmount");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountGreaterThan(String value) {
            addCriterion("medicine_Stock_Amount >", value, "medicineStockAmount");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_Stock_Amount >=", value, "medicineStockAmount");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountLessThan(String value) {
            addCriterion("medicine_Stock_Amount <", value, "medicineStockAmount");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountLessThanOrEqualTo(String value) {
            addCriterion("medicine_Stock_Amount <=", value, "medicineStockAmount");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountLike(String value) {
            addCriterion("medicine_Stock_Amount like", value, "medicineStockAmount");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountNotLike(String value) {
            addCriterion("medicine_Stock_Amount not like", value, "medicineStockAmount");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountIn(List<String> values) {
            addCriterion("medicine_Stock_Amount in", values, "medicineStockAmount");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountNotIn(List<String> values) {
            addCriterion("medicine_Stock_Amount not in", values, "medicineStockAmount");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountBetween(String value1, String value2) {
            addCriterion("medicine_Stock_Amount between", value1, value2, "medicineStockAmount");
            return (Criteria) this;
        }

        public Criteria andMedicineStockAmountNotBetween(String value1, String value2) {
            addCriterion("medicine_Stock_Amount not between", value1, value2, "medicineStockAmount");
            return (Criteria) this;
        }

        public Criteria andMedicinePurchasePriceIsNull() {
            addCriterion("medicine_Purchase_Price is null");
            return (Criteria) this;
        }

        public Criteria andMedicinePurchasePriceIsNotNull() {
            addCriterion("medicine_Purchase_Price is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinePurchasePriceEqualTo(Double value) {
            addCriterion("medicine_Purchase_Price =", value, "medicinePurchasePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePurchasePriceNotEqualTo(Double value) {
            addCriterion("medicine_Purchase_Price <>", value, "medicinePurchasePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePurchasePriceGreaterThan(Double value) {
            addCriterion("medicine_Purchase_Price >", value, "medicinePurchasePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePurchasePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("medicine_Purchase_Price >=", value, "medicinePurchasePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePurchasePriceLessThan(Double value) {
            addCriterion("medicine_Purchase_Price <", value, "medicinePurchasePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePurchasePriceLessThanOrEqualTo(Double value) {
            addCriterion("medicine_Purchase_Price <=", value, "medicinePurchasePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePurchasePriceIn(List<Double> values) {
            addCriterion("medicine_Purchase_Price in", values, "medicinePurchasePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePurchasePriceNotIn(List<Double> values) {
            addCriterion("medicine_Purchase_Price not in", values, "medicinePurchasePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePurchasePriceBetween(Double value1, Double value2) {
            addCriterion("medicine_Purchase_Price between", value1, value2, "medicinePurchasePrice");
            return (Criteria) this;
        }

        public Criteria andMedicinePurchasePriceNotBetween(Double value1, Double value2) {
            addCriterion("medicine_Purchase_Price not between", value1, value2, "medicinePurchasePrice");
            return (Criteria) this;
        }

        public Criteria andMedicineRetailPriceIsNull() {
            addCriterion("medicine_Retail_Price is null");
            return (Criteria) this;
        }

        public Criteria andMedicineRetailPriceIsNotNull() {
            addCriterion("medicine_Retail_Price is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineRetailPriceEqualTo(Double value) {
            addCriterion("medicine_Retail_Price =", value, "medicineRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMedicineRetailPriceNotEqualTo(Double value) {
            addCriterion("medicine_Retail_Price <>", value, "medicineRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMedicineRetailPriceGreaterThan(Double value) {
            addCriterion("medicine_Retail_Price >", value, "medicineRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMedicineRetailPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("medicine_Retail_Price >=", value, "medicineRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMedicineRetailPriceLessThan(Double value) {
            addCriterion("medicine_Retail_Price <", value, "medicineRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMedicineRetailPriceLessThanOrEqualTo(Double value) {
            addCriterion("medicine_Retail_Price <=", value, "medicineRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMedicineRetailPriceIn(List<Double> values) {
            addCriterion("medicine_Retail_Price in", values, "medicineRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMedicineRetailPriceNotIn(List<Double> values) {
            addCriterion("medicine_Retail_Price not in", values, "medicineRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMedicineRetailPriceBetween(Double value1, Double value2) {
            addCriterion("medicine_Retail_Price between", value1, value2, "medicineRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMedicineRetailPriceNotBetween(Double value1, Double value2) {
            addCriterion("medicine_Retail_Price not between", value1, value2, "medicineRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMedicineWholesalePriceIsNull() {
            addCriterion("medicine_Wholesale_Price is null");
            return (Criteria) this;
        }

        public Criteria andMedicineWholesalePriceIsNotNull() {
            addCriterion("medicine_Wholesale_Price is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineWholesalePriceEqualTo(Double value) {
            addCriterion("medicine_Wholesale_Price =", value, "medicineWholesalePrice");
            return (Criteria) this;
        }

        public Criteria andMedicineWholesalePriceNotEqualTo(Double value) {
            addCriterion("medicine_Wholesale_Price <>", value, "medicineWholesalePrice");
            return (Criteria) this;
        }

        public Criteria andMedicineWholesalePriceGreaterThan(Double value) {
            addCriterion("medicine_Wholesale_Price >", value, "medicineWholesalePrice");
            return (Criteria) this;
        }

        public Criteria andMedicineWholesalePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("medicine_Wholesale_Price >=", value, "medicineWholesalePrice");
            return (Criteria) this;
        }

        public Criteria andMedicineWholesalePriceLessThan(Double value) {
            addCriterion("medicine_Wholesale_Price <", value, "medicineWholesalePrice");
            return (Criteria) this;
        }

        public Criteria andMedicineWholesalePriceLessThanOrEqualTo(Double value) {
            addCriterion("medicine_Wholesale_Price <=", value, "medicineWholesalePrice");
            return (Criteria) this;
        }

        public Criteria andMedicineWholesalePriceIn(List<Double> values) {
            addCriterion("medicine_Wholesale_Price in", values, "medicineWholesalePrice");
            return (Criteria) this;
        }

        public Criteria andMedicineWholesalePriceNotIn(List<Double> values) {
            addCriterion("medicine_Wholesale_Price not in", values, "medicineWholesalePrice");
            return (Criteria) this;
        }

        public Criteria andMedicineWholesalePriceBetween(Double value1, Double value2) {
            addCriterion("medicine_Wholesale_Price between", value1, value2, "medicineWholesalePrice");
            return (Criteria) this;
        }

        public Criteria andMedicineWholesalePriceNotBetween(Double value1, Double value2) {
            addCriterion("medicine_Wholesale_Price not between", value1, value2, "medicineWholesalePrice");
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