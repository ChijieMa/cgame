package onight.tfg.ordbgens.act.mapper;

import java.util.List;
import onight.tfg.ordbgens.act.entity.TActInterest;
import onight.tfg.ordbgens.act.entity.TActInterestExample;
import onight.tfg.ordbgens.act.entity.TActInterestKey;
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

public interface TActInterestMapper extends StaticTableDaoSupport<TActInterest, TActInterestExample, TActInterestKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INTEREST
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @SelectProvider(type=TActInterestSqlProvider.class, method="countByExample")
    int countByExample(TActInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INTEREST
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @DeleteProvider(type=TActInterestSqlProvider.class, method="deleteByExample")
    int deleteByExample(TActInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INTEREST
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @Delete({
        "delete from T_ACT_INTEREST",
        "where INST_LOGID = #{instLogid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(TActInterestKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INTEREST
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @Insert({
        "insert into T_ACT_INTEREST (INST_LOGID, INTEREST_DATE, ",
        "FUND_NO, ACT_NO, INTEREST_TYPE, ",
        "INTEREST_AMOUNT, GMT_CREATE, ",
        "GMT_MODIFY, TRADE_DATE, ",
        "RATE_VALUE, UNIT_NO)",
        "values (#{instLogid,jdbcType=VARCHAR}, #{interestDate,jdbcType=VARCHAR}, ",
        "#{fundNo,jdbcType=VARCHAR}, #{actNo,jdbcType=VARCHAR}, #{interestType,jdbcType=VARCHAR}, ",
        "#{interestAmount,jdbcType=DECIMAL}, #{gmtCreate,jdbcType=TIMESTAMP}, ",
        "#{gmtModify,jdbcType=TIMESTAMP}, #{tradeDate,jdbcType=VARCHAR}, ",
        "#{rateValue,jdbcType=DECIMAL}, #{unitNo,jdbcType=VARCHAR})"
    })
    int insert(TActInterest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INTEREST
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @InsertProvider(type=TActInterestSqlProvider.class, method="insertSelective")
    int insertSelective(TActInterest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INTEREST
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @SelectProvider(type=TActInterestSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="INST_LOGID", property="instLogid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="INTEREST_DATE", property="interestDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_NO", property="fundNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACT_NO", property="actNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="INTEREST_TYPE", property="interestType", jdbcType=JdbcType.VARCHAR),
        @Result(column="INTEREST_AMOUNT", property="interestAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="GMT_CREATE", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="GMT_MODIFY", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TRADE_DATE", property="tradeDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="RATE_VALUE", property="rateValue", jdbcType=JdbcType.DECIMAL),
        @Result(column="UNIT_NO", property="unitNo", jdbcType=JdbcType.VARCHAR)
    })
    List<TActInterest> selectByExample(TActInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INTEREST
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @Select({
        "select",
        "INST_LOGID, INTEREST_DATE, FUND_NO, ACT_NO, INTEREST_TYPE, INTEREST_AMOUNT, ",
        "GMT_CREATE, GMT_MODIFY, TRADE_DATE, RATE_VALUE, UNIT_NO",
        "from T_ACT_INTEREST",
        "where INST_LOGID = #{instLogid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="INST_LOGID", property="instLogid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="INTEREST_DATE", property="interestDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_NO", property="fundNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACT_NO", property="actNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="INTEREST_TYPE", property="interestType", jdbcType=JdbcType.VARCHAR),
        @Result(column="INTEREST_AMOUNT", property="interestAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="GMT_CREATE", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="GMT_MODIFY", property="gmtModify", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TRADE_DATE", property="tradeDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="RATE_VALUE", property="rateValue", jdbcType=JdbcType.DECIMAL),
        @Result(column="UNIT_NO", property="unitNo", jdbcType=JdbcType.VARCHAR)
    })
    TActInterest selectByPrimaryKey(TActInterestKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INTEREST
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @UpdateProvider(type=TActInterestSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TActInterest record, @Param("example") TActInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INTEREST
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @UpdateProvider(type=TActInterestSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TActInterest record, @Param("example") TActInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INTEREST
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @UpdateProvider(type=TActInterestSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TActInterest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ACT_INTEREST
     *
     * @mbggenerated Thu Apr 14 00:04:41 CST 2016
     */
    @Update({
        "update T_ACT_INTEREST",
        "set INTEREST_DATE = #{interestDate,jdbcType=VARCHAR},",
          "FUND_NO = #{fundNo,jdbcType=VARCHAR},",
          "ACT_NO = #{actNo,jdbcType=VARCHAR},",
          "INTEREST_TYPE = #{interestType,jdbcType=VARCHAR},",
          "INTEREST_AMOUNT = #{interestAmount,jdbcType=DECIMAL},",
          "GMT_CREATE = #{gmtCreate,jdbcType=TIMESTAMP},",
          "GMT_MODIFY = #{gmtModify,jdbcType=TIMESTAMP},",
          "TRADE_DATE = #{tradeDate,jdbcType=VARCHAR},",
          "RATE_VALUE = #{rateValue,jdbcType=DECIMAL},",
          "UNIT_NO = #{unitNo,jdbcType=VARCHAR}",
        "where INST_LOGID = #{instLogid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TActInterest record);
}