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
import onight.tfg.ordbgens.tlt.entity.TLTPlayType;
import onight.tfg.ordbgens.tlt.entity.TLTPlayTypeExample.Criteria;
import onight.tfg.ordbgens.tlt.entity.TLTPlayTypeExample.Criterion;
import onight.tfg.ordbgens.tlt.entity.TLTPlayTypeExample;

public class TLTPlayTypeSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_PLAY_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String countByExample(TLTPlayTypeExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("TLT_PLAY_TYPE");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_PLAY_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String deleteByExample(TLTPlayTypeExample example) {
        BEGIN();
        DELETE_FROM("TLT_PLAY_TYPE");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_PLAY_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String insertSelective(TLTPlayType record) {
        BEGIN();
        INSERT_INTO("TLT_PLAY_TYPE");
        
        if (record.getPlayType() != null) {
            VALUES("PLAY_TYPE", "#{playType,jdbcType=VARCHAR}");
        }
        
        if (record.getLtype() != null) {
            VALUES("LTYPE", "#{ltype,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupType() != null) {
            VALUES("GROUP_TYPE", "#{groupType,jdbcType=VARCHAR}");
        }
        
        if (record.getLpgId() != null) {
            VALUES("LPG_ID", "#{lpgId,jdbcType=VARCHAR}");
        }
        
        if (record.getCnName() != null) {
            VALUES("CN_NAME", "#{cnName,jdbcType=VARCHAR}");
        }
        
        if (record.getEnName() != null) {
            VALUES("EN_NAME", "#{enName,jdbcType=VARCHAR}");
        }
        
        if (record.getLockFunc() != null) {
            VALUES("LOCK_FUNC", "#{lockFunc,jdbcType=VARCHAR}");
        }
        
        if (record.getLockTable() != null) {
            VALUES("LOCK_TABLE", "#{lockTable,jdbcType=VARCHAR}");
        }
        
        if (record.getLockStatus() != null) {
            VALUES("LOCK_STATUS", "#{lockStatus,jdbcType=BIT}");
        }
        
        if (record.getModeYjfl() != null) {
            VALUES("MODE_YJFL", "#{modeYjfl,jdbcType=VARCHAR}");
        }
        
        if (record.getIsandvalue() != null) {
            VALUES("ISANDVALUE", "#{isandvalue,jdbcType=BIT}");
        }
        
        if (record.getMaxBuyCodenum() != null) {
            VALUES("MAX_BUY_CODENUM", "#{maxBuyCodenum,jdbcType=INTEGER}");
        }
        
        if (record.getWinFunc() != null) {
            VALUES("WIN_FUNC", "#{winFunc,jdbcType=VARCHAR}");
        }
        
        if (record.getWinBeginpos() != null) {
            VALUES("WIN_BEGINPOS", "#{winBeginpos,jdbcType=INTEGER}");
        }
        
        if (record.getWinCodenum() != null) {
            VALUES("WIN_CODENUM", "#{winCodenum,jdbcType=INTEGER}");
        }
        
        if (record.getWinDiscontinuouspos() != null) {
            VALUES("WIN_DISCONTINUOUSPOS", "#{winDiscontinuouspos,jdbcType=INTEGER}");
        }
        
        if (record.getWinCheckfunc() != null) {
            VALUES("WIN_CHECKFUNC", "#{winCheckfunc,jdbcType=VARCHAR}");
        }
        
        if (record.getWinPaybonusfunc() != null) {
            VALUES("WIN_PAYBONUSFUNC", "#{winPaybonusfunc,jdbcType=VARCHAR}");
        }
        
        if (record.getEnable() != null) {
            VALUES("ENABLE", "#{enable,jdbcType=BIT}");
        }
        
        if (record.getRemark() != null) {
            VALUES("REMARK", "#{remark,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_PLAY_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String selectByExample(TLTPlayTypeExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("PLAY_TYPE");
        } else {
            SELECT("PLAY_TYPE");
        }
        SELECT("LTYPE");
        SELECT("GROUP_TYPE");
        SELECT("LPG_ID");
        SELECT("CN_NAME");
        SELECT("EN_NAME");
        SELECT("LOCK_FUNC");
        SELECT("LOCK_TABLE");
        SELECT("LOCK_STATUS");
        SELECT("MODE_YJFL");
        SELECT("ISANDVALUE");
        SELECT("MAX_BUY_CODENUM");
        SELECT("WIN_FUNC");
        SELECT("WIN_BEGINPOS");
        SELECT("WIN_CODENUM");
        SELECT("WIN_DISCONTINUOUSPOS");
        SELECT("WIN_CHECKFUNC");
        SELECT("WIN_PAYBONUSFUNC");
        SELECT("ENABLE");
        SELECT("REMARK");
        FROM("TLT_PLAY_TYPE");
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
     * This method corresponds to the database table TLT_PLAY_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TLTPlayType record = (TLTPlayType) parameter.get("record");
        TLTPlayTypeExample example = (TLTPlayTypeExample) parameter.get("example");
        
        BEGIN();
        UPDATE("TLT_PLAY_TYPE");
        
        if (record.getPlayType() != null) {
            SET("PLAY_TYPE = #{record.playType,jdbcType=VARCHAR}");
        }
        
        if (record.getLtype() != null) {
            SET("LTYPE = #{record.ltype,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupType() != null) {
            SET("GROUP_TYPE = #{record.groupType,jdbcType=VARCHAR}");
        }
        
        if (record.getLpgId() != null) {
            SET("LPG_ID = #{record.lpgId,jdbcType=VARCHAR}");
        }
        
        if (record.getCnName() != null) {
            SET("CN_NAME = #{record.cnName,jdbcType=VARCHAR}");
        }
        
        if (record.getEnName() != null) {
            SET("EN_NAME = #{record.enName,jdbcType=VARCHAR}");
        }
        
        if (record.getLockFunc() != null) {
            SET("LOCK_FUNC = #{record.lockFunc,jdbcType=VARCHAR}");
        }
        
        if (record.getLockTable() != null) {
            SET("LOCK_TABLE = #{record.lockTable,jdbcType=VARCHAR}");
        }
        
        if (record.getLockStatus() != null) {
            SET("LOCK_STATUS = #{record.lockStatus,jdbcType=BIT}");
        }
        
        if (record.getModeYjfl() != null) {
            SET("MODE_YJFL = #{record.modeYjfl,jdbcType=VARCHAR}");
        }
        
        if (record.getIsandvalue() != null) {
            SET("ISANDVALUE = #{record.isandvalue,jdbcType=BIT}");
        }
        
        if (record.getMaxBuyCodenum() != null) {
            SET("MAX_BUY_CODENUM = #{record.maxBuyCodenum,jdbcType=INTEGER}");
        }
        
        if (record.getWinFunc() != null) {
            SET("WIN_FUNC = #{record.winFunc,jdbcType=VARCHAR}");
        }
        
        if (record.getWinBeginpos() != null) {
            SET("WIN_BEGINPOS = #{record.winBeginpos,jdbcType=INTEGER}");
        }
        
        if (record.getWinCodenum() != null) {
            SET("WIN_CODENUM = #{record.winCodenum,jdbcType=INTEGER}");
        }
        
        if (record.getWinDiscontinuouspos() != null) {
            SET("WIN_DISCONTINUOUSPOS = #{record.winDiscontinuouspos,jdbcType=INTEGER}");
        }
        
        if (record.getWinCheckfunc() != null) {
            SET("WIN_CHECKFUNC = #{record.winCheckfunc,jdbcType=VARCHAR}");
        }
        
        if (record.getWinPaybonusfunc() != null) {
            SET("WIN_PAYBONUSFUNC = #{record.winPaybonusfunc,jdbcType=VARCHAR}");
        }
        
        if (record.getEnable() != null) {
            SET("ENABLE = #{record.enable,jdbcType=BIT}");
        }
        
        if (record.getRemark() != null) {
            SET("REMARK = #{record.remark,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_PLAY_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("TLT_PLAY_TYPE");
        
        SET("PLAY_TYPE = #{record.playType,jdbcType=VARCHAR}");
        SET("LTYPE = #{record.ltype,jdbcType=VARCHAR}");
        SET("GROUP_TYPE = #{record.groupType,jdbcType=VARCHAR}");
        SET("LPG_ID = #{record.lpgId,jdbcType=VARCHAR}");
        SET("CN_NAME = #{record.cnName,jdbcType=VARCHAR}");
        SET("EN_NAME = #{record.enName,jdbcType=VARCHAR}");
        SET("LOCK_FUNC = #{record.lockFunc,jdbcType=VARCHAR}");
        SET("LOCK_TABLE = #{record.lockTable,jdbcType=VARCHAR}");
        SET("LOCK_STATUS = #{record.lockStatus,jdbcType=BIT}");
        SET("MODE_YJFL = #{record.modeYjfl,jdbcType=VARCHAR}");
        SET("ISANDVALUE = #{record.isandvalue,jdbcType=BIT}");
        SET("MAX_BUY_CODENUM = #{record.maxBuyCodenum,jdbcType=INTEGER}");
        SET("WIN_FUNC = #{record.winFunc,jdbcType=VARCHAR}");
        SET("WIN_BEGINPOS = #{record.winBeginpos,jdbcType=INTEGER}");
        SET("WIN_CODENUM = #{record.winCodenum,jdbcType=INTEGER}");
        SET("WIN_DISCONTINUOUSPOS = #{record.winDiscontinuouspos,jdbcType=INTEGER}");
        SET("WIN_CHECKFUNC = #{record.winCheckfunc,jdbcType=VARCHAR}");
        SET("WIN_PAYBONUSFUNC = #{record.winPaybonusfunc,jdbcType=VARCHAR}");
        SET("ENABLE = #{record.enable,jdbcType=BIT}");
        SET("REMARK = #{record.remark,jdbcType=VARCHAR}");
        
        TLTPlayTypeExample example = (TLTPlayTypeExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_PLAY_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String updateByPrimaryKeySelective(TLTPlayType record) {
        BEGIN();
        UPDATE("TLT_PLAY_TYPE");
        
        if (record.getLtype() != null) {
            SET("LTYPE = #{ltype,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupType() != null) {
            SET("GROUP_TYPE = #{groupType,jdbcType=VARCHAR}");
        }
        
        if (record.getLpgId() != null) {
            SET("LPG_ID = #{lpgId,jdbcType=VARCHAR}");
        }
        
        if (record.getCnName() != null) {
            SET("CN_NAME = #{cnName,jdbcType=VARCHAR}");
        }
        
        if (record.getEnName() != null) {
            SET("EN_NAME = #{enName,jdbcType=VARCHAR}");
        }
        
        if (record.getLockFunc() != null) {
            SET("LOCK_FUNC = #{lockFunc,jdbcType=VARCHAR}");
        }
        
        if (record.getLockTable() != null) {
            SET("LOCK_TABLE = #{lockTable,jdbcType=VARCHAR}");
        }
        
        if (record.getLockStatus() != null) {
            SET("LOCK_STATUS = #{lockStatus,jdbcType=BIT}");
        }
        
        if (record.getModeYjfl() != null) {
            SET("MODE_YJFL = #{modeYjfl,jdbcType=VARCHAR}");
        }
        
        if (record.getIsandvalue() != null) {
            SET("ISANDVALUE = #{isandvalue,jdbcType=BIT}");
        }
        
        if (record.getMaxBuyCodenum() != null) {
            SET("MAX_BUY_CODENUM = #{maxBuyCodenum,jdbcType=INTEGER}");
        }
        
        if (record.getWinFunc() != null) {
            SET("WIN_FUNC = #{winFunc,jdbcType=VARCHAR}");
        }
        
        if (record.getWinBeginpos() != null) {
            SET("WIN_BEGINPOS = #{winBeginpos,jdbcType=INTEGER}");
        }
        
        if (record.getWinCodenum() != null) {
            SET("WIN_CODENUM = #{winCodenum,jdbcType=INTEGER}");
        }
        
        if (record.getWinDiscontinuouspos() != null) {
            SET("WIN_DISCONTINUOUSPOS = #{winDiscontinuouspos,jdbcType=INTEGER}");
        }
        
        if (record.getWinCheckfunc() != null) {
            SET("WIN_CHECKFUNC = #{winCheckfunc,jdbcType=VARCHAR}");
        }
        
        if (record.getWinPaybonusfunc() != null) {
            SET("WIN_PAYBONUSFUNC = #{winPaybonusfunc,jdbcType=VARCHAR}");
        }
        
        if (record.getEnable() != null) {
            SET("ENABLE = #{enable,jdbcType=BIT}");
        }
        
        if (record.getRemark() != null) {
            SET("REMARK = #{remark,jdbcType=VARCHAR}");
        }
        
        WHERE("PLAY_TYPE = #{playType,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_PLAY_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    protected void applyWhere(TLTPlayTypeExample example, boolean includeExamplePhrase) {
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