package com.tw.dps.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiExample() {
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

        public Criteria andApiIdIsNull() {
            addCriterion("api_id is null");
            return (Criteria) this;
        }

        public Criteria andApiIdIsNotNull() {
            addCriterion("api_id is not null");
            return (Criteria) this;
        }

        public Criteria andApiIdEqualTo(Integer value) {
            addCriterion("api_id =", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdNotEqualTo(Integer value) {
            addCriterion("api_id <>", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdGreaterThan(Integer value) {
            addCriterion("api_id >", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("api_id >=", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdLessThan(Integer value) {
            addCriterion("api_id <", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdLessThanOrEqualTo(Integer value) {
            addCriterion("api_id <=", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdIn(List<Integer> values) {
            addCriterion("api_id in", values, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdNotIn(List<Integer> values) {
            addCriterion("api_id not in", values, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdBetween(Integer value1, Integer value2) {
            addCriterion("api_id between", value1, value2, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("api_id not between", value1, value2, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiNameIsNull() {
            addCriterion("api_name is null");
            return (Criteria) this;
        }

        public Criteria andApiNameIsNotNull() {
            addCriterion("api_name is not null");
            return (Criteria) this;
        }

        public Criteria andApiNameEqualTo(String value) {
            addCriterion("api_name =", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotEqualTo(String value) {
            addCriterion("api_name <>", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameGreaterThan(String value) {
            addCriterion("api_name >", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameGreaterThanOrEqualTo(String value) {
            addCriterion("api_name >=", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLessThan(String value) {
            addCriterion("api_name <", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLessThanOrEqualTo(String value) {
            addCriterion("api_name <=", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLike(String value) {
            addCriterion("api_name like", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotLike(String value) {
            addCriterion("api_name not like", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameIn(List<String> values) {
            addCriterion("api_name in", values, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotIn(List<String> values) {
            addCriterion("api_name not in", values, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameBetween(String value1, String value2) {
            addCriterion("api_name between", value1, value2, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotBetween(String value1, String value2) {
            addCriterion("api_name not between", value1, value2, "apiName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andApiVersionIsNull() {
            addCriterion("api_version is null");
            return (Criteria) this;
        }

        public Criteria andApiVersionIsNotNull() {
            addCriterion("api_version is not null");
            return (Criteria) this;
        }

        public Criteria andApiVersionEqualTo(String value) {
            addCriterion("api_version =", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionNotEqualTo(String value) {
            addCriterion("api_version <>", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionGreaterThan(String value) {
            addCriterion("api_version >", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionGreaterThanOrEqualTo(String value) {
            addCriterion("api_version >=", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionLessThan(String value) {
            addCriterion("api_version <", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionLessThanOrEqualTo(String value) {
            addCriterion("api_version <=", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionLike(String value) {
            addCriterion("api_version like", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionNotLike(String value) {
            addCriterion("api_version not like", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionIn(List<String> values) {
            addCriterion("api_version in", values, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionNotIn(List<String> values) {
            addCriterion("api_version not in", values, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionBetween(String value1, String value2) {
            addCriterion("api_version between", value1, value2, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionNotBetween(String value1, String value2) {
            addCriterion("api_version not between", value1, value2, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiPathIsNull() {
            addCriterion("api_path is null");
            return (Criteria) this;
        }

        public Criteria andApiPathIsNotNull() {
            addCriterion("api_path is not null");
            return (Criteria) this;
        }

        public Criteria andApiPathEqualTo(String value) {
            addCriterion("api_path =", value, "apiPath");
            return (Criteria) this;
        }

        public Criteria andApiPathNotEqualTo(String value) {
            addCriterion("api_path <>", value, "apiPath");
            return (Criteria) this;
        }

        public Criteria andApiPathGreaterThan(String value) {
            addCriterion("api_path >", value, "apiPath");
            return (Criteria) this;
        }

        public Criteria andApiPathGreaterThanOrEqualTo(String value) {
            addCriterion("api_path >=", value, "apiPath");
            return (Criteria) this;
        }

        public Criteria andApiPathLessThan(String value) {
            addCriterion("api_path <", value, "apiPath");
            return (Criteria) this;
        }

        public Criteria andApiPathLessThanOrEqualTo(String value) {
            addCriterion("api_path <=", value, "apiPath");
            return (Criteria) this;
        }

        public Criteria andApiPathLike(String value) {
            addCriterion("api_path like", value, "apiPath");
            return (Criteria) this;
        }

        public Criteria andApiPathNotLike(String value) {
            addCriterion("api_path not like", value, "apiPath");
            return (Criteria) this;
        }

        public Criteria andApiPathIn(List<String> values) {
            addCriterion("api_path in", values, "apiPath");
            return (Criteria) this;
        }

        public Criteria andApiPathNotIn(List<String> values) {
            addCriterion("api_path not in", values, "apiPath");
            return (Criteria) this;
        }

        public Criteria andApiPathBetween(String value1, String value2) {
            addCriterion("api_path between", value1, value2, "apiPath");
            return (Criteria) this;
        }

        public Criteria andApiPathNotBetween(String value1, String value2) {
            addCriterion("api_path not between", value1, value2, "apiPath");
            return (Criteria) this;
        }

        public Criteria andUpstreamIsNull() {
            addCriterion("upstream is null");
            return (Criteria) this;
        }

        public Criteria andUpstreamIsNotNull() {
            addCriterion("upstream is not null");
            return (Criteria) this;
        }

        public Criteria andUpstreamEqualTo(String value) {
            addCriterion("upstream =", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamNotEqualTo(String value) {
            addCriterion("upstream <>", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamGreaterThan(String value) {
            addCriterion("upstream >", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamGreaterThanOrEqualTo(String value) {
            addCriterion("upstream >=", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamLessThan(String value) {
            addCriterion("upstream <", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamLessThanOrEqualTo(String value) {
            addCriterion("upstream <=", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamLike(String value) {
            addCriterion("upstream like", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamNotLike(String value) {
            addCriterion("upstream not like", value, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamIn(List<String> values) {
            addCriterion("upstream in", values, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamNotIn(List<String> values) {
            addCriterion("upstream not in", values, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamBetween(String value1, String value2) {
            addCriterion("upstream between", value1, value2, "upstream");
            return (Criteria) this;
        }

        public Criteria andUpstreamNotBetween(String value1, String value2) {
            addCriterion("upstream not between", value1, value2, "upstream");
            return (Criteria) this;
        }

        public Criteria andTeamIsNull() {
            addCriterion("team is null");
            return (Criteria) this;
        }

        public Criteria andTeamIsNotNull() {
            addCriterion("team is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEqualTo(Integer value) {
            addCriterion("team =", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotEqualTo(Integer value) {
            addCriterion("team <>", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThan(Integer value) {
            addCriterion("team >", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThanOrEqualTo(Integer value) {
            addCriterion("team >=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThan(Integer value) {
            addCriterion("team <", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThanOrEqualTo(Integer value) {
            addCriterion("team <=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamIn(List<Integer> values) {
            addCriterion("team in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotIn(List<Integer> values) {
            addCriterion("team not in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamBetween(Integer value1, Integer value2) {
            addCriterion("team between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotBetween(Integer value1, Integer value2) {
            addCriterion("team not between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andSquadIsNull() {
            addCriterion("squad is null");
            return (Criteria) this;
        }

        public Criteria andSquadIsNotNull() {
            addCriterion("squad is not null");
            return (Criteria) this;
        }

        public Criteria andSquadEqualTo(Integer value) {
            addCriterion("squad =", value, "squad");
            return (Criteria) this;
        }

        public Criteria andSquadNotEqualTo(Integer value) {
            addCriterion("squad <>", value, "squad");
            return (Criteria) this;
        }

        public Criteria andSquadGreaterThan(Integer value) {
            addCriterion("squad >", value, "squad");
            return (Criteria) this;
        }

        public Criteria andSquadGreaterThanOrEqualTo(Integer value) {
            addCriterion("squad >=", value, "squad");
            return (Criteria) this;
        }

        public Criteria andSquadLessThan(Integer value) {
            addCriterion("squad <", value, "squad");
            return (Criteria) this;
        }

        public Criteria andSquadLessThanOrEqualTo(Integer value) {
            addCriterion("squad <=", value, "squad");
            return (Criteria) this;
        }

        public Criteria andSquadIn(List<Integer> values) {
            addCriterion("squad in", values, "squad");
            return (Criteria) this;
        }

        public Criteria andSquadNotIn(List<Integer> values) {
            addCriterion("squad not in", values, "squad");
            return (Criteria) this;
        }

        public Criteria andSquadBetween(Integer value1, Integer value2) {
            addCriterion("squad between", value1, value2, "squad");
            return (Criteria) this;
        }

        public Criteria andSquadNotBetween(Integer value1, Integer value2) {
            addCriterion("squad not between", value1, value2, "squad");
            return (Criteria) this;
        }

        public Criteria andHeaderIsNull() {
            addCriterion("header is null");
            return (Criteria) this;
        }

        public Criteria andHeaderIsNotNull() {
            addCriterion("header is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderEqualTo(String value) {
            addCriterion("header =", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotEqualTo(String value) {
            addCriterion("header <>", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderGreaterThan(String value) {
            addCriterion("header >", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("header >=", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderLessThan(String value) {
            addCriterion("header <", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderLessThanOrEqualTo(String value) {
            addCriterion("header <=", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderLike(String value) {
            addCriterion("header like", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotLike(String value) {
            addCriterion("header not like", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderIn(List<String> values) {
            addCriterion("header in", values, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotIn(List<String> values) {
            addCriterion("header not in", values, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderBetween(String value1, String value2) {
            addCriterion("header between", value1, value2, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotBetween(String value1, String value2) {
            addCriterion("header not between", value1, value2, "header");
            return (Criteria) this;
        }

        public Criteria andMd5CodeIsNull() {
            addCriterion("md5_code is null");
            return (Criteria) this;
        }

        public Criteria andMd5CodeIsNotNull() {
            addCriterion("md5_code is not null");
            return (Criteria) this;
        }

        public Criteria andMd5CodeEqualTo(String value) {
            addCriterion("md5_code =", value, "md5Code");
            return (Criteria) this;
        }

        public Criteria andMd5CodeNotEqualTo(String value) {
            addCriterion("md5_code <>", value, "md5Code");
            return (Criteria) this;
        }

        public Criteria andMd5CodeGreaterThan(String value) {
            addCriterion("md5_code >", value, "md5Code");
            return (Criteria) this;
        }

        public Criteria andMd5CodeGreaterThanOrEqualTo(String value) {
            addCriterion("md5_code >=", value, "md5Code");
            return (Criteria) this;
        }

        public Criteria andMd5CodeLessThan(String value) {
            addCriterion("md5_code <", value, "md5Code");
            return (Criteria) this;
        }

        public Criteria andMd5CodeLessThanOrEqualTo(String value) {
            addCriterion("md5_code <=", value, "md5Code");
            return (Criteria) this;
        }

        public Criteria andMd5CodeLike(String value) {
            addCriterion("md5_code like", value, "md5Code");
            return (Criteria) this;
        }

        public Criteria andMd5CodeNotLike(String value) {
            addCriterion("md5_code not like", value, "md5Code");
            return (Criteria) this;
        }

        public Criteria andMd5CodeIn(List<String> values) {
            addCriterion("md5_code in", values, "md5Code");
            return (Criteria) this;
        }

        public Criteria andMd5CodeNotIn(List<String> values) {
            addCriterion("md5_code not in", values, "md5Code");
            return (Criteria) this;
        }

        public Criteria andMd5CodeBetween(String value1, String value2) {
            addCriterion("md5_code between", value1, value2, "md5Code");
            return (Criteria) this;
        }

        public Criteria andMd5CodeNotBetween(String value1, String value2) {
            addCriterion("md5_code not between", value1, value2, "md5Code");
            return (Criteria) this;
        }

        public Criteria andServiceEmailIsNull() {
            addCriterion("service_email is null");
            return (Criteria) this;
        }

        public Criteria andServiceEmailIsNotNull() {
            addCriterion("service_email is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEmailEqualTo(String value) {
            addCriterion("service_email =", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailNotEqualTo(String value) {
            addCriterion("service_email <>", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailGreaterThan(String value) {
            addCriterion("service_email >", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailGreaterThanOrEqualTo(String value) {
            addCriterion("service_email >=", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailLessThan(String value) {
            addCriterion("service_email <", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailLessThanOrEqualTo(String value) {
            addCriterion("service_email <=", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailLike(String value) {
            addCriterion("service_email like", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailNotLike(String value) {
            addCriterion("service_email not like", value, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailIn(List<String> values) {
            addCriterion("service_email in", values, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailNotIn(List<String> values) {
            addCriterion("service_email not in", values, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailBetween(String value1, String value2) {
            addCriterion("service_email between", value1, value2, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andServiceEmailNotBetween(String value1, String value2) {
            addCriterion("service_email not between", value1, value2, "serviceEmail");
            return (Criteria) this;
        }

        public Criteria andApiStatusIsNull() {
            addCriterion("api_status is null");
            return (Criteria) this;
        }

        public Criteria andApiStatusIsNotNull() {
            addCriterion("api_status is not null");
            return (Criteria) this;
        }

        public Criteria andApiStatusEqualTo(String value) {
            addCriterion("api_status =", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusNotEqualTo(String value) {
            addCriterion("api_status <>", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusGreaterThan(String value) {
            addCriterion("api_status >", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusGreaterThanOrEqualTo(String value) {
            addCriterion("api_status >=", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusLessThan(String value) {
            addCriterion("api_status <", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusLessThanOrEqualTo(String value) {
            addCriterion("api_status <=", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusLike(String value) {
            addCriterion("api_status like", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusNotLike(String value) {
            addCriterion("api_status not like", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusIn(List<String> values) {
            addCriterion("api_status in", values, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusNotIn(List<String> values) {
            addCriterion("api_status not in", values, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusBetween(String value1, String value2) {
            addCriterion("api_status between", value1, value2, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusNotBetween(String value1, String value2) {
            addCriterion("api_status not between", value1, value2, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andActivePluginsIsNull() {
            addCriterion("active_plugins is null");
            return (Criteria) this;
        }

        public Criteria andActivePluginsIsNotNull() {
            addCriterion("active_plugins is not null");
            return (Criteria) this;
        }

        public Criteria andActivePluginsEqualTo(String value) {
            addCriterion("active_plugins =", value, "activePlugins");
            return (Criteria) this;
        }

        public Criteria andActivePluginsNotEqualTo(String value) {
            addCriterion("active_plugins <>", value, "activePlugins");
            return (Criteria) this;
        }

        public Criteria andActivePluginsGreaterThan(String value) {
            addCriterion("active_plugins >", value, "activePlugins");
            return (Criteria) this;
        }

        public Criteria andActivePluginsGreaterThanOrEqualTo(String value) {
            addCriterion("active_plugins >=", value, "activePlugins");
            return (Criteria) this;
        }

        public Criteria andActivePluginsLessThan(String value) {
            addCriterion("active_plugins <", value, "activePlugins");
            return (Criteria) this;
        }

        public Criteria andActivePluginsLessThanOrEqualTo(String value) {
            addCriterion("active_plugins <=", value, "activePlugins");
            return (Criteria) this;
        }

        public Criteria andActivePluginsLike(String value) {
            addCriterion("active_plugins like", value, "activePlugins");
            return (Criteria) this;
        }

        public Criteria andActivePluginsNotLike(String value) {
            addCriterion("active_plugins not like", value, "activePlugins");
            return (Criteria) this;
        }

        public Criteria andActivePluginsIn(List<String> values) {
            addCriterion("active_plugins in", values, "activePlugins");
            return (Criteria) this;
        }

        public Criteria andActivePluginsNotIn(List<String> values) {
            addCriterion("active_plugins not in", values, "activePlugins");
            return (Criteria) this;
        }

        public Criteria andActivePluginsBetween(String value1, String value2) {
            addCriterion("active_plugins between", value1, value2, "activePlugins");
            return (Criteria) this;
        }

        public Criteria andActivePluginsNotBetween(String value1, String value2) {
            addCriterion("active_plugins not between", value1, value2, "activePlugins");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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