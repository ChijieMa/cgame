package onight.tfg.ordbgens.tlt.mapper;

import java.util.List;
import onight.tfg.ordbgens.tlt.entity.TLTCoreReward;
import onight.tfg.ordbgens.tlt.entity.TLTCoreRewardExample;
import onight.tfg.ordbgens.tlt.entity.TLTCoreRewardKey;
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

public interface TLTCoreRewardMapper extends StaticTableDaoSupport<TLTCoreReward, TLTCoreRewardExample, TLTCoreRewardKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_REWARD
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @SelectProvider(type=TLTCoreRewardSqlProvider.class, method="countByExample")
    int countByExample(TLTCoreRewardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_REWARD
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @DeleteProvider(type=TLTCoreRewardSqlProvider.class, method="deleteByExample")
    int deleteByExample(TLTCoreRewardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_REWARD
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @Delete({
        "delete from TLT_CORE_REWARD",
        "where UUID = #{uuid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(TLTCoreRewardKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_REWARD
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @Insert({
        "insert into TLT_CORE_REWARD (UUID, TICK_NO, ",
        "BET_NO, MERCHANTID, ",
        "USER_ID, ISSUE_NO, ",
        "LTYPE, PLAY_TYPE, ",
        "CREATE_DATE, MODIFY_DATE, ",
        "BET_AMOUNT, BET_COUNTS, ",
        "REWARD_AMOUNT, REWARD_RATIO, ",
        "FUND_REWARD_AMOUNT, FUND_REF_ID_REWARD, ",
        "FUND_REF_ID_CANCEL, FUND_REWARD_DATE, ",
        "FUND_REWARD_STATUS, FUND_CANCEL_DATE, ",
        "SERIAL_NUM, STATUS)",
        "values (#{uuid,jdbcType=VARCHAR}, #{tickNo,jdbcType=VARCHAR}, ",
        "#{betNo,jdbcType=VARCHAR}, #{merchantid,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=VARCHAR}, #{issueNo,jdbcType=DECIMAL}, ",
        "#{ltype,jdbcType=VARCHAR}, #{playType,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{modifyDate,jdbcType=TIMESTAMP}, ",
        "#{betAmount,jdbcType=DECIMAL}, #{betCounts,jdbcType=DECIMAL}, ",
        "#{rewardAmount,jdbcType=DECIMAL}, #{rewardRatio,jdbcType=DECIMAL}, ",
        "#{fundRewardAmount,jdbcType=DECIMAL}, #{fundRefIdReward,jdbcType=VARCHAR}, ",
        "#{fundRefIdCancel,jdbcType=VARCHAR}, #{fundRewardDate,jdbcType=TIMESTAMP}, ",
        "#{fundRewardStatus,jdbcType=VARCHAR}, #{fundCancelDate,jdbcType=TIMESTAMP}, ",
        "#{serialNum,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR})"
    })
    int insert(TLTCoreReward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_REWARD
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @InsertProvider(type=TLTCoreRewardSqlProvider.class, method="insertSelective")
    int insertSelective(TLTCoreReward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_REWARD
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @SelectProvider(type=TLTCoreRewardSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="UUID", property="uuid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="TICK_NO", property="tickNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="BET_NO", property="betNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="MERCHANTID", property="merchantid", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISSUE_NO", property="issueNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LTYPE", property="ltype", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLAY_TYPE", property="playType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="BET_AMOUNT", property="betAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="BET_COUNTS", property="betCounts", jdbcType=JdbcType.DECIMAL),
        @Result(column="REWARD_AMOUNT", property="rewardAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="REWARD_RATIO", property="rewardRatio", jdbcType=JdbcType.DECIMAL),
        @Result(column="FUND_REWARD_AMOUNT", property="fundRewardAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="FUND_REF_ID_REWARD", property="fundRefIdReward", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_REF_ID_CANCEL", property="fundRefIdCancel", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_REWARD_DATE", property="fundRewardDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FUND_REWARD_STATUS", property="fundRewardStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_CANCEL_DATE", property="fundCancelDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SERIAL_NUM", property="serialNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR)
    })
    List<TLTCoreReward> selectByExample(TLTCoreRewardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_REWARD
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @Select({
        "select",
        "UUID, TICK_NO, BET_NO, MERCHANTID, USER_ID, ISSUE_NO, LTYPE, PLAY_TYPE, CREATE_DATE, ",
        "MODIFY_DATE, BET_AMOUNT, BET_COUNTS, REWARD_AMOUNT, REWARD_RATIO, FUND_REWARD_AMOUNT, ",
        "FUND_REF_ID_REWARD, FUND_REF_ID_CANCEL, FUND_REWARD_DATE, FUND_REWARD_STATUS, ",
        "FUND_CANCEL_DATE, SERIAL_NUM, STATUS",
        "from TLT_CORE_REWARD",
        "where UUID = #{uuid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="UUID", property="uuid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="TICK_NO", property="tickNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="BET_NO", property="betNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="MERCHANTID", property="merchantid", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISSUE_NO", property="issueNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LTYPE", property="ltype", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLAY_TYPE", property="playType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="BET_AMOUNT", property="betAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="BET_COUNTS", property="betCounts", jdbcType=JdbcType.DECIMAL),
        @Result(column="REWARD_AMOUNT", property="rewardAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="REWARD_RATIO", property="rewardRatio", jdbcType=JdbcType.DECIMAL),
        @Result(column="FUND_REWARD_AMOUNT", property="fundRewardAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="FUND_REF_ID_REWARD", property="fundRefIdReward", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_REF_ID_CANCEL", property="fundRefIdCancel", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_REWARD_DATE", property="fundRewardDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FUND_REWARD_STATUS", property="fundRewardStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_CANCEL_DATE", property="fundCancelDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SERIAL_NUM", property="serialNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR)
    })
    TLTCoreReward selectByPrimaryKey(TLTCoreRewardKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_REWARD
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @UpdateProvider(type=TLTCoreRewardSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TLTCoreReward record, @Param("example") TLTCoreRewardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_REWARD
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @UpdateProvider(type=TLTCoreRewardSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TLTCoreReward record, @Param("example") TLTCoreRewardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_REWARD
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @UpdateProvider(type=TLTCoreRewardSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TLTCoreReward record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_REWARD
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @Update({
        "update TLT_CORE_REWARD",
        "set TICK_NO = #{tickNo,jdbcType=VARCHAR},",
          "BET_NO = #{betNo,jdbcType=VARCHAR},",
          "MERCHANTID = #{merchantid,jdbcType=VARCHAR},",
          "USER_ID = #{userId,jdbcType=VARCHAR},",
          "ISSUE_NO = #{issueNo,jdbcType=DECIMAL},",
          "LTYPE = #{ltype,jdbcType=VARCHAR},",
          "PLAY_TYPE = #{playType,jdbcType=VARCHAR},",
          "CREATE_DATE = #{createDate,jdbcType=TIMESTAMP},",
          "MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP},",
          "BET_AMOUNT = #{betAmount,jdbcType=DECIMAL},",
          "BET_COUNTS = #{betCounts,jdbcType=DECIMAL},",
          "REWARD_AMOUNT = #{rewardAmount,jdbcType=DECIMAL},",
          "REWARD_RATIO = #{rewardRatio,jdbcType=DECIMAL},",
          "FUND_REWARD_AMOUNT = #{fundRewardAmount,jdbcType=DECIMAL},",
          "FUND_REF_ID_REWARD = #{fundRefIdReward,jdbcType=VARCHAR},",
          "FUND_REF_ID_CANCEL = #{fundRefIdCancel,jdbcType=VARCHAR},",
          "FUND_REWARD_DATE = #{fundRewardDate,jdbcType=TIMESTAMP},",
          "FUND_REWARD_STATUS = #{fundRewardStatus,jdbcType=VARCHAR},",
          "FUND_CANCEL_DATE = #{fundCancelDate,jdbcType=TIMESTAMP},",
          "SERIAL_NUM = #{serialNum,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=VARCHAR}",
        "where UUID = #{uuid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TLTCoreReward record);
}