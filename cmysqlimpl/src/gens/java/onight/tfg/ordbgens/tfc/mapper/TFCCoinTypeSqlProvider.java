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
import onight.tfg.ordbgens.tfc.entity.TFCCoinType;
import onight.tfg.ordbgens.tfc.entity.TFCCoinTypeExample.Criteria;
import onight.tfg.ordbgens.tfc.entity.TFCCoinTypeExample.Criterion;
import onight.tfg.ordbgens.tfc.entity.TFCCoinTypeExample;

public class TFCCoinTypeSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_COIN_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String countByExample(TFCCoinTypeExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("TFC_COIN_TYPE");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_COIN_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String deleteByExample(TFCCoinTypeExample example) {
        BEGIN();
        DELETE_FROM("TFC_COIN_TYPE");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_COIN_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String insertSelective(TFCCoinType record) {
        BEGIN();
        INSERT_INTO("TFC_COIN_TYPE");
        
        if (record.getCoinTypeId() != null) {
            VALUES("COIN_TYPE_ID", "#{coinTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getCoinName() != null) {
            VALUES("COIN_NAME", "#{coinName,jdbcType=VARCHAR}");
        }
        
        if (record.getCoinScript() != null) {
            VALUES("COIN_SCRIPT", "#{coinScript,jdbcType=VARCHAR}");
        }
        
        if (record.getHaveChild() != null) {
            VALUES("HAVE_CHILD", "#{haveChild,jdbcType=INTEGER}");
        }
        
        if (record.getCanSplit() != null) {
            VALUES("CAN_SPLIT", "#{canSplit,jdbcType=INTEGER}");
        }
        
        if (record.getUseLevel() != null) {
            VALUES("USE_LEVEL", "#{useLevel,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_COIN_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String selectByExample(TFCCoinTypeExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("COIN_TYPE_ID");
        } else {
            SELECT("COIN_TYPE_ID");
        }
        SELECT("COIN_NAME");
        SELECT("COIN_SCRIPT");
        SELECT("HAVE_CHILD");
        SELECT("CAN_SPLIT");
        SELECT("USE_LEVEL");
        FROM("TFC_COIN_TYPE");
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
     * This method corresponds to the database table TFC_COIN_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TFCCoinType record = (TFCCoinType) parameter.get("record");
        TFCCoinTypeExample example = (TFCCoinTypeExample) parameter.get("example");
        
        BEGIN();
        UPDATE("TFC_COIN_TYPE");
        
        if (record.getCoinTypeId() != null) {
            SET("COIN_TYPE_ID = #{record.coinTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getCoinName() != null) {
            SET("COIN_NAME = #{record.coinName,jdbcType=VARCHAR}");
        }
        
        if (record.getCoinScript() != null) {
            SET("COIN_SCRIPT = #{record.coinScript,jdbcType=VARCHAR}");
        }
        
        if (record.getHaveChild() != null) {
            SET("HAVE_CHILD = #{record.haveChild,jdbcType=INTEGER}");
        }
        
        if (record.getCanSplit() != null) {
            SET("CAN_SPLIT = #{record.canSplit,jdbcType=INTEGER}");
        }
        
        if (record.getUseLevel() != null) {
            SET("USE_LEVEL = #{record.useLevel,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_COIN_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("TFC_COIN_TYPE");
        
        SET("COIN_TYPE_ID = #{record.coinTypeId,jdbcType=VARCHAR}");
        SET("COIN_NAME = #{record.coinName,jdbcType=VARCHAR}");
        SET("COIN_SCRIPT = #{record.coinScript,jdbcType=VARCHAR}");
        SET("HAVE_CHILD = #{record.haveChild,jdbcType=INTEGER}");
        SET("CAN_SPLIT = #{record.canSplit,jdbcType=INTEGER}");
        SET("USE_LEVEL = #{record.useLevel,jdbcType=INTEGER}");
        
        TFCCoinTypeExample example = (TFCCoinTypeExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_COIN_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String updateByPrimaryKeySelective(TFCCoinType record) {
        BEGIN();
        UPDATE("TFC_COIN_TYPE");
        
        if (record.getCoinName() != null) {
            SET("COIN_NAME = #{coinName,jdbcType=VARCHAR}");
        }
        
        if (record.getCoinScript() != null) {
            SET("COIN_SCRIPT = #{coinScript,jdbcType=VARCHAR}");
        }
        
        if (record.getHaveChild() != null) {
            SET("HAVE_CHILD = #{haveChild,jdbcType=INTEGER}");
        }
        
        if (record.getCanSplit() != null) {
            SET("CAN_SPLIT = #{canSplit,jdbcType=INTEGER}");
        }
        
        if (record.getUseLevel() != null) {
            SET("USE_LEVEL = #{useLevel,jdbcType=INTEGER}");
        }
        
        WHERE("COIN_TYPE_ID = #{coinTypeId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_COIN_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    protected void applyWhere(TFCCoinTypeExample example, boolean includeExamplePhrase) {
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