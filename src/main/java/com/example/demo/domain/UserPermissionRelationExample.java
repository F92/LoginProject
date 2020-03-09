package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class UserPermissionRelationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    public UserPermissionRelationExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andUpridIsNull() {
            addCriterion("UprId is null");
            return (Criteria) this;
        }

        public Criteria andUpridIsNotNull() {
            addCriterion("UprId is not null");
            return (Criteria) this;
        }

        public Criteria andUpridEqualTo(Integer value) {
            addCriterion("UprId =", value, "uprid");
            return (Criteria) this;
        }

        public Criteria andUpridNotEqualTo(Integer value) {
            addCriterion("UprId <>", value, "uprid");
            return (Criteria) this;
        }

        public Criteria andUpridGreaterThan(Integer value) {
            addCriterion("UprId >", value, "uprid");
            return (Criteria) this;
        }

        public Criteria andUpridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UprId >=", value, "uprid");
            return (Criteria) this;
        }

        public Criteria andUpridLessThan(Integer value) {
            addCriterion("UprId <", value, "uprid");
            return (Criteria) this;
        }

        public Criteria andUpridLessThanOrEqualTo(Integer value) {
            addCriterion("UprId <=", value, "uprid");
            return (Criteria) this;
        }

        public Criteria andUpridIn(List<Integer> values) {
            addCriterion("UprId in", values, "uprid");
            return (Criteria) this;
        }

        public Criteria andUpridNotIn(List<Integer> values) {
            addCriterion("UprId not in", values, "uprid");
            return (Criteria) this;
        }

        public Criteria andUpridBetween(Integer value1, Integer value2) {
            addCriterion("UprId between", value1, value2, "uprid");
            return (Criteria) this;
        }

        public Criteria andUpridNotBetween(Integer value1, Integer value2) {
            addCriterion("UprId not between", value1, value2, "uprid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPmidIsNull() {
            addCriterion("PmId is null");
            return (Criteria) this;
        }

        public Criteria andPmidIsNotNull() {
            addCriterion("PmId is not null");
            return (Criteria) this;
        }

        public Criteria andPmidEqualTo(Integer value) {
            addCriterion("PmId =", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotEqualTo(Integer value) {
            addCriterion("PmId <>", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThan(Integer value) {
            addCriterion("PmId >", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PmId >=", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThan(Integer value) {
            addCriterion("PmId <", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThanOrEqualTo(Integer value) {
            addCriterion("PmId <=", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidIn(List<Integer> values) {
            addCriterion("PmId in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotIn(List<Integer> values) {
            addCriterion("PmId not in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidBetween(Integer value1, Integer value2) {
            addCriterion("PmId between", value1, value2, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotBetween(Integer value1, Integer value2) {
            addCriterion("PmId not between", value1, value2, "pmid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table UserPermissionRelation
     *
     * @mbg.generated
     */
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