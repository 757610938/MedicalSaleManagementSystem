package com.medicalSaleManagementSystem.core.bean.POJO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstockRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstockRecordExample() {
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

        public Criteria andInstockListIdIsNull() {
            addCriterion("instock_List_Id is null");
            return (Criteria) this;
        }

        public Criteria andInstockListIdIsNotNull() {
            addCriterion("instock_List_Id is not null");
            return (Criteria) this;
        }

        public Criteria andInstockListIdEqualTo(String value) {
            addCriterion("instock_List_Id =", value, "instockListId");
            return (Criteria) this;
        }

        public Criteria andInstockListIdNotEqualTo(String value) {
            addCriterion("instock_List_Id <>", value, "instockListId");
            return (Criteria) this;
        }

        public Criteria andInstockListIdGreaterThan(String value) {
            addCriterion("instock_List_Id >", value, "instockListId");
            return (Criteria) this;
        }

        public Criteria andInstockListIdGreaterThanOrEqualTo(String value) {
            addCriterion("instock_List_Id >=", value, "instockListId");
            return (Criteria) this;
        }

        public Criteria andInstockListIdLessThan(String value) {
            addCriterion("instock_List_Id <", value, "instockListId");
            return (Criteria) this;
        }

        public Criteria andInstockListIdLessThanOrEqualTo(String value) {
            addCriterion("instock_List_Id <=", value, "instockListId");
            return (Criteria) this;
        }

        public Criteria andInstockListIdLike(String value) {
            addCriterion("instock_List_Id like", value, "instockListId");
            return (Criteria) this;
        }

        public Criteria andInstockListIdNotLike(String value) {
            addCriterion("instock_List_Id not like", value, "instockListId");
            return (Criteria) this;
        }

        public Criteria andInstockListIdIn(List<String> values) {
            addCriterion("instock_List_Id in", values, "instockListId");
            return (Criteria) this;
        }

        public Criteria andInstockListIdNotIn(List<String> values) {
            addCriterion("instock_List_Id not in", values, "instockListId");
            return (Criteria) this;
        }

        public Criteria andInstockListIdBetween(String value1, String value2) {
            addCriterion("instock_List_Id between", value1, value2, "instockListId");
            return (Criteria) this;
        }

        public Criteria andInstockListIdNotBetween(String value1, String value2) {
            addCriterion("instock_List_Id not between", value1, value2, "instockListId");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryIsNull() {
            addCriterion("instock_Category is null");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryIsNotNull() {
            addCriterion("instock_Category is not null");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryEqualTo(String value) {
            addCriterion("instock_Category =", value, "instockCategory");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryNotEqualTo(String value) {
            addCriterion("instock_Category <>", value, "instockCategory");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryGreaterThan(String value) {
            addCriterion("instock_Category >", value, "instockCategory");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("instock_Category >=", value, "instockCategory");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryLessThan(String value) {
            addCriterion("instock_Category <", value, "instockCategory");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryLessThanOrEqualTo(String value) {
            addCriterion("instock_Category <=", value, "instockCategory");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryLike(String value) {
            addCriterion("instock_Category like", value, "instockCategory");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryNotLike(String value) {
            addCriterion("instock_Category not like", value, "instockCategory");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryIn(List<String> values) {
            addCriterion("instock_Category in", values, "instockCategory");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryNotIn(List<String> values) {
            addCriterion("instock_Category not in", values, "instockCategory");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryBetween(String value1, String value2) {
            addCriterion("instock_Category between", value1, value2, "instockCategory");
            return (Criteria) this;
        }

        public Criteria andInstockCategoryNotBetween(String value1, String value2) {
            addCriterion("instock_Category not between", value1, value2, "instockCategory");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIsNull() {
            addCriterion("medicine_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIsNotNull() {
            addCriterion("medicine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineIdEqualTo(Integer value) {
            addCriterion("medicine_id =", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotEqualTo(Integer value) {
            addCriterion("medicine_id <>", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdGreaterThan(Integer value) {
            addCriterion("medicine_id >", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicine_id >=", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdLessThan(Integer value) {
            addCriterion("medicine_id <", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdLessThanOrEqualTo(Integer value) {
            addCriterion("medicine_id <=", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIn(List<Integer> values) {
            addCriterion("medicine_id in", values, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotIn(List<Integer> values) {
            addCriterion("medicine_id not in", values, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdBetween(Integer value1, Integer value2) {
            addCriterion("medicine_id between", value1, value2, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medicine_id not between", value1, value2, "medicineId");
            return (Criteria) this;
        }

        public Criteria andInstockNumberIsNull() {
            addCriterion("instock_Number is null");
            return (Criteria) this;
        }

        public Criteria andInstockNumberIsNotNull() {
            addCriterion("instock_Number is not null");
            return (Criteria) this;
        }

        public Criteria andInstockNumberEqualTo(Integer value) {
            addCriterion("instock_Number =", value, "instockNumber");
            return (Criteria) this;
        }

        public Criteria andInstockNumberNotEqualTo(Integer value) {
            addCriterion("instock_Number <>", value, "instockNumber");
            return (Criteria) this;
        }

        public Criteria andInstockNumberGreaterThan(Integer value) {
            addCriterion("instock_Number >", value, "instockNumber");
            return (Criteria) this;
        }

        public Criteria andInstockNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("instock_Number >=", value, "instockNumber");
            return (Criteria) this;
        }

        public Criteria andInstockNumberLessThan(Integer value) {
            addCriterion("instock_Number <", value, "instockNumber");
            return (Criteria) this;
        }

        public Criteria andInstockNumberLessThanOrEqualTo(Integer value) {
            addCriterion("instock_Number <=", value, "instockNumber");
            return (Criteria) this;
        }

        public Criteria andInstockNumberIn(List<Integer> values) {
            addCriterion("instock_Number in", values, "instockNumber");
            return (Criteria) this;
        }

        public Criteria andInstockNumberNotIn(List<Integer> values) {
            addCriterion("instock_Number not in", values, "instockNumber");
            return (Criteria) this;
        }

        public Criteria andInstockNumberBetween(Integer value1, Integer value2) {
            addCriterion("instock_Number between", value1, value2, "instockNumber");
            return (Criteria) this;
        }

        public Criteria andInstockNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("instock_Number not between", value1, value2, "instockNumber");
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

        public Criteria andInstockRemarkIsNull() {
            addCriterion("instock_Remark is null");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkIsNotNull() {
            addCriterion("instock_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkEqualTo(String value) {
            addCriterion("instock_Remark =", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkNotEqualTo(String value) {
            addCriterion("instock_Remark <>", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkGreaterThan(String value) {
            addCriterion("instock_Remark >", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("instock_Remark >=", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkLessThan(String value) {
            addCriterion("instock_Remark <", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkLessThanOrEqualTo(String value) {
            addCriterion("instock_Remark <=", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkLike(String value) {
            addCriterion("instock_Remark like", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkNotLike(String value) {
            addCriterion("instock_Remark not like", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkIn(List<String> values) {
            addCriterion("instock_Remark in", values, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkNotIn(List<String> values) {
            addCriterion("instock_Remark not in", values, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkBetween(String value1, String value2) {
            addCriterion("instock_Remark between", value1, value2, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkNotBetween(String value1, String value2) {
            addCriterion("instock_Remark not between", value1, value2, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockTimeIsNull() {
            addCriterion("instock_time is null");
            return (Criteria) this;
        }

        public Criteria andInstockTimeIsNotNull() {
            addCriterion("instock_time is not null");
            return (Criteria) this;
        }

        public Criteria andInstockTimeEqualTo(Date value) {
            addCriterion("instock_time =", value, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeNotEqualTo(Date value) {
            addCriterion("instock_time <>", value, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeGreaterThan(Date value) {
            addCriterion("instock_time >", value, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("instock_time >=", value, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeLessThan(Date value) {
            addCriterion("instock_time <", value, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeLessThanOrEqualTo(Date value) {
            addCriterion("instock_time <=", value, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeIn(List<Date> values) {
            addCriterion("instock_time in", values, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeNotIn(List<Date> values) {
            addCriterion("instock_time not in", values, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeBetween(Date value1, Date value2) {
            addCriterion("instock_time between", value1, value2, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeNotBetween(Date value1, Date value2) {
            addCriterion("instock_time not between", value1, value2, "instockTime");
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