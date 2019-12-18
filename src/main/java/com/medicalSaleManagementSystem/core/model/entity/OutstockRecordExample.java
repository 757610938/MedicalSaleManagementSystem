package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutstockRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutstockRecordExample() {
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

        public Criteria andOutstockIdIsNull() {
            addCriterion("outstock_id is null");
            return (Criteria) this;
        }

        public Criteria andOutstockIdIsNotNull() {
            addCriterion("outstock_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockIdEqualTo(Integer value) {
            addCriterion("outstock_id =", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdNotEqualTo(Integer value) {
            addCriterion("outstock_id <>", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdGreaterThan(Integer value) {
            addCriterion("outstock_id >", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("outstock_id >=", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdLessThan(Integer value) {
            addCriterion("outstock_id <", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdLessThanOrEqualTo(Integer value) {
            addCriterion("outstock_id <=", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdIn(List<Integer> values) {
            addCriterion("outstock_id in", values, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdNotIn(List<Integer> values) {
            addCriterion("outstock_id not in", values, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdBetween(Integer value1, Integer value2) {
            addCriterion("outstock_id between", value1, value2, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("outstock_id not between", value1, value2, "outstockId");
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

        public Criteria andOutstockCategoryIsNull() {
            addCriterion("outstock_Category is null");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryIsNotNull() {
            addCriterion("outstock_Category is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryEqualTo(String value) {
            addCriterion("outstock_Category =", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryNotEqualTo(String value) {
            addCriterion("outstock_Category <>", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryGreaterThan(String value) {
            addCriterion("outstock_Category >", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("outstock_Category >=", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryLessThan(String value) {
            addCriterion("outstock_Category <", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryLessThanOrEqualTo(String value) {
            addCriterion("outstock_Category <=", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryLike(String value) {
            addCriterion("outstock_Category like", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryNotLike(String value) {
            addCriterion("outstock_Category not like", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryIn(List<String> values) {
            addCriterion("outstock_Category in", values, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryNotIn(List<String> values) {
            addCriterion("outstock_Category not in", values, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryBetween(String value1, String value2) {
            addCriterion("outstock_Category between", value1, value2, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryNotBetween(String value1, String value2) {
            addCriterion("outstock_Category not between", value1, value2, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeIsNull() {
            addCriterion("outstock_Time is null");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeIsNotNull() {
            addCriterion("outstock_Time is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeEqualTo(Date value) {
            addCriterion("outstock_Time =", value, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeNotEqualTo(Date value) {
            addCriterion("outstock_Time <>", value, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeGreaterThan(Date value) {
            addCriterion("outstock_Time >", value, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("outstock_Time >=", value, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeLessThan(Date value) {
            addCriterion("outstock_Time <", value, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeLessThanOrEqualTo(Date value) {
            addCriterion("outstock_Time <=", value, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeIn(List<Date> values) {
            addCriterion("outstock_Time in", values, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeNotIn(List<Date> values) {
            addCriterion("outstock_Time not in", values, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeBetween(Date value1, Date value2) {
            addCriterion("outstock_Time between", value1, value2, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeNotBetween(Date value1, Date value2) {
            addCriterion("outstock_Time not between", value1, value2, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNull() {
            addCriterion("user_Number is null");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNotNull() {
            addCriterion("user_Number is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumberEqualTo(String value) {
            addCriterion("user_Number =", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotEqualTo(String value) {
            addCriterion("user_Number <>", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThan(String value) {
            addCriterion("user_Number >", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_Number >=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThan(String value) {
            addCriterion("user_Number <", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThanOrEqualTo(String value) {
            addCriterion("user_Number <=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLike(String value) {
            addCriterion("user_Number like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotLike(String value) {
            addCriterion("user_Number not like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberIn(List<String> values) {
            addCriterion("user_Number in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotIn(List<String> values) {
            addCriterion("user_Number not in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberBetween(String value1, String value2) {
            addCriterion("user_Number between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotBetween(String value1, String value2) {
            addCriterion("user_Number not between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkIsNull() {
            addCriterion("outstock_Remark is null");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkIsNotNull() {
            addCriterion("outstock_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkEqualTo(String value) {
            addCriterion("outstock_Remark =", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkNotEqualTo(String value) {
            addCriterion("outstock_Remark <>", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkGreaterThan(String value) {
            addCriterion("outstock_Remark >", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("outstock_Remark >=", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkLessThan(String value) {
            addCriterion("outstock_Remark <", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkLessThanOrEqualTo(String value) {
            addCriterion("outstock_Remark <=", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkLike(String value) {
            addCriterion("outstock_Remark like", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkNotLike(String value) {
            addCriterion("outstock_Remark not like", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkIn(List<String> values) {
            addCriterion("outstock_Remark in", values, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkNotIn(List<String> values) {
            addCriterion("outstock_Remark not in", values, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkBetween(String value1, String value2) {
            addCriterion("outstock_Remark between", value1, value2, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkNotBetween(String value1, String value2) {
            addCriterion("outstock_Remark not between", value1, value2, "outstockRemark");
            return (Criteria) this;
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