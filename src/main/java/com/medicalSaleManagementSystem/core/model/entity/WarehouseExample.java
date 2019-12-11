package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.List;

public class WarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String whseName;

    public WarehouseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOredCriteria(List<Criteria> oredCriteria) {
        this.oredCriteria = oredCriteria;
    }

    public String getWhseName() {
        return whseName;
    }

    public void setWhseName(String whseName) {
        this.whseName = whseName;
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

        public Criteria andWhseNameIsNull() {
            addCriterion("whse_Name is null");
            return (Criteria) this;
        }

        public Criteria andWhseNameIsNotNull() {
            addCriterion("whse_Name is not null");
            return (Criteria) this;
        }

        public Criteria andWhseNameEqualTo(String value) {
            addCriterion("whse_Name =", value, "whseName");
            return (Criteria) this;
        }

        public Criteria andWhseNameNotEqualTo(String value) {
            addCriterion("whse_Name <>", value, "whseName");
            return (Criteria) this;
        }

        public Criteria andWhseNameGreaterThan(String value) {
            addCriterion("whse_Name >", value, "whseName");
            return (Criteria) this;
        }

        public Criteria andWhseNameGreaterThanOrEqualTo(String value) {
            addCriterion("whse_Name >=", value, "whseName");
            return (Criteria) this;
        }

        public Criteria andWhseNameLessThan(String value) {
            addCriterion("whse_Name <", value, "whseName");
            return (Criteria) this;
        }

        public Criteria andWhseNameLessThanOrEqualTo(String value) {
            addCriterion("whse_Name <=", value, "whseName");
            return (Criteria) this;
        }

        public Criteria andWhseNameLike(String value) {
            addCriterion("whse_Name like", value, "whseName");
            return (Criteria) this;
        }

        public Criteria andWhseNameNotLike(String value) {
            addCriterion("whse_Name not like", value, "whseName");
            return (Criteria) this;
        }

        public Criteria andWhseNameIn(List<String> values) {
            addCriterion("whse_Name in", values, "whseName");
            return (Criteria) this;
        }

        public Criteria andWhseNameNotIn(List<String> values) {
            addCriterion("whse_Name not in", values, "whseName");
            return (Criteria) this;
        }

        public Criteria andWhseNameBetween(String value1, String value2) {
            addCriterion("whse_Name between", value1, value2, "whseName");
            return (Criteria) this;
        }

        public Criteria andWhseNameNotBetween(String value1, String value2) {
            addCriterion("whse_Name not between", value1, value2, "whseName");
            return (Criteria) this;
        }

        public Criteria andWhseAddressIsNull() {
            addCriterion("whse_Address is null");
            return (Criteria) this;
        }

        public Criteria andWhseAddressIsNotNull() {
            addCriterion("whse_Address is not null");
            return (Criteria) this;
        }

        public Criteria andWhseAddressEqualTo(String value) {
            addCriterion("whse_Address =", value, "whseAddress");
            return (Criteria) this;
        }

        public Criteria andWhseAddressNotEqualTo(String value) {
            addCriterion("whse_Address <>", value, "whseAddress");
            return (Criteria) this;
        }

        public Criteria andWhseAddressGreaterThan(String value) {
            addCriterion("whse_Address >", value, "whseAddress");
            return (Criteria) this;
        }

        public Criteria andWhseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("whse_Address >=", value, "whseAddress");
            return (Criteria) this;
        }

        public Criteria andWhseAddressLessThan(String value) {
            addCriterion("whse_Address <", value, "whseAddress");
            return (Criteria) this;
        }

        public Criteria andWhseAddressLessThanOrEqualTo(String value) {
            addCriterion("whse_Address <=", value, "whseAddress");
            return (Criteria) this;
        }

        public Criteria andWhseAddressLike(String value) {
            addCriterion("whse_Address like", value, "whseAddress");
            return (Criteria) this;
        }

        public Criteria andWhseAddressNotLike(String value) {
            addCriterion("whse_Address not like", value, "whseAddress");
            return (Criteria) this;
        }

        public Criteria andWhseAddressIn(List<String> values) {
            addCriterion("whse_Address in", values, "whseAddress");
            return (Criteria) this;
        }

        public Criteria andWhseAddressNotIn(List<String> values) {
            addCriterion("whse_Address not in", values, "whseAddress");
            return (Criteria) this;
        }

        public Criteria andWhseAddressBetween(String value1, String value2) {
            addCriterion("whse_Address between", value1, value2, "whseAddress");
            return (Criteria) this;
        }

        public Criteria andWhseAddressNotBetween(String value1, String value2) {
            addCriterion("whse_Address not between", value1, value2, "whseAddress");
            return (Criteria) this;
        }

        public Criteria andWhseTelIsNull() {
            addCriterion("whse_Tel is null");
            return (Criteria) this;
        }

        public Criteria andWhseTelIsNotNull() {
            addCriterion("whse_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andWhseTelEqualTo(String value) {
            addCriterion("whse_Tel =", value, "whseTel");
            return (Criteria) this;
        }

        public Criteria andWhseTelNotEqualTo(String value) {
            addCriterion("whse_Tel <>", value, "whseTel");
            return (Criteria) this;
        }

        public Criteria andWhseTelGreaterThan(String value) {
            addCriterion("whse_Tel >", value, "whseTel");
            return (Criteria) this;
        }

        public Criteria andWhseTelGreaterThanOrEqualTo(String value) {
            addCriterion("whse_Tel >=", value, "whseTel");
            return (Criteria) this;
        }

        public Criteria andWhseTelLessThan(String value) {
            addCriterion("whse_Tel <", value, "whseTel");
            return (Criteria) this;
        }

        public Criteria andWhseTelLessThanOrEqualTo(String value) {
            addCriterion("whse_Tel <=", value, "whseTel");
            return (Criteria) this;
        }

        public Criteria andWhseTelLike(String value) {
            addCriterion("whse_Tel like", value, "whseTel");
            return (Criteria) this;
        }

        public Criteria andWhseTelNotLike(String value) {
            addCriterion("whse_Tel not like", value, "whseTel");
            return (Criteria) this;
        }

        public Criteria andWhseTelIn(List<String> values) {
            addCriterion("whse_Tel in", values, "whseTel");
            return (Criteria) this;
        }

        public Criteria andWhseTelNotIn(List<String> values) {
            addCriterion("whse_Tel not in", values, "whseTel");
            return (Criteria) this;
        }

        public Criteria andWhseTelBetween(String value1, String value2) {
            addCriterion("whse_Tel between", value1, value2, "whseTel");
            return (Criteria) this;
        }

        public Criteria andWhseTelNotBetween(String value1, String value2) {
            addCriterion("whse_Tel not between", value1, value2, "whseTel");
            return (Criteria) this;
        }

        public Criteria andWhseCapacityIsNull() {
            addCriterion("whse_Capacity is null");
            return (Criteria) this;
        }

        public Criteria andWhseCapacityIsNotNull() {
            addCriterion("whse_Capacity is not null");
            return (Criteria) this;
        }

        public Criteria andWhseCapacityEqualTo(Integer value) {
            addCriterion("whse_Capacity =", value, "whseCapacity");
            return (Criteria) this;
        }

        public Criteria andWhseCapacityNotEqualTo(Integer value) {
            addCriterion("whse_Capacity <>", value, "whseCapacity");
            return (Criteria) this;
        }

        public Criteria andWhseCapacityGreaterThan(Integer value) {
            addCriterion("whse_Capacity >", value, "whseCapacity");
            return (Criteria) this;
        }

        public Criteria andWhseCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("whse_Capacity >=", value, "whseCapacity");
            return (Criteria) this;
        }

        public Criteria andWhseCapacityLessThan(Integer value) {
            addCriterion("whse_Capacity <", value, "whseCapacity");
            return (Criteria) this;
        }

        public Criteria andWhseCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("whse_Capacity <=", value, "whseCapacity");
            return (Criteria) this;
        }

        public Criteria andWhseCapacityIn(List<Integer> values) {
            addCriterion("whse_Capacity in", values, "whseCapacity");
            return (Criteria) this;
        }

        public Criteria andWhseCapacityNotIn(List<Integer> values) {
            addCriterion("whse_Capacity not in", values, "whseCapacity");
            return (Criteria) this;
        }

        public Criteria andWhseCapacityBetween(Integer value1, Integer value2) {
            addCriterion("whse_Capacity between", value1, value2, "whseCapacity");
            return (Criteria) this;
        }

        public Criteria andWhseCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("whse_Capacity not between", value1, value2, "whseCapacity");
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