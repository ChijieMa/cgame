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
import onight.tfg.ordbgens.tfc.entity.TFCUserCoinChangeDetail;
import onight.tfg.ordbgens.tfc.entity.TFCUserCoinChangeDetailExample.Criteria;
import onight.tfg.ordbgens.tfc.entity.TFCUserCoinChangeDetailExample.Criterion;
import onight.tfg.ordbgens.tfc.entity.TFCUserCoinChangeDetailExample;

public class TFCUserCoinChangeDetailSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    public String countByExample(TFCUserCoinChangeDetailExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("TFC_USER_COIN_CHANGE_DETAIL");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    public String deleteByExample(TFCUserCoinChangeDetailExample example) {
        BEGIN();
        DELETE_FROM("TFC_USER_COIN_CHANGE_DETAIL");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    public String insertSelective(TFCUserCoinChangeDetail record) {
        BEGIN();
        INSERT_INTO("TFC_USER_COIN_CHANGE_DETAIL");
        
        if (record.getCoinRowId() != null) {
            VALUES("COIN_ROW_ID", "#{coinRowId,jdbcType=VARCHAR}");
        }
        
        if (record.getCoinTypeId() != null) {
            VALUES("COIN_TYPE_ID", "#{coinTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getRecTime() != null) {
            VALUES("REC_TIME", "#{recTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserId() != null) {
            VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getChangeNum() != null) {
            VALUES("CHANGE_NUM", "#{changeNum,jdbcType=BIGINT}");
        }
        
        if (record.getRemainNum() != null) {
            VALUES("REMAIN_NUM", "#{remainNum,jdbcType=BIGINT}");
        }
        
        if (record.getLockId() != null) {
            VALUES("LOCK_ID", "#{lockId,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            VALUES("CHANNEL_ID", "#{channelId,jdbcType=VARCHAR}");
        }
        
        if (record.getProductId() != null) {
            VALUES("PRODUCT_ID", "#{productId,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowNumber() != null) {
            VALUES("FLOW_NUMBER", "#{flowNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIp() != null) {
            VALUES("USER_IP", "#{userIp,jdbcType=VARCHAR}");
        }
        
        if (record.getServerIp() != null) {
            VALUES("SERVER_IP", "#{serverIp,jdbcType=VARCHAR}");
        }
        
        if (record.getGameId() != null) {
            VALUES("GAME_ID", "#{gameId,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    public String selectByExample(TFCUserCoinChangeDetailExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("COIN_ROW_ID");
        } else {
            SELECT("COIN_ROW_ID");
        }
        SELECT("COIN_TYPE_ID");
        SELECT("REC_TIME");
        SELECT("USER_ID");
        SELECT("CHANGE_NUM");
        SELECT("REMAIN_NUM");
        SELECT("LOCK_ID");
        SELECT("CHANNEL_ID");
        SELECT("PRODUCT_ID");
        SELECT("FLOW_NUMBER");
        SELECT("USER_IP");
        SELECT("SERVER_IP");
        SELECT("GAME_ID");
        FROM("TFC_USER_COIN_CHANGE_DETAIL");
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
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TFCUserCoinChangeDetail record = (TFCUserCoinChangeDetail) parameter.get("record");
        TFCUserCoinChangeDetailExample example = (TFCUserCoinChangeDetailExample) parameter.get("example");
        
        BEGIN();
        UPDATE("TFC_USER_COIN_CHANGE_DETAIL");
        
        if (record.getCoinRowId() != null) {
            SET("COIN_ROW_ID = #{record.coinRowId,jdbcType=VARCHAR}");
        }
        
        if (record.getCoinTypeId() != null) {
            SET("COIN_TYPE_ID = #{record.coinTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getRecTime() != null) {
            SET("REC_TIME = #{record.recTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserId() != null) {
            SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getChangeNum() != null) {
            SET("CHANGE_NUM = #{record.changeNum,jdbcType=BIGINT}");
        }
        
        if (record.getRemainNum() != null) {
            SET("REMAIN_NUM = #{record.remainNum,jdbcType=BIGINT}");
        }
        
        if (record.getLockId() != null) {
            SET("LOCK_ID = #{record.lockId,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            SET("CHANNEL_ID = #{record.channelId,jdbcType=VARCHAR}");
        }
        
        if (record.getProductId() != null) {
            SET("PRODUCT_ID = #{record.productId,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowNumber() != null) {
            SET("FLOW_NUMBER = #{record.flowNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIp() != null) {
            SET("USER_IP = #{record.userIp,jdbcType=VARCHAR}");
        }
        
        if (record.getServerIp() != null) {
            SET("SERVER_IP = #{record.serverIp,jdbcType=VARCHAR}");
        }
        
        if (record.getGameId() != null) {
            SET("GAME_ID = #{record.gameId,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("TFC_USER_COIN_CHANGE_DETAIL");
        
        SET("COIN_ROW_ID = #{record.coinRowId,jdbcType=VARCHAR}");
        SET("COIN_TYPE_ID = #{record.coinTypeId,jdbcType=VARCHAR}");
        SET("REC_TIME = #{record.recTime,jdbcType=TIMESTAMP}");
        SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        SET("CHANGE_NUM = #{record.changeNum,jdbcType=BIGINT}");
        SET("REMAIN_NUM = #{record.remainNum,jdbcType=BIGINT}");
        SET("LOCK_ID = #{record.lockId,jdbcType=VARCHAR}");
        SET("CHANNEL_ID = #{record.channelId,jdbcType=VARCHAR}");
        SET("PRODUCT_ID = #{record.productId,jdbcType=VARCHAR}");
        SET("FLOW_NUMBER = #{record.flowNumber,jdbcType=VARCHAR}");
        SET("USER_IP = #{record.userIp,jdbcType=VARCHAR}");
        SET("SERVER_IP = #{record.serverIp,jdbcType=VARCHAR}");
        SET("GAME_ID = #{record.gameId,jdbcType=INTEGER}");
        
        TFCUserCoinChangeDetailExample example = (TFCUserCoinChangeDetailExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    public String updateByPrimaryKeySelective(TFCUserCoinChangeDetail record) {
        BEGIN();
        UPDATE("TFC_USER_COIN_CHANGE_DETAIL");
        
        if (record.getCoinTypeId() != null) {
            SET("COIN_TYPE_ID = #{coinTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getRecTime() != null) {
            SET("REC_TIME = #{recTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserId() != null) {
            SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getChangeNum() != null) {
            SET("CHANGE_NUM = #{changeNum,jdbcType=BIGINT}");
        }
        
        if (record.getRemainNum() != null) {
            SET("REMAIN_NUM = #{remainNum,jdbcType=BIGINT}");
        }
        
        if (record.getLockId() != null) {
            SET("LOCK_ID = #{lockId,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            SET("CHANNEL_ID = #{channelId,jdbcType=VARCHAR}");
        }
        
        if (record.getProductId() != null) {
            SET("PRODUCT_ID = #{productId,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowNumber() != null) {
            SET("FLOW_NUMBER = #{flowNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIp() != null) {
            SET("USER_IP = #{userIp,jdbcType=VARCHAR}");
        }
        
        if (record.getServerIp() != null) {
            SET("SERVER_IP = #{serverIp,jdbcType=VARCHAR}");
        }
        
        if (record.getGameId() != null) {
            SET("GAME_ID = #{gameId,jdbcType=INTEGER}");
        }
        
        WHERE("COIN_ROW_ID = #{coinRowId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    protected void applyWhere(TFCUserCoinChangeDetailExample example, boolean includeExamplePhrase) {
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