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
import onight.tfg.ordbgens.act.entity.TActInfo;
import onight.tfg.ordbgens.act.entity.TActInfoExample.Criteria;
import onight.tfg.ordbgens.act.entity.TActInfoExample.Criterion;
import onight.tfg.ordbgens.act.entity.TActInfoExample;

public class TActInfoSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INFO
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public String countByExample(TActInfoExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("T_ACT_INFO");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INFO
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public String deleteByExample(TActInfoExample example) {
        BEGIN();
        DELETE_FROM("T_ACT_INFO");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INFO
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public String insertSelective(TActInfo record) {
        BEGIN();
        INSERT_INTO("T_ACT_INFO");
        
        if (record.getActNo() != null) {
            VALUES("ACT_NO", "#{actNo,jdbcType=VARCHAR}");
        }
        
        if (record.getActName() != null) {
            VALUES("ACT_NAME", "#{actName,jdbcType=VARCHAR}");
        }
        
        if (record.getCustId() != null) {
            VALUES("CUST_ID", "#{custId,jdbcType=VARCHAR}");
        }
        
        if (record.getMchntId() != null) {
            VALUES("MCHNT_ID", "#{mchntId,jdbcType=VARCHAR}");
        }
        
        if (record.getActType() != null) {
            VALUES("ACT_TYPE", "#{actType,jdbcType=VARCHAR}");
        }
        
        if (record.getMnySmb() != null) {
            VALUES("MNY_SMB", "#{mnySmb,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            VALUES("CHANNEL_ID", "#{channelId,jdbcType=VARCHAR}");
        }
        
        if (record.getCatalog() != null) {
            VALUES("CATALOG", "#{catalog,jdbcType=VARCHAR}");
        }
        
        if (record.getActYinitBal() != null) {
            VALUES("ACT_YINIT_BAL", "#{actYinitBal,jdbcType=DECIMAL}");
        }
        
        if (record.getActDinitBal() != null) {
            VALUES("ACT_DINIT_BAL", "#{actDinitBal,jdbcType=DECIMAL}");
        }
        
        if (record.getActCurBal() != null) {
            VALUES("ACT_CUR_BAL", "#{actCurBal,jdbcType=DECIMAL}");
        }
        
        if (record.getActStat() != null) {
            VALUES("ACT_STAT", "#{actStat,jdbcType=VARCHAR}");
        }
        
        if (record.getActMaxodAmt() != null) {
            VALUES("ACT_MAXOD_AMT", "#{actMaxodAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getActCtrlBal() != null) {
            VALUES("ACT_CTRL_BAL", "#{actCtrlBal,jdbcType=DECIMAL}");
        }
        
        if (record.getActBalWarnFlag() != null) {
            VALUES("ACT_BAL_WARN_FLAG", "#{actBalWarnFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("CREATE_TIME", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("UPDATE_TIME", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyId() != null) {
            VALUES("MODIFY_ID", "#{modifyId,jdbcType=VARCHAR}");
        }
        
        if (record.getMemo() != null) {
            VALUES("MEMO", "#{memo,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INFO
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public String selectByExample(TActInfoExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ACT_NO");
        } else {
            SELECT("ACT_NO");
        }
        SELECT("ACT_NAME");
        SELECT("CUST_ID");
        SELECT("MCHNT_ID");
        SELECT("ACT_TYPE");
        SELECT("MNY_SMB");
        SELECT("CHANNEL_ID");
        SELECT("CATALOG");
        SELECT("ACT_YINIT_BAL");
        SELECT("ACT_DINIT_BAL");
        SELECT("ACT_CUR_BAL");
        SELECT("ACT_STAT");
        SELECT("ACT_MAXOD_AMT");
        SELECT("ACT_CTRL_BAL");
        SELECT("ACT_BAL_WARN_FLAG");
        SELECT("CREATE_TIME");
        SELECT("UPDATE_TIME");
        SELECT("MODIFY_ID");
        SELECT("MEMO");
        FROM("T_ACT_INFO");
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
     * This method corresponds to the database table T_ACT_INFO
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TActInfo record = (TActInfo) parameter.get("record");
        TActInfoExample example = (TActInfoExample) parameter.get("example");
        
        BEGIN();
        UPDATE("T_ACT_INFO");
        
        if (record.getActNo() != null) {
            SET("ACT_NO = #{record.actNo,jdbcType=VARCHAR}");
        }
        
        if (record.getActName() != null) {
            SET("ACT_NAME = #{record.actName,jdbcType=VARCHAR}");
        }
        
        if (record.getCustId() != null) {
            SET("CUST_ID = #{record.custId,jdbcType=VARCHAR}");
        }
        
        if (record.getMchntId() != null) {
            SET("MCHNT_ID = #{record.mchntId,jdbcType=VARCHAR}");
        }
        
        if (record.getActType() != null) {
            SET("ACT_TYPE = #{record.actType,jdbcType=VARCHAR}");
        }
        
        if (record.getMnySmb() != null) {
            SET("MNY_SMB = #{record.mnySmb,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            SET("CHANNEL_ID = #{record.channelId,jdbcType=VARCHAR}");
        }
        
        if (record.getCatalog() != null) {
            SET("CATALOG = #{record.catalog,jdbcType=VARCHAR}");
        }
        
        if (record.getActYinitBal() != null) {
            SET("ACT_YINIT_BAL = #{record.actYinitBal,jdbcType=DECIMAL}");
        }
        
        if (record.getActDinitBal() != null) {
            SET("ACT_DINIT_BAL = #{record.actDinitBal,jdbcType=DECIMAL}");
        }
        
        if (record.getActCurBal() != null) {
            SET("ACT_CUR_BAL = #{record.actCurBal,jdbcType=DECIMAL}");
        }
        
        if (record.getActStat() != null) {
            SET("ACT_STAT = #{record.actStat,jdbcType=VARCHAR}");
        }
        
        if (record.getActMaxodAmt() != null) {
            SET("ACT_MAXOD_AMT = #{record.actMaxodAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getActCtrlBal() != null) {
            SET("ACT_CTRL_BAL = #{record.actCtrlBal,jdbcType=DECIMAL}");
        }
        
        if (record.getActBalWarnFlag() != null) {
            SET("ACT_BAL_WARN_FLAG = #{record.actBalWarnFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyId() != null) {
            SET("MODIFY_ID = #{record.modifyId,jdbcType=VARCHAR}");
        }
        
        if (record.getMemo() != null) {
            SET("MEMO = #{record.memo,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INFO
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("T_ACT_INFO");
        
        SET("ACT_NO = #{record.actNo,jdbcType=VARCHAR}");
        SET("ACT_NAME = #{record.actName,jdbcType=VARCHAR}");
        SET("CUST_ID = #{record.custId,jdbcType=VARCHAR}");
        SET("MCHNT_ID = #{record.mchntId,jdbcType=VARCHAR}");
        SET("ACT_TYPE = #{record.actType,jdbcType=VARCHAR}");
        SET("MNY_SMB = #{record.mnySmb,jdbcType=VARCHAR}");
        SET("CHANNEL_ID = #{record.channelId,jdbcType=VARCHAR}");
        SET("CATALOG = #{record.catalog,jdbcType=VARCHAR}");
        SET("ACT_YINIT_BAL = #{record.actYinitBal,jdbcType=DECIMAL}");
        SET("ACT_DINIT_BAL = #{record.actDinitBal,jdbcType=DECIMAL}");
        SET("ACT_CUR_BAL = #{record.actCurBal,jdbcType=DECIMAL}");
        SET("ACT_STAT = #{record.actStat,jdbcType=VARCHAR}");
        SET("ACT_MAXOD_AMT = #{record.actMaxodAmt,jdbcType=DECIMAL}");
        SET("ACT_CTRL_BAL = #{record.actCtrlBal,jdbcType=DECIMAL}");
        SET("ACT_BAL_WARN_FLAG = #{record.actBalWarnFlag,jdbcType=VARCHAR}");
        SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        SET("MODIFY_ID = #{record.modifyId,jdbcType=VARCHAR}");
        SET("MEMO = #{record.memo,jdbcType=VARCHAR}");
        
        TActInfoExample example = (TActInfoExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INFO
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public String updateByPrimaryKeySelective(TActInfo record) {
        BEGIN();
        UPDATE("T_ACT_INFO");
        
        if (record.getActName() != null) {
            SET("ACT_NAME = #{actName,jdbcType=VARCHAR}");
        }
        
        if (record.getCustId() != null) {
            SET("CUST_ID = #{custId,jdbcType=VARCHAR}");
        }
        
        if (record.getMchntId() != null) {
            SET("MCHNT_ID = #{mchntId,jdbcType=VARCHAR}");
        }
        
        if (record.getActType() != null) {
            SET("ACT_TYPE = #{actType,jdbcType=VARCHAR}");
        }
        
        if (record.getMnySmb() != null) {
            SET("MNY_SMB = #{mnySmb,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            SET("CHANNEL_ID = #{channelId,jdbcType=VARCHAR}");
        }
        
        if (record.getCatalog() != null) {
            SET("CATALOG = #{catalog,jdbcType=VARCHAR}");
        }
        
        if (record.getActYinitBal() != null) {
            SET("ACT_YINIT_BAL = #{actYinitBal,jdbcType=DECIMAL}");
        }
        
        if (record.getActDinitBal() != null) {
            SET("ACT_DINIT_BAL = #{actDinitBal,jdbcType=DECIMAL}");
        }
        
        if (record.getActCurBal() != null) {
            SET("ACT_CUR_BAL = #{actCurBal,jdbcType=DECIMAL}");
        }
        
        if (record.getActStat() != null) {
            SET("ACT_STAT = #{actStat,jdbcType=VARCHAR}");
        }
        
        if (record.getActMaxodAmt() != null) {
            SET("ACT_MAXOD_AMT = #{actMaxodAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getActCtrlBal() != null) {
            SET("ACT_CTRL_BAL = #{actCtrlBal,jdbcType=DECIMAL}");
        }
        
        if (record.getActBalWarnFlag() != null) {
            SET("ACT_BAL_WARN_FLAG = #{actBalWarnFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyId() != null) {
            SET("MODIFY_ID = #{modifyId,jdbcType=VARCHAR}");
        }
        
        if (record.getMemo() != null) {
            SET("MEMO = #{memo,jdbcType=VARCHAR}");
        }
        
        WHERE("ACT_NO = #{actNo,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INFO
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    protected void applyWhere(TActInfoExample example, boolean includeExamplePhrase) {
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