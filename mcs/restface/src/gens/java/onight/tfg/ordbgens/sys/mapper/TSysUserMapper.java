package onight.tfg.ordbgens.sys.mapper;

import java.util.List;
import onight.tfg.ordbgens.sys.entity.TSysUser;
import onight.tfg.ordbgens.sys.entity.TSysUserExample;
import onight.tfg.ordbgens.sys.entity.TSysUserKey;
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

public interface TSysUserMapper extends StaticTableDaoSupport<TSysUser, TSysUserExample, TSysUserKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    @SelectProvider(type=TSysUserSqlProvider.class, method="countByExample")
    int countByExample(TSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    @DeleteProvider(type=TSysUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(TSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    @Delete({
        "delete from T_SYS_USER",
        "where USER_ID = #{userId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(TSysUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    @Insert({
        "insert into T_SYS_USER (USER_ID, BRANCH_ID, ",
        "LOGIN_NAME, USER_NAME, ",
        "MOBILE, USER_WORKADDRESS, ",
        "STATUS, PASSWORD, ",
        "UPDATE_TIME, CREATE_TIME, ",
        "CREATED_BY, MODIFIED_BY, ",
        "EMAIL, DATA_ENVIRON, ",
        "ICON)",
        "values (#{userId,jdbcType=VARCHAR}, #{branchId,jdbcType=VARCHAR}, ",
        "#{loginName,jdbcType=VARCHAR}, #{userName,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{userWorkaddress,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{createdBy,jdbcType=VARCHAR}, #{modifiedBy,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{dataEnviron,jdbcType=INTEGER}, ",
        "#{icon,jdbcType=VARCHAR})"
    })
    int insert(TSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    @InsertProvider(type=TSysUserSqlProvider.class, method="insertSelective")
    int insertSelective(TSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    @SelectProvider(type=TSysUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="BRANCH_ID", property="branchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGIN_NAME", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_NAME", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="MOBILE", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_WORKADDRESS", property="userWorkaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="PASSWORD", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODIFIED_BY", property="modifiedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_ENVIRON", property="dataEnviron", jdbcType=JdbcType.INTEGER),
        @Result(column="ICON", property="icon", jdbcType=JdbcType.VARCHAR)
    })
    List<TSysUser> selectByExample(TSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    @Select({
        "select",
        "USER_ID, BRANCH_ID, LOGIN_NAME, USER_NAME, MOBILE, USER_WORKADDRESS, STATUS, ",
        "PASSWORD, UPDATE_TIME, CREATE_TIME, CREATED_BY, MODIFIED_BY, EMAIL, DATA_ENVIRON, ",
        "ICON",
        "from T_SYS_USER",
        "where USER_ID = #{userId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="BRANCH_ID", property="branchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGIN_NAME", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_NAME", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="MOBILE", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_WORKADDRESS", property="userWorkaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="PASSWORD", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODIFIED_BY", property="modifiedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_ENVIRON", property="dataEnviron", jdbcType=JdbcType.INTEGER),
        @Result(column="ICON", property="icon", jdbcType=JdbcType.VARCHAR)
    })
    TSysUser selectByPrimaryKey(TSysUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    @UpdateProvider(type=TSysUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TSysUser record, @Param("example") TSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    @UpdateProvider(type=TSysUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TSysUser record, @Param("example") TSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    @UpdateProvider(type=TSysUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    @Update({
        "update T_SYS_USER",
        "set BRANCH_ID = #{branchId,jdbcType=VARCHAR},",
          "LOGIN_NAME = #{loginName,jdbcType=VARCHAR},",
          "USER_NAME = #{userName,jdbcType=VARCHAR},",
          "MOBILE = #{mobile,jdbcType=VARCHAR},",
          "USER_WORKADDRESS = #{userWorkaddress,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=VARCHAR},",
          "PASSWORD = #{password,jdbcType=VARCHAR},",
          "UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP},",
          "CREATE_TIME = #{createTime,jdbcType=TIMESTAMP},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "MODIFIED_BY = #{modifiedBy,jdbcType=VARCHAR},",
          "EMAIL = #{email,jdbcType=VARCHAR},",
          "DATA_ENVIRON = #{dataEnviron,jdbcType=INTEGER},",
          "ICON = #{icon,jdbcType=VARCHAR}",
        "where USER_ID = #{userId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TSysUser record);
}