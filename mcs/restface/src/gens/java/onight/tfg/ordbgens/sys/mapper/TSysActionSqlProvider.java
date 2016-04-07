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
import onight.tfg.ordbgens.sys.entity.TSysAction;
import onight.tfg.ordbgens.sys.entity.TSysActionExample.Criteria;
import onight.tfg.ordbgens.sys.entity.TSysActionExample.Criterion;
import onight.tfg.ordbgens.sys.entity.TSysActionExample;

public class TSysActionSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    public String countByExample(TSysActionExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("T_SYS_ACTION");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    public String deleteByExample(TSysActionExample example) {
        BEGIN();
        DELETE_FROM("T_SYS_ACTION");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    public String insertSelective(TSysAction record) {
        BEGIN();
        INSERT_INTO("T_SYS_ACTION");
        
        if (record.getActionId() != null) {
            VALUES("ACTION_ID", "#{actionId,jdbcType=BIGINT}");
        }
        
        if (record.getActionFlag() != null) {
            VALUES("ACTION_FLAG", "#{actionFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getActionName() != null) {
            VALUES("ACTION_NAME", "#{actionName,jdbcType=VARCHAR}");
        }
        
        if (record.getActionDesc() != null) {
            VALUES("ACTION_DESC", "#{actionDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getActionMenu() != null) {
            VALUES("ACTION_MENU", "#{actionMenu,jdbcType=BIGINT}");
        }
        
        if (record.getField1() != null) {
            VALUES("FIELD1", "#{field1,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    public String selectByExample(TSysActionExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ACTION_ID");
        } else {
            SELECT("ACTION_ID");
        }
        SELECT("ACTION_FLAG");
        SELECT("ACTION_NAME");
        SELECT("ACTION_DESC");
        SELECT("ACTION_MENU");
        SELECT("FIELD1");
        FROM("T_SYS_ACTION");
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
            return SQL().concat(" limit "+example.getOffset()+","+example.getLimit());
        }
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TSysAction record = (TSysAction) parameter.get("record");
        TSysActionExample example = (TSysActionExample) parameter.get("example");
        
        BEGIN();
        UPDATE("T_SYS_ACTION");
        
        if (record.getActionId() != null) {
            SET("ACTION_ID = #{record.actionId,jdbcType=BIGINT}");
        }
        
        if (record.getActionFlag() != null) {
            SET("ACTION_FLAG = #{record.actionFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getActionName() != null) {
            SET("ACTION_NAME = #{record.actionName,jdbcType=VARCHAR}");
        }
        
        if (record.getActionDesc() != null) {
            SET("ACTION_DESC = #{record.actionDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getActionMenu() != null) {
            SET("ACTION_MENU = #{record.actionMenu,jdbcType=BIGINT}");
        }
        
        if (record.getField1() != null) {
            SET("FIELD1 = #{record.field1,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("T_SYS_ACTION");
        
        SET("ACTION_ID = #{record.actionId,jdbcType=BIGINT}");
        SET("ACTION_FLAG = #{record.actionFlag,jdbcType=VARCHAR}");
        SET("ACTION_NAME = #{record.actionName,jdbcType=VARCHAR}");
        SET("ACTION_DESC = #{record.actionDesc,jdbcType=VARCHAR}");
        SET("ACTION_MENU = #{record.actionMenu,jdbcType=BIGINT}");
        SET("FIELD1 = #{record.field1,jdbcType=VARCHAR}");
        
        TSysActionExample example = (TSysActionExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    public String updateByPrimaryKeySelective(TSysAction record) {
        BEGIN();
        UPDATE("T_SYS_ACTION");
        
        if (record.getActionFlag() != null) {
            SET("ACTION_FLAG = #{actionFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getActionName() != null) {
            SET("ACTION_NAME = #{actionName,jdbcType=VARCHAR}");
        }
        
        if (record.getActionDesc() != null) {
            SET("ACTION_DESC = #{actionDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getActionMenu() != null) {
            SET("ACTION_MENU = #{actionMenu,jdbcType=BIGINT}");
        }
        
        if (record.getField1() != null) {
            SET("FIELD1 = #{field1,jdbcType=VARCHAR}");
        }
        
        WHERE("ACTION_ID = #{actionId,jdbcType=BIGINT}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    protected void applyWhere(TSysActionExample example, boolean includeExamplePhrase) {
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