package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.List;

public class OutstockDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutstockDtlExample() {
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

        public Criteria andOutstockDtlIdIsNull() {
            addCriterion("outstock_Dtl_id is null");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlIdIsNotNull() {
            addCriterion("outstock_Dtl_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlIdEqualTo(Integer value) {
            addCriterion("outstock_Dtl_id =", value, "outstockDtlId");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlIdNotEqualTo(Integer value) {
            addCriterion("outstock_Dtl_id <>", value, "outstockDtlId");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlIdGreaterThan(Integer value) {
            addCriterion("outstock_Dtl_id >", value, "outstockDtlId");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("outstock_Dtl_id >=", value, "outstockDtlId");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlIdLessThan(Integer value) {
            addCriterion("outstock_Dtl_id <", value, "outstockDtlId");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlIdLessThanOrEqualTo(Integer value) {
            addCriterion("outstock_Dtl_id <=", value, "outstockDtlId");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlIdIn(List<Integer> values) {
            addCriterion("outstock_Dtl_id in", values, "outstockDtlId");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlIdNotIn(List<Integer> values) {
            addCriterion("outstock_Dtl_id not in", values, "outstockDtlId");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlIdBetween(Integer value1, Integer value2) {
            addCriterion("outstock_Dtl_id between", value1, value2, "outstockDtlId");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("outstock_Dtl_id not between", value1, value2, "outstockDtlId");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberIsNull() {
            addCriterion("outstock_Dtl_Number is null");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberIsNotNull() {
            addCriterion("outstock_Dtl_Number is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberEqualTo(String value) {
            addCriterion("outstock_Dtl_Number =", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberNotEqualTo(String value) {
            addCriterion("outstock_Dtl_Number <>", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberGreaterThan(String value) {
            addCriterion("outstock_Dtl_Number >", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberGreaterThanOrEqualTo(String value) {
            addCriterion("outstock_Dtl_Number >=", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberLessThan(String value) {
            addCriterion("outstock_Dtl_Number <", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberLessThanOrEqualTo(String value) {
            addCriterion("outstock_Dtl_Number <=", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberLike(String value) {
            addCriterion("outstock_Dtl_Number like", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberNotLike(String value) {
            addCriterion("outstock_Dtl_Number not like", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberIn(List<String> values) {
            addCriterion("outstock_Dtl_Number in", values, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberNotIn(List<String> values) {
            addCriterion("outstock_Dtl_Number not in", values, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberBetween(String value1, String value2) {
            addCriterion("outstock_Dtl_Number between", value1, value2, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberNotBetween(String value1, String value2) {
            addCriterion("outstock_Dtl_Number not between", value1, value2, "outstockDtlNumber");
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

        public Criteria andOutstockAmountIsNull() {
            addCriterion("outstock_Amount is null");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountIsNotNull() {
            addCriterion("outstock_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountEqualTo(Integer value) {
            addCriterion("outstock_Amount =", value, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountNotEqualTo(Integer value) {
            addCriterion("outstock_Amount <>", value, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountGreaterThan(Integer value) {
            addCriterion("outstock_Amount >", value, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("outstock_Amount >=", value, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountLessThan(Integer value) {
            addCriterion("outstock_Amount <", value, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountLessThanOrEqualTo(Integer value) {
            addCriterion("outstock_Amount <=", value, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountIn(List<Integer> values) {
            addCriterion("outstock_Amount in", values, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountNotIn(List<Integer> values) {
            addCriterion("outstock_Amount not in", values, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountBetween(Integer value1, Integer value2) {
            addCriterion("outstock_Amount between", value1, value2, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("outstock_Amount not between", value1, value2, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andWhseIdIsNull() {
            addCriterion("whse_id is null");
            return (Criteria) this;
        }

        public Criteria andWhseIdIsNotNull() {
            addCriterion("whse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWhseIdEqualTo(Integer value) {
            addCriterion("whse_id =", value, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdNotEqualTo(Integer value) {
            addCriterion("whse_id <>", value, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdGreaterThan(Integer value) {
            addCriterion("whse_id >", value, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("whse_id >=", value, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdLessThan(Integer value) {
            addCriterion("whse_id <", value, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdLessThanOrEqualTo(Integer value) {
            addCriterion("whse_id <=", value, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdIn(List<Integer> values) {
            addCriterion("whse_id in", values, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdNotIn(List<Integer> values) {
            addCriterion("whse_id not in", values, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdBetween(Integer value1, Integer value2) {
            addCriterion("whse_id between", value1, value2, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("whse_id not between", value1, value2, "whseId");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberIsNull() {
            addCriterion("outstock_Number is null");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberIsNotNull() {
            addCriterion("outstock_Number is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberEqualTo(String value) {
            addCriterion("outstock_Number =", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberNotEqualTo(String value) {
            addCriterion("outstock_Number <>", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberGreaterThan(String value) {
            addCriterion("outstock_Number >", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberGreaterThanOrEqualTo(String value) {
            addCriterion("outstock_Number >=", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberLessThan(String value) {
            addCriterion("outstock_Number <", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberLessThanOrEqualTo(String value) {
            addCriterion("outstock_Number <=", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberLike(String value) {
            addCriterion("outstock_Number like", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberNotLike(String value) {
            addCriterion("outstock_Number not like", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberIn(List<String> values) {
            addCriterion("outstock_Number in", values, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberNotIn(List<String> values) {
            addCriterion("outstock_Number not in", values, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberBetween(String value1, String value2) {
            addCriterion("outstock_Number between", value1, value2, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberNotBetween(String value1, String value2) {
            addCriterion("outstock_Number not between", value1, value2, "outstockNumber");
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