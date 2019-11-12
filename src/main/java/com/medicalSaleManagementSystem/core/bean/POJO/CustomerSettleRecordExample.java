package com.medicalSaleManagementSystem.core.bean.POJO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerSettleRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerSettleRecordExample() {
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

        public Criteria andCustSettleIdIsNull() {
            addCriterion("cust_Settle_id is null");
            return (Criteria) this;
        }

        public Criteria andCustSettleIdIsNotNull() {
            addCriterion("cust_Settle_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustSettleIdEqualTo(Integer value) {
            addCriterion("cust_Settle_id =", value, "custSettleId");
            return (Criteria) this;
        }

        public Criteria andCustSettleIdNotEqualTo(Integer value) {
            addCriterion("cust_Settle_id <>", value, "custSettleId");
            return (Criteria) this;
        }

        public Criteria andCustSettleIdGreaterThan(Integer value) {
            addCriterion("cust_Settle_id >", value, "custSettleId");
            return (Criteria) this;
        }

        public Criteria andCustSettleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_Settle_id >=", value, "custSettleId");
            return (Criteria) this;
        }

        public Criteria andCustSettleIdLessThan(Integer value) {
            addCriterion("cust_Settle_id <", value, "custSettleId");
            return (Criteria) this;
        }

        public Criteria andCustSettleIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_Settle_id <=", value, "custSettleId");
            return (Criteria) this;
        }

        public Criteria andCustSettleIdIn(List<Integer> values) {
            addCriterion("cust_Settle_id in", values, "custSettleId");
            return (Criteria) this;
        }

        public Criteria andCustSettleIdNotIn(List<Integer> values) {
            addCriterion("cust_Settle_id not in", values, "custSettleId");
            return (Criteria) this;
        }

        public Criteria andCustSettleIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_Settle_id between", value1, value2, "custSettleId");
            return (Criteria) this;
        }

        public Criteria andCustSettleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_Settle_id not between", value1, value2, "custSettleId");
            return (Criteria) this;
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

        public Criteria andCustSettleDateIsNull() {
            addCriterion("cust_Settle_Date is null");
            return (Criteria) this;
        }

        public Criteria andCustSettleDateIsNotNull() {
            addCriterion("cust_Settle_Date is not null");
            return (Criteria) this;
        }

        public Criteria andCustSettleDateEqualTo(Date value) {
            addCriterion("cust_Settle_Date =", value, "custSettleDate");
            return (Criteria) this;
        }

        public Criteria andCustSettleDateNotEqualTo(Date value) {
            addCriterion("cust_Settle_Date <>", value, "custSettleDate");
            return (Criteria) this;
        }

        public Criteria andCustSettleDateGreaterThan(Date value) {
            addCriterion("cust_Settle_Date >", value, "custSettleDate");
            return (Criteria) this;
        }

        public Criteria andCustSettleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cust_Settle_Date >=", value, "custSettleDate");
            return (Criteria) this;
        }

        public Criteria andCustSettleDateLessThan(Date value) {
            addCriterion("cust_Settle_Date <", value, "custSettleDate");
            return (Criteria) this;
        }

        public Criteria andCustSettleDateLessThanOrEqualTo(Date value) {
            addCriterion("cust_Settle_Date <=", value, "custSettleDate");
            return (Criteria) this;
        }

        public Criteria andCustSettleDateIn(List<Date> values) {
            addCriterion("cust_Settle_Date in", values, "custSettleDate");
            return (Criteria) this;
        }

        public Criteria andCustSettleDateNotIn(List<Date> values) {
            addCriterion("cust_Settle_Date not in", values, "custSettleDate");
            return (Criteria) this;
        }

        public Criteria andCustSettleDateBetween(Date value1, Date value2) {
            addCriterion("cust_Settle_Date between", value1, value2, "custSettleDate");
            return (Criteria) this;
        }

        public Criteria andCustSettleDateNotBetween(Date value1, Date value2) {
            addCriterion("cust_Settle_Date not between", value1, value2, "custSettleDate");
            return (Criteria) this;
        }

        public Criteria andCustSettleMoneyIsNull() {
            addCriterion("cust_Settle_Money is null");
            return (Criteria) this;
        }

        public Criteria andCustSettleMoneyIsNotNull() {
            addCriterion("cust_Settle_Money is not null");
            return (Criteria) this;
        }

        public Criteria andCustSettleMoneyEqualTo(Double value) {
            addCriterion("cust_Settle_Money =", value, "custSettleMoney");
            return (Criteria) this;
        }

        public Criteria andCustSettleMoneyNotEqualTo(Double value) {
            addCriterion("cust_Settle_Money <>", value, "custSettleMoney");
            return (Criteria) this;
        }

        public Criteria andCustSettleMoneyGreaterThan(Double value) {
            addCriterion("cust_Settle_Money >", value, "custSettleMoney");
            return (Criteria) this;
        }

        public Criteria andCustSettleMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cust_Settle_Money >=", value, "custSettleMoney");
            return (Criteria) this;
        }

        public Criteria andCustSettleMoneyLessThan(Double value) {
            addCriterion("cust_Settle_Money <", value, "custSettleMoney");
            return (Criteria) this;
        }

        public Criteria andCustSettleMoneyLessThanOrEqualTo(Double value) {
            addCriterion("cust_Settle_Money <=", value, "custSettleMoney");
            return (Criteria) this;
        }

        public Criteria andCustSettleMoneyIn(List<Double> values) {
            addCriterion("cust_Settle_Money in", values, "custSettleMoney");
            return (Criteria) this;
        }

        public Criteria andCustSettleMoneyNotIn(List<Double> values) {
            addCriterion("cust_Settle_Money not in", values, "custSettleMoney");
            return (Criteria) this;
        }

        public Criteria andCustSettleMoneyBetween(Double value1, Double value2) {
            addCriterion("cust_Settle_Money between", value1, value2, "custSettleMoney");
            return (Criteria) this;
        }

        public Criteria andCustSettleMoneyNotBetween(Double value1, Double value2) {
            addCriterion("cust_Settle_Money not between", value1, value2, "custSettleMoney");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkIsNull() {
            addCriterion("cust_Settle_Remark is null");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkIsNotNull() {
            addCriterion("cust_Settle_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkEqualTo(String value) {
            addCriterion("cust_Settle_Remark =", value, "custSettleRemark");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkNotEqualTo(String value) {
            addCriterion("cust_Settle_Remark <>", value, "custSettleRemark");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkGreaterThan(String value) {
            addCriterion("cust_Settle_Remark >", value, "custSettleRemark");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cust_Settle_Remark >=", value, "custSettleRemark");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkLessThan(String value) {
            addCriterion("cust_Settle_Remark <", value, "custSettleRemark");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkLessThanOrEqualTo(String value) {
            addCriterion("cust_Settle_Remark <=", value, "custSettleRemark");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkLike(String value) {
            addCriterion("cust_Settle_Remark like", value, "custSettleRemark");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkNotLike(String value) {
            addCriterion("cust_Settle_Remark not like", value, "custSettleRemark");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkIn(List<String> values) {
            addCriterion("cust_Settle_Remark in", values, "custSettleRemark");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkNotIn(List<String> values) {
            addCriterion("cust_Settle_Remark not in", values, "custSettleRemark");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkBetween(String value1, String value2) {
            addCriterion("cust_Settle_Remark between", value1, value2, "custSettleRemark");
            return (Criteria) this;
        }

        public Criteria andCustSettleRemarkNotBetween(String value1, String value2) {
            addCriterion("cust_Settle_Remark not between", value1, value2, "custSettleRemark");
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