package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.List;

public class UserEmployeeRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserEmployeeRelationExample() {
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

        public Criteria andRelationIdIsNull() {
            addCriterion("relation_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationIdIsNotNull() {
            addCriterion("relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationIdEqualTo(Integer value) {
            addCriterion("relation_id =", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotEqualTo(Integer value) {
            addCriterion("relation_id <>", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThan(Integer value) {
            addCriterion("relation_id >", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_id >=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThan(Integer value) {
            addCriterion("relation_id <", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThanOrEqualTo(Integer value) {
            addCriterion("relation_id <=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdIn(List<Integer> values) {
            addCriterion("relation_id in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotIn(List<Integer> values) {
            addCriterion("relation_id not in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdBetween(Integer value1, Integer value2) {
            addCriterion("relation_id between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_id not between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
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