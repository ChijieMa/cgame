package onight.tfg.ordbgens.tlt.mapper;

import java.util.List;
import onight.tfg.ordbgens.tlt.entity.TLTCoreWin;
import onight.tfg.ordbgens.tlt.entity.TLTCoreWinExample;
import onight.tfg.ordbgens.tlt.entity.TLTCoreWinKey;
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

public interface TLTCoreWinMapper extends StaticTableDaoSupport<TLTCoreWin, TLTCoreWinExample, TLTCoreWinKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Fri Apr 15 21:03:12 CST 2016
     */
    @SelectProvider(type=TLTCoreWinSqlProvider.class, method="countByExample")
    int countByExample(TLTCoreWinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Fri Apr 15 21:03:12 CST 2016
     */
    @DeleteProvider(type=TLTCoreWinSqlProvider.class, method="deleteByExample")
    int deleteByExample(TLTCoreWinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Fri Apr 15 21:03:12 CST 2016
     */
    @Delete({
        "delete from TLT_CORE_WIN",
        "where WIN_NO = #{winNo,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(TLTCoreWinKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Fri Apr 15 21:03:12 CST 2016
     */
    @Insert({
        "insert into TLT_CORE_WIN (WIN_NO, TICK_NO, ",
        "BET_NO, MERCHANTID, ",
        "USER_ID, ISSUE_NO, ",
        "LTYPE, PLAY_TYPE, ",
        "WIN_TYPE, WIN_LEVEL, ",
        "WIN_PATTERN, WIN_NUM, ",
        "LEVEL_BONUS_AMOUNT, AWARD_MONEY, ",
        "BONUS_MONEY, STATUS, ",
        "SUM_DIVISION_TYPE, CREATE_DATE, ",
        "MODIFY_DATE, FUND_RETURN_AMOUNT, ",
        "FUND_REF_ID_RETURN, FUND_REF_ID_CANCEL, ",
        "FUND_RETURN_DATE, FUND_RETURN_STATUS, ",
        "FUND_CANCEL_DATE, SERIAL_NUM)",
        "values (#{winNo,jdbcType=VARCHAR}, #{tickNo,jdbcType=VARCHAR}, ",
        "#{betNo,jdbcType=VARCHAR}, #{merchantid,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=VARCHAR}, #{issueNo,jdbcType=DECIMAL}, ",
        "#{ltype,jdbcType=VARCHAR}, #{playType,jdbcType=VARCHAR}, ",
        "#{winType,jdbcType=VARCHAR}, #{winLevel,jdbcType=VARCHAR}, ",
        "#{winPattern,jdbcType=VARCHAR}, #{winNum,jdbcType=DECIMAL}, ",
        "#{levelBonusAmount,jdbcType=DECIMAL}, #{awardMoney,jdbcType=DECIMAL}, ",
        "#{bonusMoney,jdbcType=DECIMAL}, #{status,jdbcType=VARCHAR}, ",
        "#{sumDivisionType,jdbcType=INTEGER}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{modifyDate,jdbcType=TIMESTAMP}, #{fundReturnAmount,jdbcType=DECIMAL}, ",
        "#{fundRefIdReturn,jdbcType=VARCHAR}, #{fundRefIdCancel,jdbcType=VARCHAR}, ",
        "#{fundReturnDate,jdbcType=TIMESTAMP}, #{fundReturnStatus,jdbcType=VARCHAR}, ",
        "#{fundCancelDate,jdbcType=TIMESTAMP}, #{serialNum,jdbcType=VARCHAR})"
    })
    int insert(TLTCoreWin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Fri Apr 15 21:03:12 CST 2016
     */
    @InsertProvider(type=TLTCoreWinSqlProvider.class, method="insertSelective")
    int insertSelective(TLTCoreWin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Fri Apr 15 21:03:12 CST 2016
     */
    @SelectProvider(type=TLTCoreWinSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="WIN_NO", property="winNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="TICK_NO", property="tickNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="BET_NO", property="betNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="MERCHANTID", property="merchantid", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISSUE_NO", property="issueNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LTYPE", property="ltype", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLAY_TYPE", property="playType", jdbcType=JdbcType.VARCHAR),
        @Result(column="WIN_TYPE", property="winType", jdbcType=JdbcType.VARCHAR),
        @Result(column="WIN_LEVEL", property="winLevel", jdbcType=JdbcType.VARCHAR),
        @Result(column="WIN_PATTERN", property="winPattern", jdbcType=JdbcType.VARCHAR),
        @Result(column="WIN_NUM", property="winNum", jdbcType=JdbcType.DECIMAL),
        @Result(column="LEVEL_BONUS_AMOUNT", property="levelBonusAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="AWARD_MONEY", property="awardMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="BONUS_MONEY", property="bonusMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUM_DIVISION_TYPE", property="sumDivisionType", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FUND_RETURN_AMOUNT", property="fundReturnAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="FUND_REF_ID_RETURN", property="fundRefIdReturn", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_REF_ID_CANCEL", property="fundRefIdCancel", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_RETURN_DATE", property="fundReturnDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FUND_RETURN_STATUS", property="fundReturnStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_CANCEL_DATE", property="fundCancelDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SERIAL_NUM", property="serialNum", jdbcType=JdbcType.VARCHAR)
    })
    List<TLTCoreWin> selectByExample(TLTCoreWinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Fri Apr 15 21:03:12 CST 2016
     */
    @Select({
        "select",
        "WIN_NO, TICK_NO, BET_NO, MERCHANTID, USER_ID, ISSUE_NO, LTYPE, PLAY_TYPE, WIN_TYPE, ",
        "WIN_LEVEL, WIN_PATTERN, WIN_NUM, LEVEL_BONUS_AMOUNT, AWARD_MONEY, BONUS_MONEY, ",
        "STATUS, SUM_DIVISION_TYPE, CREATE_DATE, MODIFY_DATE, FUND_RETURN_AMOUNT, FUND_REF_ID_RETURN, ",
        "FUND_REF_ID_CANCEL, FUND_RETURN_DATE, FUND_RETURN_STATUS, FUND_CANCEL_DATE, ",
        "SERIAL_NUM",
        "from TLT_CORE_WIN",
        "where WIN_NO = #{winNo,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="WIN_NO", property="winNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="TICK_NO", property="tickNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="BET_NO", property="betNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="MERCHANTID", property="merchantid", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISSUE_NO", property="issueNo", jdbcType=JdbcType.DECIMAL),
        @Result(column="LTYPE", property="ltype", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLAY_TYPE", property="playType", jdbcType=JdbcType.VARCHAR),
        @Result(column="WIN_TYPE", property="winType", jdbcType=JdbcType.VARCHAR),
        @Result(column="WIN_LEVEL", property="winLevel", jdbcType=JdbcType.VARCHAR),
        @Result(column="WIN_PATTERN", property="winPattern", jdbcType=JdbcType.VARCHAR),
        @Result(column="WIN_NUM", property="winNum", jdbcType=JdbcType.DECIMAL),
        @Result(column="LEVEL_BONUS_AMOUNT", property="levelBonusAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="AWARD_MONEY", property="awardMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="BONUS_MONEY", property="bonusMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUM_DIVISION_TYPE", property="sumDivisionType", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_DATE", property="modifyDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FUND_RETURN_AMOUNT", property="fundReturnAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="FUND_REF_ID_RETURN", property="fundRefIdReturn", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_REF_ID_CANCEL", property="fundRefIdCancel", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_RETURN_DATE", property="fundReturnDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FUND_RETURN_STATUS", property="fundReturnStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_CANCEL_DATE", property="fundCancelDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SERIAL_NUM", property="serialNum", jdbcType=JdbcType.VARCHAR)
    })
    TLTCoreWin selectByPrimaryKey(TLTCoreWinKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Fri Apr 15 21:03:12 CST 2016
     */
    @UpdateProvider(type=TLTCoreWinSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TLTCoreWin record, @Param("example") TLTCoreWinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Fri Apr 15 21:03:12 CST 2016
     */
    @UpdateProvider(type=TLTCoreWinSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TLTCoreWin record, @Param("example") TLTCoreWinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Fri Apr 15 21:03:12 CST 2016
     */
    @UpdateProvider(type=TLTCoreWinSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TLTCoreWin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_WIN
     *
     * @mbggenerated Fri Apr 15 21:03:12 CST 2016
     */
    @Update({
        "update TLT_CORE_WIN",
        "set TICK_NO = #{tickNo,jdbcType=VARCHAR},",
          "BET_NO = #{betNo,jdbcType=VARCHAR},",
          "MERCHANTID = #{merchantid,jdbcType=VARCHAR},",
          "USER_ID = #{userId,jdbcType=VARCHAR},",
          "ISSUE_NO = #{issueNo,jdbcType=DECIMAL},",
          "LTYPE = #{ltype,jdbcType=VARCHAR},",
          "PLAY_TYPE = #{playType,jdbcType=VARCHAR},",
          "WIN_TYPE = #{winType,jdbcType=VARCHAR},",
          "WIN_LEVEL = #{winLevel,jdbcType=VARCHAR},",
          "WIN_PATTERN = #{winPattern,jdbcType=VARCHAR},",
          "WIN_NUM = #{winNum,jdbcType=DECIMAL},",
          "LEVEL_BONUS_AMOUNT = #{levelBonusAmount,jdbcType=DECIMAL},",
          "AWARD_MONEY = #{awardMoney,jdbcType=DECIMAL},",
          "BONUS_MONEY = #{bonusMoney,jdbcType=DECIMAL},",
          "STATUS = #{status,jdbcType=VARCHAR},",
          "SUM_DIVISION_TYPE = #{sumDivisionType,jdbcType=INTEGER},",
          "CREATE_DATE = #{createDate,jdbcType=TIMESTAMP},",
          "MODIFY_DATE = #{modifyDate,jdbcType=TIMESTAMP},",
          "FUND_RETURN_AMOUNT = #{fundReturnAmount,jdbcType=DECIMAL},",
          "FUND_REF_ID_RETURN = #{fundRefIdReturn,jdbcType=VARCHAR},",
          "FUND_REF_ID_CANCEL = #{fundRefIdCancel,jdbcType=VARCHAR},",
          "FUND_RETURN_DATE = #{fundReturnDate,jdbcType=TIMESTAMP},",
          "FUND_RETURN_STATUS = #{fundReturnStatus,jdbcType=VARCHAR},",
          "FUND_CANCEL_DATE = #{fundCancelDate,jdbcType=TIMESTAMP},",
          "SERIAL_NUM = #{serialNum,jdbcType=VARCHAR}",
        "where WIN_NO = #{winNo,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TLTCoreWin record);
}