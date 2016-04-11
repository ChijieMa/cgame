package onight.tfg.ordbgens.tfc.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;
import java.util.Map;
import onight.tfg.ordbgens.tfc.entity.TFCUserCoin;
import onight.tfg.ordbgens.tfc.entity.TFCUserCoinExample.Criteria;
import onight.tfg.ordbgens.tfc.entity.TFCUserCoinExample.Criterion;
import onight.tfg.ordbgens.tfc.entity.TFCUserCoinExample;

public class TFCUserCoinSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String countByExample(TFCUserCoinExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("TFC_USER_COIN");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String deleteByExample(TFCUserCoinExample example) {
        BEGIN();
        DELETE_FROM("TFC_USER_COIN");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String insertSelective(TFCUserCoin record) {
        BEGIN();
        INSERT_INTO("TFC_USER_COIN");
        
        if (record.getCoinRowid() != null) {
            VALUES("COIN_ROWID", "#{coinRowid,jdbcType=VARCHAR}");
        }
        
        if (record.getCoinTypeId() != null) {
            VALUES("COIN_TYPE_ID", "#{coinTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getStartTime() != null) {
            VALUES("START_TIME", "#{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpireTime() != null) {
            VALUES("EXPIRE_TIME", "#{expireTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCoinNum() != null) {
            VALUES("COIN_NUM", "#{coinNum,jdbcType=BIGINT}");
        }
        
        if (record.getLockCount() != null) {
            VALUES("LOCK_COUNT", "#{lockCount,jdbcType=BIGINT}");
        }
        
        if (record.getShowChild() != null) {
            VALUES("SHOW_CHILD", "#{showChild,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String selectByExample(TFCUserCoinExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("COIN_ROWID");
        } else {
            SELECT("COIN_ROWID");
        }
        SELECT("COIN_TYPE_ID");
        SELECT("USER_ID");
        SELECT("START_TIME");
        SELECT("EXPIRE_TIME");
        SELECT("COIN_NUM");
        SELECT("LOCK_COUNT");
        SELECT("SHOW_CHILD");
        FROM("TFC_USER_COIN");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        if(example!=null&&example.getSelectCols()!=null&&example.getSelectCols().trim().length()>0){
		BEGIN();
		if (example != null && example.isDistinct()) {
			SELECT_DISTINCT(example.getSelectCols());
		} else {
				SELECT(example.getSelectCols());
		}
				applyWhere(example, false);
		}
        if(example != null){
            String retstr= SQL().concat(" limit "+example.getOffset()+","+example.getLimit());
            if(example.isForUpdate()) { return retstr+"  FOR UPDATE " ;} else { return retstr;}
        }
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TFCUserCoin record = (TFCUserCoin) parameter.get("record");
        TFCUserCoinExample example = (TFCUserCoinExample) parameter.get("example");
        
        BEGIN();
        UPDATE("TFC_USER_COIN");
        
        if (record.getCoinRowid() != null) {
            SET("COIN_ROWID = #{record.coinRowid,jdbcType=VARCHAR}");
        }
        
        if (record.getCoinTypeId() != null) {
            SET("COIN_TYPE_ID = #{record.coinTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getStartTime() != null) {
            SET("START_TIME = #{record.startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpireTime() != null) {
            SET("EXPIRE_TIME = #{record.expireTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCoinNum() != null) {
            SET("COIN_NUM = #{record.coinNum,jdbcType=BIGINT}");
        }
        
        if (record.getLockCount() != null) {
            SET("LOCK_COUNT = #{record.lockCount,jdbcType=BIGINT}");
        }
        
        if (record.getShowChild() != null) {
            SET("SHOW_CHILD = #{record.showChild,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("TFC_USER_COIN");
        
        SET("COIN_ROWID = #{record.coinRowid,jdbcType=VARCHAR}");
        SET("COIN_TYPE_ID = #{record.coinTypeId,jdbcType=VARCHAR}");
        SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        SET("START_TIME = #{record.startTime,jdbcType=TIMESTAMP}");
        SET("EXPIRE_TIME = #{record.expireTime,jdbcType=TIMESTAMP}");
        SET("COIN_NUM = #{record.coinNum,jdbcType=BIGINT}");
        SET("LOCK_COUNT = #{record.lockCount,jdbcType=BIGINT}");
        SET("SHOW_CHILD = #{record.showChild,jdbcType=INTEGER}");
        
        TFCUserCoinExample example = (TFCUserCoinExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String updateByPrimaryKeySelective(TFCUserCoin record) {
        BEGIN();
        UPDATE("TFC_USER_COIN");
        
        if (record.getCoinTypeId() != null) {
            SET("COIN_TYPE_ID = #{coinTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getStartTime() != null) {
            SET("START_TIME = #{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpireTime() != null) {
            SET("EXPIRE_TIME = #{expireTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCoinNum() != null) {
            SET("COIN_NUM = #{coinNum,jdbcType=BIGINT}");
        }
        
        if (record.getLockCount() != null) {
            SET("LOCK_COUNT = #{lockCount,jdbcType=BIGINT}");
        }
        
        if (record.getShowChild() != null) {
            SET("SHOW_CHILD = #{showChild,jdbcType=INTEGER}");
        }
        
        WHERE("COIN_ROWID = #{coinRowid,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    protected void applyWhere(TFCUserCoinExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}