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
import onight.tfg.ordbgens.tlt.entity.TLTUserBank;
import onight.tfg.ordbgens.tlt.entity.TLTUserBankExample.Criteria;
import onight.tfg.ordbgens.tlt.entity.TLTUserBankExample.Criterion;
import onight.tfg.ordbgens.tlt.entity.TLTUserBankExample;

public class TLTUserBankSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_USER_BANK
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String countByExample(TLTUserBankExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("TLT_USER_BANK");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_USER_BANK
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String deleteByExample(TLTUserBankExample example) {
        BEGIN();
        DELETE_FROM("TLT_USER_BANK");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_USER_BANK
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String insertSelective(TLTUserBank record) {
        BEGIN();
        INSERT_INTO("TLT_USER_BANK");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getBankCode() != null) {
            VALUES("BANK_CODE", "#{bankCode,jdbcType=VARCHAR}");
        }
        
        if (record.getBankName() != null) {
            VALUES("BANK_NAME", "#{bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            VALUES("USERNAME", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            VALUES("ACCOUNT", "#{account,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            VALUES("MOBILE", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            VALUES("PASSWORD", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getEnable() != null) {
            VALUES("ENABLE", "#{enable,jdbcType=BIT}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_USER_BANK
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String selectByExample(TLTUserBankExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ID");
        } else {
            SELECT("ID");
        }
        SELECT("USER_ID");
        SELECT("BANK_CODE");
        SELECT("BANK_NAME");
        SELECT("USERNAME");
        SELECT("ACCOUNT");
        SELECT("MOBILE");
        SELECT("PASSWORD");
        SELECT("ENABLE");
        FROM("TLT_USER_BANK");
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
     * This method corresponds to the database table TLT_USER_BANK
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TLTUserBank record = (TLTUserBank) parameter.get("record");
        TLTUserBankExample example = (TLTUserBankExample) parameter.get("example");
        
        BEGIN();
        UPDATE("TLT_USER_BANK");
        
        if (record.getId() != null) {
            SET("ID = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getBankCode() != null) {
            SET("BANK_CODE = #{record.bankCode,jdbcType=VARCHAR}");
        }
        
        if (record.getBankName() != null) {
            SET("BANK_NAME = #{record.bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            SET("USERNAME = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            SET("ACCOUNT = #{record.account,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            SET("MOBILE = #{record.mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("PASSWORD = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getEnable() != null) {
            SET("ENABLE = #{record.enable,jdbcType=BIT}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_USER_BANK
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("TLT_USER_BANK");
        
        SET("ID = #{record.id,jdbcType=BIGINT}");
        SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        SET("BANK_CODE = #{record.bankCode,jdbcType=VARCHAR}");
        SET("BANK_NAME = #{record.bankName,jdbcType=VARCHAR}");
        SET("USERNAME = #{record.username,jdbcType=VARCHAR}");
        SET("ACCOUNT = #{record.account,jdbcType=VARCHAR}");
        SET("MOBILE = #{record.mobile,jdbcType=VARCHAR}");
        SET("PASSWORD = #{record.password,jdbcType=VARCHAR}");
        SET("ENABLE = #{record.enable,jdbcType=BIT}");
        
        TLTUserBankExample example = (TLTUserBankExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_USER_BANK
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    public String updateByPrimaryKeySelective(TLTUserBank record) {
        BEGIN();
        UPDATE("TLT_USER_BANK");
        
        if (record.getUserId() != null) {
            SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getBankCode() != null) {
            SET("BANK_CODE = #{bankCode,jdbcType=VARCHAR}");
        }
        
        if (record.getBankName() != null) {
            SET("BANK_NAME = #{bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            SET("USERNAME = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            SET("ACCOUNT = #{account,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            SET("MOBILE = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("PASSWORD = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getEnable() != null) {
            SET("ENABLE = #{enable,jdbcType=BIT}");
        }
        
        WHERE("ID = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_USER_BANK
     *
     * @mbggenerated Mon Apr 11 20:11:17 CST 2016
     */
    protected void applyWhere(TLTUserBankExample example, boolean includeExamplePhrase) {
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