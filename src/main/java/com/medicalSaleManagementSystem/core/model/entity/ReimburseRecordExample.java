package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReimburseRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReimburseRecordExample() {
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

        public Criteria andReimburseIdIsNull() {
            addCriterion("reimburse_id is null");
            return (Criteria) this;
        }

        public Criteria andReimburseIdIsNotNull() {
            addCriterion("reimburse_id is not null");
            return (Criteria) this;
        }

        public Criteria andReimburseIdEqualTo(Integer value) {
            addCriterion("reimburse_id =", value, "reimburseId");
            return (Criteria) this;
        }

        public Criteria andReimburseIdNotEqualTo(Integer value) {
            addCriterion("reimburse_id <>", value, "reimburseId");
            return (Criteria) this;
        }

        public Criteria andReimburseIdGreaterThan(Integer value) {
            addCriterion("reimburse_id >", value, "reimburseId");
            return (Criteria) this;
        }

        public Criteria andReimburseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reimburse_id >=", value, "reimburseId");
            return (Criteria) this;
        }

        public Criteria andReimburseIdLessThan(Integer value) {
            addCriterion("reimburse_id <", value, "reimburseId");
            return (Criteria) this;
        }

        public Criteria andReimburseIdLessThanOrEqualTo(Integer value) {
            addCriterion("reimburse_id <=", value, "reimburseId");
            return (Criteria) this;
        }

        public Criteria andReimburseIdIn(List<Integer> values) {
            addCriterion("reimburse_id in", values, "reimburseId");
            return (Criteria) this;
        }

        public Criteria andReimburseIdNotIn(List<Integer> values) {
            addCriterion("reimburse_id not in", values, "reimburseId");
            return (Criteria) this;
        }

        public Criteria andReimburseIdBetween(Integer value1, Integer value2) {
            addCriterion("reimburse_id between", value1, value2, "reimburseId");
            return (Criteria) this;
        }

        public Criteria andReimburseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reimburse_id not between", value1, value2, "reimburseId");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberIsNull() {
            addCriterion("reimburse_Number is null");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberIsNotNull() {
            addCriterion("reimburse_Number is not null");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberEqualTo(String value) {
            addCriterion("reimburse_Number =", value, "reimburseNumber");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberNotEqualTo(String value) {
            addCriterion("reimburse_Number <>", value, "reimburseNumber");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberGreaterThan(String value) {
            addCriterion("reimburse_Number >", value, "reimburseNumber");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("reimburse_Number >=", value, "reimburseNumber");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberLessThan(String value) {
            addCriterion("reimburse_Number <", value, "reimburseNumber");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberLessThanOrEqualTo(String value) {
            addCriterion("reimburse_Number <=", value, "reimburseNumber");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberLike(String value) {
            addCriterion("reimburse_Number like", value, "reimburseNumber");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberNotLike(String value) {
            addCriterion("reimburse_Number not like", value, "reimburseNumber");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberIn(List<String> values) {
            addCriterion("reimburse_Number in", values, "reimburseNumber");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberNotIn(List<String> values) {
            addCriterion("reimburse_Number not in", values, "reimburseNumber");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberBetween(String value1, String value2) {
            addCriterion("reimburse_Number between", value1, value2, "reimburseNumber");
            return (Criteria) this;
        }

        public Criteria andReimburseNumberNotBetween(String value1, String value2) {
            addCriterion("reimburse_Number not between", value1, value2, "reimburseNumber");
            return (Criteria) this;
        }

        public Criteria andReimburseTimeIsNull() {
            addCriterion("reimburse_Time is null");
            return (Criteria) this;
        }

        public Criteria andReimburseTimeIsNotNull() {
            addCriterion("reimburse_Time is not null");
            return (Criteria) this;
        }

        public Criteria andReimburseTimeEqualTo(Date value) {
            addCriterion("reimburse_Time =", value, "reimburseTime");
            return (Criteria) this;
        }

        public Criteria andReimburseTimeNotEqualTo(Date value) {
            addCriterion("reimburse_Time <>", value, "reimburseTime");
            return (Criteria) this;
        }

        public Criteria andReimburseTimeGreaterThan(Date value) {
            addCriterion("reimburse_Time >", value, "reimburseTime");
            return (Criteria) this;
        }

        public Criteria andReimburseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reimburse_Time >=", value, "reimburseTime");
            return (Criteria) this;
        }

        public Criteria andReimburseTimeLessThan(Date value) {
            addCriterion("reimburse_Time <", value, "reimburseTime");
            return (Criteria) this;
        }

        public Criteria andReimburseTimeLessThanOrEqualTo(Date value) {
            addCriterion("reimburse_Time <=", value, "reimburseTime");
            return (Criteria) this;
        }

        public Criteria andReimburseTimeIn(List<Date> values) {
            addCriterion("reimburse_Time in", values, "reimburseTime");
            return (Criteria) this;
        }

        public Criteria andReimburseTimeNotIn(List<Date> values) {
            addCriterion("reimburse_Time not in", values, "reimburseTime");
            return (Criteria) this;
        }

        public Criteria andReimburseTimeBetween(Date value1, Date value2) {
            addCriterion("reimburse_Time between", value1, value2, "reimburseTime");
            return (Criteria) this;
        }

        public Criteria andReimburseTimeNotBetween(Date value1, Date value2) {
            addCriterion("reimburse_Time not between", value1, value2, "reimburseTime");
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

        public Criteria andReimburseRemarkIsNull() {
            addCriterion("reimburse_Remark is null");
            return (Criteria) this;
        }

        public Criteria andReimburseRemarkIsNotNull() {
            addCriterion("reimburse_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andReimburseRemarkEqualTo(String value) {
            addCriterion("reimburse_Remark =", value, "reimburseRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseRemarkNotEqualTo(String value) {
            addCriterion("reimburse_Remark <>", value, "reimburseRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseRemarkGreaterThan(String value) {
            addCriterion("reimburse_Remark >", value, "reimburseRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("reimburse_Remark >=", value, "reimburseRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseRemarkLessThan(String value) {
            addCriterion("reimburse_Remark <", value, "reimburseRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseRemarkLessThanOrEqualTo(String value) {
            addCriterion("reimburse_Remark <=", value, "reimburseRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseRemarkLike(String value) {
            addCriterion("reimburse_Remark like", value, "reimburseRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseRemarkNotLike(String value) {
            addCriterion("reimburse_Remark not like", value, "reimburseRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseRemarkIn(List<String> values) {
            addCriterion("reimburse_Remark in", values, "reimburseRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseRemarkNotIn(List<String> values) {
            addCriterion("reimburse_Remark not in", values, "reimburseRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseRemarkBetween(String value1, String value2) {
            addCriterion("reimburse_Remark between", value1, value2, "reimburseRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseRemarkNotBetween(String value1, String value2) {
            addCriterion("reimburse_Remark not between", value1, value2, "reimburseRemark");
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