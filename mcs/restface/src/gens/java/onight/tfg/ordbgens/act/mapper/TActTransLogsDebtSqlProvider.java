package onight.tfg.ordbgens.act.mapper;

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
import onight.tfg.ordbgens.act.entity.TActTransLogsDebt;
import onight.tfg.ordbgens.act.entity.TActTransLogsDebtExample.Criteria;
import onight.tfg.ordbgens.act.entity.TActTransLogsDebtExample.Criterion;
import onight.tfg.ordbgens.act.entity.TActTransLogsDebtExample;

public class TActTransLogsDebtSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS_DEBT
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String countByExample(TActTransLogsDebtExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("T_ACT_TRANS_LOGS_DEBT");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS_DEBT
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String deleteByExample(TActTransLogsDebtExample example) {
        BEGIN();
        DELETE_FROM("T_ACT_TRANS_LOGS_DEBT");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS_DEBT
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String insertSelective(TActTransLogsDebt record) {
        BEGIN();
        INSERT_INTO("T_ACT_TRANS_LOGS_DEBT");
        
        if (record.getLogUuid() != null) {
            VALUES("LOG_UUID", "#{logUuid,jdbcType=VARCHAR}");
        }
        
        if (record.getFromFundNo() != null) {
            VALUES("FROM_FUND_NO", "#{fromFundNo,jdbcType=VARCHAR}");
        }
        
        if (record.getToFundNo() != null) {
            VALUES("TO_FUND_NO", "#{toFundNo,jdbcType=VARCHAR}");
        }
        
        if (record.getFlagCancel() != null) {
            VALUES("FLAG_CANCEL", "#{flagCancel,jdbcType=CHAR}");
        }
        
        if (record.getRelatedTransId() != null) {
            VALUES("RELATED_TRANS_ID", "#{relatedTransId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("STATUS", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("CREATE_TIME", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("UPDATE_TIME", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS_DEBT
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String selectByExample(TActTransLogsDebtExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("LOG_UUID");
        } else {
            SELECT("LOG_UUID");
        }
        SELECT("FROM_FUND_NO");
        SELECT("TO_FUND_NO");
        SELECT("FLAG_CANCEL");
        SELECT("RELATED_TRANS_ID");
        SELECT("STATUS");
        SELECT("CREATE_TIME");
        SELECT("UPDATE_TIME");
        FROM("T_ACT_TRANS_LOGS_DEBT");
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
     * This method corresponds to the database table T_ACT_TRANS_LOGS_DEBT
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TActTransLogsDebt record = (TActTransLogsDebt) parameter.get("record");
        TActTransLogsDebtExample example = (TActTransLogsDebtExample) parameter.get("example");
        
        BEGIN();
        UPDATE("T_ACT_TRANS_LOGS_DEBT");
        
        if (record.getLogUuid() != null) {
            SET("LOG_UUID = #{record.logUuid,jdbcType=VARCHAR}");
        }
        
        if (record.getFromFundNo() != null) {
            SET("FROM_FUND_NO = #{record.fromFundNo,jdbcType=VARCHAR}");
        }
        
        if (record.getToFundNo() != null) {
            SET("TO_FUND_NO = #{record.toFundNo,jdbcType=VARCHAR}");
        }
        
        if (record.getFlagCancel() != null) {
            SET("FLAG_CANCEL = #{record.flagCancel,jdbcType=CHAR}");
        }
        
        if (record.getRelatedTransId() != null) {
            SET("RELATED_TRANS_ID = #{record.relatedTransId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS_DEBT
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("T_ACT_TRANS_LOGS_DEBT");
        
        SET("LOG_UUID = #{record.logUuid,jdbcType=VARCHAR}");
        SET("FROM_FUND_NO = #{record.fromFundNo,jdbcType=VARCHAR}");
        SET("TO_FUND_NO = #{record.toFundNo,jdbcType=VARCHAR}");
        SET("FLAG_CANCEL = #{record.flagCancel,jdbcType=CHAR}");
        SET("RELATED_TRANS_ID = #{record.relatedTransId,jdbcType=VARCHAR}");
        SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        TActTransLogsDebtExample example = (TActTransLogsDebtExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS_DEBT
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String updateByPrimaryKeySelective(TActTransLogsDebt record) {
        BEGIN();
        UPDATE("T_ACT_TRANS_LOGS_DEBT");
        
        if (record.getFromFundNo() != null) {
            SET("FROM_FUND_NO = #{fromFundNo,jdbcType=VARCHAR}");
        }
        
        if (record.getToFundNo() != null) {
            SET("TO_FUND_NO = #{toFundNo,jdbcType=VARCHAR}");
        }
        
        if (record.getFlagCancel() != null) {
            SET("FLAG_CANCEL = #{flagCancel,jdbcType=CHAR}");
        }
        
        if (record.getRelatedTransId() != null) {
            SET("RELATED_TRANS_ID = #{relatedTransId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{status,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("LOG_UUID = #{logUuid,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS_DEBT
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    protected void applyWhere(TActTransLogsDebtExample example, boolean includeExamplePhrase) {
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