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
import onight.tfg.ordbgens.tlt.entity.TLTIssueFlows;
import onight.tfg.ordbgens.tlt.entity.TLTIssueFlowsExample.Criteria;
import onight.tfg.ordbgens.tlt.entity.TLTIssueFlowsExample.Criterion;
import onight.tfg.ordbgens.tlt.entity.TLTIssueFlowsExample;

public class TLTIssueFlowsSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String countByExample(TLTIssueFlowsExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("TLT_ISSUE_FLOWS");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String deleteByExample(TLTIssueFlowsExample example) {
        BEGIN();
        DELETE_FROM("TLT_ISSUE_FLOWS");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String insertSelective(TLTIssueFlows record) {
        BEGIN();
        INSERT_INTO("TLT_ISSUE_FLOWS");
        
        if (record.getGenId() != null) {
            VALUES("GEN_ID", "#{genId,jdbcType=BIGINT}");
        }
        
        if (record.getLtype() != null) {
            VALUES("LTYPE", "#{ltype,jdbcType=VARCHAR}");
        }
        
        if (record.getGsEcode() != null) {
            VALUES("GS_ECODE", "#{gsEcode,jdbcType=VARCHAR}");
        }
        
        if (record.getGsChcode() != null) {
            VALUES("GS_CHCODE", "#{gsChcode,jdbcType=VARCHAR}");
        }
        
        if (record.getGsDesc() != null) {
            VALUES("GS_DESC", "#{gsDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTimesecOffset() != null) {
            VALUES("TIMESEC_OFFSET", "#{timesecOffset,jdbcType=INTEGER}");
        }
        
        if (record.getGsOrder() != null) {
            VALUES("GS_ORDER", "#{gsOrder,jdbcType=VARCHAR}");
        }
        
        if (record.getNextOrders() != null) {
            VALUES("NEXT_ORDERS", "#{nextOrders,jdbcType=VARCHAR}");
        }
        
        if (record.getWaitOrders() != null) {
            VALUES("WAIT_ORDERS", "#{waitOrders,jdbcType=VARCHAR}");
        }
        
        if (record.getNodeType() != null) {
            VALUES("NODE_TYPE", "#{nodeType,jdbcType=VARCHAR}");
        }
        
        if (record.getAutoGonext() != null) {
            VALUES("AUTO_GONEXT", "#{autoGonext,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("STATUS", "#{status,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String selectByExample(TLTIssueFlowsExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("GEN_ID");
        } else {
            SELECT("GEN_ID");
        }
        SELECT("LTYPE");
        SELECT("GS_ECODE");
        SELECT("GS_CHCODE");
        SELECT("GS_DESC");
        SELECT("TIMESEC_OFFSET");
        SELECT("GS_ORDER");
        SELECT("NEXT_ORDERS");
        SELECT("WAIT_ORDERS");
        SELECT("NODE_TYPE");
        SELECT("AUTO_GONEXT");
        SELECT("STATUS");
        FROM("TLT_ISSUE_FLOWS");
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
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TLTIssueFlows record = (TLTIssueFlows) parameter.get("record");
        TLTIssueFlowsExample example = (TLTIssueFlowsExample) parameter.get("example");
        
        BEGIN();
        UPDATE("TLT_ISSUE_FLOWS");
        
        if (record.getGenId() != null) {
            SET("GEN_ID = #{record.genId,jdbcType=BIGINT}");
        }
        
        if (record.getLtype() != null) {
            SET("LTYPE = #{record.ltype,jdbcType=VARCHAR}");
        }
        
        if (record.getGsEcode() != null) {
            SET("GS_ECODE = #{record.gsEcode,jdbcType=VARCHAR}");
        }
        
        if (record.getGsChcode() != null) {
            SET("GS_CHCODE = #{record.gsChcode,jdbcType=VARCHAR}");
        }
        
        if (record.getGsDesc() != null) {
            SET("GS_DESC = #{record.gsDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTimesecOffset() != null) {
            SET("TIMESEC_OFFSET = #{record.timesecOffset,jdbcType=INTEGER}");
        }
        
        if (record.getGsOrder() != null) {
            SET("GS_ORDER = #{record.gsOrder,jdbcType=VARCHAR}");
        }
        
        if (record.getNextOrders() != null) {
            SET("NEXT_ORDERS = #{record.nextOrders,jdbcType=VARCHAR}");
        }
        
        if (record.getWaitOrders() != null) {
            SET("WAIT_ORDERS = #{record.waitOrders,jdbcType=VARCHAR}");
        }
        
        if (record.getNodeType() != null) {
            SET("NODE_TYPE = #{record.nodeType,jdbcType=VARCHAR}");
        }
        
        if (record.getAutoGonext() != null) {
            SET("AUTO_GONEXT = #{record.autoGonext,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("TLT_ISSUE_FLOWS");
        
        SET("GEN_ID = #{record.genId,jdbcType=BIGINT}");
        SET("LTYPE = #{record.ltype,jdbcType=VARCHAR}");
        SET("GS_ECODE = #{record.gsEcode,jdbcType=VARCHAR}");
        SET("GS_CHCODE = #{record.gsChcode,jdbcType=VARCHAR}");
        SET("GS_DESC = #{record.gsDesc,jdbcType=VARCHAR}");
        SET("TIMESEC_OFFSET = #{record.timesecOffset,jdbcType=INTEGER}");
        SET("GS_ORDER = #{record.gsOrder,jdbcType=VARCHAR}");
        SET("NEXT_ORDERS = #{record.nextOrders,jdbcType=VARCHAR}");
        SET("WAIT_ORDERS = #{record.waitOrders,jdbcType=VARCHAR}");
        SET("NODE_TYPE = #{record.nodeType,jdbcType=VARCHAR}");
        SET("AUTO_GONEXT = #{record.autoGonext,jdbcType=VARCHAR}");
        SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        
        TLTIssueFlowsExample example = (TLTIssueFlowsExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String updateByPrimaryKeySelective(TLTIssueFlows record) {
        BEGIN();
        UPDATE("TLT_ISSUE_FLOWS");
        
        if (record.getLtype() != null) {
            SET("LTYPE = #{ltype,jdbcType=VARCHAR}");
        }
        
        if (record.getGsEcode() != null) {
            SET("GS_ECODE = #{gsEcode,jdbcType=VARCHAR}");
        }
        
        if (record.getGsChcode() != null) {
            SET("GS_CHCODE = #{gsChcode,jdbcType=VARCHAR}");
        }
        
        if (record.getGsDesc() != null) {
            SET("GS_DESC = #{gsDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTimesecOffset() != null) {
            SET("TIMESEC_OFFSET = #{timesecOffset,jdbcType=INTEGER}");
        }
        
        if (record.getGsOrder() != null) {
            SET("GS_ORDER = #{gsOrder,jdbcType=VARCHAR}");
        }
        
        if (record.getNextOrders() != null) {
            SET("NEXT_ORDERS = #{nextOrders,jdbcType=VARCHAR}");
        }
        
        if (record.getWaitOrders() != null) {
            SET("WAIT_ORDERS = #{waitOrders,jdbcType=VARCHAR}");
        }
        
        if (record.getNodeType() != null) {
            SET("NODE_TYPE = #{nodeType,jdbcType=VARCHAR}");
        }
        
        if (record.getAutoGonext() != null) {
            SET("AUTO_GONEXT = #{autoGonext,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{status,jdbcType=VARCHAR}");
        }
        
        WHERE("GEN_ID = #{genId,jdbcType=BIGINT}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    protected void applyWhere(TLTIssueFlowsExample example, boolean includeExamplePhrase) {
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