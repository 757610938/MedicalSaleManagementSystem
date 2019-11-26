package com.medicalSaleManagementSystem.core.bean.entity;

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

        public Criteria andSaleDtlOrderidIsNull() {
            addCriterion("sale_Dtl_OrderId is null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidIsNotNull() {
            addCriterion("sale_Dtl_OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidEqualTo(String value) {
            addCriterion("sale_Dtl_OrderId =", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidNotEqualTo(String value) {
            addCriterion("sale_Dtl_OrderId <>", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidGreaterThan(String value) {
            addCriterion("sale_Dtl_OrderId >", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("sale_Dtl_OrderId >=", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidLessThan(String value) {
            addCriterion("sale_Dtl_OrderId <", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidLessThanOrEqualTo(String value) {
            addCriterion("sale_Dtl_OrderId <=", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidLike(String value) {
            addCriterion("sale_Dtl_OrderId like", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidNotLike(String value) {
            addCriterion("sale_Dtl_OrderId not like", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidIn(List<String> values) {
            addCriterion("sale_Dtl_OrderId in", values, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidNotIn(List<String> values) {
            addCriterion("sale_Dtl_OrderId not in", values, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidBetween(String value1, String value2) {
            addCriterion("sale_Dtl_OrderId between", value1, value2, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidNotBetween(String value1, String value2) {
            addCriterion("sale_Dtl_OrderId not between", value1, value2, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidIsNull() {
            addCriterion("sale_OrderId is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidIsNotNull() {
            addCriterion("sale_OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidEqualTo(String value) {
            addCriterion("sale_OrderId =", value, "saleOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidNotEqualTo(String value) {
            addCriterion("sale_OrderId <>", value, "saleOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidGreaterThan(String value) {
            addCriterion("sale_OrderId >", value, "saleOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("sale_OrderId >=", value, "saleOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidLessThan(String value) {
            addCriterion("sale_OrderId <", value, "saleOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidLessThanOrEqualTo(String value) {
            addCriterion("sale_OrderId <=", value, "saleOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidLike(String value) {
            addCriterion("sale_OrderId like", value, "saleOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidNotLike(String value) {
            addCriterion("sale_OrderId not like", value, "saleOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidIn(List<String> values) {
            addCriterion("sale_OrderId in", values, "saleOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidNotIn(List<String> values) {
            addCriterion("sale_OrderId not in", values, "saleOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidBetween(String value1, String value2) {
            addCriterion("sale_OrderId between", value1, value2, "saleOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleOrderidNotBetween(String value1, String value2) {
            addCriterion("sale_OrderId not between", value1, value2, "saleOrderid");
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