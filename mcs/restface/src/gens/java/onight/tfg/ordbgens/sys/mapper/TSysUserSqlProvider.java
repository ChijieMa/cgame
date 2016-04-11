package onight.tfg.ordbgens.sys.mapper;

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
import onight.tfg.ordbgens.sys.entity.TSysUser;
import onight.tfg.ordbgens.sys.entity.TSysUserExample.Criteria;
import onight.tfg.ordbgens.sys.entity.TSysUserExample.Criterion;
import onight.tfg.ordbgens.sys.entity.TSysUserExample;

public class TSysUserSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String countByExample(TSysUserExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("T_SYS_USER");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String deleteByExample(TSysUserExample example) {
        BEGIN();
        DELETE_FROM("T_SYS_USER");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String insertSelective(TSysUser record) {
        BEGIN();
        INSERT_INTO("T_SYS_USER");
        
        if (record.getUserId() != null) {
            VALUES("USER_ID", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchId() != null) {
            VALUES("BRANCH_ID", "#{branchId,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginName() != null) {
            VALUES("LOGIN_NAME", "#{loginName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            VALUES("USER_NAME", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            VALUES("MOBILE", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWorkaddress() != null) {
            VALUES("USER_WORKADDRESS", "#{userWorkaddress,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("STATUS", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            VALUES("PASSWORD", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("UPDATE_TIME", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("CREATE_TIME", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedBy() != null) {
            VALUES("CREATED_BY", "#{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getModifiedBy() != null) {
            VALUES("MODIFIED_BY", "#{modifiedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            VALUES("EMAIL", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getDataEnviron() != null) {
            VALUES("DATA_ENVIRON", "#{dataEnviron,jdbcType=INTEGER}");
        }
        
        if (record.getIcon() != null) {
            VALUES("ICON", "#{icon,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String selectByExample(TSysUserExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("USER_ID");
        } else {
            SELECT("USER_ID");
        }
        SELECT("BRANCH_ID");
        SELECT("LOGIN_NAME");
        SELECT("USER_NAME");
        SELECT("MOBILE");
        SELECT("USER_WORKADDRESS");
        SELECT("STATUS");
        SELECT("PASSWORD");
        SELECT("UPDATE_TIME");
        SELECT("CREATE_TIME");
        SELECT("CREATED_BY");
        SELECT("MODIFIED_BY");
        SELECT("EMAIL");
        SELECT("DATA_ENVIRON");
        SELECT("ICON");
        FROM("T_SYS_USER");
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
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TSysUser record = (TSysUser) parameter.get("record");
        TSysUserExample example = (TSysUserExample) parameter.get("example");
        
        BEGIN();
        UPDATE("T_SYS_USER");
        
        if (record.getUserId() != null) {
            SET("USER_ID = #{record.userId,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchId() != null) {
            SET("BRANCH_ID = #{record.branchId,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginName() != null) {
            SET("LOGIN_NAME = #{record.loginName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            SET("USER_NAME = #{record.userName,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            SET("MOBILE = #{record.mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWorkaddress() != null) {
            SET("USER_WORKADDRESS = #{record.userWorkaddress,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("PASSWORD = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedBy() != null) {
            SET("CREATED_BY = #{record.createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getModifiedBy() != null) {
            SET("MODIFIED_BY = #{record.modifiedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            SET("EMAIL = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getDataEnviron() != null) {
            SET("DATA_ENVIRON = #{record.dataEnviron,jdbcType=INTEGER}");
        }
        
        if (record.getIcon() != null) {
            SET("ICON = #{record.icon,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("T_SYS_USER");
        
        SET("USER_ID = #{record.userId,jdbcType=VARCHAR}");
        SET("BRANCH_ID = #{record.branchId,jdbcType=VARCHAR}");
        SET("LOGIN_NAME = #{record.loginName,jdbcType=VARCHAR}");
        SET("USER_NAME = #{record.userName,jdbcType=VARCHAR}");
        SET("MOBILE = #{record.mobile,jdbcType=VARCHAR}");
        SET("USER_WORKADDRESS = #{record.userWorkaddress,jdbcType=VARCHAR}");
        SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        SET("PASSWORD = #{record.password,jdbcType=VARCHAR}");
        SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("CREATED_BY = #{record.createdBy,jdbcType=VARCHAR}");
        SET("MODIFIED_BY = #{record.modifiedBy,jdbcType=VARCHAR}");
        SET("EMAIL = #{record.email,jdbcType=VARCHAR}");
        SET("DATA_ENVIRON = #{record.dataEnviron,jdbcType=INTEGER}");
        SET("ICON = #{record.icon,jdbcType=VARCHAR}");
        
        TSysUserExample example = (TSysUserExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String updateByPrimaryKeySelective(TSysUser record) {
        BEGIN();
        UPDATE("T_SYS_USER");
        
        if (record.getBranchId() != null) {
            SET("BRANCH_ID = #{branchId,jdbcType=VARCHAR}");
        }
        
        if (record.getLoginName() != null) {
            SET("LOGIN_NAME = #{loginName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            SET("USER_NAME = #{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            SET("MOBILE = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWorkaddress() != null) {
            SET("USER_WORKADDRESS = #{userWorkaddress,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{status,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("PASSWORD = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedBy() != null) {
            SET("CREATED_BY = #{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getModifiedBy() != null) {
            SET("MODIFIED_BY = #{modifiedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            SET("EMAIL = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getDataEnviron() != null) {
            SET("DATA_ENVIRON = #{dataEnviron,jdbcType=INTEGER}");
        }
        
        if (record.getIcon() != null) {
            SET("ICON = #{icon,jdbcType=VARCHAR}");
        }
        
        WHERE("USER_ID = #{userId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    protected void applyWhere(TSysUserExample example, boolean includeExamplePhrase) {
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