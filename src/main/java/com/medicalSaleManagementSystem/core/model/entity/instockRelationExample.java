package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.List;

public class instockRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public instockRelationExample() {
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

        public Criteria andInstockRelationIdIsNull() {
            addCriterion("instock_relation_id is null");
            return (Criteria) this;
        }

        public Criteria andInstockRelationIdIsNotNull() {
            addCriterion("instock_relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstockRelationIdEqualTo(Integer value) {
            addCriterion("instock_relation_id =", value, "instockRelationId");
            return (Criteria) this;
        }

        public Criteria andInstockRelationIdNotEqualTo(Integer value) {
            addCriterion("instock_relation_id <>", value, "instockRelationId");
            return (Criteria) this;
        }

        public Criteria andInstockRelationIdGreaterThan(Integer value) {
            addCriterion("instock_relation_id >", value, "instockRelationId");
            return (Criteria) this;
        }

        public Criteria andInstockRelationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instock_relation_id >=", value, "instockRelationId");
            return (Criteria) this;
        }

        public Criteria andInstockRelationIdLessThan(Integer value) {
            addCriterion("instock_relation_id <", value, "instockRelationId");
            return (Criteria) this;
        }

        public Criteria andInstockRelationIdLessThanOrEqualTo(Integer value) {
            addCriterion("instock_relation_id <=", value, "instockRelationId");
            return (Criteria) this;
        }

        public Criteria andInstockRelationIdIn(List<Integer> values) {
            addCriterion("instock_relation_id in", values, "instockRelationId");
            return (Criteria) this;
        }

        public Criteria andInstockRelationIdNotIn(List<Integer> values) {
            addCriterion("instock_relation_id not in", values, "instockRelationId");
            return (Criteria) this;
        }

        public Criteria andInstockRelationIdBetween(Integer value1, Integer value2) {
            addCriterion("instock_relation_id between", value1, value2, "instockRelationId");
            return (Criteria) this;
        }

        public Criteria andInstockRelationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instock_relation_id not between", value1, value2, "instockRelationId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdIsNull() {
            addCriterion("instock_apply_id is null");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdIsNotNull() {
            addCriterion("instock_apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdEqualTo(Integer value) {
            addCriterion("instock_apply_id =", value, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdNotEqualTo(Integer value) {
            addCriterion("instock_apply_id <>", value, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdGreaterThan(Integer value) {
            addCriterion("instock_apply_id >", value, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instock_apply_id >=", value, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdLessThan(Integer value) {
            addCriterion("instock_apply_id <", value, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("instock_apply_id <=", value, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdIn(List<Integer> values) {
            addCriterion("instock_apply_id in", values, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdNotIn(List<Integer> values) {
            addCriterion("instock_apply_id not in", values, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("instock_apply_id between", value1, value2, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instock_apply_id not between", value1, value2, "instockApplyId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdIsNull() {
            addCriterion("instock_dtl_id is null");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdIsNotNull() {
            addCriterion("instock_dtl_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdEqualTo(Integer value) {
            addCriterion("instock_dtl_id =", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdNotEqualTo(Integer value) {
            addCriterion("instock_dtl_id <>", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdGreaterThan(Integer value) {
            addCriterion("instock_dtl_id >", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instock_dtl_id >=", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdLessThan(Integer value) {
            addCriterion("instock_dtl_id <", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdLessThanOrEqualTo(Integer value) {
            addCriterion("instock_dtl_id <=", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdIn(List<Integer> values) {
            addCriterion("instock_dtl_id in", values, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdNotIn(List<Integer> values) {
            addCriterion("instock_dtl_id not in", values, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdBetween(Integer value1, Integer value2) {
            addCriterion("instock_dtl_id between", value1, value2, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instock_dtl_id not between", value1, value2, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockCheckIdIsNull() {
            addCriterion("instock_check_id is null");
            return (Criteria) this;
        }

        public Criteria andInstockCheckIdIsNotNull() {
            addCriterion("instock_check_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstockCheckIdEqualTo(Integer value) {
            addCriterion("instock_check_id =", value, "instockCheckId");
            return (Criteria) this;
        }

        public Criteria andInstockCheckIdNotEqualTo(Integer value) {
            addCriterion("instock_check_id <>", value, "instockCheckId");
            return (Criteria) this;
        }

        public Criteria andInstockCheckIdGreaterThan(Integer value) {
            addCriterion("instock_check_id >", value, "instockCheckId");
            return (Criteria) this;
        }

        public Criteria andInstockCheckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instock_check_id >=", value, "instockCheckId");
            return (Criteria) this;
        }

        public Criteria andInstockCheckIdLessThan(Integer value) {
            addCriterion("instock_check_id <", value, "instockCheckId");
            return (Criteria) this;
        }

        public Criteria andInstockCheckIdLessThanOrEqualTo(Integer value) {
            addCriterion("instock_check_id <=", value, "instockCheckId");
            return (Criteria) this;
        }

        public Criteria andInstockCheckIdIn(List<Integer> values) {
            addCriterion("instock_check_id in", values, "instockCheckId");
            return (Criteria) this;
        }

        public Criteria andInstockCheckIdNotIn(List<Integer> values) {
            addCriterion("instock_check_id not in", values, "instockCheckId");
            return (Criteria) this;
        }

        public Criteria andInstockCheckIdBetween(Integer value1, Integer value2) {
            addCriterion("instock_check_id between", value1, value2, "instockCheckId");
            return (Criteria) this;
        }

        public Criteria andInstockCheckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instock_check_id not between", value1, value2, "instockCheckId");
            return (Criteria) this;
        }

        public Criteria andInstockIdIsNull() {
            addCriterion("instock_id is null");
            return (Criteria) this;
        }

        public Criteria andInstockIdIsNotNull() {
            addCriterion("instock_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstockIdEqualTo(Integer value) {
            addCriterion("instock_id =", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdNotEqualTo(Integer value) {
            addCriterion("instock_id <>", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdGreaterThan(Integer value) {
            addCriterion("instock_id >", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instock_id >=", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdLessThan(Integer value) {
            addCriterion("instock_id <", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdLessThanOrEqualTo(Integer value) {
            addCriterion("instock_id <=", value, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdIn(List<Integer> values) {
            addCriterion("instock_id in", values, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdNotIn(List<Integer> values) {
            addCriterion("instock_id not in", values, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdBetween(Integer value1, Integer value2) {
            addCriterion("instock_id between", value1, value2, "instockId");
            return (Criteria) this;
        }

        public Criteria andInstockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instock_id not between", value1, value2, "instockId");
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