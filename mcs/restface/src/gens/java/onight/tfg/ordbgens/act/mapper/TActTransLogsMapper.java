package onight.tfg.ordbgens.act.mapper;

import java.util.List;
import onight.tfg.ordbgens.act.entity.TActTransLogs;
import onight.tfg.ordbgens.act.entity.TActTransLogsExample;
import onight.tfg.ordbgens.act.entity.TActTransLogsKey;
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

public interface TActTransLogsMapper extends StaticTableDaoSupport<TActTransLogs, TActTransLogsExample, TActTransLogsKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @SelectProvider(type=TActTransLogsSqlProvider.class, method="countByExample")
    int countByExample(TActTransLogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @DeleteProvider(type=TActTransLogsSqlProvider.class, method="deleteByExample")
    int deleteByExample(TActTransLogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @Delete({
        "delete from T_ACT_TRANS_LOGS",
        "where LOG_UUID = #{logUuid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(TActTransLogsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @Insert({
        "insert into T_ACT_TRANS_LOGS (LOG_UUID, SETT_DATE, ",
        "CONS_DATE, TX_SNO, ",
        "TRANS_CODE, SUB_TRANS_CODE, ",
        "BIZ_TYPE, BIZ_DTL_TYPE, ",
        "FROM_FUND_NO, TO_FUND_NO, ",
        "DC_TYPE, AMT, CNT, ",
        "FLAG_CANCEL, RELATED_TRANS_ID, ",
        "STATUS, ACT_BAL_AFTER, ",
        "ACT_BAL_BEFORE, EXT_ID1, ",
        "EXT_ID2, EXT_COMMETS, ",
        "CREATE_TIME, UPDATE_TIME)",
        "values (#{logUuid,jdbcType=VARCHAR}, #{settDate,jdbcType=VARCHAR}, ",
        "#{consDate,jdbcType=VARCHAR}, #{txSno,jdbcType=VARCHAR}, ",
        "#{transCode,jdbcType=VARCHAR}, #{subTransCode,jdbcType=VARCHAR}, ",
        "#{bizType,jdbcType=VARCHAR}, #{bizDtlType,jdbcType=VARCHAR}, ",
        "#{fromFundNo,jdbcType=VARCHAR}, #{toFundNo,jdbcType=VARCHAR}, ",
        "#{dcType,jdbcType=VARCHAR}, #{amt,jdbcType=DECIMAL}, #{cnt,jdbcType=INTEGER}, ",
        "#{flagCancel,jdbcType=CHAR}, #{relatedTransId,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=VARCHAR}, #{actBalAfter,jdbcType=DECIMAL}, ",
        "#{actBalBefore,jdbcType=DECIMAL}, #{extId1,jdbcType=VARCHAR}, ",
        "#{extId2,jdbcType=VARCHAR}, #{extCommets,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(TActTransLogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @InsertProvider(type=TActTransLogsSqlProvider.class, method="insertSelective")
    int insertSelective(TActTransLogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @SelectProvider(type=TActTransLogsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="LOG_UUID", property="logUuid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="SETT_DATE", property="settDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONS_DATE", property="consDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="TX_SNO", property="txSno", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRANS_CODE", property="transCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUB_TRANS_CODE", property="subTransCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="BIZ_TYPE", property="bizType", jdbcType=JdbcType.VARCHAR),
        @Result(column="BIZ_DTL_TYPE", property="bizDtlType", jdbcType=JdbcType.VARCHAR),
        @Result(column="FROM_FUND_NO", property="fromFundNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="TO_FUND_NO", property="toFundNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DC_TYPE", property="dcType", jdbcType=JdbcType.VARCHAR),
        @Result(column="AMT", property="amt", jdbcType=JdbcType.DECIMAL),
        @Result(column="CNT", property="cnt", jdbcType=JdbcType.INTEGER),
        @Result(column="FLAG_CANCEL", property="flagCancel", jdbcType=JdbcType.CHAR),
        @Result(column="RELATED_TRANS_ID", property="relatedTransId", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACT_BAL_AFTER", property="actBalAfter", jdbcType=JdbcType.DECIMAL),
        @Result(column="ACT_BAL_BEFORE", property="actBalBefore", jdbcType=JdbcType.DECIMAL),
        @Result(column="EXT_ID1", property="extId1", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXT_ID2", property="extId2", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXT_COMMETS", property="extCommets", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TActTransLogs> selectByExample(TActTransLogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @Select({
        "select",
        "LOG_UUID, SETT_DATE, CONS_DATE, TX_SNO, TRANS_CODE, SUB_TRANS_CODE, BIZ_TYPE, ",
        "BIZ_DTL_TYPE, FROM_FUND_NO, TO_FUND_NO, DC_TYPE, AMT, CNT, FLAG_CANCEL, RELATED_TRANS_ID, ",
        "STATUS, ACT_BAL_AFTER, ACT_BAL_BEFORE, EXT_ID1, EXT_ID2, EXT_COMMETS, CREATE_TIME, ",
        "UPDATE_TIME",
        "from T_ACT_TRANS_LOGS",
        "where LOG_UUID = #{logUuid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="LOG_UUID", property="logUuid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="SETT_DATE", property="settDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONS_DATE", property="consDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="TX_SNO", property="txSno", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRANS_CODE", property="transCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUB_TRANS_CODE", property="subTransCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="BIZ_TYPE", property="bizType", jdbcType=JdbcType.VARCHAR),
        @Result(column="BIZ_DTL_TYPE", property="bizDtlType", jdbcType=JdbcType.VARCHAR),
        @Result(column="FROM_FUND_NO", property="fromFundNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="TO_FUND_NO", property="toFundNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DC_TYPE", property="dcType", jdbcType=JdbcType.VARCHAR),
        @Result(column="AMT", property="amt", jdbcType=JdbcType.DECIMAL),
        @Result(column="CNT", property="cnt", jdbcType=JdbcType.INTEGER),
        @Result(column="FLAG_CANCEL", property="flagCancel", jdbcType=JdbcType.CHAR),
        @Result(column="RELATED_TRANS_ID", property="relatedTransId", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACT_BAL_AFTER", property="actBalAfter", jdbcType=JdbcType.DECIMAL),
        @Result(column="ACT_BAL_BEFORE", property="actBalBefore", jdbcType=JdbcType.DECIMAL),
        @Result(column="EXT_ID1", property="extId1", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXT_ID2", property="extId2", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXT_COMMETS", property="extCommets", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    TActTransLogs selectByPrimaryKey(TActTransLogsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @UpdateProvider(type=TActTransLogsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TActTransLogs record, @Param("example") TActTransLogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @UpdateProvider(type=TActTransLogsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TActTransLogs record, @Param("example") TActTransLogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @UpdateProvider(type=TActTransLogsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TActTransLogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_TRANS_LOGS
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @Update({
        "update T_ACT_TRANS_LOGS",
        "set SETT_DATE = #{settDate,jdbcType=VARCHAR},",
          "CONS_DATE = #{consDate,jdbcType=VARCHAR},",
          "TX_SNO = #{txSno,jdbcType=VARCHAR},",
          "TRANS_CODE = #{transCode,jdbcType=VARCHAR},",
          "SUB_TRANS_CODE = #{subTransCode,jdbcType=VARCHAR},",
          "BIZ_TYPE = #{bizType,jdbcType=VARCHAR},",
          "BIZ_DTL_TYPE = #{bizDtlType,jdbcType=VARCHAR},",
          "FROM_FUND_NO = #{fromFundNo,jdbcType=VARCHAR},",
          "TO_FUND_NO = #{toFundNo,jdbcType=VARCHAR},",
          "DC_TYPE = #{dcType,jdbcType=VARCHAR},",
          "AMT = #{amt,jdbcType=DECIMAL},",
          "CNT = #{cnt,jdbcType=INTEGER},",
          "FLAG_CANCEL = #{flagCancel,jdbcType=CHAR},",
          "RELATED_TRANS_ID = #{relatedTransId,jdbcType=VARCHAR},",
          "STATUS = #{status,jdbcType=VARCHAR},",
          "ACT_BAL_AFTER = #{actBalAfter,jdbcType=DECIMAL},",
          "ACT_BAL_BEFORE = #{actBalBefore,jdbcType=DECIMAL},",
          "EXT_ID1 = #{extId1,jdbcType=VARCHAR},",
          "EXT_ID2 = #{extId2,jdbcType=VARCHAR},",
          "EXT_COMMETS = #{extCommets,jdbcType=VARCHAR},",
          "CREATE_TIME = #{createTime,jdbcType=TIMESTAMP},",
          "UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP}",
        "where LOG_UUID = #{logUuid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TActTransLogs record);
}