package onight.tfg.ordbgens.sys.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class TSysMenuExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
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
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
     */
    public TSysMenuExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
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
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
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
     * This class corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
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

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MENU_NAME =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MENU_NAME <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MENU_NAME >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAME >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MENU_NAME <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAME <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MENU_NAME like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MENU_NAME not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MENU_NAME in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MENU_NAME not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MENU_NAME between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MENU_NAME not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNull() {
            addCriterion("MENU_DESC is null");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNotNull() {
            addCriterion("MENU_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andMenuDescEqualTo(String value) {
            addCriterion("MENU_DESC =", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotEqualTo(String value) {
            addCriterion("MENU_DESC <>", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThan(String value) {
            addCriterion("MENU_DESC >", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_DESC >=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThan(String value) {
            addCriterion("MENU_DESC <", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThanOrEqualTo(String value) {
            addCriterion("MENU_DESC <=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLike(String value) {
            addCriterion("MENU_DESC like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotLike(String value) {
            addCriterion("MENU_DESC not like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescIn(List<String> values) {
            addCriterion("MENU_DESC in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotIn(List<String> values) {
            addCriterion("MENU_DESC not in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescBetween(String value1, String value2) {
            addCriterion("MENU_DESC between", value1, value2, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotBetween(String value1, String value2) {
            addCriterion("MENU_DESC not between", value1, value2, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuSeqIsNull() {
            addCriterion("MENU_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andMenuSeqIsNotNull() {
            addCriterion("MENU_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSeqEqualTo(Integer value) {
            addCriterion("MENU_SEQ =", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqNotEqualTo(Integer value) {
            addCriterion("MENU_SEQ <>", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqGreaterThan(Integer value) {
            addCriterion("MENU_SEQ >", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_SEQ >=", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqLessThan(Integer value) {
            addCriterion("MENU_SEQ <", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_SEQ <=", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqIn(List<Integer> values) {
            addCriterion("MENU_SEQ in", values, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqNotIn(List<Integer> values) {
            addCriterion("MENU_SEQ not in", values, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqBetween(Integer value1, Integer value2) {
            addCriterion("MENU_SEQ between", value1, value2, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_SEQ not between", value1, value2, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNull() {
            addCriterion("MENU_URL is null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNotNull() {
            addCriterion("MENU_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlEqualTo(String value) {
            addCriterion("MENU_URL =", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotEqualTo(String value) {
            addCriterion("MENU_URL <>", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThan(String value) {
            addCriterion("MENU_URL >", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_URL >=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThan(String value) {
            addCriterion("MENU_URL <", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("MENU_URL <=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLike(String value) {
            addCriterion("MENU_URL like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotLike(String value) {
            addCriterion("MENU_URL not like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIn(List<String> values) {
            addCriterion("MENU_URL in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotIn(List<String> values) {
            addCriterion("MENU_URL not in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlBetween(String value1, String value2) {
            addCriterion("MENU_URL between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotBetween(String value1, String value2) {
            addCriterion("MENU_URL not between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andLeafFlagIsNull() {
            addCriterion("LEAF_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLeafFlagIsNotNull() {
            addCriterion("LEAF_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLeafFlagEqualTo(Integer value) {
            addCriterion("LEAF_FLAG =", value, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagNotEqualTo(Integer value) {
            addCriterion("LEAF_FLAG <>", value, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagGreaterThan(Integer value) {
            addCriterion("LEAF_FLAG >", value, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEAF_FLAG >=", value, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagLessThan(Integer value) {
            addCriterion("LEAF_FLAG <", value, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagLessThanOrEqualTo(Integer value) {
            addCriterion("LEAF_FLAG <=", value, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagIn(List<Integer> values) {
            addCriterion("LEAF_FLAG in", values, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagNotIn(List<Integer> values) {
            addCriterion("LEAF_FLAG not in", values, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagBetween(Integer value1, Integer value2) {
            addCriterion("LEAF_FLAG between", value1, value2, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("LEAF_FLAG not between", value1, value2, "leafFlag");
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

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("LEVEL =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("LEVEL <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("LEVEL >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEVEL >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("LEVEL <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("LEVEL <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("LEVEL in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("LEVEL not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andMenuNameLikeInsensitive(String value) {
            addCriterion("upper(MENU_NAME) like", value.toUpperCase(), "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuDescLikeInsensitive(String value) {
            addCriterion("upper(MENU_DESC) like", value.toUpperCase(), "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLikeInsensitive(String value) {
            addCriterion("upper(MENU_URL) like", value.toUpperCase(), "menuUrl");
            return (Criteria) this;
        }

        public Criteria andIconLikeInsensitive(String value) {
            addCriterion("upper(ICON) like", value.toUpperCase(), "icon");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated do_not_delete_during_merge Thu Apr 14 00:04:38 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Thu Apr 14 00:04:38 CST 2016
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