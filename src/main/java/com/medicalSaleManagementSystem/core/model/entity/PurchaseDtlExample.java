package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.List;

public class PurchaseDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseDtlExample() {
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

        public Criteria andPurDtlIdIsNull() {
            addCriterion("pur_Dtl_id is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdIsNotNull() {
            addCriterion("pur_Dtl_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdEqualTo(Integer value) {
            addCriterion("pur_Dtl_id =", value, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdNotEqualTo(Integer value) {
            addCriterion("pur_Dtl_id <>", value, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdGreaterThan(Integer value) {
            addCriterion("pur_Dtl_id >", value, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pur_Dtl_id >=", value, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdLessThan(Integer value) {
            addCriterion("pur_Dtl_id <", value, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdLessThanOrEqualTo(Integer value) {
            addCriterion("pur_Dtl_id <=", value, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdIn(List<Integer> values) {
            addCriterion("pur_Dtl_id in", values, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdNotIn(List<Integer> values) {
            addCriterion("pur_Dtl_id not in", values, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdBetween(Integer value1, Integer value2) {
            addCriterion("pur_Dtl_id between", value1, value2, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pur_Dtl_id not between", value1, value2, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdIsNull() {
            addCriterion("pur_Dtl_Order_Id is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdIsNotNull() {
            addCriterion("pur_Dtl_Order_Id is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdEqualTo(String value) {
            addCriterion("pur_Dtl_Order_Id =", value, "purDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdNotEqualTo(String value) {
            addCriterion("pur_Dtl_Order_Id <>", value, "purDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdGreaterThan(String value) {
            addCriterion("pur_Dtl_Order_Id >", value, "purDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_Order_Id >=", value, "purDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdLessThan(String value) {
            addCriterion("pur_Dtl_Order_Id <", value, "purDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdLessThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_Order_Id <=", value, "purDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdLike(String value) {
            addCriterion("pur_Dtl_Order_Id like", value, "purDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdNotLike(String value) {
            addCriterion("pur_Dtl_Order_Id not like", value, "purDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdIn(List<String> values) {
            addCriterion("pur_Dtl_Order_Id in", values, "purDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdNotIn(List<String> values) {
            addCriterion("pur_Dtl_Order_Id not in", values, "purDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdBetween(String value1, String value2) {
            addCriterion("pur_Dtl_Order_Id between", value1, value2, "purDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderIdNotBetween(String value1, String value2) {
            addCriterion("pur_Dtl_Order_Id not between", value1, value2, "purDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIsNull() {
            addCriterion("pur_Order_Id is null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIsNotNull() {
            addCriterion("pur_Order_Id is not null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdEqualTo(String value) {
            addCriterion("pur_Order_Id =", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotEqualTo(String value) {
            addCriterion("pur_Order_Id <>", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThan(String value) {
            addCriterion("pur_Order_Id >", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("pur_Order_Id >=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThan(String value) {
            addCriterion("pur_Order_Id <", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThanOrEqualTo(String value) {
            addCriterion("pur_Order_Id <=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLike(String value) {
            addCriterion("pur_Order_Id like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotLike(String value) {
            addCriterion("pur_Order_Id not like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIn(List<String> values) {
            addCriterion("pur_Order_Id in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotIn(List<String> values) {
            addCriterion("pur_Order_Id not in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdBetween(String value1, String value2) {
            addCriterion("pur_Order_Id between", value1, value2, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotBetween(String value1, String value2) {
            addCriterion("pur_Order_Id not between", value1, value2, "purOrderId");
            return (Criteria) this;
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

        public Criteria andPurDtlAmountIsNull() {
            addCriterion("pur_Dtl_Amount is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlAmountIsNotNull() {
            addCriterion("pur_Dtl_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlAmountEqualTo(Integer value) {
            addCriterion("pur_Dtl_Amount =", value, "purDtlAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlAmountNotEqualTo(Integer value) {
            addCriterion("pur_Dtl_Amount <>", value, "purDtlAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlAmountGreaterThan(Integer value) {
            addCriterion("pur_Dtl_Amount >", value, "purDtlAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pur_Dtl_Amount >=", value, "purDtlAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlAmountLessThan(Integer value) {
            addCriterion("pur_Dtl_Amount <", value, "purDtlAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlAmountLessThanOrEqualTo(Integer value) {
            addCriterion("pur_Dtl_Amount <=", value, "purDtlAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlAmountIn(List<Integer> values) {
            addCriterion("pur_Dtl_Amount in", values, "purDtlAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlAmountNotIn(List<Integer> values) {
            addCriterion("pur_Dtl_Amount not in", values, "purDtlAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlAmountBetween(Integer value1, Integer value2) {
            addCriterion("pur_Dtl_Amount between", value1, value2, "purDtlAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("pur_Dtl_Amount not between", value1, value2, "purDtlAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlPriceIsNull() {
            addCriterion("pur_Dtl_Price is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlPriceIsNotNull() {
            addCriterion("pur_Dtl_Price is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlPriceEqualTo(Double value) {
            addCriterion("pur_Dtl_Price =", value, "purDtlPrice");
            return (Criteria) this;
        }

        public Criteria andPurDtlPriceNotEqualTo(Double value) {
            addCriterion("pur_Dtl_Price <>", value, "purDtlPrice");
            return (Criteria) this;
        }

        public Criteria andPurDtlPriceGreaterThan(Double value) {
            addCriterion("pur_Dtl_Price >", value, "purDtlPrice");
            return (Criteria) this;
        }

        public Criteria andPurDtlPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pur_Dtl_Price >=", value, "purDtlPrice");
            return (Criteria) this;
        }

        public Criteria andPurDtlPriceLessThan(Double value) {
            addCriterion("pur_Dtl_Price <", value, "purDtlPrice");
            return (Criteria) this;
        }

        public Criteria andPurDtlPriceLessThanOrEqualTo(Double value) {
            addCriterion("pur_Dtl_Price <=", value, "purDtlPrice");
            return (Criteria) this;
        }

        public Criteria andPurDtlPriceIn(List<Double> values) {
            addCriterion("pur_Dtl_Price in", values, "purDtlPrice");
            return (Criteria) this;
        }

        public Criteria andPurDtlPriceNotIn(List<Double> values) {
            addCriterion("pur_Dtl_Price not in", values, "purDtlPrice");
            return (Criteria) this;
        }

        public Criteria andPurDtlPriceBetween(Double value1, Double value2) {
            addCriterion("pur_Dtl_Price between", value1, value2, "purDtlPrice");
            return (Criteria) this;
        }

        public Criteria andPurDtlPriceNotBetween(Double value1, Double value2) {
            addCriterion("pur_Dtl_Price not between", value1, value2, "purDtlPrice");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIsNull() {
            addCriterion("pur_Dtl_Status is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIsNotNull() {
            addCriterion("pur_Dtl_Status is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusEqualTo(String value) {
            addCriterion("pur_Dtl_Status =", value, "purDtlStatus");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNotEqualTo(String value) {
            addCriterion("pur_Dtl_Status <>", value, "purDtlStatus");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusGreaterThan(String value) {
            addCriterion("pur_Dtl_Status >", value, "purDtlStatus");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_Status >=", value, "purDtlStatus");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusLessThan(String value) {
            addCriterion("pur_Dtl_Status <", value, "purDtlStatus");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusLessThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_Status <=", value, "purDtlStatus");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusLike(String value) {
            addCriterion("pur_Dtl_Status like", value, "purDtlStatus");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNotLike(String value) {
            addCriterion("pur_Dtl_Status not like", value, "purDtlStatus");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIn(List<String> values) {
            addCriterion("pur_Dtl_Status in", values, "purDtlStatus");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNotIn(List<String> values) {
            addCriterion("pur_Dtl_Status not in", values, "purDtlStatus");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusBetween(String value1, String value2) {
            addCriterion("pur_Dtl_Status between", value1, value2, "purDtlStatus");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNotBetween(String value1, String value2) {
            addCriterion("pur_Dtl_Status not between", value1, value2, "purDtlStatus");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkIsNull() {
            addCriterion("pur_Dtl_Remark is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkIsNotNull() {
            addCriterion("pur_Dtl_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkEqualTo(String value) {
            addCriterion("pur_Dtl_Remark =", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkNotEqualTo(String value) {
            addCriterion("pur_Dtl_Remark <>", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkGreaterThan(String value) {
            addCriterion("pur_Dtl_Remark >", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_Remark >=", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkLessThan(String value) {
            addCriterion("pur_Dtl_Remark <", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkLessThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_Remark <=", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkLike(String value) {
            addCriterion("pur_Dtl_Remark like", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkNotLike(String value) {
            addCriterion("pur_Dtl_Remark not like", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkIn(List<String> values) {
            addCriterion("pur_Dtl_Remark in", values, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkNotIn(List<String> values) {
            addCriterion("pur_Dtl_Remark not in", values, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkBetween(String value1, String value2) {
            addCriterion("pur_Dtl_Remark between", value1, value2, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkNotBetween(String value1, String value2) {
            addCriterion("pur_Dtl_Remark not between", value1, value2, "purDtlRemark");
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