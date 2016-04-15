package onight.tfg.ordbgens.sys.mapper;

import java.util.List;
import onight.tfg.ordbgens.sys.entity.TSysMenu;
import onight.tfg.ordbgens.sys.entity.TSysMenuExample;
import onight.tfg.ordbgens.sys.entity.TSysMenuKey;
import onight.tfw.ojpa.ordb.StaticTableDaoSupport;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TSysMenuMapper extends StaticTableDaoSupport<TSysMenu, TSysMenuExample, TSysMenuKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @SelectProvider(type=TSysMenuSqlProvider.class, method="countByExample")
    int countByExample(TSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @DeleteProvider(type=TSysMenuSqlProvider.class, method="deleteByExample")
    int deleteByExample(TSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Delete({
        "delete from T_SYS_MENU",
        "where MENU_ID = #{menuId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(TSysMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Insert({
        "insert into T_SYS_MENU (MENU_ID, MENU_NAME, ",
        "MENU_DESC, MENU_SEQ, ",
        "MENU_URL, PARENT_ID, ",
        "LEAF_FLAG, LEVEL, ",
        "ICON)",
        "values (#{menuId,jdbcType=INTEGER}, #{menuName,jdbcType=VARCHAR}, ",
        "#{menuDesc,jdbcType=VARCHAR}, #{menuSeq,jdbcType=INTEGER}, ",
        "#{menuUrl,jdbcType=VARCHAR}, #{parentId,jdbcType=INTEGER}, ",
        "#{leafFlag,jdbcType=INTEGER}, #{level,jdbcType=INTEGER}, ",
        "#{icon,jdbcType=VARCHAR})"
    })
    int insert(TSysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @InsertProvider(type=TSysMenuSqlProvider.class, method="insertSelective")
    int insertSelective(TSysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @SelectProvider(type=TSysMenuSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="MENU_ID", property="menuId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MENU_NAME", property="menuName", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_DESC", property="menuDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_SEQ", property="menuSeq", jdbcType=JdbcType.INTEGER),
        @Result(column="MENU_URL", property="menuUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARENT_ID", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="LEAF_FLAG", property="leafFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="LEVEL", property="level", jdbcType=JdbcType.INTEGER),
        @Result(column="ICON", property="icon", jdbcType=JdbcType.VARCHAR)
    })
    List<TSysMenu> selectByExample(TSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Select({
        "select",
        "MENU_ID, MENU_NAME, MENU_DESC, MENU_SEQ, MENU_URL, PARENT_ID, LEAF_FLAG, LEVEL, ",
        "ICON",
        "from T_SYS_MENU",
        "where MENU_ID = #{menuId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="MENU_ID", property="menuId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MENU_NAME", property="menuName", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_DESC", property="menuDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_SEQ", property="menuSeq", jdbcType=JdbcType.INTEGER),
        @Result(column="MENU_URL", property="menuUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARENT_ID", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="LEAF_FLAG", property="leafFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="LEVEL", property="level", jdbcType=JdbcType.INTEGER),
        @Result(column="ICON", property="icon", jdbcType=JdbcType.VARCHAR)
    })
    TSysMenu selectByPrimaryKey(TSysMenuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @UpdateProvider(type=TSysMenuSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TSysMenu record, @Param("example") TSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @UpdateProvider(type=TSysMenuSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TSysMenu record, @Param("example") TSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @UpdateProvider(type=TSysMenuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TSysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_MENU
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Update({
        "update T_SYS_MENU",
        "set MENU_NAME = #{menuName,jdbcType=VARCHAR},",
          "MENU_DESC = #{menuDesc,jdbcType=VARCHAR},",
          "MENU_SEQ = #{menuSeq,jdbcType=INTEGER},",
          "MENU_URL = #{menuUrl,jdbcType=VARCHAR},",
          "PARENT_ID = #{parentId,jdbcType=INTEGER},",
          "LEAF_FLAG = #{leafFlag,jdbcType=INTEGER},",
          "LEVEL = #{level,jdbcType=INTEGER},",
          "ICON = #{icon,jdbcType=VARCHAR}",
        "where MENU_ID = #{menuId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TSysMenu record);
}