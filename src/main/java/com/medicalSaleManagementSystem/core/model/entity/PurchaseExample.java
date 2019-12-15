package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andPurOrderIdIsNull() {
            addCriterion("pur_Order_Id is null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIsNotNull() {
            addCriterion("pur_Order_Id is not null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdEqualTo(String value) {
            addCriterion("pur_Order_Id =", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotEqualTo(String value) {
            addCriterion("pur_Order_Id <>", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThan(String value) {
            addCriterion("pur_Order_Id >", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("pur_Order_Id >=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThan(String value) {
            addCriterion("pur_Order_Id <", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThanOrEqualTo(String value) {
            addCriterion("pur_Order_Id <=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLike(String value) {
            addCriterion("pur_Order_Id like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotLike(String value) {
            addCriterion("pur_Order_Id not like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIn(List<String> values) {
            addCriterion("pur_Order_Id in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotIn(List<String> values) {
            addCriterion("pur_Order_Id not in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdBetween(String value1, String value2) {
            addCriterion("pur_Order_Id between", value1, value2, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotBetween(String value1, String value2) {
            addCriterion("pur_Order_Id not between", value1, value2, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurNameIsNull() {
            addCriterion("pur__Name is null");
            return (Criteria) this;
        }

        public Criteria andPurNameIsNotNull() {
            addCriterion("pur__Name is not null");
            return (Criteria) this;
        }

        public Criteria andPurNameEqualTo(String value) {
            addCriterion("pur__Name =", value, "purName");
            return (Criteria) this;
        }

        public Criteria andPurNameNotEqualTo(String value) {
            addCriterion("pur__Name <>", value, "purName");
            return (Criteria) this;
        }

        public Criteria andPurNameGreaterThan(String value) {
            addCriterion("pur__Name >", value, "purName");
            return (Criteria) this;
        }

        public Criteria andPurNameGreaterThanOrEqualTo(String value) {
            addCriterion("pur__Name >=", value, "purName");
            return (Criteria) this;
        }

        public Criteria andPurNameLessThan(String value) {
            addCriterion("pur__Name <", value, "purName");
            return (Criteria) this;
        }

        public Criteria andPurNameLessThanOrEqualTo(String value) {
            addCriterion("pur__Name <=", value, "purName");
            return (Criteria) this;
        }

        public Criteria andPurNameLike(String value) {
            addCriterion("pur__Name like", value, "purName");
            return (Criteria) this;
        }

        public Criteria andPurNameNotLike(String value) {
            addCriterion("pur__Name not like", value, "purName");
            return (Criteria) this;
        }

        public Criteria andPurNameIn(List<String> values) {
            addCriterion("pur__Name in", values, "purName");
            return (Criteria) this;
        }

        public Criteria andPurNameNotIn(List<String> values) {
            addCriterion("pur__Name not in", values, "purName");
            return (Criteria) this;
        }

        public Criteria andPurNameBetween(String value1, String value2) {
            addCriterion("pur__Name between", value1, value2, "purName");
            return (Criteria) this;
        }

        public Criteria andPurNameNotBetween(String value1, String value2) {
            addCriterion("pur__Name not between", value1, value2, "purName");
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

        public Criteria andPurStatusIsNull() {
            addCriterion("pur_Status is null");
            return (Criteria) this;
        }

        public Criteria andPurStatusIsNotNull() {
            addCriterion("pur_Status is not null");
            return (Criteria) this;
        }

        public Criteria andPurStatusEqualTo(String value) {
            addCriterion("pur_Status =", value, "purStatus");
            return (Criteria) this;
        }

        public Criteria andPurStatusNotEqualTo(String value) {
            addCriterion("pur_Status <>", value, "purStatus");
            return (Criteria) this;
        }

        public Criteria andPurStatusGreaterThan(String value) {
            addCriterion("pur_Status >", value, "purStatus");
            return (Criteria) this;
        }

        public Criteria andPurStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pur_Status >=", value, "purStatus");
            return (Criteria) this;
        }

        public Criteria andPurStatusLessThan(String value) {
            addCriterion("pur_Status <", value, "purStatus");
            return (Criteria) this;
        }

        public Criteria andPurStatusLessThanOrEqualTo(String value) {
            addCriterion("pur_Status <=", value, "purStatus");
            return (Criteria) this;
        }

        public Criteria andPurStatusLike(String value) {
            addCriterion("pur_Status like", value, "purStatus");
            return (Criteria) this;
        }

        public Criteria andPurStatusNotLike(String value) {
            addCriterion("pur_Status not like", value, "purStatus");
            return (Criteria) this;
        }

        public Criteria andPurStatusIn(List<String> values) {
            addCriterion("pur_Status in", values, "purStatus");
            return (Criteria) this;
        }

        public Criteria andPurStatusNotIn(List<String> values) {
            addCriterion("pur_Status not in", values, "purStatus");
            return (Criteria) this;
        }

        public Criteria andPurStatusBetween(String value1, String value2) {
            addCriterion("pur_Status between", value1, value2, "purStatus");
            return (Criteria) this;
        }

        public Criteria andPurStatusNotBetween(String value1, String value2) {
            addCriterion("pur_Status not between", value1, value2, "purStatus");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("Warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("Warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Integer value) {
            addCriterion("Warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Integer value) {
            addCriterion("Warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Integer value) {
            addCriterion("Warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Integer value) {
            addCriterion("Warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("Warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Integer> values) {
            addCriterion("Warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Integer> values) {
            addCriterion("Warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("Warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andPurDateIsNull() {
            addCriterion("pur_Date is null");
            return (Criteria) this;
        }

        public Criteria andPurDateIsNotNull() {
            addCriterion("pur_Date is not null");
            return (Criteria) this;
        }

        public Criteria andPurDateEqualTo(Date value) {
            addCriterion("pur_Date =", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateNotEqualTo(Date value) {
            addCriterion("pur_Date <>", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateGreaterThan(Date value) {
            addCriterion("pur_Date >", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pur_Date >=", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateLessThan(Date value) {
            addCriterion("pur_Date <", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateLessThanOrEqualTo(Date value) {
            addCriterion("pur_Date <=", value, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateIn(List<Date> values) {
            addCriterion("pur_Date in", values, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateNotIn(List<Date> values) {
            addCriterion("pur_Date not in", values, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateBetween(Date value1, Date value2) {
            addCriterion("pur_Date between", value1, value2, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurDateNotBetween(Date value1, Date value2) {
            addCriterion("pur_Date not between", value1, value2, "purDate");
            return (Criteria) this;
        }

        public Criteria andPurRemarkIsNull() {
            addCriterion("pur__Remark is null");
            return (Criteria) this;
        }

        public Criteria andPurRemarkIsNotNull() {
            addCriterion("pur__Remark is not null");
            return (Criteria) this;
        }

        public Criteria andPurRemarkEqualTo(String value) {
            addCriterion("pur__Remark =", value, "purRemark");
            return (Criteria) this;
        }

        public Criteria andPurRemarkNotEqualTo(String value) {
            addCriterion("pur__Remark <>", value, "purRemark");
            return (Criteria) this;
        }

        public Criteria andPurRemarkGreaterThan(String value) {
            addCriterion("pur__Remark >", value, "purRemark");
            return (Criteria) this;
        }

        public Criteria andPurRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pur__Remark >=", value, "purRemark");
            return (Criteria) this;
        }

        public Criteria andPurRemarkLessThan(String value) {
            addCriterion("pur__Remark <", value, "purRemark");
            return (Criteria) this;
        }

        public Criteria andPurRemarkLessThanOrEqualTo(String value) {
            addCriterion("pur__Remark <=", value, "purRemark");
            return (Criteria) this;
        }

        public Criteria andPurRemarkLike(String value) {
            addCriterion("pur__Remark like", value, "purRemark");
            return (Criteria) this;
        }

        public Criteria andPurRemarkNotLike(String value) {
            addCriterion("pur__Remark not like", value, "purRemark");
            return (Criteria) this;
        }

        public Criteria andPurRemarkIn(List<String> values) {
            addCriterion("pur__Remark in", values, "purRemark");
            return (Criteria) this;
        }

        public Criteria andPurRemarkNotIn(List<String> values) {
            addCriterion("pur__Remark not in", values, "purRemark");
            return (Criteria) this;
        }

        public Criteria andPurRemarkBetween(String value1, String value2) {
            addCriterion("pur__Remark between", value1, value2, "purRemark");
            return (Criteria) this;
        }

        public Criteria andPurRemarkNotBetween(String value1, String value2) {
            addCriterion("pur__Remark not between", value1, value2, "purRemark");
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