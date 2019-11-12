package com.medicalSaleManagementSystem.core.bean.POJO;

import java.util.ArrayList;
import java.util.List;

public class PurchaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseExample() {
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

        public Criteria andPurIdIsNull() {
            addCriterion("pur_id is null");
            return (Criteria) this;
        }

        public Criteria andPurIdIsNotNull() {
            addCriterion("pur_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurIdEqualTo(Integer value) {
            addCriterion("pur_id =", value, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdNotEqualTo(Integer value) {
            addCriterion("pur_id <>", value, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdGreaterThan(Integer value) {
            addCriterion("pur_id >", value, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pur_id >=", value, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdLessThan(Integer value) {
            addCriterion("pur_id <", value, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdLessThanOrEqualTo(Integer value) {
            addCriterion("pur_id <=", value, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdIn(List<Integer> values) {
            addCriterion("pur_id in", values, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdNotIn(List<Integer> values) {
            addCriterion("pur_id not in", values, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdBetween(Integer value1, Integer value2) {
            addCriterion("pur_id between", value1, value2, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pur_id not between", value1, value2, "purId");
            return (Criteria) this;
        }

        public Criteria andPurOrderidIsNull() {
            addCriterion("pur_OrderId is null");
            return (Criteria) this;
        }

        public Criteria andPurOrderidIsNotNull() {
            addCriterion("pur_OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andPurOrderidEqualTo(String value) {
            addCriterion("pur_OrderId =", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidNotEqualTo(String value) {
            addCriterion("pur_OrderId <>", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidGreaterThan(String value) {
            addCriterion("pur_OrderId >", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("pur_OrderId >=", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidLessThan(String value) {
            addCriterion("pur_OrderId <", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidLessThanOrEqualTo(String value) {
            addCriterion("pur_OrderId <=", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidLike(String value) {
            addCriterion("pur_OrderId like", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidNotLike(String value) {
            addCriterion("pur_OrderId not like", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidIn(List<String> values) {
            addCriterion("pur_OrderId in", values, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidNotIn(List<String> values) {
            addCriterion("pur_OrderId not in", values, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidBetween(String value1, String value2) {
            addCriterion("pur_OrderId between", value1, value2, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidNotBetween(String value1, String value2) {
            addCriterion("pur_OrderId not between", value1, value2, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
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

        public Criteria andPurTotalMoneyIsNull() {
            addCriterion("pur_Total_Money is null");
            return (Criteria) this;
        }

        public Criteria andPurTotalMoneyIsNotNull() {
            addCriterion("pur_Total_Money is not null");
            return (Criteria) this;
        }

        public Criteria andPurTotalMoneyEqualTo(Double value) {
            addCriterion("pur_Total_Money =", value, "purTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPurTotalMoneyNotEqualTo(Double value) {
            addCriterion("pur_Total_Money <>", value, "purTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPurTotalMoneyGreaterThan(Double value) {
            addCriterion("pur_Total_Money >", value, "purTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPurTotalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("pur_Total_Money >=", value, "purTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPurTotalMoneyLessThan(Double value) {
            addCriterion("pur_Total_Money <", value, "purTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPurTotalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("pur_Total_Money <=", value, "purTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPurTotalMoneyIn(List<Double> values) {
            addCriterion("pur_Total_Money in", values, "purTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPurTotalMoneyNotIn(List<Double> values) {
            addCriterion("pur_Total_Money not in", values, "purTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPurTotalMoneyBetween(Double value1, Double value2) {
            addCriterion("pur_Total_Money between", value1, value2, "purTotalMoney");
            return (Criteria) this;
        }

        public Criteria andPurTotalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("pur_Total_Money not between", value1, value2, "purTotalMoney");
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