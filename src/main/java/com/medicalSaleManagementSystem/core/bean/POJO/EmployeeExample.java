package com.medicalSaleManagementSystem.core.bean.POJO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andEmpAccountIsNull() {
            addCriterion("emp_Account is null");
            return (Criteria) this;
        }

        public Criteria andEmpAccountIsNotNull() {
            addCriterion("emp_Account is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAccountEqualTo(String value) {
            addCriterion("emp_Account =", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountNotEqualTo(String value) {
            addCriterion("emp_Account <>", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountGreaterThan(String value) {
            addCriterion("emp_Account >", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountGreaterThanOrEqualTo(String value) {
            addCriterion("emp_Account >=", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountLessThan(String value) {
            addCriterion("emp_Account <", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountLessThanOrEqualTo(String value) {
            addCriterion("emp_Account <=", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountLike(String value) {
            addCriterion("emp_Account like", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountNotLike(String value) {
            addCriterion("emp_Account not like", value, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountIn(List<String> values) {
            addCriterion("emp_Account in", values, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountNotIn(List<String> values) {
            addCriterion("emp_Account not in", values, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountBetween(String value1, String value2) {
            addCriterion("emp_Account between", value1, value2, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpAccountNotBetween(String value1, String value2) {
            addCriterion("emp_Account not between", value1, value2, "empAccount");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIsNull() {
            addCriterion("emp_Password is null");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIsNotNull() {
            addCriterion("emp_Password is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordEqualTo(String value) {
            addCriterion("emp_Password =", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotEqualTo(String value) {
            addCriterion("emp_Password <>", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordGreaterThan(String value) {
            addCriterion("emp_Password >", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("emp_Password >=", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLessThan(String value) {
            addCriterion("emp_Password <", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLessThanOrEqualTo(String value) {
            addCriterion("emp_Password <=", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLike(String value) {
            addCriterion("emp_Password like", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotLike(String value) {
            addCriterion("emp_Password not like", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIn(List<String> values) {
            addCriterion("emp_Password in", values, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotIn(List<String> values) {
            addCriterion("emp_Password not in", values, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordBetween(String value1, String value2) {
            addCriterion("emp_Password between", value1, value2, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotBetween(String value1, String value2) {
            addCriterion("emp_Password not between", value1, value2, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_Name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_Name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_Name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_Name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_Name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_Name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_Name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_Name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_Name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_Name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_Name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_Name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_Name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_Name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNull() {
            addCriterion("emp_Sex is null");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNotNull() {
            addCriterion("emp_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSexEqualTo(String value) {
            addCriterion("emp_Sex =", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotEqualTo(String value) {
            addCriterion("emp_Sex <>", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThan(String value) {
            addCriterion("emp_Sex >", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThanOrEqualTo(String value) {
            addCriterion("emp_Sex >=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThan(String value) {
            addCriterion("emp_Sex <", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThanOrEqualTo(String value) {
            addCriterion("emp_Sex <=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLike(String value) {
            addCriterion("emp_Sex like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotLike(String value) {
            addCriterion("emp_Sex not like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexIn(List<String> values) {
            addCriterion("emp_Sex in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotIn(List<String> values) {
            addCriterion("emp_Sex not in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexBetween(String value1, String value2) {
            addCriterion("emp_Sex between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotBetween(String value1, String value2) {
            addCriterion("emp_Sex not between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayIsNull() {
            addCriterion("emp_Birthday is null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayIsNotNull() {
            addCriterion("emp_Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("emp_Birthday =", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("emp_Birthday <>", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("emp_Birthday >", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_Birthday >=", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("emp_Birthday <", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_Birthday <=", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("emp_Birthday in", values, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("emp_Birthday not in", values, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_Birthday between", value1, value2, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_Birthday not between", value1, value2, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardIsNull() {
            addCriterion("emp_Id_Card is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardIsNotNull() {
            addCriterion("emp_Id_Card is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardEqualTo(String value) {
            addCriterion("emp_Id_Card =", value, "empIdCard");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardNotEqualTo(String value) {
            addCriterion("emp_Id_Card <>", value, "empIdCard");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardGreaterThan(String value) {
            addCriterion("emp_Id_Card >", value, "empIdCard");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("emp_Id_Card >=", value, "empIdCard");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardLessThan(String value) {
            addCriterion("emp_Id_Card <", value, "empIdCard");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardLessThanOrEqualTo(String value) {
            addCriterion("emp_Id_Card <=", value, "empIdCard");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardLike(String value) {
            addCriterion("emp_Id_Card like", value, "empIdCard");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardNotLike(String value) {
            addCriterion("emp_Id_Card not like", value, "empIdCard");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardIn(List<String> values) {
            addCriterion("emp_Id_Card in", values, "empIdCard");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardNotIn(List<String> values) {
            addCriterion("emp_Id_Card not in", values, "empIdCard");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardBetween(String value1, String value2) {
            addCriterion("emp_Id_Card between", value1, value2, "empIdCard");
            return (Criteria) this;
        }

        public Criteria andEmpIdCardNotBetween(String value1, String value2) {
            addCriterion("emp_Id_Card not between", value1, value2, "empIdCard");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIsNull() {
            addCriterion("emp_Address is null");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIsNotNull() {
            addCriterion("emp_Address is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAddressEqualTo(String value) {
            addCriterion("emp_Address =", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotEqualTo(String value) {
            addCriterion("emp_Address <>", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressGreaterThan(String value) {
            addCriterion("emp_Address >", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("emp_Address >=", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLessThan(String value) {
            addCriterion("emp_Address <", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLessThanOrEqualTo(String value) {
            addCriterion("emp_Address <=", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLike(String value) {
            addCriterion("emp_Address like", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotLike(String value) {
            addCriterion("emp_Address not like", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIn(List<String> values) {
            addCriterion("emp_Address in", values, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotIn(List<String> values) {
            addCriterion("emp_Address not in", values, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressBetween(String value1, String value2) {
            addCriterion("emp_Address between", value1, value2, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotBetween(String value1, String value2) {
            addCriterion("emp_Address not between", value1, value2, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNull() {
            addCriterion("emp_Phone is null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNotNull() {
            addCriterion("emp_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneEqualTo(String value) {
            addCriterion("emp_Phone =", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotEqualTo(String value) {
            addCriterion("emp_Phone <>", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThan(String value) {
            addCriterion("emp_Phone >", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("emp_Phone >=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThan(String value) {
            addCriterion("emp_Phone <", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThanOrEqualTo(String value) {
            addCriterion("emp_Phone <=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLike(String value) {
            addCriterion("emp_Phone like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotLike(String value) {
            addCriterion("emp_Phone not like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIn(List<String> values) {
            addCriterion("emp_Phone in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotIn(List<String> values) {
            addCriterion("emp_Phone not in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneBetween(String value1, String value2) {
            addCriterion("emp_Phone between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotBetween(String value1, String value2) {
            addCriterion("emp_Phone not between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIsNull() {
            addCriterion("emp_Email is null");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIsNotNull() {
            addCriterion("emp_Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmpEmailEqualTo(String value) {
            addCriterion("emp_Email =", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotEqualTo(String value) {
            addCriterion("emp_Email <>", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailGreaterThan(String value) {
            addCriterion("emp_Email >", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailGreaterThanOrEqualTo(String value) {
            addCriterion("emp_Email >=", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLessThan(String value) {
            addCriterion("emp_Email <", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLessThanOrEqualTo(String value) {
            addCriterion("emp_Email <=", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLike(String value) {
            addCriterion("emp_Email like", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotLike(String value) {
            addCriterion("emp_Email not like", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIn(List<String> values) {
            addCriterion("emp_Email in", values, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotIn(List<String> values) {
            addCriterion("emp_Email not in", values, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailBetween(String value1, String value2) {
            addCriterion("emp_Email between", value1, value2, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotBetween(String value1, String value2) {
            addCriterion("emp_Email not between", value1, value2, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpDeptIdIsNull() {
            addCriterion("emp_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpDeptIdIsNotNull() {
            addCriterion("emp_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpDeptIdEqualTo(Integer value) {
            addCriterion("emp_dept_id =", value, "empDeptId");
            return (Criteria) this;
        }

        public Criteria andEmpDeptIdNotEqualTo(Integer value) {
            addCriterion("emp_dept_id <>", value, "empDeptId");
            return (Criteria) this;
        }

        public Criteria andEmpDeptIdGreaterThan(Integer value) {
            addCriterion("emp_dept_id >", value, "empDeptId");
            return (Criteria) this;
        }

        public Criteria andEmpDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_dept_id >=", value, "empDeptId");
            return (Criteria) this;
        }

        public Criteria andEmpDeptIdLessThan(Integer value) {
            addCriterion("emp_dept_id <", value, "empDeptId");
            return (Criteria) this;
        }

        public Criteria andEmpDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_dept_id <=", value, "empDeptId");
            return (Criteria) this;
        }

        public Criteria andEmpDeptIdIn(List<Integer> values) {
            addCriterion("emp_dept_id in", values, "empDeptId");
            return (Criteria) this;
        }

        public Criteria andEmpDeptIdNotIn(List<Integer> values) {
            addCriterion("emp_dept_id not in", values, "empDeptId");
            return (Criteria) this;
        }

        public Criteria andEmpDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_dept_id between", value1, value2, "empDeptId");
            return (Criteria) this;
        }

        public Criteria andEmpDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_dept_id not between", value1, value2, "empDeptId");
            return (Criteria) this;
        }

        public Criteria andEmpPositionIsNull() {
            addCriterion("emp_Position is null");
            return (Criteria) this;
        }

        public Criteria andEmpPositionIsNotNull() {
            addCriterion("emp_Position is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPositionEqualTo(String value) {
            addCriterion("emp_Position =", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionNotEqualTo(String value) {
            addCriterion("emp_Position <>", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionGreaterThan(String value) {
            addCriterion("emp_Position >", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionGreaterThanOrEqualTo(String value) {
            addCriterion("emp_Position >=", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionLessThan(String value) {
            addCriterion("emp_Position <", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionLessThanOrEqualTo(String value) {
            addCriterion("emp_Position <=", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionLike(String value) {
            addCriterion("emp_Position like", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionNotLike(String value) {
            addCriterion("emp_Position not like", value, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionIn(List<String> values) {
            addCriterion("emp_Position in", values, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionNotIn(List<String> values) {
            addCriterion("emp_Position not in", values, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionBetween(String value1, String value2) {
            addCriterion("emp_Position between", value1, value2, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpPositionNotBetween(String value1, String value2) {
            addCriterion("emp_Position not between", value1, value2, "empPosition");
            return (Criteria) this;
        }

        public Criteria andEmpWagesIsNull() {
            addCriterion("emp_Wages is null");
            return (Criteria) this;
        }

        public Criteria andEmpWagesIsNotNull() {
            addCriterion("emp_Wages is not null");
            return (Criteria) this;
        }

        public Criteria andEmpWagesEqualTo(Double value) {
            addCriterion("emp_Wages =", value, "empWages");
            return (Criteria) this;
        }

        public Criteria andEmpWagesNotEqualTo(Double value) {
            addCriterion("emp_Wages <>", value, "empWages");
            return (Criteria) this;
        }

        public Criteria andEmpWagesGreaterThan(Double value) {
            addCriterion("emp_Wages >", value, "empWages");
            return (Criteria) this;
        }

        public Criteria andEmpWagesGreaterThanOrEqualTo(Double value) {
            addCriterion("emp_Wages >=", value, "empWages");
            return (Criteria) this;
        }

        public Criteria andEmpWagesLessThan(Double value) {
            addCriterion("emp_Wages <", value, "empWages");
            return (Criteria) this;
        }

        public Criteria andEmpWagesLessThanOrEqualTo(Double value) {
            addCriterion("emp_Wages <=", value, "empWages");
            return (Criteria) this;
        }

        public Criteria andEmpWagesIn(List<Double> values) {
            addCriterion("emp_Wages in", values, "empWages");
            return (Criteria) this;
        }

        public Criteria andEmpWagesNotIn(List<Double> values) {
            addCriterion("emp_Wages not in", values, "empWages");
            return (Criteria) this;
        }

        public Criteria andEmpWagesBetween(Double value1, Double value2) {
            addCriterion("emp_Wages between", value1, value2, "empWages");
            return (Criteria) this;
        }

        public Criteria andEmpWagesNotBetween(Double value1, Double value2) {
            addCriterion("emp_Wages not between", value1, value2, "empWages");
            return (Criteria) this;
        }

        public Criteria andGenTimeIsNull() {
            addCriterion("gen_time is null");
            return (Criteria) this;
        }

        public Criteria andGenTimeIsNotNull() {
            addCriterion("gen_time is not null");
            return (Criteria) this;
        }

        public Criteria andGenTimeEqualTo(Date value) {
            addCriterion("gen_time =", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeNotEqualTo(Date value) {
            addCriterion("gen_time <>", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeGreaterThan(Date value) {
            addCriterion("gen_time >", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gen_time >=", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeLessThan(Date value) {
            addCriterion("gen_time <", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeLessThanOrEqualTo(Date value) {
            addCriterion("gen_time <=", value, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeIn(List<Date> values) {
            addCriterion("gen_time in", values, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeNotIn(List<Date> values) {
            addCriterion("gen_time not in", values, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeBetween(Date value1, Date value2) {
            addCriterion("gen_time between", value1, value2, "genTime");
            return (Criteria) this;
        }

        public Criteria andGenTimeNotBetween(Date value1, Date value2) {
            addCriterion("gen_time not between", value1, value2, "genTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Integer value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Integer value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Integer value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Integer value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Integer value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Integer> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Integer> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Integer value1, Integer value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Integer value1, Integer value2) {
            addCriterion("valid not between", value1, value2, "valid");
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