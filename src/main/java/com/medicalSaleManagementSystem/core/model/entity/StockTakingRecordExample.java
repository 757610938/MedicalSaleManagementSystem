package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockTakingRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockTakingRecordExample() {
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

        public Criteria andStockTakingIdIsNull() {
            addCriterion("stock_Taking_id is null");
            return (Criteria) this;
        }

        public Criteria andStockTakingIdIsNotNull() {
            addCriterion("stock_Taking_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockTakingIdEqualTo(Integer value) {
            addCriterion("stock_Taking_id =", value, "stockTakingId");
            return (Criteria) this;
        }

        public Criteria andStockTakingIdNotEqualTo(Integer value) {
            addCriterion("stock_Taking_id <>", value, "stockTakingId");
            return (Criteria) this;
        }

        public Criteria andStockTakingIdGreaterThan(Integer value) {
            addCriterion("stock_Taking_id >", value, "stockTakingId");
            return (Criteria) this;
        }

        public Criteria andStockTakingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_Taking_id >=", value, "stockTakingId");
            return (Criteria) this;
        }

        public Criteria andStockTakingIdLessThan(Integer value) {
            addCriterion("stock_Taking_id <", value, "stockTakingId");
            return (Criteria) this;
        }

        public Criteria andStockTakingIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_Taking_id <=", value, "stockTakingId");
            return (Criteria) this;
        }

        public Criteria andStockTakingIdIn(List<Integer> values) {
            addCriterion("stock_Taking_id in", values, "stockTakingId");
            return (Criteria) this;
        }

        public Criteria andStockTakingIdNotIn(List<Integer> values) {
            addCriterion("stock_Taking_id not in", values, "stockTakingId");
            return (Criteria) this;
        }

        public Criteria andStockTakingIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_Taking_id between", value1, value2, "stockTakingId");
            return (Criteria) this;
        }

        public Criteria andStockTakingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_Taking_id not between", value1, value2, "stockTakingId");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberIsNull() {
            addCriterion("stock_Taking_Number is null");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberIsNotNull() {
            addCriterion("stock_Taking_Number is not null");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberEqualTo(String value) {
            addCriterion("stock_Taking_Number =", value, "stockTakingNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberNotEqualTo(String value) {
            addCriterion("stock_Taking_Number <>", value, "stockTakingNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberGreaterThan(String value) {
            addCriterion("stock_Taking_Number >", value, "stockTakingNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberGreaterThanOrEqualTo(String value) {
            addCriterion("stock_Taking_Number >=", value, "stockTakingNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberLessThan(String value) {
            addCriterion("stock_Taking_Number <", value, "stockTakingNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberLessThanOrEqualTo(String value) {
            addCriterion("stock_Taking_Number <=", value, "stockTakingNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberLike(String value) {
            addCriterion("stock_Taking_Number like", value, "stockTakingNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberNotLike(String value) {
            addCriterion("stock_Taking_Number not like", value, "stockTakingNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberIn(List<String> values) {
            addCriterion("stock_Taking_Number in", values, "stockTakingNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberNotIn(List<String> values) {
            addCriterion("stock_Taking_Number not in", values, "stockTakingNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberBetween(String value1, String value2) {
            addCriterion("stock_Taking_Number between", value1, value2, "stockTakingNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingNumberNotBetween(String value1, String value2) {
            addCriterion("stock_Taking_Number not between", value1, value2, "stockTakingNumber");
            return (Criteria) this;
        }

        public Criteria andTakingTimerIsNull() {
            addCriterion("taking_Timer is null");
            return (Criteria) this;
        }

        public Criteria andTakingTimerIsNotNull() {
            addCriterion("taking_Timer is not null");
            return (Criteria) this;
        }

        public Criteria andTakingTimerEqualTo(Date value) {
            addCriterion("taking_Timer =", value, "takingTimer");
            return (Criteria) this;
        }

        public Criteria andTakingTimerNotEqualTo(Date value) {
            addCriterion("taking_Timer <>", value, "takingTimer");
            return (Criteria) this;
        }

        public Criteria andTakingTimerGreaterThan(Date value) {
            addCriterion("taking_Timer >", value, "takingTimer");
            return (Criteria) this;
        }

        public Criteria andTakingTimerGreaterThanOrEqualTo(Date value) {
            addCriterion("taking_Timer >=", value, "takingTimer");
            return (Criteria) this;
        }

        public Criteria andTakingTimerLessThan(Date value) {
            addCriterion("taking_Timer <", value, "takingTimer");
            return (Criteria) this;
        }

        public Criteria andTakingTimerLessThanOrEqualTo(Date value) {
            addCriterion("taking_Timer <=", value, "takingTimer");
            return (Criteria) this;
        }

        public Criteria andTakingTimerIn(List<Date> values) {
            addCriterion("taking_Timer in", values, "takingTimer");
            return (Criteria) this;
        }

        public Criteria andTakingTimerNotIn(List<Date> values) {
            addCriterion("taking_Timer not in", values, "takingTimer");
            return (Criteria) this;
        }

        public Criteria andTakingTimerBetween(Date value1, Date value2) {
            addCriterion("taking_Timer between", value1, value2, "takingTimer");
            return (Criteria) this;
        }

        public Criteria andTakingTimerNotBetween(Date value1, Date value2) {
            addCriterion("taking_Timer not between", value1, value2, "takingTimer");
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

        public Criteria andTakingRemarkIsNull() {
            addCriterion("taking_Remark is null");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkIsNotNull() {
            addCriterion("taking_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkEqualTo(String value) {
            addCriterion("taking_Remark =", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkNotEqualTo(String value) {
            addCriterion("taking_Remark <>", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkGreaterThan(String value) {
            addCriterion("taking_Remark >", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("taking_Remark >=", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkLessThan(String value) {
            addCriterion("taking_Remark <", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkLessThanOrEqualTo(String value) {
            addCriterion("taking_Remark <=", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkLike(String value) {
            addCriterion("taking_Remark like", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkNotLike(String value) {
            addCriterion("taking_Remark not like", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkIn(List<String> values) {
            addCriterion("taking_Remark in", values, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkNotIn(List<String> values) {
            addCriterion("taking_Remark not in", values, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkBetween(String value1, String value2) {
            addCriterion("taking_Remark between", value1, value2, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkNotBetween(String value1, String value2) {
            addCriterion("taking_Remark not between", value1, value2, "takingRemark");
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

        public Criteria andStockTakingDtlIdIsNull() {
            addCriterion("stock_Taking_Dtl_id is null");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdIsNotNull() {
            addCriterion("stock_Taking_Dtl_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdEqualTo(String value) {
            addCriterion("stock_Taking_Dtl_id =", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdNotEqualTo(String value) {
            addCriterion("stock_Taking_Dtl_id <>", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdGreaterThan(String value) {
            addCriterion("stock_Taking_Dtl_id >", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdGreaterThanOrEqualTo(String value) {
            addCriterion("stock_Taking_Dtl_id >=", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdLessThan(String value) {
            addCriterion("stock_Taking_Dtl_id <", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdLessThanOrEqualTo(String value) {
            addCriterion("stock_Taking_Dtl_id <=", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdLike(String value) {
            addCriterion("stock_Taking_Dtl_id like", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdNotLike(String value) {
            addCriterion("stock_Taking_Dtl_id not like", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdIn(List<String> values) {
            addCriterion("stock_Taking_Dtl_id in", values, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdNotIn(List<String> values) {
            addCriterion("stock_Taking_Dtl_id not in", values, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdBetween(String value1, String value2) {
            addCriterion("stock_Taking_Dtl_id between", value1, value2, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdNotBetween(String value1, String value2) {
            addCriterion("stock_Taking_Dtl_id not between", value1, value2, "stockTakingDtlId");
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