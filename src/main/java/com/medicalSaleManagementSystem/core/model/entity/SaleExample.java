package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.List;

public class SaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleExample() {
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

        public Criteria andSaleIdIsNull() {
            addCriterion("sale_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNotNull() {
            addCriterion("sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIdEqualTo(Integer value) {
            addCriterion("sale_id =", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotEqualTo(Integer value) {
            addCriterion("sale_id <>", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThan(Integer value) {
            addCriterion("sale_id >", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_id >=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThan(Integer value) {
            addCriterion("sale_id <", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_id <=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIn(List<Integer> values) {
            addCriterion("sale_id in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotIn(List<Integer> values) {
            addCriterion("sale_id not in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_id between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_id not between", value1, value2, "saleId");
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

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
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

        public Criteria andSaleTotalMoneyIsNull() {
            addCriterion("sale_Total_Money is null");
            return (Criteria) this;
        }

        public Criteria andSaleTotalMoneyIsNotNull() {
            addCriterion("sale_Total_Money is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTotalMoneyEqualTo(Double value) {
            addCriterion("sale_Total_Money =", value, "saleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSaleTotalMoneyNotEqualTo(Double value) {
            addCriterion("sale_Total_Money <>", value, "saleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSaleTotalMoneyGreaterThan(Double value) {
            addCriterion("sale_Total_Money >", value, "saleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSaleTotalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_Total_Money >=", value, "saleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSaleTotalMoneyLessThan(Double value) {
            addCriterion("sale_Total_Money <", value, "saleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSaleTotalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("sale_Total_Money <=", value, "saleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSaleTotalMoneyIn(List<Double> values) {
            addCriterion("sale_Total_Money in", values, "saleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSaleTotalMoneyNotIn(List<Double> values) {
            addCriterion("sale_Total_Money not in", values, "saleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSaleTotalMoneyBetween(Double value1, Double value2) {
            addCriterion("sale_Total_Money between", value1, value2, "saleTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSaleTotalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("sale_Total_Money not between", value1, value2, "saleTotalMoney");
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