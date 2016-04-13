package onight.tfg.ordbgens.tfg.mapper;

import java.util.List;
import onight.tfg.ordbgens.tfg.entity.TFGUserRole;
import onight.tfg.ordbgens.tfg.entity.TFGUserRoleExample;
import onight.tfg.ordbgens.tfg.entity.TFGUserRoleKey;
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

public interface TFGUserRoleMapper extends StaticTableDaoSupport<TFGUserRole, TFGUserRoleExample, TFGUserRoleKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    @SelectProvider(type=TFGUserRoleSqlProvider.class, method="countByExample")
    int countByExample(TFGUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    @DeleteProvider(type=TFGUserRoleSqlProvider.class, method="deleteByExample")
    int deleteByExample(TFGUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    @Delete({
        "delete from TFG_USER_ROLE",
        "where USER_ROLE_ID = #{userRoleId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(TFGUserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    @Insert({
        "insert into TFG_USER_ROLE (USER_ROLE_ID, USER_ID, ",
        "ROLE_ID, STATUS)",
        "values (#{userRoleId,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, ",
        "#{roleId,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR})"
    })
    int insert(TFGUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    @InsertProvider(type=TFGUserRoleSqlProvider.class, method="insertSelective")
    int insertSelective(TFGUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    @SelectProvider(type=TFGUserRoleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="USER_ROLE_ID", property="userRoleId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROLE_ID", property="roleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR)
    })
    List<TFGUserRole> selectByExample(TFGUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    @Select({
        "select",
        "USER_ROLE_ID, USER_ID, ROLE_ID, STATUS",
        "from TFG_USER_ROLE",
        "where USER_ROLE_ID = #{userRoleId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="USER_ROLE_ID", property="userRoleId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROLE_ID", property="roleId", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR)
    })
    TFGUserRole selectByPrimaryKey(TFGUserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    @UpdateProvider(type=TFGUserRoleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TFGUserRole record, @Param("example") TFGUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    @UpdateProvider(type=TFGUserRoleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TFGUserRole record, @Param("example") TFGUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    @UpdateProvider(type=TFGUserRoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TFGUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Thu Apr 14 00:04:42 CST 2016
     */
    @Update({
        "update TFG_USER_ROLE",
        "set USER_ID = #{userId,jdbcType=VARCHAR},",
          "ROLE_ID = #{roleId,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=VARCHAR}",
        "where USER_ROLE_ID = #{userRoleId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TFGUserRole record);
}