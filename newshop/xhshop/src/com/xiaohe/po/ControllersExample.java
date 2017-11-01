package com.xiaohe.po;

import java.util.ArrayList;
import java.util.List;

public class ControllersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ControllersExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("Cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("Cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("Cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("Cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("Cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("Cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("Cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("Cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("Cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("Cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("Cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("Cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("Cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("Cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("Cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("Cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("Cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("Cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("Cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("Cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("Cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("Cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("Cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("Cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("Cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCpwdIsNull() {
            addCriterion("Cpwd is null");
            return (Criteria) this;
        }

        public Criteria andCpwdIsNotNull() {
            addCriterion("Cpwd is not null");
            return (Criteria) this;
        }

        public Criteria andCpwdEqualTo(String value) {
            addCriterion("Cpwd =", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdNotEqualTo(String value) {
            addCriterion("Cpwd <>", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdGreaterThan(String value) {
            addCriterion("Cpwd >", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdGreaterThanOrEqualTo(String value) {
            addCriterion("Cpwd >=", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdLessThan(String value) {
            addCriterion("Cpwd <", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdLessThanOrEqualTo(String value) {
            addCriterion("Cpwd <=", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdLike(String value) {
            addCriterion("Cpwd like", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdNotLike(String value) {
            addCriterion("Cpwd not like", value, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdIn(List<String> values) {
            addCriterion("Cpwd in", values, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdNotIn(List<String> values) {
            addCriterion("Cpwd not in", values, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdBetween(String value1, String value2) {
            addCriterion("Cpwd between", value1, value2, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCpwdNotBetween(String value1, String value2) {
            addCriterion("Cpwd not between", value1, value2, "cpwd");
            return (Criteria) this;
        }

        public Criteria andCroleidIsNull() {
            addCriterion("Croleid is null");
            return (Criteria) this;
        }

        public Criteria andCroleidIsNotNull() {
            addCriterion("Croleid is not null");
            return (Criteria) this;
        }

        public Criteria andCroleidEqualTo(Integer value) {
            addCriterion("Croleid =", value, "croleid");
            return (Criteria) this;
        }

        public Criteria andCroleidNotEqualTo(Integer value) {
            addCriterion("Croleid <>", value, "croleid");
            return (Criteria) this;
        }

        public Criteria andCroleidGreaterThan(Integer value) {
            addCriterion("Croleid >", value, "croleid");
            return (Criteria) this;
        }

        public Criteria andCroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Croleid >=", value, "croleid");
            return (Criteria) this;
        }

        public Criteria andCroleidLessThan(Integer value) {
            addCriterion("Croleid <", value, "croleid");
            return (Criteria) this;
        }

        public Criteria andCroleidLessThanOrEqualTo(Integer value) {
            addCriterion("Croleid <=", value, "croleid");
            return (Criteria) this;
        }

        public Criteria andCroleidIn(List<Integer> values) {
            addCriterion("Croleid in", values, "croleid");
            return (Criteria) this;
        }

        public Criteria andCroleidNotIn(List<Integer> values) {
            addCriterion("Croleid not in", values, "croleid");
            return (Criteria) this;
        }

        public Criteria andCroleidBetween(Integer value1, Integer value2) {
            addCriterion("Croleid between", value1, value2, "croleid");
            return (Criteria) this;
        }

        public Criteria andCroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("Croleid not between", value1, value2, "croleid");
            return (Criteria) this;
        }

        public Criteria andCsexIsNull() {
            addCriterion("Csex is null");
            return (Criteria) this;
        }

        public Criteria andCsexIsNotNull() {
            addCriterion("Csex is not null");
            return (Criteria) this;
        }

        public Criteria andCsexEqualTo(String value) {
            addCriterion("Csex =", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotEqualTo(String value) {
            addCriterion("Csex <>", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThan(String value) {
            addCriterion("Csex >", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThanOrEqualTo(String value) {
            addCriterion("Csex >=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThan(String value) {
            addCriterion("Csex <", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThanOrEqualTo(String value) {
            addCriterion("Csex <=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLike(String value) {
            addCriterion("Csex like", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotLike(String value) {
            addCriterion("Csex not like", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexIn(List<String> values) {
            addCriterion("Csex in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotIn(List<String> values) {
            addCriterion("Csex not in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexBetween(String value1, String value2) {
            addCriterion("Csex between", value1, value2, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotBetween(String value1, String value2) {
            addCriterion("Csex not between", value1, value2, "csex");
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