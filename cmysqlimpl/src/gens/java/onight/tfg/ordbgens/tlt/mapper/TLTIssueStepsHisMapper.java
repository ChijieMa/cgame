package onight.tfg.ordbgens.tlt.mapper;

import java.util.List;
import onight.tfg.ordbgens.tlt.entity.TLTIssueStepsHis;
import onight.tfg.ordbgens.tlt.entity.TLTIssueStepsHisExample;
import onight.tfg.ordbgens.tlt.entity.TLTIssueStepsHisKey;
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

public interface TLTIssueStepsHisMapper extends StaticTableDaoSupport<TLTIssueStepsHis, TLTIssueStepsHisExample, TLTIssueStepsHisKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS_HIS
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @SelectProvider(type=TLTIssueStepsHisSqlProvider.class, method="countByExample")
    int countByExample(TLTIssueStepsHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS_HIS
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @DeleteProvider(type=TLTIssueStepsHisSqlProvider.class, method="deleteByExample")
    int deleteByExample(TLTIssueStepsHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS_HIS
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @Delete({
        "delete from TLT_ISSUE_STEPS_HIS",
        "where ISSUE_STEP_ID = #{issueStepId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(TLTIssueStepsHisKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS_HIS
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @Insert({
        "insert into TLT_ISSUE_STEPS_HIS (ISSUE_STEP_ID, LTYPE, ",
        "ISSUE_NO, STEP_STATUS, ",
        "CREATE_TIME, MODIFY_TIME, ",
        "OPERATOR_ID, GS_ECODE, ",
        "GS_NAME, TIMESEC_OFFSET, ",
        "GS_ORDER, NEXT_ORDERS, ",
        "REF_PARAM_GEN_ID, AUTO_GONEXT, ",
        "BACKUP_TIME)",
        "values (#{issueStepId,jdbcType=VARCHAR}, #{ltype,jdbcType=VARCHAR}, ",
        "#{issueNo,jdbcType=VARCHAR}, #{stepStatus,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{operatorId,jdbcType=VARCHAR}, #{gsEcode,jdbcType=VARCHAR}, ",
        "#{gsName,jdbcType=VARCHAR}, #{timesecOffset,jdbcType=INTEGER}, ",
        "#{gsOrder,jdbcType=VARCHAR}, #{nextOrders,jdbcType=VARCHAR}, ",
        "#{refParamGenId,jdbcType=BIGINT}, #{autoGonext,jdbcType=VARCHAR}, ",
        "#{backupTime,jdbcType=TIMESTAMP})"
    })
    int insert(TLTIssueStepsHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS_HIS
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @InsertProvider(type=TLTIssueStepsHisSqlProvider.class, method="insertSelective")
    int insertSelective(TLTIssueStepsHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS_HIS
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @SelectProvider(type=TLTIssueStepsHisSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ISSUE_STEP_ID", property="issueStepId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="LTYPE", property="ltype", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISSUE_NO", property="issueNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="STEP_STATUS", property="stepStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_TIME", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="OPERATOR_ID", property="operatorId", jdbcType=JdbcType.VARCHAR),
        @Result(column="GS_ECODE", property="gsEcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="GS_NAME", property="gsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIMESEC_OFFSET", property="timesecOffset", jdbcType=JdbcType.INTEGER),
        @Result(column="GS_ORDER", property="gsOrder", jdbcType=JdbcType.VARCHAR),
        @Result(column="NEXT_ORDERS", property="nextOrders", jdbcType=JdbcType.VARCHAR),
        @Result(column="REF_PARAM_GEN_ID", property="refParamGenId", jdbcType=JdbcType.BIGINT),
        @Result(column="AUTO_GONEXT", property="autoGonext", jdbcType=JdbcType.VARCHAR),
        @Result(column="BACKUP_TIME", property="backupTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TLTIssueStepsHis> selectByExample(TLTIssueStepsHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS_HIS
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @Select({
        "select",
        "ISSUE_STEP_ID, LTYPE, ISSUE_NO, STEP_STATUS, CREATE_TIME, MODIFY_TIME, OPERATOR_ID, ",
        "GS_ECODE, GS_NAME, TIMESEC_OFFSET, GS_ORDER, NEXT_ORDERS, REF_PARAM_GEN_ID, ",
        "AUTO_GONEXT, BACKUP_TIME",
        "from TLT_ISSUE_STEPS_HIS",
        "where ISSUE_STEP_ID = #{issueStepId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ISSUE_STEP_ID", property="issueStepId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="LTYPE", property="ltype", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISSUE_NO", property="issueNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="STEP_STATUS", property="stepStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFY_TIME", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="OPERATOR_ID", property="operatorId", jdbcType=JdbcType.VARCHAR),
        @Result(column="GS_ECODE", property="gsEcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="GS_NAME", property="gsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIMESEC_OFFSET", property="timesecOffset", jdbcType=JdbcType.INTEGER),
        @Result(column="GS_ORDER", property="gsOrder", jdbcType=JdbcType.VARCHAR),
        @Result(column="NEXT_ORDERS", property="nextOrders", jdbcType=JdbcType.VARCHAR),
        @Result(column="REF_PARAM_GEN_ID", property="refParamGenId", jdbcType=JdbcType.BIGINT),
        @Result(column="AUTO_GONEXT", property="autoGonext", jdbcType=JdbcType.VARCHAR),
        @Result(column="BACKUP_TIME", property="backupTime", jdbcType=JdbcType.TIMESTAMP)
    })
    TLTIssueStepsHis selectByPrimaryKey(TLTIssueStepsHisKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS_HIS
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @UpdateProvider(type=TLTIssueStepsHisSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TLTIssueStepsHis record, @Param("example") TLTIssueStepsHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS_HIS
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @UpdateProvider(type=TLTIssueStepsHisSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TLTIssueStepsHis record, @Param("example") TLTIssueStepsHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS_HIS
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @UpdateProvider(type=TLTIssueStepsHisSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TLTIssueStepsHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS_HIS
     *
     * @mbggenerated Sun Apr 10 15:45:38 CST 2016
     */
    @Update({
        "update TLT_ISSUE_STEPS_HIS",
        "set LTYPE = #{ltype,jdbcType=VARCHAR},",
          "ISSUE_NO = #{issueNo,jdbcType=VARCHAR},",
          "STEP_STATUS = #{stepStatus,jdbcType=VARCHAR},",
          "CREATE_TIME = #{createTime,jdbcType=TIMESTAMP},",
          "MODIFY_TIME = #{modifyTime,jdbcType=TIMESTAMP},",
          "OPERATOR_ID = #{operatorId,jdbcType=VARCHAR},",
          "GS_ECODE = #{gsEcode,jdbcType=VARCHAR},",
          "GS_NAME = #{gsName,jdbcType=VARCHAR},",
          "TIMESEC_OFFSET = #{timesecOffset,jdbcType=INTEGER},",
          "GS_ORDER = #{gsOrder,jdbcType=VARCHAR},",
          "NEXT_ORDERS = #{nextOrders,jdbcType=VARCHAR},",
          "REF_PARAM_GEN_ID = #{refParamGenId,jdbcType=BIGINT},",
          "AUTO_GONEXT = #{autoGonext,jdbcType=VARCHAR},",
          "BACKUP_TIME = #{backupTime,jdbcType=TIMESTAMP}",
        "where ISSUE_STEP_ID = #{issueStepId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TLTIssueStepsHis record);
}