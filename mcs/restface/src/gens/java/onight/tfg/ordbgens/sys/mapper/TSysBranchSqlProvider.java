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
import onight.tfg.ordbgens.sys.entity.TSysBranch;
import onight.tfg.ordbgens.sys.entity.TSysBranchExample.Criteria;
import onight.tfg.ordbgens.sys.entity.TSysBranchExample.Criterion;
import onight.tfg.ordbgens.sys.entity.TSysBranchExample;

public class TSysBranchSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String countByExample(TSysBranchExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("T_SYS_BRANCH");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String deleteByExample(TSysBranchExample example) {
        BEGIN();
        DELETE_FROM("T_SYS_BRANCH");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String insertSelective(TSysBranch record) {
        BEGIN();
        INSERT_INTO("T_SYS_BRANCH");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchId() != null) {
            VALUES("BRANCH_ID", "#{branchId,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchDesc() != null) {
            VALUES("BRANCH_DESC", "#{branchDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchName() != null) {
            VALUES("BRANCH_NAME", "#{branchName,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchManager() != null) {
            VALUES("BRANCH_MANAGER", "#{branchManager,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            VALUES("MOBILE", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getBeginTime() != null) {
            VALUES("BEGIN_TIME", "#{beginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            VALUES("END_TIME", "#{endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getParentId() != null) {
            VALUES("PARENT_ID", "#{parentId,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafFlag() != null) {
            VALUES("LEAF_FLAG", "#{leafFlag,jdbcType=INTEGER}");
        }
        
        if (record.getBranchSeq() != null) {
            VALUES("BRANCH_SEQ", "#{branchSeq,jdbcType=INTEGER}");
        }
        
        if (record.getLevel() != null) {
            VALUES("LEVEL", "#{level,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String selectByExample(TSysBranchExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ID");
        } else {
            SELECT("ID");
        }
        SELECT("BRANCH_ID");
        SELECT("BRANCH_DESC");
        SELECT("BRANCH_NAME");
        SELECT("BRANCH_MANAGER");
        SELECT("MOBILE");
        SELECT("BEGIN_TIME");
        SELECT("END_TIME");
        SELECT("PARENT_ID");
        SELECT("LEAF_FLAG");
        SELECT("BRANCH_SEQ");
        SELECT("LEVEL");
        FROM("T_SYS_BRANCH");
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
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TSysBranch record = (TSysBranch) parameter.get("record");
        TSysBranchExample example = (TSysBranchExample) parameter.get("example");
        
        BEGIN();
        UPDATE("T_SYS_BRANCH");
        
        if (record.getId() != null) {
            SET("ID = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchId() != null) {
            SET("BRANCH_ID = #{record.branchId,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchDesc() != null) {
            SET("BRANCH_DESC = #{record.branchDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchName() != null) {
            SET("BRANCH_NAME = #{record.branchName,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchManager() != null) {
            SET("BRANCH_MANAGER = #{record.branchManager,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            SET("MOBILE = #{record.mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getBeginTime() != null) {
            SET("BEGIN_TIME = #{record.beginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            SET("END_TIME = #{record.endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getParentId() != null) {
            SET("PARENT_ID = #{record.parentId,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafFlag() != null) {
            SET("LEAF_FLAG = #{record.leafFlag,jdbcType=INTEGER}");
        }
        
        if (record.getBranchSeq() != null) {
            SET("BRANCH_SEQ = #{record.branchSeq,jdbcType=INTEGER}");
        }
        
        if (record.getLevel() != null) {
            SET("LEVEL = #{record.level,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("T_SYS_BRANCH");
        
        SET("ID = #{record.id,jdbcType=VARCHAR}");
        SET("BRANCH_ID = #{record.branchId,jdbcType=VARCHAR}");
        SET("BRANCH_DESC = #{record.branchDesc,jdbcType=VARCHAR}");
        SET("BRANCH_NAME = #{record.branchName,jdbcType=VARCHAR}");
        SET("BRANCH_MANAGER = #{record.branchManager,jdbcType=VARCHAR}");
        SET("MOBILE = #{record.mobile,jdbcType=VARCHAR}");
        SET("BEGIN_TIME = #{record.beginTime,jdbcType=TIMESTAMP}");
        SET("END_TIME = #{record.endTime,jdbcType=TIMESTAMP}");
        SET("PARENT_ID = #{record.parentId,jdbcType=VARCHAR}");
        SET("LEAF_FLAG = #{record.leafFlag,jdbcType=INTEGER}");
        SET("BRANCH_SEQ = #{record.branchSeq,jdbcType=INTEGER}");
        SET("LEVEL = #{record.level,jdbcType=INTEGER}");
        
        TSysBranchExample example = (TSysBranchExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String updateByPrimaryKeySelective(TSysBranch record) {
        BEGIN();
        UPDATE("T_SYS_BRANCH");
        
        if (record.getBranchId() != null) {
            SET("BRANCH_ID = #{branchId,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchDesc() != null) {
            SET("BRANCH_DESC = #{branchDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchName() != null) {
            SET("BRANCH_NAME = #{branchName,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchManager() != null) {
            SET("BRANCH_MANAGER = #{branchManager,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            SET("MOBILE = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getBeginTime() != null) {
            SET("BEGIN_TIME = #{beginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            SET("END_TIME = #{endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getParentId() != null) {
            SET("PARENT_ID = #{parentId,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafFlag() != null) {
            SET("LEAF_FLAG = #{leafFlag,jdbcType=INTEGER}");
        }
        
        if (record.getBranchSeq() != null) {
            SET("BRANCH_SEQ = #{branchSeq,jdbcType=INTEGER}");
        }
        
        if (record.getLevel() != null) {
            SET("LEVEL = #{level,jdbcType=INTEGER}");
        }
        
        WHERE("ID = #{id,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    protected void applyWhere(TSysBranchExample example, boolean includeExamplePhrase) {
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