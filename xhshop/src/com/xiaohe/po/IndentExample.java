package com.xiaohe.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class IndentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndentExample() {
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

        public Criteria andBconsigneeIsNull() {
            addCriterion("Bconsignee is null");
            return (Criteria) this;
        }

        public Criteria andBconsigneeIsNotNull() {
            addCriterion("Bconsignee is not null");
            return (Criteria) this;
        }

        public Criteria andBconsigneeEqualTo(String value) {
            addCriterion("Bconsignee =", value, "bconsignee");
            return (Criteria) this;
        }

        public Criteria andBconsigneeNotEqualTo(String value) {
            addCriterion("Bconsignee <>", value, "bconsignee");
            return (Criteria) this;
        }

        public Criteria andBconsigneeGreaterThan(String value) {
            addCriterion("Bconsignee >", value, "bconsignee");
            return (Criteria) this;
        }

        public Criteria andBconsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("Bconsignee >=", value, "bconsignee");
            return (Criteria) this;
        }

        public Criteria andBconsigneeLessThan(String value) {
            addCriterion("Bconsignee <", value, "bconsignee");
            return (Criteria) this;
        }

        public Criteria andBconsigneeLessThanOrEqualTo(String value) {
            addCriterion("Bconsignee <=", value, "bconsignee");
            return (Criteria) this;
        }

        public Criteria andBconsigneeLike(String value) {
            addCriterion("Bconsignee like", value, "bconsignee");
            return (Criteria) this;
        }

        public Criteria andBconsigneeNotLike(String value) {
            addCriterion("Bconsignee not like", value, "bconsignee");
            return (Criteria) this;
        }

        public Criteria andBconsigneeIn(List<String> values) {
            addCriterion("Bconsignee in", values, "bconsignee");
            return (Criteria) this;
        }

        public Criteria andBconsigneeNotIn(List<String> values) {
            addCriterion("Bconsignee not in", values, "bconsignee");
            return (Criteria) this;
        }

        public Criteria andBconsigneeBetween(String value1, String value2) {
            addCriterion("Bconsignee between", value1, value2, "bconsignee");
            return (Criteria) this;
        }

        public Criteria andBconsigneeNotBetween(String value1, String value2) {
            addCriterion("Bconsignee not between", value1, value2, "bconsignee");
            return (Criteria) this;
        }

        public Criteria andBsidIsNull() {
            addCriterion("Bsid is null");
            return (Criteria) this;
        }

        public Criteria andBsidIsNotNull() {
            addCriterion("Bsid is not null");
            return (Criteria) this;
        }

        public Criteria andBsidEqualTo(Integer value) {
            addCriterion("Bsid =", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotEqualTo(Integer value) {
            addCriterion("Bsid <>", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidGreaterThan(Integer value) {
            addCriterion("Bsid >", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Bsid >=", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLessThan(Integer value) {
            addCriterion("Bsid <", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLessThanOrEqualTo(Integer value) {
            addCriterion("Bsid <=", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidIn(List<Integer> values) {
            addCriterion("Bsid in", values, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotIn(List<Integer> values) {
            addCriterion("Bsid not in", values, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidBetween(Integer value1, Integer value2) {
            addCriterion("Bsid between", value1, value2, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotBetween(Integer value1, Integer value2) {
            addCriterion("Bsid not between", value1, value2, "bsid");
            return (Criteria) this;
        }

        public Criteria andBaddressIsNull() {
            addCriterion("Baddress is null");
            return (Criteria) this;
        }

        public Criteria andBaddressIsNotNull() {
            addCriterion("Baddress is not null");
            return (Criteria) this;
        }

        public Criteria andBaddressEqualTo(Integer value) {
            addCriterion("Baddress =", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotEqualTo(Integer value) {
            addCriterion("Baddress <>", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressGreaterThan(Integer value) {
            addCriterion("Baddress >", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("Baddress >=", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressLessThan(Integer value) {
            addCriterion("Baddress <", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressLessThanOrEqualTo(Integer value) {
            addCriterion("Baddress <=", value, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressIn(List<Integer> values) {
            addCriterion("Baddress in", values, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotIn(List<Integer> values) {
            addCriterion("Baddress not in", values, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressBetween(Integer value1, Integer value2) {
            addCriterion("Baddress between", value1, value2, "baddress");
            return (Criteria) this;
        }

        public Criteria andBaddressNotBetween(Integer value1, Integer value2) {
            addCriterion("Baddress not between", value1, value2, "baddress");
            return (Criteria) this;
        }

        public Criteria andBphoneIsNull() {
            addCriterion("Bphone is null");
            return (Criteria) this;
        }

        public Criteria andBphoneIsNotNull() {
            addCriterion("Bphone is not null");
            return (Criteria) this;
        }

        public Criteria andBphoneEqualTo(Integer value) {
            addCriterion("Bphone =", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotEqualTo(Integer value) {
            addCriterion("Bphone <>", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneGreaterThan(Integer value) {
            addCriterion("Bphone >", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("Bphone >=", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLessThan(Integer value) {
            addCriterion("Bphone <", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneLessThanOrEqualTo(Integer value) {
            addCriterion("Bphone <=", value, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneIn(List<Integer> values) {
            addCriterion("Bphone in", values, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotIn(List<Integer> values) {
            addCriterion("Bphone not in", values, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneBetween(Integer value1, Integer value2) {
            addCriterion("Bphone between", value1, value2, "bphone");
            return (Criteria) this;
        }

        public Criteria andBphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("Bphone not between", value1, value2, "bphone");
            return (Criteria) this;
        }

        public Criteria andBdidIsNull() {
            addCriterion("Bdid is null");
            return (Criteria) this;
        }

        public Criteria andBdidIsNotNull() {
            addCriterion("Bdid is not null");
            return (Criteria) this;
        }

        public Criteria andBdidEqualTo(Integer value) {
            addCriterion("Bdid =", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotEqualTo(Integer value) {
            addCriterion("Bdid <>", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThan(Integer value) {
            addCriterion("Bdid >", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Bdid >=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThan(Integer value) {
            addCriterion("Bdid <", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThanOrEqualTo(Integer value) {
            addCriterion("Bdid <=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidIn(List<Integer> values) {
            addCriterion("Bdid in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotIn(List<Integer> values) {
            addCriterion("Bdid not in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidBetween(Integer value1, Integer value2) {
            addCriterion("Bdid between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotBetween(Integer value1, Integer value2) {
            addCriterion("Bdid not between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdateIsNull() {
            addCriterion("Bdate is null");
            return (Criteria) this;
        }

        public Criteria andBdateIsNotNull() {
            addCriterion("Bdate is not null");
            return (Criteria) this;
        }

        public Criteria andBdateEqualTo(Date value) {
            addCriterionForJDBCDate("Bdate =", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Bdate <>", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThan(Date value) {
            addCriterionForJDBCDate("Bdate >", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Bdate >=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThan(Date value) {
            addCriterionForJDBCDate("Bdate <", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Bdate <=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateIn(List<Date> values) {
            addCriterionForJDBCDate("Bdate in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Bdate not in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Bdate between", value1, value2, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Bdate not between", value1, value2, "bdate");
            return (Criteria) this;
        }

        public Criteria andBunameIsNull() {
            addCriterion("Buname is null");
            return (Criteria) this;
        }

        public Criteria andBunameIsNotNull() {
            addCriterion("Buname is not null");
            return (Criteria) this;
        }

        public Criteria andBunameEqualTo(String value) {
            addCriterion("Buname =", value, "buname");
            return (Criteria) this;
        }

        public Criteria andBunameNotEqualTo(String value) {
            addCriterion("Buname <>", value, "buname");
            return (Criteria) this;
        }

        public Criteria andBunameGreaterThan(String value) {
            addCriterion("Buname >", value, "buname");
            return (Criteria) this;
        }

        public Criteria andBunameGreaterThanOrEqualTo(String value) {
            addCriterion("Buname >=", value, "buname");
            return (Criteria) this;
        }

        public Criteria andBunameLessThan(String value) {
            addCriterion("Buname <", value, "buname");
            return (Criteria) this;
        }

        public Criteria andBunameLessThanOrEqualTo(String value) {
            addCriterion("Buname <=", value, "buname");
            return (Criteria) this;
        }

        public Criteria andBunameLike(String value) {
            addCriterion("Buname like", value, "buname");
            return (Criteria) this;
        }

        public Criteria andBunameNotLike(String value) {
            addCriterion("Buname not like", value, "buname");
            return (Criteria) this;
        }

        public Criteria andBunameIn(List<String> values) {
            addCriterion("Buname in", values, "buname");
            return (Criteria) this;
        }

        public Criteria andBunameNotIn(List<String> values) {
            addCriterion("Buname not in", values, "buname");
            return (Criteria) this;
        }

        public Criteria andBunameBetween(String value1, String value2) {
            addCriterion("Buname between", value1, value2, "buname");
            return (Criteria) this;
        }

        public Criteria andBunameNotBetween(String value1, String value2) {
            addCriterion("Buname not between", value1, value2, "buname");
            return (Criteria) this;
        }

        public Criteria andBstatusIsNull() {
            addCriterion("Bstatus is null");
            return (Criteria) this;
        }

        public Criteria andBstatusIsNotNull() {
            addCriterion("Bstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBstatusEqualTo(String value) {
            addCriterion("Bstatus =", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotEqualTo(String value) {
            addCriterion("Bstatus <>", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusGreaterThan(String value) {
            addCriterion("Bstatus >", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusGreaterThanOrEqualTo(String value) {
            addCriterion("Bstatus >=", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusLessThan(String value) {
            addCriterion("Bstatus <", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusLessThanOrEqualTo(String value) {
            addCriterion("Bstatus <=", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusLike(String value) {
            addCriterion("Bstatus like", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotLike(String value) {
            addCriterion("Bstatus not like", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusIn(List<String> values) {
            addCriterion("Bstatus in", values, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotIn(List<String> values) {
            addCriterion("Bstatus not in", values, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusBetween(String value1, String value2) {
            addCriterion("Bstatus between", value1, value2, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotBetween(String value1, String value2) {
            addCriterion("Bstatus not between", value1, value2, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBpriceIsNull() {
            addCriterion("Bprice is null");
            return (Criteria) this;
        }

        public Criteria andBpriceIsNotNull() {
            addCriterion("Bprice is not null");
            return (Criteria) this;
        }

        public Criteria andBpriceEqualTo(Float value) {
            addCriterion("Bprice =", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceNotEqualTo(Float value) {
            addCriterion("Bprice <>", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceGreaterThan(Float value) {
            addCriterion("Bprice >", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Bprice >=", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceLessThan(Float value) {
            addCriterion("Bprice <", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceLessThanOrEqualTo(Float value) {
            addCriterion("Bprice <=", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceIn(List<Float> values) {
            addCriterion("Bprice in", values, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceNotIn(List<Float> values) {
            addCriterion("Bprice not in", values, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceBetween(Float value1, Float value2) {
            addCriterion("Bprice between", value1, value2, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceNotBetween(Float value1, Float value2) {
            addCriterion("Bprice not between", value1, value2, "bprice");
            return (Criteria) this;
        }

        public Criteria andBdeliverIsNull() {
            addCriterion("Bdeliver is null");
            return (Criteria) this;
        }

        public Criteria andBdeliverIsNotNull() {
            addCriterion("Bdeliver is not null");
            return (Criteria) this;
        }

        public Criteria andBdeliverEqualTo(String value) {
            addCriterion("Bdeliver =", value, "bdeliver");
            return (Criteria) this;
        }

        public Criteria andBdeliverNotEqualTo(String value) {
            addCriterion("Bdeliver <>", value, "bdeliver");
            return (Criteria) this;
        }

        public Criteria andBdeliverGreaterThan(String value) {
            addCriterion("Bdeliver >", value, "bdeliver");
            return (Criteria) this;
        }

        public Criteria andBdeliverGreaterThanOrEqualTo(String value) {
            addCriterion("Bdeliver >=", value, "bdeliver");
            return (Criteria) this;
        }

        public Criteria andBdeliverLessThan(String value) {
            addCriterion("Bdeliver <", value, "bdeliver");
            return (Criteria) this;
        }

        public Criteria andBdeliverLessThanOrEqualTo(String value) {
            addCriterion("Bdeliver <=", value, "bdeliver");
            return (Criteria) this;
        }

        public Criteria andBdeliverLike(String value) {
            addCriterion("Bdeliver like", value, "bdeliver");
            return (Criteria) this;
        }

        public Criteria andBdeliverNotLike(String value) {
            addCriterion("Bdeliver not like", value, "bdeliver");
            return (Criteria) this;
        }

        public Criteria andBdeliverIn(List<String> values) {
            addCriterion("Bdeliver in", values, "bdeliver");
            return (Criteria) this;
        }

        public Criteria andBdeliverNotIn(List<String> values) {
            addCriterion("Bdeliver not in", values, "bdeliver");
            return (Criteria) this;
        }

        public Criteria andBdeliverBetween(String value1, String value2) {
            addCriterion("Bdeliver between", value1, value2, "bdeliver");
            return (Criteria) this;
        }

        public Criteria andBdeliverNotBetween(String value1, String value2) {
            addCriterion("Bdeliver not between", value1, value2, "bdeliver");
            return (Criteria) this;
        }

        public Criteria andBordertimeIsNull() {
            addCriterion("Bordertime is null");
            return (Criteria) this;
        }

        public Criteria andBordertimeIsNotNull() {
            addCriterion("Bordertime is not null");
            return (Criteria) this;
        }

        public Criteria andBordertimeEqualTo(Date value) {
            addCriterionForJDBCDate("Bordertime =", value, "bordertime");
            return (Criteria) this;
        }

        public Criteria andBordertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Bordertime <>", value, "bordertime");
            return (Criteria) this;
        }

        public Criteria andBordertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Bordertime >", value, "bordertime");
            return (Criteria) this;
        }

        public Criteria andBordertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Bordertime >=", value, "bordertime");
            return (Criteria) this;
        }

        public Criteria andBordertimeLessThan(Date value) {
            addCriterionForJDBCDate("Bordertime <", value, "bordertime");
            return (Criteria) this;
        }

        public Criteria andBordertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Bordertime <=", value, "bordertime");
            return (Criteria) this;
        }

        public Criteria andBordertimeIn(List<Date> values) {
            addCriterionForJDBCDate("Bordertime in", values, "bordertime");
            return (Criteria) this;
        }

        public Criteria andBordertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Bordertime not in", values, "bordertime");
            return (Criteria) this;
        }

        public Criteria andBordertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Bordertime between", value1, value2, "bordertime");
            return (Criteria) this;
        }

        public Criteria andBordertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Bordertime not between", value1, value2, "bordertime");
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