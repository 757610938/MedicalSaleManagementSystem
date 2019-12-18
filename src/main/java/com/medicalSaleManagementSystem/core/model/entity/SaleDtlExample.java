package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.List;

public class SaleDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleDtlExample() {
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

        public Criteria andSaleDtlIdIsNull() {
            addCriterion("sale_Dtl_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlIdIsNotNull() {
            addCriterion("sale_Dtl_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlIdEqualTo(Integer value) {
            addCriterion("sale_Dtl_id =", value, "saleDtlId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlIdNotEqualTo(Integer value) {
            addCriterion("sale_Dtl_id <>", value, "saleDtlId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlIdGreaterThan(Integer value) {
            addCriterion("sale_Dtl_id >", value, "saleDtlId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_Dtl_id >=", value, "saleDtlId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlIdLessThan(Integer value) {
            addCriterion("sale_Dtl_id <", value, "saleDtlId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_Dtl_id <=", value, "saleDtlId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlIdIn(List<Integer> values) {
            addCriterion("sale_Dtl_id in", values, "saleDtlId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlIdNotIn(List<Integer> values) {
            addCriterion("sale_Dtl_id not in", values, "saleDtlId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_Dtl_id between", value1, value2, "saleDtlId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_Dtl_id not between", value1, value2, "saleDtlId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdIsNull() {
            addCriterion("sale_Dtl_Order_Id is null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdIsNotNull() {
            addCriterion("sale_Dtl_Order_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdEqualTo(String value) {
            addCriterion("sale_Dtl_Order_Id =", value, "saleDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdNotEqualTo(String value) {
            addCriterion("sale_Dtl_Order_Id <>", value, "saleDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdGreaterThan(String value) {
            addCriterion("sale_Dtl_Order_Id >", value, "saleDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("sale_Dtl_Order_Id >=", value, "saleDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdLessThan(String value) {
            addCriterion("sale_Dtl_Order_Id <", value, "saleDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdLessThanOrEqualTo(String value) {
            addCriterion("sale_Dtl_Order_Id <=", value, "saleDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdLike(String value) {
            addCriterion("sale_Dtl_Order_Id like", value, "saleDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdNotLike(String value) {
            addCriterion("sale_Dtl_Order_Id not like", value, "saleDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdIn(List<String> values) {
            addCriterion("sale_Dtl_Order_Id in", values, "saleDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdNotIn(List<String> values) {
            addCriterion("sale_Dtl_Order_Id not in", values, "saleDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdBetween(String value1, String value2) {
            addCriterion("sale_Dtl_Order_Id between", value1, value2, "saleDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderIdNotBetween(String value1, String value2) {
            addCriterion("sale_Dtl_Order_Id not between", value1, value2, "saleDtlOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdIsNull() {
            addCriterion("sale_Order_Id is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdIsNotNull() {
            addCriterion("sale_Order_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdEqualTo(String value) {
            addCriterion("sale_Order_Id =", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotEqualTo(String value) {
            addCriterion("sale_Order_Id <>", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdGreaterThan(String value) {
            addCriterion("sale_Order_Id >", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("sale_Order_Id >=", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdLessThan(String value) {
            addCriterion("sale_Order_Id <", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdLessThanOrEqualTo(String value) {
            addCriterion("sale_Order_Id <=", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdLike(String value) {
            addCriterion("sale_Order_Id like", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotLike(String value) {
            addCriterion("sale_Order_Id not like", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdIn(List<String> values) {
            addCriterion("sale_Order_Id in", values, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotIn(List<String> values) {
            addCriterion("sale_Order_Id not in", values, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdBetween(String value1, String value2) {
            addCriterion("sale_Order_Id between", value1, value2, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotBetween(String value1, String value2) {
            addCriterion("sale_Order_Id not between", value1, value2, "saleOrderId");
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

        public Criteria andSaleDtlPriceIsNull() {
            addCriterion("sale_Dtl_Price is null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlPriceIsNotNull() {
            addCriterion("sale_Dtl_Price is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlPriceEqualTo(Double value) {
            addCriterion("sale_Dtl_Price =", value, "saleDtlPrice");
            return (Criteria) this;
        }

        public Criteria andSaleDtlPriceNotEqualTo(Double value) {
            addCriterion("sale_Dtl_Price <>", value, "saleDtlPrice");
            return (Criteria) this;
        }

        public Criteria andSaleDtlPriceGreaterThan(Double value) {
            addCriterion("sale_Dtl_Price >", value, "saleDtlPrice");
            return (Criteria) this;
        }

        public Criteria andSaleDtlPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_Dtl_Price >=", value, "saleDtlPrice");
            return (Criteria) this;
        }

        public Criteria andSaleDtlPriceLessThan(Double value) {
            addCriterion("sale_Dtl_Price <", value, "saleDtlPrice");
            return (Criteria) this;
        }

        public Criteria andSaleDtlPriceLessThanOrEqualTo(Double value) {
            addCriterion("sale_Dtl_Price <=", value, "saleDtlPrice");
            return (Criteria) this;
        }

        public Criteria andSaleDtlPriceIn(List<Double> values) {
            addCriterion("sale_Dtl_Price in", values, "saleDtlPrice");
            return (Criteria) this;
        }

        public Criteria andSaleDtlPriceNotIn(List<Double> values) {
            addCriterion("sale_Dtl_Price not in", values, "saleDtlPrice");
            return (Criteria) this;
        }

        public Criteria andSaleDtlPriceBetween(Double value1, Double value2) {
            addCriterion("sale_Dtl_Price between", value1, value2, "saleDtlPrice");
            return (Criteria) this;
        }

        public Criteria andSaleDtlPriceNotBetween(Double value1, Double value2) {
            addCriterion("sale_Dtl_Price not between", value1, value2, "saleDtlPrice");
            return (Criteria) this;
        }

        public Criteria andSaleDtlTotalAmountIsNull() {
            addCriterion("sale_Dtl_Total_Amount is null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlTotalAmountIsNotNull() {
            addCriterion("sale_Dtl_Total_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlTotalAmountEqualTo(Integer value) {
            addCriterion("sale_Dtl_Total_Amount =", value, "saleDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlTotalAmountNotEqualTo(Integer value) {
            addCriterion("sale_Dtl_Total_Amount <>", value, "saleDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlTotalAmountGreaterThan(Integer value) {
            addCriterion("sale_Dtl_Total_Amount >", value, "saleDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlTotalAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_Dtl_Total_Amount >=", value, "saleDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlTotalAmountLessThan(Integer value) {
            addCriterion("sale_Dtl_Total_Amount <", value, "saleDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlTotalAmountLessThanOrEqualTo(Integer value) {
            addCriterion("sale_Dtl_Total_Amount <=", value, "saleDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlTotalAmountIn(List<Integer> values) {
            addCriterion("sale_Dtl_Total_Amount in", values, "saleDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlTotalAmountNotIn(List<Integer> values) {
            addCriterion("sale_Dtl_Total_Amount not in", values, "saleDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlTotalAmountBetween(Integer value1, Integer value2) {
            addCriterion("sale_Dtl_Total_Amount between", value1, value2, "saleDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlTotalAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_Dtl_Total_Amount not between", value1, value2, "saleDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIsNull() {
            addCriterion("sale_Dtl_Status is null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIsNotNull() {
            addCriterion("sale_Dtl_Status is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusEqualTo(String value) {
            addCriterion("sale_Dtl_Status =", value, "saleDtlStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNotEqualTo(String value) {
            addCriterion("sale_Dtl_Status <>", value, "saleDtlStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusGreaterThan(String value) {
            addCriterion("sale_Dtl_Status >", value, "saleDtlStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sale_Dtl_Status >=", value, "saleDtlStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusLessThan(String value) {
            addCriterion("sale_Dtl_Status <", value, "saleDtlStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusLessThanOrEqualTo(String value) {
            addCriterion("sale_Dtl_Status <=", value, "saleDtlStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusLike(String value) {
            addCriterion("sale_Dtl_Status like", value, "saleDtlStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNotLike(String value) {
            addCriterion("sale_Dtl_Status not like", value, "saleDtlStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIn(List<String> values) {
            addCriterion("sale_Dtl_Status in", values, "saleDtlStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNotIn(List<String> values) {
            addCriterion("sale_Dtl_Status not in", values, "saleDtlStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusBetween(String value1, String value2) {
            addCriterion("sale_Dtl_Status between", value1, value2, "saleDtlStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNotBetween(String value1, String value2) {
            addCriterion("sale_Dtl_Status not between", value1, value2, "saleDtlStatus");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkIsNull() {
            addCriterion("sale_Dtl_Remark is null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkIsNotNull() {
            addCriterion("sale_Dtl_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkEqualTo(String value) {
            addCriterion("sale_Dtl_Remark =", value, "saleDtlRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkNotEqualTo(String value) {
            addCriterion("sale_Dtl_Remark <>", value, "saleDtlRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkGreaterThan(String value) {
            addCriterion("sale_Dtl_Remark >", value, "saleDtlRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sale_Dtl_Remark >=", value, "saleDtlRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkLessThan(String value) {
            addCriterion("sale_Dtl_Remark <", value, "saleDtlRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkLessThanOrEqualTo(String value) {
            addCriterion("sale_Dtl_Remark <=", value, "saleDtlRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkLike(String value) {
            addCriterion("sale_Dtl_Remark like", value, "saleDtlRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkNotLike(String value) {
            addCriterion("sale_Dtl_Remark not like", value, "saleDtlRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkIn(List<String> values) {
            addCriterion("sale_Dtl_Remark in", values, "saleDtlRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkNotIn(List<String> values) {
            addCriterion("sale_Dtl_Remark not in", values, "saleDtlRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkBetween(String value1, String value2) {
            addCriterion("sale_Dtl_Remark between", value1, value2, "saleDtlRemark");
            return (Criteria) this;
        }

        public Criteria andSaleDtlRemarkNotBetween(String value1, String value2) {
            addCriterion("sale_Dtl_Remark not between", value1, value2, "saleDtlRemark");
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