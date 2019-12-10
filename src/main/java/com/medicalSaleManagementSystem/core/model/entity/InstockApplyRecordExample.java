package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstockApplyRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstockApplyRecordExample() {
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

        public Criteria andInstockApplyIdIsNull() {
            addCriterion("instock_Apply_id is null");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdIsNotNull() {
            addCriterion("instock_Apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdEqualTo(Integer value) {
            addCriterion("instock_Apply_id =", value, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdNotEqualTo(Integer value) {
            addCriterion("instock_Apply_id <>", value, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdGreaterThan(Integer value) {
            addCriterion("instock_Apply_id >", value, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instock_Apply_id >=", value, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdLessThan(Integer value) {
            addCriterion("instock_Apply_id <", value, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("instock_Apply_id <=", value, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdIn(List<Integer> values) {
            addCriterion("instock_Apply_id in", values, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdNotIn(List<Integer> values) {
            addCriterion("instock_Apply_id not in", values, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("instock_Apply_id between", value1, value2, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instock_Apply_id not between", value1, value2, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberIsNull() {
            addCriterion("instock_Apply_Number is null");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberIsNotNull() {
            addCriterion("instock_Apply_Number is not null");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberEqualTo(String value) {
            addCriterion("instock_Apply_Number =", value, "instockApplyNumber");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberNotEqualTo(String value) {
            addCriterion("instock_Apply_Number <>", value, "instockApplyNumber");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberGreaterThan(String value) {
            addCriterion("instock_Apply_Number >", value, "instockApplyNumber");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("instock_Apply_Number >=", value, "instockApplyNumber");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberLessThan(String value) {
            addCriterion("instock_Apply_Number <", value, "instockApplyNumber");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberLessThanOrEqualTo(String value) {
            addCriterion("instock_Apply_Number <=", value, "instockApplyNumber");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberLike(String value) {
            addCriterion("instock_Apply_Number like", value, "instockApplyNumber");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberNotLike(String value) {
            addCriterion("instock_Apply_Number not like", value, "instockApplyNumber");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberIn(List<String> values) {
            addCriterion("instock_Apply_Number in", values, "instockApplyNumber");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberNotIn(List<String> values) {
            addCriterion("instock_Apply_Number not in", values, "instockApplyNumber");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberBetween(String value1, String value2) {
            addCriterion("instock_Apply_Number between", value1, value2, "instockApplyNumber");
            return (Criteria) this;
        }

        public Criteria andInstockApplyNumberNotBetween(String value1, String value2) {
            addCriterion("instock_Apply_Number not between", value1, value2, "instockApplyNumber");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdIsNull() {
            addCriterion("instock_Dtl_id is null");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdIsNotNull() {
            addCriterion("instock_Dtl_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdEqualTo(Integer value) {
            addCriterion("instock_Dtl_id =", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdNotEqualTo(Integer value) {
            addCriterion("instock_Dtl_id <>", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdGreaterThan(Integer value) {
            addCriterion("instock_Dtl_id >", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instock_Dtl_id >=", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdLessThan(Integer value) {
            addCriterion("instock_Dtl_id <", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdLessThanOrEqualTo(Integer value) {
            addCriterion("instock_Dtl_id <=", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdIn(List<Integer> values) {
            addCriterion("instock_Dtl_id in", values, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdNotIn(List<Integer> values) {
            addCriterion("instock_Dtl_id not in", values, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdBetween(Integer value1, Integer value2) {
            addCriterion("instock_Dtl_id between", value1, value2, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instock_Dtl_id not between", value1, value2, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_Time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_Time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_Time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_Time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_Time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_Time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_Time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_Time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_Time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_Time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_Time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_Time not between", value1, value2, "applyTime");
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

        public Criteria andInstockApplyCategoryIsNull() {
            addCriterion("instock_Apply_Category is null");
            return (Criteria) this;
        }

        public Criteria andInstockApplyCategoryIsNotNull() {
            addCriterion("instock_Apply_Category is not null");
            return (Criteria) this;
        }

        public Criteria andInstockApplyCategoryEqualTo(String value) {
            addCriterion("instock_Apply_Category =", value, "instockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andInstockApplyCategoryNotEqualTo(String value) {
            addCriterion("instock_Apply_Category <>", value, "instockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andInstockApplyCategoryGreaterThan(String value) {
            addCriterion("instock_Apply_Category >", value, "instockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andInstockApplyCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("instock_Apply_Category >=", value, "instockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andInstockApplyCategoryLessThan(String value) {
            addCriterion("instock_Apply_Category <", value, "instockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andInstockApplyCategoryLessThanOrEqualTo(String value) {
            addCriterion("instock_Apply_Category <=", value, "instockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andInstockApplyCategoryLike(String value) {
            addCriterion("instock_Apply_Category like", value, "instockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andInstockApplyCategoryNotLike(String value) {
            addCriterion("instock_Apply_Category not like", value, "instockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andInstockApplyCategoryIn(List<String> values) {
            addCriterion("instock_Apply_Category in", values, "instockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andInstockApplyCategoryNotIn(List<String> values) {
            addCriterion("instock_Apply_Category not in", values, "instockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andInstockApplyCategoryBetween(String value1, String value2) {
            addCriterion("instock_Apply_Category between", value1, value2, "instockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andInstockApplyCategoryNotBetween(String value1, String value2) {
            addCriterion("instock_Apply_Category not between", value1, value2, "instockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkIsNull() {
            addCriterion("instock_Apply_Remark is null");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkIsNotNull() {
            addCriterion("instock_Apply_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkEqualTo(String value) {
            addCriterion("instock_Apply_Remark =", value, "instockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkNotEqualTo(String value) {
            addCriterion("instock_Apply_Remark <>", value, "instockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkGreaterThan(String value) {
            addCriterion("instock_Apply_Remark >", value, "instockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("instock_Apply_Remark >=", value, "instockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkLessThan(String value) {
            addCriterion("instock_Apply_Remark <", value, "instockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkLessThanOrEqualTo(String value) {
            addCriterion("instock_Apply_Remark <=", value, "instockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkLike(String value) {
            addCriterion("instock_Apply_Remark like", value, "instockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkNotLike(String value) {
            addCriterion("instock_Apply_Remark not like", value, "instockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkIn(List<String> values) {
            addCriterion("instock_Apply_Remark in", values, "instockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkNotIn(List<String> values) {
            addCriterion("instock_Apply_Remark not in", values, "instockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkBetween(String value1, String value2) {
            addCriterion("instock_Apply_Remark between", value1, value2, "instockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andInstockApplyRemarkNotBetween(String value1, String value2) {
            addCriterion("instock_Apply_Remark not between", value1, value2, "instockApplyRemark");
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