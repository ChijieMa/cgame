package onight.tfg.ordbgens.sys.mapper;

import java.util.List;
import onight.tfg.ordbgens.sys.entity.TSysAction;
import onight.tfg.ordbgens.sys.entity.TSysActionExample;
import onight.tfg.ordbgens.sys.entity.TSysActionKey;
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

public interface TSysActionMapper extends StaticTableDaoSupport<TSysAction, TSysActionExample, TSysActionKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    @SelectProvider(type=TSysActionSqlProvider.class, method="countByExample")
    int countByExample(TSysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    @DeleteProvider(type=TSysActionSqlProvider.class, method="deleteByExample")
    int deleteByExample(TSysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    @Delete({
        "delete from T_SYS_ACTION",
        "where ACTION_ID = #{actionId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(TSysActionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    @Insert({
        "insert into T_SYS_ACTION (ACTION_ID, ACTION_FLAG, ",
        "ACTION_NAME, ACTION_DESC, ",
        "ACTION_MENU, FIELD1)",
        "values (#{actionId,jdbcType=BIGINT}, #{actionFlag,jdbcType=VARCHAR}, ",
        "#{actionName,jdbcType=VARCHAR}, #{actionDesc,jdbcType=VARCHAR}, ",
        "#{actionMenu,jdbcType=BIGINT}, #{field1,jdbcType=VARCHAR})"
    })
    int insert(TSysAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    @InsertProvider(type=TSysActionSqlProvider.class, method="insertSelective")
    int insertSelective(TSysAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    @SelectProvider(type=TSysActionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ACTION_ID", property="actionId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ACTION_FLAG", property="actionFlag", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_NAME", property="actionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_DESC", property="actionDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_MENU", property="actionMenu", jdbcType=JdbcType.BIGINT),
        @Result(column="FIELD1", property="field1", jdbcType=JdbcType.VARCHAR)
    })
    List<TSysAction> selectByExample(TSysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    @Select({
        "select",
        "ACTION_ID, ACTION_FLAG, ACTION_NAME, ACTION_DESC, ACTION_MENU, FIELD1",
        "from T_SYS_ACTION",
        "where ACTION_ID = #{actionId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="ACTION_ID", property="actionId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ACTION_FLAG", property="actionFlag", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_NAME", property="actionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_DESC", property="actionDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_MENU", property="actionMenu", jdbcType=JdbcType.BIGINT),
        @Result(column="FIELD1", property="field1", jdbcType=JdbcType.VARCHAR)
    })
    TSysAction selectByPrimaryKey(TSysActionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    @UpdateProvider(type=TSysActionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TSysAction record, @Param("example") TSysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    @UpdateProvider(type=TSysActionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TSysAction record, @Param("example") TSysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    @UpdateProvider(type=TSysActionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TSysAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Thu Apr 07 10:12:35 CST 2016
     */
    @Update({
        "update T_SYS_ACTION",
        "set ACTION_FLAG = #{actionFlag,jdbcType=VARCHAR},",
          "ACTION_NAME = #{actionName,jdbcType=VARCHAR},",
          "ACTION_DESC = #{actionDesc,jdbcType=VARCHAR},",
          "ACTION_MENU = #{actionMenu,jdbcType=BIGINT},",
          "FIELD1 = #{field1,jdbcType=VARCHAR}",
        "where ACTION_ID = #{actionId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TSysAction record);
}