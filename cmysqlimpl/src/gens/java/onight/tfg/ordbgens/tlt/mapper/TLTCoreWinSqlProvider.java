package onight.tfg.ordbgens.tlt.mapper;

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
import onight.tfg.ordbgens.tlt.entity.TLTCoreWin;
import onight.tfg.ordbgens.tlt.entity.TLTCoreWinExample.Criteria;
import onight.tfg.ordbgens.tlt.entity.TLTCoreWinExample.Criterion;
import onight.tfg.ordbgens.tlt.entity.TLTCoreWinExample;

public class TLTCoreWinSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String countByExample(TLTCoreWinExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("TLT_CORE_WIN");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String deleteByExample(TLTCoreWinExample example) {
        BEGIN();
        DELETE_FROM("TLT_CORE_WIN");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String insertSelective(TLTCoreWin record) {
        BEGIN();
        INSERT_INTO("TLT_CORE_WIN");
        
        if (record.getUuid() != null) {
            VALUES("UUID", "#{uuid,jdbcType=VARCHAR}");
        }
        
        if (record.getTickNo() != null) {
            VALUES("TICK_NO", "#{tickNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBetNo() != null) {
            VALUES("BET_NO", "#{betNo,jdbcType=VARCHAR}");
        }
        
        if (record.getMerchantid() != null) {
            VALUES("MERCHANTID", "#{merchantid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            VALUES("USER_ID", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getIssueNo() != null) {
            VALUES("ISSUE_NO", "#{issueNo,jdbcType=DECIMAL}");
        }
        
        if (record.getLtype() != null) {
            VALUES("LTYPE", "#{ltype,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayType() != null) {
            VALUES("PLAY_TYPE", "#{playType,jdbcType=VARCHAR}");
        }
        
        if (record.getDivisionType() != null) {
            VALUES("DIVISION_TYPE", "#{divisionType,jdbcType=VARCHAR}");
        }
        
        if (record.getDivisionLevel() != null) {
            VALUES("DIVISION_LEVEL", "#{divisionLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getDivisionNum() != null) {
            VALUES("DIVISION_NUM", "#{divisionNum,jdbcType=DECIMAL}");
        }
        
        if (record.getLevelBonusAmount() != null) {
            VALUES("LEVEL_BONUS_AMOUNT", "#{levelBonusAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            VALUES("STATUS", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getAwardMoney() != null) {
            VALUES("AWARD_MONEY", "#{awardMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getBonusMoney() != null) {
            VALUES("BONUS_MONEY", "#{bonusMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getSumDivisionType() != null) {
            VALUES("SUM_DIVISION_TYPE", "#{sumDivisionType,jdbcType=INTEGER}");
        }
        
        if (record.getCreateDate() != null) {
            VALUES("CREATE_DATE", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyDate() != null) {
            VALUES("MODIFY_DATE", "#{modifyDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFundReturnAmount() != null) {
            VALUES("FUND_RETURN_AMOUNT", "#{fundReturnAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getFundRefIdReturn() != null) {
            VALUES("FUND_REF_ID_RETURN", "#{fundRefIdReturn,jdbcType=VARCHAR}");
        }
        
        if (record.getFundRefIdCancel() != null) {
            VALUES("FUND_REF_ID_CANCEL", "#{fundRefIdCancel,jdbcType=VARCHAR}");
        }
        
        if (record.getFundReturnDate() != null) {
            VALUES("FUND_RETURN_DATE", "#{fundReturnDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFundReturnStatus() != null) {
            VALUES("FUND_RETURN_STATUS", "#{fundReturnStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getFundCancelDate() != null) {
            VALUES("FUND_CANCEL_DATE", "#{fundCancelDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSerialNum() != null) {
            VALUES("SERIAL_NUM", "#{serialNum,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String selectByExample(TLTCoreWinExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("UUID");
        } else {
            SELECT("UUID");
        }
        SELECT("TICK_NO");
        SELECT("BET_NO");
        SELECT("MERCHANTID");
        SELECT("USER_ID");
        SELECT("ISSUE_NO");
        SELECT("LTYPE");
        SELECT("PLAY_TYPE");
        SELECT("DIVISION_TYPE");
        SELECT("DIVISION_LEVEL");
        SELECT("DIVISION_NUM");
        SELECT("LEVEL_BONUS_AMOUNT");
        SELECT("STATUS");
        SELECT("AWARD_MONEY");
        SELECT("BONUS_MONEY");
        SELECT("SUM_DIVISION_TYPE");
        SELECT("CREATE_DATE");
        SELECT("MODIFY_DATE");
        SELECT("FUND_RETURN_AMOUNT");
        SELECT("FUND_REF_ID_RETURN");
        SELECT("FUND_REF_ID_CANCEL");
        SELECT("FUND_RETURN_DATE");
        SELECT("FUND_RETURN_STATUS");
        SELECT("FUND_CANCEL_DATE");
        SELECT("SERIAL_NUM");
        FROM("TLT_CORE_WIN");
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
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TLTCoreWin record = (TLTCoreWin) parameter.get("record");
        TLTCoreWinExample example = (TLTCoreWinExample) parameter.get("example");
        
        BEGIN();
        UPDATE("TLT_CORE_WIN");
        
        if (record.getUuid() != null) {
            SET("UUID = #{record.uuid,jdbcType=VARCHAR}");
        }
        
        if (record.getTickNo() != null) {
            SET("TICK_NO = #{record.tickNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBetNo() != null) {
            SET("BET_NO = #{record.betNo,jdbcType=VARCHAR}");
        }
        
        if (record.getMerchantid() != null) {
            SET("MERCHANTID = #{record.merchantid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("USER_ID = #{record.userId,jdbcType=VARCHAR}");
        }
        
        if (record.getIssueNo() != null) {
            SET("ISSUE_NO = #{record.issueNo,jdbcType=DECIMAL}");
        }
        
        if (record.getLtype() != null) {
            SET("LTYPE = #{record.ltype,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayType() != null) {
            SET("PLAY_TYPE = #{record.playType,jdbcType=VARCHAR}");
        }
        
        if (record.getDivisionType() != null) {
            SET("DIVISION_TYPE = #{record.divisionType,jdbcType=VARCHAR}");
        }
        
        if (record.getDivisionLevel() != null) {
            SET("DIVISION_LEVEL = #{record.divisionLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getDivisionNum() != null) {
            SET("DIVISION_NUM = #{record.divisionNum,jdbcType=DECIMAL}");
        }
        
        if (record.getLevelBonusAmount() != null) {
            SET("LEVEL_BONUS_AMOUNT = #{record.levelBonusAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        }
        
        if (record.getAwardMoney() != null) {
            SET("AWARD_MONEY = #{record.awardMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getBonusMoney() != null) {
            SET("BONUS_MONEY = #{record.bonusMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getSumDivisionType() != null) {
            SET("SUM_DIVISION_TYPE = #{record.sumDivisionType,jdbcType=INTEGER}");
        }
        
        if (record.getCreateDate() != null) {
            SET("CREATE_DATE = #{record.createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyDate() != null) {
            SET("MODIFY_DATE = #{record.modifyDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFundReturnAmount() != null) {
            SET("FUND_RETURN_AMOUNT = #{record.fundReturnAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getFundRefIdReturn() != null) {
            SET("FUND_REF_ID_RETURN = #{record.fundRefIdReturn,jdbcType=VARCHAR}");
        }
        
        if (record.getFundRefIdCancel() != null) {
            SET("FUND_REF_ID_CANCEL = #{record.fundRefIdCancel,jdbcType=VARCHAR}");
        }
        
        if (record.getFundReturnDate() != null) {
            SET("FUND_RETURN_DATE = #{record.fundReturnDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFundReturnStatus() != null) {
            SET("FUND_RETURN_STATUS = #{record.fundReturnStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getFundCancelDate() != null) {
            SET("FUND_CANCEL_DATE = #{record.fundCancelDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSerialNum() != null) {
            SET("SERIAL_NUM = #{record.serialNum,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("TLT_CORE_WIN");
        
        SET("UUID = #{record.uuid,jdbcType=VARCHAR}");
        SET("TICK_NO = #{record.tickNo,jdbcType=VARCHAR}");
        SET("BET_NO = #{record.betNo,jdbcType=VARCHAR}");
        SET("MERCHANTID = #{record.merchantid,jdbcType=VARCHAR}");
        SET("USER_ID = #{record.userId,jdbcType=VARCHAR}");
        SET("ISSUE_NO = #{record.issueNo,jdbcType=DECIMAL}");
        SET("LTYPE = #{record.ltype,jdbcType=VARCHAR}");
        SET("PLAY_TYPE = #{record.playType,jdbcType=VARCHAR}");
        SET("DIVISION_TYPE = #{record.divisionType,jdbcType=VARCHAR}");
        SET("DIVISION_LEVEL = #{record.divisionLevel,jdbcType=VARCHAR}");
        SET("DIVISION_NUM = #{record.divisionNum,jdbcType=DECIMAL}");
        SET("LEVEL_BONUS_AMOUNT = #{record.levelBonusAmount,jdbcType=DECIMAL}");
        SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        SET("AWARD_MONEY = #{record.awardMoney,jdbcType=DECIMAL}");
        SET("BONUS_MONEY = #{record.bonusMoney,jdbcType=DECIMAL}");
        SET("SUM_DIVISION_TYPE = #{record.sumDivisionType,jdbcType=INTEGER}");
        SET("CREATE_DATE = #{record.createDate,jdbcType=TIMESTAMP}");
        SET("MODIFY_DATE = #{record.modifyDate,jdbcType=TIMESTAMP}");
        SET("FUND_RETURN_AMOUNT = #{record.fundReturnAmount,jdbcType=DECIMAL}");
        SET("FUND_REF_ID_RETURN = #{record.fundRefIdReturn,jdbcType=VARCHAR}");
        SET("FUND_REF_ID_CANCEL = #{record.fundRefIdCancel,jdbcType=VARCHAR}");
        SET("FUND_RETURN_DATE = #{record.fundReturnDate,jdbcType=TIMESTAMP}");
        SET("FUND_RETURN_STATUS = #{record.fundReturnStatus,jdbcType=VARCHAR}");
        SET("FUND_CANCEL_DATE = #{record.fundCancelDate,jdbcType=TIMESTAMP}");
        SET("SERIAL_NUM = #{record.serialNum,jdbcType=VARCHAR}");
        
        TLTCoreWinExample example = (TLTCoreWinExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String updateByPrimaryKeySelective(TLTCoreWin record) {
        BEGIN();
        UPDATE("TLT_CORE_WIN");
        
        if (record.getTickNo() != null) {
            SET("TICK_NO = #{tickNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBetNo() != null) {
            SET("BET_NO = #{betNo,jdbcType=VARCHAR}");
        }
        
        if (record.getMerchantid() != null) {
            SET("MERCHANTID = #{merchantid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("USER_ID = #{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getIssueNo() != null) {
            SET("ISSUE_NO = #{issueNo,jdbcType=DECIMAL}");
        }
        
        if (record.getLtype() != null) {
            SET("LTYPE = #{ltype,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayType() != null) {
            SET("PLAY_TYPE = #{playType,jdbcType=VARCHAR}");
        }
        
        if (record.getDivisionType() != null) {
            SET("DIVISION_TYPE = #{divisionType,jdbcType=VARCHAR}");
        }
        
        if (record.getDivisionLevel() != null) {
            SET("DIVISION_LEVEL = #{divisionLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getDivisionNum() != null) {
            SET("DIVISION_NUM = #{divisionNum,jdbcType=DECIMAL}");
        }
        
        if (record.getLevelBonusAmount() != null) {
            SET("LEVEL_BONUS_AMOUNT = #{levelBonusAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{status,jdbcType=VARCHAR}");
        }
        
        if (record.getAwardMoney() != null) {
            SET("AWARD_MONEY = #{awardMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getBonusMoney() != null) {
            SET("BONUS_MONEY = #{bonusMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getSumDivisionType() != null) {
            SET("SUM_DIVISION_TYPE = #{sumDivisionType,jdbcType=INTEGER}");
        }
        
        if (record.getCreateDate() != null) {
            SET("CREATE_DATE = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifyDate() != null) {
            SET("MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFundReturnAmount() != null) {
            SET("FUND_RETURN_AMOUNT = #{fundReturnAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getFundRefIdReturn() != null) {
            SET("FUND_REF_ID_RETURN = #{fundRefIdReturn,jdbcType=VARCHAR}");
        }
        
        if (record.getFundRefIdCancel() != null) {
            SET("FUND_REF_ID_CANCEL = #{fundRefIdCancel,jdbcType=VARCHAR}");
        }
        
        if (record.getFundReturnDate() != null) {
            SET("FUND_RETURN_DATE = #{fundReturnDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFundReturnStatus() != null) {
            SET("FUND_RETURN_STATUS = #{fundReturnStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getFundCancelDate() != null) {
            SET("FUND_CANCEL_DATE = #{fundCancelDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSerialNum() != null) {
            SET("SERIAL_NUM = #{serialNum,jdbcType=VARCHAR}");
        }
        
        WHERE("UUID = #{uuid,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    protected void applyWhere(TLTCoreWinExample example, boolean includeExamplePhrase) {
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