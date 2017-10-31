package com.xiaohe.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AssessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssessExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("Aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("Aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("Aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("Aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("Aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("Aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("Aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("Aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("Aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("Aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("Aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andStidIsNull() {
            addCriterion("Stid is null");
            return (Criteria) this;
        }

        public Criteria andStidIsNotNull() {
            addCriterion("Stid is not null");
            return (Criteria) this;
        }

        public Criteria andStidEqualTo(Integer value) {
            addCriterion("Stid =", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotEqualTo(Integer value) {
            addCriterion("Stid <>", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThan(Integer value) {
            addCriterion("Stid >", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Stid >=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThan(Integer value) {
            addCriterion("Stid <", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThanOrEqualTo(Integer value) {
            addCriterion("Stid <=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidIn(List<Integer> values) {
            addCriterion("Stid in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotIn(List<Integer> values) {
            addCriterion("Stid not in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidBetween(Integer value1, Integer value2) {
            addCriterion("Stid between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotBetween(Integer value1, Integer value2) {
            addCriterion("Stid not between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andAdetailIsNull() {
            addCriterion("Adetail is null");
            return (Criteria) this;
        }

        public Criteria andAdetailIsNotNull() {
            addCriterion("Adetail is not null");
            return (Criteria) this;
        }

        public Criteria andAdetailEqualTo(String value) {
            addCriterion("Adetail =", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailNotEqualTo(String value) {
            addCriterion("Adetail <>", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailGreaterThan(String value) {
            addCriterion("Adetail >", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailGreaterThanOrEqualTo(String value) {
            addCriterion("Adetail >=", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailLessThan(String value) {
            addCriterion("Adetail <", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailLessThanOrEqualTo(String value) {
            addCriterion("Adetail <=", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailLike(String value) {
            addCriterion("Adetail like", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailNotLike(String value) {
            addCriterion("Adetail not like", value, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailIn(List<String> values) {
            addCriterion("Adetail in", values, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailNotIn(List<String> values) {
            addCriterion("Adetail not in", values, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailBetween(String value1, String value2) {
            addCriterion("Adetail between", value1, value2, "adetail");
            return (Criteria) this;
        }

        public Criteria andAdetailNotBetween(String value1, String value2) {
            addCriterion("Adetail not between", value1, value2, "adetail");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("Uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("Uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("Uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("Uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("Uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("Uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("Uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("Uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("Uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("Uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("Uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("Uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("Uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("Uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andAtimeIsNull() {
            addCriterion("Atime is null");
            return (Criteria) this;
        }

        public Criteria andAtimeIsNotNull() {
            addCriterion("Atime is not null");
            return (Criteria) this;
        }

        public Criteria andAtimeEqualTo(Date value) {
            addCriterionForJDBCDate("Atime =", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Atime <>", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Atime >", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Atime >=", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeLessThan(Date value) {
            addCriterionForJDBCDate("Atime <", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Atime <=", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeIn(List<Date> values) {
            addCriterionForJDBCDate("Atime in", values, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Atime not in", values, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Atime between", value1, value2, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Atime not between", value1, value2, "atime");
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