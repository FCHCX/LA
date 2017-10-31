package com.xiaohe.po;

import java.util.ArrayList;
import java.util.List;

public class BuycarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuycarExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("Bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("Bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("Bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("Bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("Bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("Bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("Bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("Bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("Bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("Bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("Bid not between", value1, value2, "bid");
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

        public Criteria andBimgpathIsNull() {
            addCriterion("Bimgpath is null");
            return (Criteria) this;
        }

        public Criteria andBimgpathIsNotNull() {
            addCriterion("Bimgpath is not null");
            return (Criteria) this;
        }

        public Criteria andBimgpathEqualTo(String value) {
            addCriterion("Bimgpath =", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathNotEqualTo(String value) {
            addCriterion("Bimgpath <>", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathGreaterThan(String value) {
            addCriterion("Bimgpath >", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathGreaterThanOrEqualTo(String value) {
            addCriterion("Bimgpath >=", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathLessThan(String value) {
            addCriterion("Bimgpath <", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathLessThanOrEqualTo(String value) {
            addCriterion("Bimgpath <=", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathLike(String value) {
            addCriterion("Bimgpath like", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathNotLike(String value) {
            addCriterion("Bimgpath not like", value, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathIn(List<String> values) {
            addCriterion("Bimgpath in", values, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathNotIn(List<String> values) {
            addCriterion("Bimgpath not in", values, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathBetween(String value1, String value2) {
            addCriterion("Bimgpath between", value1, value2, "bimgpath");
            return (Criteria) this;
        }

        public Criteria andBimgpathNotBetween(String value1, String value2) {
            addCriterion("Bimgpath not between", value1, value2, "bimgpath");
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

        public Criteria andSpriceIsNull() {
            addCriterion("Sprice is null");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNotNull() {
            addCriterion("Sprice is not null");
            return (Criteria) this;
        }

        public Criteria andSpriceEqualTo(Float value) {
            addCriterion("Sprice =", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotEqualTo(Float value) {
            addCriterion("Sprice <>", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThan(Float value) {
            addCriterion("Sprice >", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Sprice >=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThan(Float value) {
            addCriterion("Sprice <", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThanOrEqualTo(Float value) {
            addCriterion("Sprice <=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceIn(List<Float> values) {
            addCriterion("Sprice in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotIn(List<Float> values) {
            addCriterion("Sprice not in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceBetween(Float value1, Float value2) {
            addCriterion("Sprice between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotBetween(Float value1, Float value2) {
            addCriterion("Sprice not between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSnumIsNull() {
            addCriterion("Snum is null");
            return (Criteria) this;
        }

        public Criteria andSnumIsNotNull() {
            addCriterion("Snum is not null");
            return (Criteria) this;
        }

        public Criteria andSnumEqualTo(Integer value) {
            addCriterion("Snum =", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotEqualTo(Integer value) {
            addCriterion("Snum <>", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumGreaterThan(Integer value) {
            addCriterion("Snum >", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Snum >=", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumLessThan(Integer value) {
            addCriterion("Snum <", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumLessThanOrEqualTo(Integer value) {
            addCriterion("Snum <=", value, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumIn(List<Integer> values) {
            addCriterion("Snum in", values, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotIn(List<Integer> values) {
            addCriterion("Snum not in", values, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumBetween(Integer value1, Integer value2) {
            addCriterion("Snum between", value1, value2, "snum");
            return (Criteria) this;
        }

        public Criteria andSnumNotBetween(Integer value1, Integer value2) {
            addCriterion("Snum not between", value1, value2, "snum");
            return (Criteria) this;
        }

        public Criteria andSsumpriceIsNull() {
            addCriterion("Ssumprice is null");
            return (Criteria) this;
        }

        public Criteria andSsumpriceIsNotNull() {
            addCriterion("Ssumprice is not null");
            return (Criteria) this;
        }

        public Criteria andSsumpriceEqualTo(Float value) {
            addCriterion("Ssumprice =", value, "ssumprice");
            return (Criteria) this;
        }

        public Criteria andSsumpriceNotEqualTo(Float value) {
            addCriterion("Ssumprice <>", value, "ssumprice");
            return (Criteria) this;
        }

        public Criteria andSsumpriceGreaterThan(Float value) {
            addCriterion("Ssumprice >", value, "ssumprice");
            return (Criteria) this;
        }

        public Criteria andSsumpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Ssumprice >=", value, "ssumprice");
            return (Criteria) this;
        }

        public Criteria andSsumpriceLessThan(Float value) {
            addCriterion("Ssumprice <", value, "ssumprice");
            return (Criteria) this;
        }

        public Criteria andSsumpriceLessThanOrEqualTo(Float value) {
            addCriterion("Ssumprice <=", value, "ssumprice");
            return (Criteria) this;
        }

        public Criteria andSsumpriceIn(List<Float> values) {
            addCriterion("Ssumprice in", values, "ssumprice");
            return (Criteria) this;
        }

        public Criteria andSsumpriceNotIn(List<Float> values) {
            addCriterion("Ssumprice not in", values, "ssumprice");
            return (Criteria) this;
        }

        public Criteria andSsumpriceBetween(Float value1, Float value2) {
            addCriterion("Ssumprice between", value1, value2, "ssumprice");
            return (Criteria) this;
        }

        public Criteria andSsumpriceNotBetween(Float value1, Float value2) {
            addCriterion("Ssumprice not between", value1, value2, "ssumprice");
            return (Criteria) this;
        }

        public Criteria andSoperateIsNull() {
            addCriterion("Soperate is null");
            return (Criteria) this;
        }

        public Criteria andSoperateIsNotNull() {
            addCriterion("Soperate is not null");
            return (Criteria) this;
        }

        public Criteria andSoperateEqualTo(String value) {
            addCriterion("Soperate =", value, "soperate");
            return (Criteria) this;
        }

        public Criteria andSoperateNotEqualTo(String value) {
            addCriterion("Soperate <>", value, "soperate");
            return (Criteria) this;
        }

        public Criteria andSoperateGreaterThan(String value) {
            addCriterion("Soperate >", value, "soperate");
            return (Criteria) this;
        }

        public Criteria andSoperateGreaterThanOrEqualTo(String value) {
            addCriterion("Soperate >=", value, "soperate");
            return (Criteria) this;
        }

        public Criteria andSoperateLessThan(String value) {
            addCriterion("Soperate <", value, "soperate");
            return (Criteria) this;
        }

        public Criteria andSoperateLessThanOrEqualTo(String value) {
            addCriterion("Soperate <=", value, "soperate");
            return (Criteria) this;
        }

        public Criteria andSoperateLike(String value) {
            addCriterion("Soperate like", value, "soperate");
            return (Criteria) this;
        }

        public Criteria andSoperateNotLike(String value) {
            addCriterion("Soperate not like", value, "soperate");
            return (Criteria) this;
        }

        public Criteria andSoperateIn(List<String> values) {
            addCriterion("Soperate in", values, "soperate");
            return (Criteria) this;
        }

        public Criteria andSoperateNotIn(List<String> values) {
            addCriterion("Soperate not in", values, "soperate");
            return (Criteria) this;
        }

        public Criteria andSoperateBetween(String value1, String value2) {
            addCriterion("Soperate between", value1, value2, "soperate");
            return (Criteria) this;
        }

        public Criteria andSoperateNotBetween(String value1, String value2) {
            addCriterion("Soperate not between", value1, value2, "soperate");
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