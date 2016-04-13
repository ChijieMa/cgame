package onight.tfg.ordbgens.tlt.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class TLTBonusExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
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
     * This method corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public TLTBonusExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
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
     * This method corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
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
     * This class corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBonusgroupIdIsNull() {
            addCriterion("BONUSGROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andBonusgroupIdIsNotNull() {
            addCriterion("BONUSGROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBonusgroupIdEqualTo(Long value) {
            addCriterion("BONUSGROUP_ID =", value, "bonusgroupId");
            return (Criteria) this;
        }

        public Criteria andBonusgroupIdNotEqualTo(Long value) {
            addCriterion("BONUSGROUP_ID <>", value, "bonusgroupId");
            return (Criteria) this;
        }

        public Criteria andBonusgroupIdGreaterThan(Long value) {
            addCriterion("BONUSGROUP_ID >", value, "bonusgroupId");
            return (Criteria) this;
        }

        public Criteria andBonusgroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BONUSGROUP_ID >=", value, "bonusgroupId");
            return (Criteria) this;
        }

        public Criteria andBonusgroupIdLessThan(Long value) {
            addCriterion("BONUSGROUP_ID <", value, "bonusgroupId");
            return (Criteria) this;
        }

        public Criteria andBonusgroupIdLessThanOrEqualTo(Long value) {
            addCriterion("BONUSGROUP_ID <=", value, "bonusgroupId");
            return (Criteria) this;
        }

        public Criteria andBonusgroupIdIn(List<Long> values) {
            addCriterion("BONUSGROUP_ID in", values, "bonusgroupId");
            return (Criteria) this;
        }

        public Criteria andBonusgroupIdNotIn(List<Long> values) {
            addCriterion("BONUSGROUP_ID not in", values, "bonusgroupId");
            return (Criteria) this;
        }

        public Criteria andBonusgroupIdBetween(Long value1, Long value2) {
            addCriterion("BONUSGROUP_ID between", value1, value2, "bonusgroupId");
            return (Criteria) this;
        }

        public Criteria andBonusgroupIdNotBetween(Long value1, Long value2) {
            addCriterion("BONUSGROUP_ID not between", value1, value2, "bonusgroupId");
            return (Criteria) this;
        }

        public Criteria andLtypeIsNull() {
            addCriterion("LTYPE is null");
            return (Criteria) this;
        }

        public Criteria andLtypeIsNotNull() {
            addCriterion("LTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLtypeEqualTo(String value) {
            addCriterion("LTYPE =", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeNotEqualTo(String value) {
            addCriterion("LTYPE <>", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeGreaterThan(String value) {
            addCriterion("LTYPE >", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeGreaterThanOrEqualTo(String value) {
            addCriterion("LTYPE >=", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeLessThan(String value) {
            addCriterion("LTYPE <", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeLessThanOrEqualTo(String value) {
            addCriterion("LTYPE <=", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeLike(String value) {
            addCriterion("LTYPE like", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeNotLike(String value) {
            addCriterion("LTYPE not like", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeIn(List<String> values) {
            addCriterion("LTYPE in", values, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeNotIn(List<String> values) {
            addCriterion("LTYPE not in", values, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeBetween(String value1, String value2) {
            addCriterion("LTYPE between", value1, value2, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeNotBetween(String value1, String value2) {
            addCriterion("LTYPE not between", value1, value2, "ltype");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIsNull() {
            addCriterion("PLAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIsNotNull() {
            addCriterion("PLAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPlayTypeEqualTo(String value) {
            addCriterion("PLAY_TYPE =", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotEqualTo(String value) {
            addCriterion("PLAY_TYPE <>", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeGreaterThan(String value) {
            addCriterion("PLAY_TYPE >", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAY_TYPE >=", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLessThan(String value) {
            addCriterion("PLAY_TYPE <", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLessThanOrEqualTo(String value) {
            addCriterion("PLAY_TYPE <=", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLike(String value) {
            addCriterion("PLAY_TYPE like", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotLike(String value) {
            addCriterion("PLAY_TYPE not like", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIn(List<String> values) {
            addCriterion("PLAY_TYPE in", values, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotIn(List<String> values) {
            addCriterion("PLAY_TYPE not in", values, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeBetween(String value1, String value2) {
            addCriterion("PLAY_TYPE between", value1, value2, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotBetween(String value1, String value2) {
            addCriterion("PLAY_TYPE not between", value1, value2, "playType");
            return (Criteria) this;
        }

        public Criteria andLpgIdIsNull() {
            addCriterion("LPG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLpgIdIsNotNull() {
            addCriterion("LPG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLpgIdEqualTo(Long value) {
            addCriterion("LPG_ID =", value, "lpgId");
            return (Criteria) this;
        }

        public Criteria andLpgIdNotEqualTo(Long value) {
            addCriterion("LPG_ID <>", value, "lpgId");
            return (Criteria) this;
        }

        public Criteria andLpgIdGreaterThan(Long value) {
            addCriterion("LPG_ID >", value, "lpgId");
            return (Criteria) this;
        }

        public Criteria andLpgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LPG_ID >=", value, "lpgId");
            return (Criteria) this;
        }

        public Criteria andLpgIdLessThan(Long value) {
            addCriterion("LPG_ID <", value, "lpgId");
            return (Criteria) this;
        }

        public Criteria andLpgIdLessThanOrEqualTo(Long value) {
            addCriterion("LPG_ID <=", value, "lpgId");
            return (Criteria) this;
        }

        public Criteria andLpgIdIn(List<Long> values) {
            addCriterion("LPG_ID in", values, "lpgId");
            return (Criteria) this;
        }

        public Criteria andLpgIdNotIn(List<Long> values) {
            addCriterion("LPG_ID not in", values, "lpgId");
            return (Criteria) this;
        }

        public Criteria andLpgIdBetween(Long value1, Long value2) {
            addCriterion("LPG_ID between", value1, value2, "lpgId");
            return (Criteria) this;
        }

        public Criteria andLpgIdNotBetween(Long value1, Long value2) {
            addCriterion("LPG_ID not between", value1, value2, "lpgId");
            return (Criteria) this;
        }

        public Criteria andCnNameIsNull() {
            addCriterion("CN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCnNameIsNotNull() {
            addCriterion("CN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCnNameEqualTo(String value) {
            addCriterion("CN_NAME =", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotEqualTo(String value) {
            addCriterion("CN_NAME <>", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameGreaterThan(String value) {
            addCriterion("CN_NAME >", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("CN_NAME >=", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLessThan(String value) {
            addCriterion("CN_NAME <", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLessThanOrEqualTo(String value) {
            addCriterion("CN_NAME <=", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLike(String value) {
            addCriterion("CN_NAME like", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotLike(String value) {
            addCriterion("CN_NAME not like", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameIn(List<String> values) {
            addCriterion("CN_NAME in", values, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotIn(List<String> values) {
            addCriterion("CN_NAME not in", values, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameBetween(String value1, String value2) {
            addCriterion("CN_NAME between", value1, value2, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotBetween(String value1, String value2) {
            addCriterion("CN_NAME not between", value1, value2, "cnName");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNull() {
            addCriterion("EN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNotNull() {
            addCriterion("EN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnNameEqualTo(String value) {
            addCriterion("EN_NAME =", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotEqualTo(String value) {
            addCriterion("EN_NAME <>", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThan(String value) {
            addCriterion("EN_NAME >", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("EN_NAME >=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThan(String value) {
            addCriterion("EN_NAME <", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThanOrEqualTo(String value) {
            addCriterion("EN_NAME <=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLike(String value) {
            addCriterion("EN_NAME like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotLike(String value) {
            addCriterion("EN_NAME not like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameIn(List<String> values) {
            addCriterion("EN_NAME in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotIn(List<String> values) {
            addCriterion("EN_NAME not in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameBetween(String value1, String value2) {
            addCriterion("EN_NAME between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotBetween(String value1, String value2) {
            addCriterion("EN_NAME not between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andBonusIsNull() {
            addCriterion("BONUS is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("BONUS is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(Float value) {
            addCriterion("BONUS =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(Float value) {
            addCriterion("BONUS <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(Float value) {
            addCriterion("BONUS >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(Float value) {
            addCriterion("BONUS >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(Float value) {
            addCriterion("BONUS <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(Float value) {
            addCriterion("BONUS <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<Float> values) {
            addCriterion("BONUS in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<Float> values) {
            addCriterion("BONUS not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(Float value1, Float value2) {
            addCriterion("BONUS between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(Float value1, Float value2) {
            addCriterion("BONUS not between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBetNumIsNull() {
            addCriterion("BET_NUM is null");
            return (Criteria) this;
        }

        public Criteria andBetNumIsNotNull() {
            addCriterion("BET_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andBetNumEqualTo(Integer value) {
            addCriterion("BET_NUM =", value, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumNotEqualTo(Integer value) {
            addCriterion("BET_NUM <>", value, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumGreaterThan(Integer value) {
            addCriterion("BET_NUM >", value, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("BET_NUM >=", value, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumLessThan(Integer value) {
            addCriterion("BET_NUM <", value, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumLessThanOrEqualTo(Integer value) {
            addCriterion("BET_NUM <=", value, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumIn(List<Integer> values) {
            addCriterion("BET_NUM in", values, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumNotIn(List<Integer> values) {
            addCriterion("BET_NUM not in", values, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumBetween(Integer value1, Integer value2) {
            addCriterion("BET_NUM between", value1, value2, "betNum");
            return (Criteria) this;
        }

        public Criteria andBetNumNotBetween(Integer value1, Integer value2) {
            addCriterion("BET_NUM not between", value1, value2, "betNum");
            return (Criteria) this;
        }

        public Criteria andTotalMarginIsNull() {
            addCriterion("TOTAL_MARGIN is null");
            return (Criteria) this;
        }

        public Criteria andTotalMarginIsNotNull() {
            addCriterion("TOTAL_MARGIN is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMarginEqualTo(Float value) {
            addCriterion("TOTAL_MARGIN =", value, "totalMargin");
            return (Criteria) this;
        }

        public Criteria andTotalMarginNotEqualTo(Float value) {
            addCriterion("TOTAL_MARGIN <>", value, "totalMargin");
            return (Criteria) this;
        }

        public Criteria andTotalMarginGreaterThan(Float value) {
            addCriterion("TOTAL_MARGIN >", value, "totalMargin");
            return (Criteria) this;
        }

        public Criteria andTotalMarginGreaterThanOrEqualTo(Float value) {
            addCriterion("TOTAL_MARGIN >=", value, "totalMargin");
            return (Criteria) this;
        }

        public Criteria andTotalMarginLessThan(Float value) {
            addCriterion("TOTAL_MARGIN <", value, "totalMargin");
            return (Criteria) this;
        }

        public Criteria andTotalMarginLessThanOrEqualTo(Float value) {
            addCriterion("TOTAL_MARGIN <=", value, "totalMargin");
            return (Criteria) this;
        }

        public Criteria andTotalMarginIn(List<Float> values) {
            addCriterion("TOTAL_MARGIN in", values, "totalMargin");
            return (Criteria) this;
        }

        public Criteria andTotalMarginNotIn(List<Float> values) {
            addCriterion("TOTAL_MARGIN not in", values, "totalMargin");
            return (Criteria) this;
        }

        public Criteria andTotalMarginBetween(Float value1, Float value2) {
            addCriterion("TOTAL_MARGIN between", value1, value2, "totalMargin");
            return (Criteria) this;
        }

        public Criteria andTotalMarginNotBetween(Float value1, Float value2) {
            addCriterion("TOTAL_MARGIN not between", value1, value2, "totalMargin");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLtypeLikeInsensitive(String value) {
            addCriterion("upper(LTYPE) like", value.toUpperCase(), "ltype");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLikeInsensitive(String value) {
            addCriterion("upper(PLAY_TYPE) like", value.toUpperCase(), "playType");
            return (Criteria) this;
        }

        public Criteria andCnNameLikeInsensitive(String value) {
            addCriterion("upper(CN_NAME) like", value.toUpperCase(), "cnName");
            return (Criteria) this;
        }

        public Criteria andEnNameLikeInsensitive(String value) {
            addCriterion("upper(EN_NAME) like", value.toUpperCase(), "enName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TLT_BONUS
     *
     * @mbggenerated do_not_delete_during_merge Thu Apr 14 00:04:40 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TLT_BONUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
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