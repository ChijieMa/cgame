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
import onight.tfg.ordbgens.sys.entity.TSysMenu;
import onight.tfg.ordbgens.sys.entity.TSysMenuExample.Criteria;
import onight.tfg.ordbgens.sys.entity.TSysMenuExample.Criterion;
import onight.tfg.ordbgens.sys.entity.TSysMenuExample;

public class TSysMenuSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
     */
    public String countByExample(TSysMenuExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("T_SYS_MENU");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
     */
    public String deleteByExample(TSysMenuExample example) {
        BEGIN();
        DELETE_FROM("T_SYS_MENU");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
     */
    public String insertSelective(TSysMenu record) {
        BEGIN();
        INSERT_INTO("T_SYS_MENU");
        
        if (record.getMenuId() != null) {
            VALUES("MENU_ID", "#{menuId,jdbcType=INTEGER}");
        }
        
        if (record.getMenuName() != null) {
            VALUES("MENU_NAME", "#{menuName,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuDesc() != null) {
            VALUES("MENU_DESC", "#{menuDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuSeq() != null) {
            VALUES("MENU_SEQ", "#{menuSeq,jdbcType=INTEGER}");
        }
        
        if (record.getMenuUrl() != null) {
            VALUES("MENU_URL", "#{menuUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getParentId() != null) {
            VALUES("PARENT_ID", "#{parentId,jdbcType=INTEGER}");
        }
        
        if (record.getLeafFlag() != null) {
            VALUES("LEAF_FLAG", "#{leafFlag,jdbcType=INTEGER}");
        }
        
        if (record.getLevel() != null) {
            VALUES("LEVEL", "#{level,jdbcType=INTEGER}");
        }
        
        if (record.getIcon() != null) {
            VALUES("ICON", "#{icon,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
     */
    public String selectByExample(TSysMenuExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("MENU_ID");
        } else {
            SELECT("MENU_ID");
        }
        SELECT("MENU_NAME");
        SELECT("MENU_DESC");
        SELECT("MENU_SEQ");
        SELECT("MENU_URL");
        SELECT("PARENT_ID");
        SELECT("LEAF_FLAG");
        SELECT("LEVEL");
        SELECT("ICON");
        FROM("T_SYS_MENU");
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
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TSysMenu record = (TSysMenu) parameter.get("record");
        TSysMenuExample example = (TSysMenuExample) parameter.get("example");
        
        BEGIN();
        UPDATE("T_SYS_MENU");
        
        if (record.getMenuId() != null) {
            SET("MENU_ID = #{record.menuId,jdbcType=INTEGER}");
        }
        
        if (record.getMenuName() != null) {
            SET("MENU_NAME = #{record.menuName,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuDesc() != null) {
            SET("MENU_DESC = #{record.menuDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuSeq() != null) {
            SET("MENU_SEQ = #{record.menuSeq,jdbcType=INTEGER}");
        }
        
        if (record.getMenuUrl() != null) {
            SET("MENU_URL = #{record.menuUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getParentId() != null) {
            SET("PARENT_ID = #{record.parentId,jdbcType=INTEGER}");
        }
        
        if (record.getLeafFlag() != null) {
            SET("LEAF_FLAG = #{record.leafFlag,jdbcType=INTEGER}");
        }
        
        if (record.getLevel() != null) {
            SET("LEVEL = #{record.level,jdbcType=INTEGER}");
        }
        
        if (record.getIcon() != null) {
            SET("ICON = #{record.icon,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("T_SYS_MENU");
        
        SET("MENU_ID = #{record.menuId,jdbcType=INTEGER}");
        SET("MENU_NAME = #{record.menuName,jdbcType=VARCHAR}");
        SET("MENU_DESC = #{record.menuDesc,jdbcType=VARCHAR}");
        SET("MENU_SEQ = #{record.menuSeq,jdbcType=INTEGER}");
        SET("MENU_URL = #{record.menuUrl,jdbcType=VARCHAR}");
        SET("PARENT_ID = #{record.parentId,jdbcType=INTEGER}");
        SET("LEAF_FLAG = #{record.leafFlag,jdbcType=INTEGER}");
        SET("LEVEL = #{record.level,jdbcType=INTEGER}");
        SET("ICON = #{record.icon,jdbcType=VARCHAR}");
        
        TSysMenuExample example = (TSysMenuExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
     */
    public String updateByPrimaryKeySelective(TSysMenu record) {
        BEGIN();
        UPDATE("T_SYS_MENU");
        
        if (record.getMenuName() != null) {
            SET("MENU_NAME = #{menuName,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuDesc() != null) {
            SET("MENU_DESC = #{menuDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getMenuSeq() != null) {
            SET("MENU_SEQ = #{menuSeq,jdbcType=INTEGER}");
        }
        
        if (record.getMenuUrl() != null) {
            SET("MENU_URL = #{menuUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getParentId() != null) {
            SET("PARENT_ID = #{parentId,jdbcType=INTEGER}");
        }
        
        if (record.getLeafFlag() != null) {
            SET("LEAF_FLAG = #{leafFlag,jdbcType=INTEGER}");
        }
        
        if (record.getLevel() != null) {
            SET("LEVEL = #{level,jdbcType=INTEGER}");
        }
        
        if (record.getIcon() != null) {
            SET("ICON = #{icon,jdbcType=VARCHAR}");
        }
        
        WHERE("MENU_ID = #{menuId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
     */
    protected void applyWhere(TSysMenuExample example, boolean includeExamplePhrase) {
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