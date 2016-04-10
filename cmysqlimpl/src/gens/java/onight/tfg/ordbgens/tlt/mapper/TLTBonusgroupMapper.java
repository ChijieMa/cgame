package onight.tfg.ordbgens.tlt.mapper;

import java.util.List;
import onight.tfg.ordbgens.tlt.entity.TLTBonusgroup;
import onight.tfg.ordbgens.tlt.entity.TLTBonusgroupExample;
import onight.tfg.ordbgens.tlt.entity.TLTBonusgroupKey;
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

public interface TLTBonusgroupMapper extends StaticTableDaoSupport<TLTBonusgroup, TLTBonusgroupExample, TLTBonusgroupKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @SelectProvider(type=TLTBonusgroupSqlProvider.class, method="countByExample")
    int countByExample(TLTBonusgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @DeleteProvider(type=TLTBonusgroupSqlProvider.class, method="deleteByExample")
    int deleteByExample(TLTBonusgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @Delete({
        "delete from TLT_BONUSGROUP",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(TLTBonusgroupKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @Insert({
        "insert into TLT_BONUSGROUP (ID, LTYPE, ",
        "PLAY_TYPE, CN_NAME, ",
        "EN_NAME, STATUS, ",
        "CREATE_TIME, UPDATE_TIME, ",
        "USER_ID)",
        "values (#{id,jdbcType=BIGINT}, #{ltype,jdbcType=VARCHAR}, ",
        "#{playType,jdbcType=VARCHAR}, #{cnName,jdbcType=VARCHAR}, ",
        "#{enName,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{userId,jdbcType=BIGINT})"
    })
    int insert(TLTBonusgroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @InsertProvider(type=TLTBonusgroupSqlProvider.class, method="insertSelective")
    int insertSelective(TLTBonusgroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @SelectProvider(type=TLTBonusgroupSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="LTYPE", property="ltype", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLAY_TYPE", property="playType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CN_NAME", property="cnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="EN_NAME", property="enName", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.BIGINT)
    })
    List<TLTBonusgroup> selectByExample(TLTBonusgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @Select({
        "select",
        "ID, LTYPE, PLAY_TYPE, CN_NAME, EN_NAME, STATUS, CREATE_TIME, UPDATE_TIME, USER_ID",
        "from TLT_BONUSGROUP",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="LTYPE", property="ltype", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLAY_TYPE", property="playType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CN_NAME", property="cnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="EN_NAME", property="enName", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.BIGINT)
    })
    TLTBonusgroup selectByPrimaryKey(TLTBonusgroupKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @UpdateProvider(type=TLTBonusgroupSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TLTBonusgroup record, @Param("example") TLTBonusgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @UpdateProvider(type=TLTBonusgroupSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TLTBonusgroup record, @Param("example") TLTBonusgroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @UpdateProvider(type=TLTBonusgroupSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TLTBonusgroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @Update({
        "update TLT_BONUSGROUP",
        "set LTYPE = #{ltype,jdbcType=VARCHAR},",
          "PLAY_TYPE = #{playType,jdbcType=VARCHAR},",
          "CN_NAME = #{cnName,jdbcType=VARCHAR},",
          "EN_NAME = #{enName,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=INTEGER},",
          "CREATE_TIME = #{createTime,jdbcType=TIMESTAMP},",
          "UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP},",
          "USER_ID = #{userId,jdbcType=BIGINT}",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TLTBonusgroup record);
}