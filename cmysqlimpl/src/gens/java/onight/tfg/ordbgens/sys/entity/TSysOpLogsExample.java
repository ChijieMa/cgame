package onight.tfg.ordbgens.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class TSysOpLogsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    protected List<Criteria> oredCriteria;

    protected int offset;

    protected int limit;

    protected String sumCol;

    protected String groupSelClause;

    protected boolean forUpdate;

    protected String groupByClause;

    String selectCols;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public TSysOpLogsExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
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
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        this.offset= 0;
        this.limit= Integer.MAX_VALUE;
        this.sumCol=null;
        this.groupSelClause=null;
        this.groupByClause=null;
        this.forUpdate=false;
    }

    public void setOffset(int offset) {
         this.offset = offset;
    }

    public int getOffset() {
          return offset;
    }

    public void setLimit(int limit) {
         this.limit = limit;
    }

    public int getLimit() {
          return limit;
    }

    public void setSumCol(String sumCol) {
         this.sumCol = sumCol;
    }

    public String getSumCol() {
          return sumCol;
    }

    public void setGroupSelClause(String groupSelClause) {
         this.groupSelClause = groupSelClause;
    }

    public String getGroupSelClause() {
          return groupSelClause;
    }

    public void setForUpdate(boolean forUpdate) {
         this.forUpdate = forUpdate;
    }

    public boolean isForUpdate() {
          return forUpdate;
    }

    public void setGroupByClause(String groupByClause) {
         this.groupByClause = groupByClause;
    }

    public String getGroupByClause() {
          return groupByClause;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Data
    public abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        public GeneratedCriteria() {
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

        public void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        public void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        public void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSkeysIsNull() {
            addCriterion("SKEYS is null");
            return (Criteria) this;
        }

        public Criteria andSkeysIsNotNull() {
            addCriterion("SKEYS is not null");
            return (Criteria) this;
        }

        public Criteria andSkeysEqualTo(String value) {
            addCriterion("SKEYS =", value, "skeys");
            return (Criteria) this;
        }

        public Criteria andSkeysNotEqualTo(String value) {
            addCriterion("SKEYS <>", value, "skeys");
            return (Criteria) this;
        }

        public Criteria andSkeysGreaterThan(String value) {
            addCriterion("SKEYS >", value, "skeys");
            return (Criteria) this;
        }

        public Criteria andSkeysGreaterThanOrEqualTo(String value) {
            addCriterion("SKEYS >=", value, "skeys");
            return (Criteria) this;
        }

        public Criteria andSkeysLessThan(String value) {
            addCriterion("SKEYS <", value, "skeys");
            return (Criteria) this;
        }

        public Criteria andSkeysLessThanOrEqualTo(String value) {
            addCriterion("SKEYS <=", value, "skeys");
            return (Criteria) this;
        }

        public Criteria andSkeysLike(String value) {
            addCriterion("SKEYS like", value, "skeys");
            return (Criteria) this;
        }

        public Criteria andSkeysNotLike(String value) {
            addCriterion("SKEYS not like", value, "skeys");
            return (Criteria) this;
        }

        public Criteria andSkeysIn(List<String> values) {
            addCriterion("SKEYS in", values, "skeys");
            return (Criteria) this;
        }

        public Criteria andSkeysNotIn(List<String> values) {
            addCriterion("SKEYS not in", values, "skeys");
            return (Criteria) this;
        }

        public Criteria andSkeysBetween(String value1, String value2) {
            addCriterion("SKEYS between", value1, value2, "skeys");
            return (Criteria) this;
        }

        public Criteria andSkeysNotBetween(String value1, String value2) {
            addCriterion("SKEYS not between", value1, value2, "skeys");
            return (Criteria) this;
        }

        public Criteria andContentsIsNull() {
            addCriterion("CONTENTS is null");
            return (Criteria) this;
        }

        public Criteria andContentsIsNotNull() {
            addCriterion("CONTENTS is not null");
            return (Criteria) this;
        }

        public Criteria andContentsEqualTo(String value) {
            addCriterion("CONTENTS =", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotEqualTo(String value) {
            addCriterion("CONTENTS <>", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsGreaterThan(String value) {
            addCriterion("CONTENTS >", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTS >=", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLessThan(String value) {
            addCriterion("CONTENTS <", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLessThanOrEqualTo(String value) {
            addCriterion("CONTENTS <=", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLike(String value) {
            addCriterion("CONTENTS like", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotLike(String value) {
            addCriterion("CONTENTS not like", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsIn(List<String> values) {
            addCriterion("CONTENTS in", values, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotIn(List<String> values) {
            addCriterion("CONTENTS not in", values, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsBetween(String value1, String value2) {
            addCriterion("CONTENTS between", value1, value2, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotBetween(String value1, String value2) {
            addCriterion("CONTENTS not between", value1, value2, "contents");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("LEVEL =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("LEVEL <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("LEVEL >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("LEVEL <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("LEVEL <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("LEVEL like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("LEVEL not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("LEVEL in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("LEVEL not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("LEVEL between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("LEVEL not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNull() {
            addCriterion("CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualTo(Date value) {
            addCriterion("CRT_TIME =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("CRT_TIME <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("CRT_TIME >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("CRT_TIME <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterion("CRT_TIME in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterion("CRT_TIME not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andSkeysLikeInsensitive(String value) {
            addCriterion("upper(SKEYS) like", value.toUpperCase(), "skeys");
            return (Criteria) this;
        }

        public Criteria andContentsLikeInsensitive(String value) {
            addCriterion("upper(CONTENTS) like", value.toUpperCase(), "contents");
            return (Criteria) this;
        }

        public Criteria andLevelLikeInsensitive(String value) {
            addCriterion("upper(LEVEL) like", value.toUpperCase(), "level");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated do_not_delete_during_merge Fri Apr 15 21:03:13 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_SYS_OP_LOGS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Data
    @NoArgsConstructor
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

        public Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        public Criterion(String condition, Object value, String typeHandler) {
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

        public Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        public Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        public Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}