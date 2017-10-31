package com.xiaohe.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShopinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopinfoExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("Sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("Sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("Sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("Sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("Sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("Sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("Sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("Sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("Sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("Sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("Sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("Sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("Sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("Sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("Sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("Sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("Sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("Sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("Sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("Sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("Sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("Sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("Sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("Sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("Sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSdetailIsNull() {
            addCriterion("Sdetail is null");
            return (Criteria) this;
        }

        public Criteria andSdetailIsNotNull() {
            addCriterion("Sdetail is not null");
            return (Criteria) this;
        }

        public Criteria andSdetailEqualTo(String value) {
            addCriterion("Sdetail =", value, "sdetail");
            return (Criteria) this;
        }

        public Criteria andSdetailNotEqualTo(String value) {
            addCriterion("Sdetail <>", value, "sdetail");
            return (Criteria) this;
        }

        public Criteria andSdetailGreaterThan(String value) {
            addCriterion("Sdetail >", value, "sdetail");
            return (Criteria) this;
        }

        public Criteria andSdetailGreaterThanOrEqualTo(String value) {
            addCriterion("Sdetail >=", value, "sdetail");
            return (Criteria) this;
        }

        public Criteria andSdetailLessThan(String value) {
            addCriterion("Sdetail <", value, "sdetail");
            return (Criteria) this;
        }

        public Criteria andSdetailLessThanOrEqualTo(String value) {
            addCriterion("Sdetail <=", value, "sdetail");
            return (Criteria) this;
        }

        public Criteria andSdetailLike(String value) {
            addCriterion("Sdetail like", value, "sdetail");
            return (Criteria) this;
        }

        public Criteria andSdetailNotLike(String value) {
            addCriterion("Sdetail not like", value, "sdetail");
            return (Criteria) this;
        }

        public Criteria andSdetailIn(List<String> values) {
            addCriterion("Sdetail in", values, "sdetail");
            return (Criteria) this;
        }

        public Criteria andSdetailNotIn(List<String> values) {
            addCriterion("Sdetail not in", values, "sdetail");
            return (Criteria) this;
        }

        public Criteria andSdetailBetween(String value1, String value2) {
            addCriterion("Sdetail between", value1, value2, "sdetail");
            return (Criteria) this;
        }

        public Criteria andSdetailNotBetween(String value1, String value2) {
            addCriterion("Sdetail not between", value1, value2, "sdetail");
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

        public Criteria andSimgpathIsNull() {
            addCriterion("Simgpath is null");
            return (Criteria) this;
        }

        public Criteria andSimgpathIsNotNull() {
            addCriterion("Simgpath is not null");
            return (Criteria) this;
        }

        public Criteria andSimgpathEqualTo(String value) {
            addCriterion("Simgpath =", value, "simgpath");
            return (Criteria) this;
        }

        public Criteria andSimgpathNotEqualTo(String value) {
            addCriterion("Simgpath <>", value, "simgpath");
            return (Criteria) this;
        }

        public Criteria andSimgpathGreaterThan(String value) {
            addCriterion("Simgpath >", value, "simgpath");
            return (Criteria) this;
        }

        public Criteria andSimgpathGreaterThanOrEqualTo(String value) {
            addCriterion("Simgpath >=", value, "simgpath");
            return (Criteria) this;
        }

        public Criteria andSimgpathLessThan(String value) {
            addCriterion("Simgpath <", value, "simgpath");
            return (Criteria) this;
        }

        public Criteria andSimgpathLessThanOrEqualTo(String value) {
            addCriterion("Simgpath <=", value, "simgpath");
            return (Criteria) this;
        }

        public Criteria andSimgpathLike(String value) {
            addCriterion("Simgpath like", value, "simgpath");
            return (Criteria) this;
        }

        public Criteria andSimgpathNotLike(String value) {
            addCriterion("Simgpath not like", value, "simgpath");
            return (Criteria) this;
        }

        public Criteria andSimgpathIn(List<String> values) {
            addCriterion("Simgpath in", values, "simgpath");
            return (Criteria) this;
        }

        public Criteria andSimgpathNotIn(List<String> values) {
            addCriterion("Simgpath not in", values, "simgpath");
            return (Criteria) this;
        }

        public Criteria andSimgpathBetween(String value1, String value2) {
            addCriterion("Simgpath between", value1, value2, "simgpath");
            return (Criteria) this;
        }

        public Criteria andSimgpathNotBetween(String value1, String value2) {
            addCriterion("Simgpath not between", value1, value2, "simgpath");
            return (Criteria) this;
        }

        public Criteria andStypeIsNull() {
            addCriterion("Stype is null");
            return (Criteria) this;
        }

        public Criteria andStypeIsNotNull() {
            addCriterion("Stype is not null");
            return (Criteria) this;
        }

        public Criteria andStypeEqualTo(String value) {
            addCriterion("Stype =", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotEqualTo(String value) {
            addCriterion("Stype <>", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThan(String value) {
            addCriterion("Stype >", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThanOrEqualTo(String value) {
            addCriterion("Stype >=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThan(String value) {
            addCriterion("Stype <", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThanOrEqualTo(String value) {
            addCriterion("Stype <=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLike(String value) {
            addCriterion("Stype like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotLike(String value) {
            addCriterion("Stype not like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeIn(List<String> values) {
            addCriterion("Stype in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotIn(List<String> values) {
            addCriterion("Stype not in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeBetween(String value1, String value2) {
            addCriterion("Stype between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotBetween(String value1, String value2) {
            addCriterion("Stype not between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andSweightIsNull() {
            addCriterion("Sweight is null");
            return (Criteria) this;
        }

        public Criteria andSweightIsNotNull() {
            addCriterion("Sweight is not null");
            return (Criteria) this;
        }

        public Criteria andSweightEqualTo(Float value) {
            addCriterion("Sweight =", value, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightNotEqualTo(Float value) {
            addCriterion("Sweight <>", value, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightGreaterThan(Float value) {
            addCriterion("Sweight >", value, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightGreaterThanOrEqualTo(Float value) {
            addCriterion("Sweight >=", value, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightLessThan(Float value) {
            addCriterion("Sweight <", value, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightLessThanOrEqualTo(Float value) {
            addCriterion("Sweight <=", value, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightIn(List<Float> values) {
            addCriterion("Sweight in", values, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightNotIn(List<Float> values) {
            addCriterion("Sweight not in", values, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightBetween(Float value1, Float value2) {
            addCriterion("Sweight between", value1, value2, "sweight");
            return (Criteria) this;
        }

        public Criteria andSweightNotBetween(Float value1, Float value2) {
            addCriterion("Sweight not between", value1, value2, "sweight");
            return (Criteria) this;
        }

        public Criteria andSbrandIsNull() {
            addCriterion("Sbrand is null");
            return (Criteria) this;
        }

        public Criteria andSbrandIsNotNull() {
            addCriterion("Sbrand is not null");
            return (Criteria) this;
        }

        public Criteria andSbrandEqualTo(String value) {
            addCriterion("Sbrand =", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandNotEqualTo(String value) {
            addCriterion("Sbrand <>", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandGreaterThan(String value) {
            addCriterion("Sbrand >", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandGreaterThanOrEqualTo(String value) {
            addCriterion("Sbrand >=", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandLessThan(String value) {
            addCriterion("Sbrand <", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandLessThanOrEqualTo(String value) {
            addCriterion("Sbrand <=", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandLike(String value) {
            addCriterion("Sbrand like", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandNotLike(String value) {
            addCriterion("Sbrand not like", value, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandIn(List<String> values) {
            addCriterion("Sbrand in", values, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandNotIn(List<String> values) {
            addCriterion("Sbrand not in", values, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandBetween(String value1, String value2) {
            addCriterion("Sbrand between", value1, value2, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSbrandNotBetween(String value1, String value2) {
            addCriterion("Sbrand not between", value1, value2, "sbrand");
            return (Criteria) this;
        }

        public Criteria andSfactoryIsNull() {
            addCriterion("Sfactory is null");
            return (Criteria) this;
        }

        public Criteria andSfactoryIsNotNull() {
            addCriterion("Sfactory is not null");
            return (Criteria) this;
        }

        public Criteria andSfactoryEqualTo(String value) {
            addCriterion("Sfactory =", value, "sfactory");
            return (Criteria) this;
        }

        public Criteria andSfactoryNotEqualTo(String value) {
            addCriterion("Sfactory <>", value, "sfactory");
            return (Criteria) this;
        }

        public Criteria andSfactoryGreaterThan(String value) {
            addCriterion("Sfactory >", value, "sfactory");
            return (Criteria) this;
        }

        public Criteria andSfactoryGreaterThanOrEqualTo(String value) {
            addCriterion("Sfactory >=", value, "sfactory");
            return (Criteria) this;
        }

        public Criteria andSfactoryLessThan(String value) {
            addCriterion("Sfactory <", value, "sfactory");
            return (Criteria) this;
        }

        public Criteria andSfactoryLessThanOrEqualTo(String value) {
            addCriterion("Sfactory <=", value, "sfactory");
            return (Criteria) this;
        }

        public Criteria andSfactoryLike(String value) {
            addCriterion("Sfactory like", value, "sfactory");
            return (Criteria) this;
        }

        public Criteria andSfactoryNotLike(String value) {
            addCriterion("Sfactory not like", value, "sfactory");
            return (Criteria) this;
        }

        public Criteria andSfactoryIn(List<String> values) {
            addCriterion("Sfactory in", values, "sfactory");
            return (Criteria) this;
        }

        public Criteria andSfactoryNotIn(List<String> values) {
            addCriterion("Sfactory not in", values, "sfactory");
            return (Criteria) this;
        }

        public Criteria andSfactoryBetween(String value1, String value2) {
            addCriterion("Sfactory between", value1, value2, "sfactory");
            return (Criteria) this;
        }

        public Criteria andSfactoryNotBetween(String value1, String value2) {
            addCriterion("Sfactory not between", value1, value2, "sfactory");
            return (Criteria) this;
        }

        public Criteria andSfaddressIsNull() {
            addCriterion("Sfaddress is null");
            return (Criteria) this;
        }

        public Criteria andSfaddressIsNotNull() {
            addCriterion("Sfaddress is not null");
            return (Criteria) this;
        }

        public Criteria andSfaddressEqualTo(String value) {
            addCriterion("Sfaddress =", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressNotEqualTo(String value) {
            addCriterion("Sfaddress <>", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressGreaterThan(String value) {
            addCriterion("Sfaddress >", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressGreaterThanOrEqualTo(String value) {
            addCriterion("Sfaddress >=", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressLessThan(String value) {
            addCriterion("Sfaddress <", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressLessThanOrEqualTo(String value) {
            addCriterion("Sfaddress <=", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressLike(String value) {
            addCriterion("Sfaddress like", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressNotLike(String value) {
            addCriterion("Sfaddress not like", value, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressIn(List<String> values) {
            addCriterion("Sfaddress in", values, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressNotIn(List<String> values) {
            addCriterion("Sfaddress not in", values, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressBetween(String value1, String value2) {
            addCriterion("Sfaddress between", value1, value2, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSfaddressNotBetween(String value1, String value2) {
            addCriterion("Sfaddress not between", value1, value2, "sfaddress");
            return (Criteria) this;
        }

        public Criteria andSpronumIsNull() {
            addCriterion("Spronum is null");
            return (Criteria) this;
        }

        public Criteria andSpronumIsNotNull() {
            addCriterion("Spronum is not null");
            return (Criteria) this;
        }

        public Criteria andSpronumEqualTo(Integer value) {
            addCriterion("Spronum =", value, "spronum");
            return (Criteria) this;
        }

        public Criteria andSpronumNotEqualTo(Integer value) {
            addCriterion("Spronum <>", value, "spronum");
            return (Criteria) this;
        }

        public Criteria andSpronumGreaterThan(Integer value) {
            addCriterion("Spronum >", value, "spronum");
            return (Criteria) this;
        }

        public Criteria andSpronumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Spronum >=", value, "spronum");
            return (Criteria) this;
        }

        public Criteria andSpronumLessThan(Integer value) {
            addCriterion("Spronum <", value, "spronum");
            return (Criteria) this;
        }

        public Criteria andSpronumLessThanOrEqualTo(Integer value) {
            addCriterion("Spronum <=", value, "spronum");
            return (Criteria) this;
        }

        public Criteria andSpronumIn(List<Integer> values) {
            addCriterion("Spronum in", values, "spronum");
            return (Criteria) this;
        }

        public Criteria andSpronumNotIn(List<Integer> values) {
            addCriterion("Spronum not in", values, "spronum");
            return (Criteria) this;
        }

        public Criteria andSpronumBetween(Integer value1, Integer value2) {
            addCriterion("Spronum between", value1, value2, "spronum");
            return (Criteria) this;
        }

        public Criteria andSpronumNotBetween(Integer value1, Integer value2) {
            addCriterion("Spronum not between", value1, value2, "spronum");
            return (Criteria) this;
        }

        public Criteria andSstanumIsNull() {
            addCriterion("Sstanum is null");
            return (Criteria) this;
        }

        public Criteria andSstanumIsNotNull() {
            addCriterion("Sstanum is not null");
            return (Criteria) this;
        }

        public Criteria andSstanumEqualTo(String value) {
            addCriterion("Sstanum =", value, "sstanum");
            return (Criteria) this;
        }

        public Criteria andSstanumNotEqualTo(String value) {
            addCriterion("Sstanum <>", value, "sstanum");
            return (Criteria) this;
        }

        public Criteria andSstanumGreaterThan(String value) {
            addCriterion("Sstanum >", value, "sstanum");
            return (Criteria) this;
        }

        public Criteria andSstanumGreaterThanOrEqualTo(String value) {
            addCriterion("Sstanum >=", value, "sstanum");
            return (Criteria) this;
        }

        public Criteria andSstanumLessThan(String value) {
            addCriterion("Sstanum <", value, "sstanum");
            return (Criteria) this;
        }

        public Criteria andSstanumLessThanOrEqualTo(String value) {
            addCriterion("Sstanum <=", value, "sstanum");
            return (Criteria) this;
        }

        public Criteria andSstanumLike(String value) {
            addCriterion("Sstanum like", value, "sstanum");
            return (Criteria) this;
        }

        public Criteria andSstanumNotLike(String value) {
            addCriterion("Sstanum not like", value, "sstanum");
            return (Criteria) this;
        }

        public Criteria andSstanumIn(List<String> values) {
            addCriterion("Sstanum in", values, "sstanum");
            return (Criteria) this;
        }

        public Criteria andSstanumNotIn(List<String> values) {
            addCriterion("Sstanum not in", values, "sstanum");
            return (Criteria) this;
        }

        public Criteria andSstanumBetween(String value1, String value2) {
            addCriterion("Sstanum between", value1, value2, "sstanum");
            return (Criteria) this;
        }

        public Criteria andSstanumNotBetween(String value1, String value2) {
            addCriterion("Sstanum not between", value1, value2, "sstanum");
            return (Criteria) this;
        }

        public Criteria andSfacphoneIsNull() {
            addCriterion("Sfacphone is null");
            return (Criteria) this;
        }

        public Criteria andSfacphoneIsNotNull() {
            addCriterion("Sfacphone is not null");
            return (Criteria) this;
        }

        public Criteria andSfacphoneEqualTo(Integer value) {
            addCriterion("Sfacphone =", value, "sfacphone");
            return (Criteria) this;
        }

        public Criteria andSfacphoneNotEqualTo(Integer value) {
            addCriterion("Sfacphone <>", value, "sfacphone");
            return (Criteria) this;
        }

        public Criteria andSfacphoneGreaterThan(Integer value) {
            addCriterion("Sfacphone >", value, "sfacphone");
            return (Criteria) this;
        }

        public Criteria andSfacphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sfacphone >=", value, "sfacphone");
            return (Criteria) this;
        }

        public Criteria andSfacphoneLessThan(Integer value) {
            addCriterion("Sfacphone <", value, "sfacphone");
            return (Criteria) this;
        }

        public Criteria andSfacphoneLessThanOrEqualTo(Integer value) {
            addCriterion("Sfacphone <=", value, "sfacphone");
            return (Criteria) this;
        }

        public Criteria andSfacphoneIn(List<Integer> values) {
            addCriterion("Sfacphone in", values, "sfacphone");
            return (Criteria) this;
        }

        public Criteria andSfacphoneNotIn(List<Integer> values) {
            addCriterion("Sfacphone not in", values, "sfacphone");
            return (Criteria) this;
        }

        public Criteria andSfacphoneBetween(Integer value1, Integer value2) {
            addCriterion("Sfacphone between", value1, value2, "sfacphone");
            return (Criteria) this;
        }

        public Criteria andSfacphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("Sfacphone not between", value1, value2, "sfacphone");
            return (Criteria) this;
        }

        public Criteria andSproducedateIsNull() {
            addCriterion("Sproducedate is null");
            return (Criteria) this;
        }

        public Criteria andSproducedateIsNotNull() {
            addCriterion("Sproducedate is not null");
            return (Criteria) this;
        }

        public Criteria andSproducedateEqualTo(Date value) {
            addCriterionForJDBCDate("Sproducedate =", value, "sproducedate");
            return (Criteria) this;
        }

        public Criteria andSproducedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Sproducedate <>", value, "sproducedate");
            return (Criteria) this;
        }

        public Criteria andSproducedateGreaterThan(Date value) {
            addCriterionForJDBCDate("Sproducedate >", value, "sproducedate");
            return (Criteria) this;
        }

        public Criteria andSproducedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Sproducedate >=", value, "sproducedate");
            return (Criteria) this;
        }

        public Criteria andSproducedateLessThan(Date value) {
            addCriterionForJDBCDate("Sproducedate <", value, "sproducedate");
            return (Criteria) this;
        }

        public Criteria andSproducedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Sproducedate <=", value, "sproducedate");
            return (Criteria) this;
        }

        public Criteria andSproducedateIn(List<Date> values) {
            addCriterionForJDBCDate("Sproducedate in", values, "sproducedate");
            return (Criteria) this;
        }

        public Criteria andSproducedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Sproducedate not in", values, "sproducedate");
            return (Criteria) this;
        }

        public Criteria andSproducedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Sproducedate between", value1, value2, "sproducedate");
            return (Criteria) this;
        }

        public Criteria andSproducedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Sproducedate not between", value1, value2, "sproducedate");
            return (Criteria) this;
        }

        public Criteria andSqualitydateIsNull() {
            addCriterion("Squalitydate is null");
            return (Criteria) this;
        }

        public Criteria andSqualitydateIsNotNull() {
            addCriterion("Squalitydate is not null");
            return (Criteria) this;
        }

        public Criteria andSqualitydateEqualTo(Date value) {
            addCriterionForJDBCDate("Squalitydate =", value, "squalitydate");
            return (Criteria) this;
        }

        public Criteria andSqualitydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Squalitydate <>", value, "squalitydate");
            return (Criteria) this;
        }

        public Criteria andSqualitydateGreaterThan(Date value) {
            addCriterionForJDBCDate("Squalitydate >", value, "squalitydate");
            return (Criteria) this;
        }

        public Criteria andSqualitydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Squalitydate >=", value, "squalitydate");
            return (Criteria) this;
        }

        public Criteria andSqualitydateLessThan(Date value) {
            addCriterionForJDBCDate("Squalitydate <", value, "squalitydate");
            return (Criteria) this;
        }

        public Criteria andSqualitydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Squalitydate <=", value, "squalitydate");
            return (Criteria) this;
        }

        public Criteria andSqualitydateIn(List<Date> values) {
            addCriterionForJDBCDate("Squalitydate in", values, "squalitydate");
            return (Criteria) this;
        }

        public Criteria andSqualitydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Squalitydate not in", values, "squalitydate");
            return (Criteria) this;
        }

        public Criteria andSqualitydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Squalitydate between", value1, value2, "squalitydate");
            return (Criteria) this;
        }

        public Criteria andSqualitydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Squalitydate not between", value1, value2, "squalitydate");
            return (Criteria) this;
        }

        public Criteria andSpacktypeIsNull() {
            addCriterion("Spacktype is null");
            return (Criteria) this;
        }

        public Criteria andSpacktypeIsNotNull() {
            addCriterion("Spacktype is not null");
            return (Criteria) this;
        }

        public Criteria andSpacktypeEqualTo(String value) {
            addCriterion("Spacktype =", value, "spacktype");
            return (Criteria) this;
        }

        public Criteria andSpacktypeNotEqualTo(String value) {
            addCriterion("Spacktype <>", value, "spacktype");
            return (Criteria) this;
        }

        public Criteria andSpacktypeGreaterThan(String value) {
            addCriterion("Spacktype >", value, "spacktype");
            return (Criteria) this;
        }

        public Criteria andSpacktypeGreaterThanOrEqualTo(String value) {
            addCriterion("Spacktype >=", value, "spacktype");
            return (Criteria) this;
        }

        public Criteria andSpacktypeLessThan(String value) {
            addCriterion("Spacktype <", value, "spacktype");
            return (Criteria) this;
        }

        public Criteria andSpacktypeLessThanOrEqualTo(String value) {
            addCriterion("Spacktype <=", value, "spacktype");
            return (Criteria) this;
        }

        public Criteria andSpacktypeLike(String value) {
            addCriterion("Spacktype like", value, "spacktype");
            return (Criteria) this;
        }

        public Criteria andSpacktypeNotLike(String value) {
            addCriterion("Spacktype not like", value, "spacktype");
            return (Criteria) this;
        }

        public Criteria andSpacktypeIn(List<String> values) {
            addCriterion("Spacktype in", values, "spacktype");
            return (Criteria) this;
        }

        public Criteria andSpacktypeNotIn(List<String> values) {
            addCriterion("Spacktype not in", values, "spacktype");
            return (Criteria) this;
        }

        public Criteria andSpacktypeBetween(String value1, String value2) {
            addCriterion("Spacktype between", value1, value2, "spacktype");
            return (Criteria) this;
        }

        public Criteria andSpacktypeNotBetween(String value1, String value2) {
            addCriterion("Spacktype not between", value1, value2, "spacktype");
            return (Criteria) this;
        }

        public Criteria andSstoremethodIsNull() {
            addCriterion("Sstoremethod is null");
            return (Criteria) this;
        }

        public Criteria andSstoremethodIsNotNull() {
            addCriterion("Sstoremethod is not null");
            return (Criteria) this;
        }

        public Criteria andSstoremethodEqualTo(String value) {
            addCriterion("Sstoremethod =", value, "sstoremethod");
            return (Criteria) this;
        }

        public Criteria andSstoremethodNotEqualTo(String value) {
            addCriterion("Sstoremethod <>", value, "sstoremethod");
            return (Criteria) this;
        }

        public Criteria andSstoremethodGreaterThan(String value) {
            addCriterion("Sstoremethod >", value, "sstoremethod");
            return (Criteria) this;
        }

        public Criteria andSstoremethodGreaterThanOrEqualTo(String value) {
            addCriterion("Sstoremethod >=", value, "sstoremethod");
            return (Criteria) this;
        }

        public Criteria andSstoremethodLessThan(String value) {
            addCriterion("Sstoremethod <", value, "sstoremethod");
            return (Criteria) this;
        }

        public Criteria andSstoremethodLessThanOrEqualTo(String value) {
            addCriterion("Sstoremethod <=", value, "sstoremethod");
            return (Criteria) this;
        }

        public Criteria andSstoremethodLike(String value) {
            addCriterion("Sstoremethod like", value, "sstoremethod");
            return (Criteria) this;
        }

        public Criteria andSstoremethodNotLike(String value) {
            addCriterion("Sstoremethod not like", value, "sstoremethod");
            return (Criteria) this;
        }

        public Criteria andSstoremethodIn(List<String> values) {
            addCriterion("Sstoremethod in", values, "sstoremethod");
            return (Criteria) this;
        }

        public Criteria andSstoremethodNotIn(List<String> values) {
            addCriterion("Sstoremethod not in", values, "sstoremethod");
            return (Criteria) this;
        }

        public Criteria andSstoremethodBetween(String value1, String value2) {
            addCriterion("Sstoremethod between", value1, value2, "sstoremethod");
            return (Criteria) this;
        }

        public Criteria andSstoremethodNotBetween(String value1, String value2) {
            addCriterion("Sstoremethod not between", value1, value2, "sstoremethod");
            return (Criteria) this;
        }

        public Criteria andSmlIsNull() {
            addCriterion("Sml is null");
            return (Criteria) this;
        }

        public Criteria andSmlIsNotNull() {
            addCriterion("Sml is not null");
            return (Criteria) this;
        }

        public Criteria andSmlEqualTo(Float value) {
            addCriterion("Sml =", value, "sml");
            return (Criteria) this;
        }

        public Criteria andSmlNotEqualTo(Float value) {
            addCriterion("Sml <>", value, "sml");
            return (Criteria) this;
        }

        public Criteria andSmlGreaterThan(Float value) {
            addCriterion("Sml >", value, "sml");
            return (Criteria) this;
        }

        public Criteria andSmlGreaterThanOrEqualTo(Float value) {
            addCriterion("Sml >=", value, "sml");
            return (Criteria) this;
        }

        public Criteria andSmlLessThan(Float value) {
            addCriterion("Sml <", value, "sml");
            return (Criteria) this;
        }

        public Criteria andSmlLessThanOrEqualTo(Float value) {
            addCriterion("Sml <=", value, "sml");
            return (Criteria) this;
        }

        public Criteria andSmlIn(List<Float> values) {
            addCriterion("Sml in", values, "sml");
            return (Criteria) this;
        }

        public Criteria andSmlNotIn(List<Float> values) {
            addCriterion("Sml not in", values, "sml");
            return (Criteria) this;
        }

        public Criteria andSmlBetween(Float value1, Float value2) {
            addCriterion("Sml between", value1, value2, "sml");
            return (Criteria) this;
        }

        public Criteria andSmlNotBetween(Float value1, Float value2) {
            addCriterion("Sml not between", value1, value2, "sml");
            return (Criteria) this;
        }

        public Criteria andSdegreeIsNull() {
            addCriterion("Sdegree is null");
            return (Criteria) this;
        }

        public Criteria andSdegreeIsNotNull() {
            addCriterion("Sdegree is not null");
            return (Criteria) this;
        }

        public Criteria andSdegreeEqualTo(Float value) {
            addCriterion("Sdegree =", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeNotEqualTo(Float value) {
            addCriterion("Sdegree <>", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeGreaterThan(Float value) {
            addCriterion("Sdegree >", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeGreaterThanOrEqualTo(Float value) {
            addCriterion("Sdegree >=", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeLessThan(Float value) {
            addCriterion("Sdegree <", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeLessThanOrEqualTo(Float value) {
            addCriterion("Sdegree <=", value, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeIn(List<Float> values) {
            addCriterion("Sdegree in", values, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeNotIn(List<Float> values) {
            addCriterion("Sdegree not in", values, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeBetween(Float value1, Float value2) {
            addCriterion("Sdegree between", value1, value2, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSdegreeNotBetween(Float value1, Float value2) {
            addCriterion("Sdegree not between", value1, value2, "sdegree");
            return (Criteria) this;
        }

        public Criteria andSobjectIsNull() {
            addCriterion("Sobject is null");
            return (Criteria) this;
        }

        public Criteria andSobjectIsNotNull() {
            addCriterion("Sobject is not null");
            return (Criteria) this;
        }

        public Criteria andSobjectEqualTo(String value) {
            addCriterion("Sobject =", value, "sobject");
            return (Criteria) this;
        }

        public Criteria andSobjectNotEqualTo(String value) {
            addCriterion("Sobject <>", value, "sobject");
            return (Criteria) this;
        }

        public Criteria andSobjectGreaterThan(String value) {
            addCriterion("Sobject >", value, "sobject");
            return (Criteria) this;
        }

        public Criteria andSobjectGreaterThanOrEqualTo(String value) {
            addCriterion("Sobject >=", value, "sobject");
            return (Criteria) this;
        }

        public Criteria andSobjectLessThan(String value) {
            addCriterion("Sobject <", value, "sobject");
            return (Criteria) this;
        }

        public Criteria andSobjectLessThanOrEqualTo(String value) {
            addCriterion("Sobject <=", value, "sobject");
            return (Criteria) this;
        }

        public Criteria andSobjectLike(String value) {
            addCriterion("Sobject like", value, "sobject");
            return (Criteria) this;
        }

        public Criteria andSobjectNotLike(String value) {
            addCriterion("Sobject not like", value, "sobject");
            return (Criteria) this;
        }

        public Criteria andSobjectIn(List<String> values) {
            addCriterion("Sobject in", values, "sobject");
            return (Criteria) this;
        }

        public Criteria andSobjectNotIn(List<String> values) {
            addCriterion("Sobject not in", values, "sobject");
            return (Criteria) this;
        }

        public Criteria andSobjectBetween(String value1, String value2) {
            addCriterion("Sobject between", value1, value2, "sobject");
            return (Criteria) this;
        }

        public Criteria andSobjectNotBetween(String value1, String value2) {
            addCriterion("Sobject not between", value1, value2, "sobject");
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