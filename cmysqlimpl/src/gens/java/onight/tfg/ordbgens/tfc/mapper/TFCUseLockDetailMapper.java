package onight.tfg.ordbgens.tfc.mapper;

import java.util.List;
import onight.tfg.ordbgens.tfc.entity.TFCUseLockDetail;
import onight.tfg.ordbgens.tfc.entity.TFCUseLockDetailExample;
import onight.tfg.ordbgens.tfc.entity.TFCUseLockDetailKey;
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

public interface TFCUseLockDetailMapper extends StaticTableDaoSupport<TFCUseLockDetail, TFCUseLockDetailExample, TFCUseLockDetailKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @SelectProvider(type=TFCUseLockDetailSqlProvider.class, method="countByExample")
    int countByExample(TFCUseLockDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @DeleteProvider(type=TFCUseLockDetailSqlProvider.class, method="deleteByExample")
    int deleteByExample(TFCUseLockDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @Delete({
        "delete from TFC_USE_LOCK_DETAIL",
        "where ROW_ID = #{rowId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(TFCUseLockDetailKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @Insert({
        "insert into TFC_USE_LOCK_DETAIL (ROW_ID, COIN_TYPE_ID, ",
        "REC_TIME, ACTIONTYPE, ",
        "LOCK_ID, USER_ID, ",
        "SERVER_IP, GAME_ID, ",
        "SERVER_NAME, LOCK_NUM, ",
        "CHANGE_NUM, REMAIN_NUM, ",
        "OTHER_LOCK_NUM)",
        "values (#{rowId,jdbcType=VARCHAR}, #{coinTypeId,jdbcType=VARCHAR}, ",
        "#{recTime,jdbcType=TIMESTAMP}, #{actiontype,jdbcType=INTEGER}, ",
        "#{lockId,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, ",
        "#{serverIp,jdbcType=VARCHAR}, #{gameId,jdbcType=VARCHAR}, ",
        "#{serverName,jdbcType=VARCHAR}, #{lockNum,jdbcType=BIGINT}, ",
        "#{changeNum,jdbcType=BIGINT}, #{remainNum,jdbcType=BIGINT}, ",
        "#{otherLockNum,jdbcType=BIGINT})"
    })
    int insert(TFCUseLockDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @InsertProvider(type=TFCUseLockDetailSqlProvider.class, method="insertSelective")
    int insertSelective(TFCUseLockDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @SelectProvider(type=TFCUseLockDetailSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ROW_ID", property="rowId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="COIN_TYPE_ID", property="coinTypeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="REC_TIME", property="recTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACTIONTYPE", property="actiontype", jdbcType=JdbcType.INTEGER),
        @Result(column="LOCK_ID", property="lockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SERVER_IP", property="serverIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="GAME_ID", property="gameId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SERVER_NAME", property="serverName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCK_NUM", property="lockNum", jdbcType=JdbcType.BIGINT),
        @Result(column="CHANGE_NUM", property="changeNum", jdbcType=JdbcType.BIGINT),
        @Result(column="REMAIN_NUM", property="remainNum", jdbcType=JdbcType.BIGINT),
        @Result(column="OTHER_LOCK_NUM", property="otherLockNum", jdbcType=JdbcType.BIGINT)
    })
    List<TFCUseLockDetail> selectByExample(TFCUseLockDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @Select({
        "select",
        "ROW_ID, COIN_TYPE_ID, REC_TIME, ACTIONTYPE, LOCK_ID, USER_ID, SERVER_IP, GAME_ID, ",
        "SERVER_NAME, LOCK_NUM, CHANGE_NUM, REMAIN_NUM, OTHER_LOCK_NUM",
        "from TFC_USE_LOCK_DETAIL",
        "where ROW_ID = #{rowId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ROW_ID", property="rowId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="COIN_TYPE_ID", property="coinTypeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="REC_TIME", property="recTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACTIONTYPE", property="actiontype", jdbcType=JdbcType.INTEGER),
        @Result(column="LOCK_ID", property="lockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SERVER_IP", property="serverIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="GAME_ID", property="gameId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SERVER_NAME", property="serverName", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCK_NUM", property="lockNum", jdbcType=JdbcType.BIGINT),
        @Result(column="CHANGE_NUM", property="changeNum", jdbcType=JdbcType.BIGINT),
        @Result(column="REMAIN_NUM", property="remainNum", jdbcType=JdbcType.BIGINT),
        @Result(column="OTHER_LOCK_NUM", property="otherLockNum", jdbcType=JdbcType.BIGINT)
    })
    TFCUseLockDetail selectByPrimaryKey(TFCUseLockDetailKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @UpdateProvider(type=TFCUseLockDetailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TFCUseLockDetail record, @Param("example") TFCUseLockDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @UpdateProvider(type=TFCUseLockDetailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TFCUseLockDetail record, @Param("example") TFCUseLockDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @UpdateProvider(type=TFCUseLockDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TFCUseLockDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @Update({
        "update TFC_USE_LOCK_DETAIL",
        "set COIN_TYPE_ID = #{coinTypeId,jdbcType=VARCHAR},",
          "REC_TIME = #{recTime,jdbcType=TIMESTAMP},",
          "ACTIONTYPE = #{actiontype,jdbcType=INTEGER},",
          "LOCK_ID = #{lockId,jdbcType=VARCHAR},",
          "USER_ID = #{userId,jdbcType=VARCHAR},",
          "SERVER_IP = #{serverIp,jdbcType=VARCHAR},",
          "GAME_ID = #{gameId,jdbcType=VARCHAR},",
          "SERVER_NAME = #{serverName,jdbcType=VARCHAR},",
          "LOCK_NUM = #{lockNum,jdbcType=BIGINT},",
          "CHANGE_NUM = #{changeNum,jdbcType=BIGINT},",
          "REMAIN_NUM = #{remainNum,jdbcType=BIGINT},",
          "OTHER_LOCK_NUM = #{otherLockNum,jdbcType=BIGINT}",
        "where ROW_ID = #{rowId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TFCUseLockDetail record);
}