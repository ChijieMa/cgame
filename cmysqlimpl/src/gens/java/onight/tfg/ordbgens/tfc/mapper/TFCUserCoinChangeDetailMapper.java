package onight.tfg.ordbgens.tfc.mapper;

import java.util.List;
import onight.tfg.ordbgens.tfc.entity.TFCUserCoinChangeDetail;
import onight.tfg.ordbgens.tfc.entity.TFCUserCoinChangeDetailExample;
import onight.tfg.ordbgens.tfc.entity.TFCUserCoinChangeDetailKey;
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

public interface TFCUserCoinChangeDetailMapper extends StaticTableDaoSupport<TFCUserCoinChangeDetail, TFCUserCoinChangeDetailExample, TFCUserCoinChangeDetailKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @SelectProvider(type=TFCUserCoinChangeDetailSqlProvider.class, method="countByExample")
    int countByExample(TFCUserCoinChangeDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @DeleteProvider(type=TFCUserCoinChangeDetailSqlProvider.class, method="deleteByExample")
    int deleteByExample(TFCUserCoinChangeDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @Delete({
        "delete from TFC_USER_COIN_CHANGE_DETAIL",
        "where COIN_ROW_ID = #{coinRowId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(TFCUserCoinChangeDetailKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @Insert({
        "insert into TFC_USER_COIN_CHANGE_DETAIL (COIN_ROW_ID, COIN_TYPE_ID, ",
        "REC_TIME, USER_ID, ",
        "CHANGE_NUM, REMAIN_NUM, ",
        "LOCK_ID, CHANNEL_ID, ",
        "PRODUCT_ID, FLOW_NUMBER, ",
        "USER_IP, SERVER_IP, ",
        "GAME_ID)",
        "values (#{coinRowId,jdbcType=VARCHAR}, #{coinTypeId,jdbcType=VARCHAR}, ",
        "#{recTime,jdbcType=TIMESTAMP}, #{userId,jdbcType=BIGINT}, ",
        "#{changeNum,jdbcType=BIGINT}, #{remainNum,jdbcType=BIGINT}, ",
        "#{lockId,jdbcType=VARCHAR}, #{channelId,jdbcType=VARCHAR}, ",
        "#{productId,jdbcType=VARCHAR}, #{flowNumber,jdbcType=VARCHAR}, ",
        "#{userIp,jdbcType=VARCHAR}, #{serverIp,jdbcType=VARCHAR}, ",
        "#{gameId,jdbcType=INTEGER})"
    })
    int insert(TFCUserCoinChangeDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @InsertProvider(type=TFCUserCoinChangeDetailSqlProvider.class, method="insertSelective")
    int insertSelective(TFCUserCoinChangeDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @SelectProvider(type=TFCUserCoinChangeDetailSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="COIN_ROW_ID", property="coinRowId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="COIN_TYPE_ID", property="coinTypeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="REC_TIME", property="recTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="CHANGE_NUM", property="changeNum", jdbcType=JdbcType.BIGINT),
        @Result(column="REMAIN_NUM", property="remainNum", jdbcType=JdbcType.BIGINT),
        @Result(column="LOCK_ID", property="lockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHANNEL_ID", property="channelId", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRODUCT_ID", property="productId", jdbcType=JdbcType.VARCHAR),
        @Result(column="FLOW_NUMBER", property="flowNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_IP", property="userIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="SERVER_IP", property="serverIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="GAME_ID", property="gameId", jdbcType=JdbcType.INTEGER)
    })
    List<TFCUserCoinChangeDetail> selectByExample(TFCUserCoinChangeDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @Select({
        "select",
        "COIN_ROW_ID, COIN_TYPE_ID, REC_TIME, USER_ID, CHANGE_NUM, REMAIN_NUM, LOCK_ID, ",
        "CHANNEL_ID, PRODUCT_ID, FLOW_NUMBER, USER_IP, SERVER_IP, GAME_ID",
        "from TFC_USER_COIN_CHANGE_DETAIL",
        "where COIN_ROW_ID = #{coinRowId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="COIN_ROW_ID", property="coinRowId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="COIN_TYPE_ID", property="coinTypeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="REC_TIME", property="recTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="CHANGE_NUM", property="changeNum", jdbcType=JdbcType.BIGINT),
        @Result(column="REMAIN_NUM", property="remainNum", jdbcType=JdbcType.BIGINT),
        @Result(column="LOCK_ID", property="lockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHANNEL_ID", property="channelId", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRODUCT_ID", property="productId", jdbcType=JdbcType.VARCHAR),
        @Result(column="FLOW_NUMBER", property="flowNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_IP", property="userIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="SERVER_IP", property="serverIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="GAME_ID", property="gameId", jdbcType=JdbcType.INTEGER)
    })
    TFCUserCoinChangeDetail selectByPrimaryKey(TFCUserCoinChangeDetailKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @UpdateProvider(type=TFCUserCoinChangeDetailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TFCUserCoinChangeDetail record, @Param("example") TFCUserCoinChangeDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @UpdateProvider(type=TFCUserCoinChangeDetailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TFCUserCoinChangeDetail record, @Param("example") TFCUserCoinChangeDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @UpdateProvider(type=TFCUserCoinChangeDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TFCUserCoinChangeDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_CHANGE_DETAIL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @Update({
        "update TFC_USER_COIN_CHANGE_DETAIL",
        "set COIN_TYPE_ID = #{coinTypeId,jdbcType=VARCHAR},",
          "REC_TIME = #{recTime,jdbcType=TIMESTAMP},",
          "USER_ID = #{userId,jdbcType=BIGINT},",
          "CHANGE_NUM = #{changeNum,jdbcType=BIGINT},",
          "REMAIN_NUM = #{remainNum,jdbcType=BIGINT},",
          "LOCK_ID = #{lockId,jdbcType=VARCHAR},",
          "CHANNEL_ID = #{channelId,jdbcType=VARCHAR},",
          "PRODUCT_ID = #{productId,jdbcType=VARCHAR},",
          "FLOW_NUMBER = #{flowNumber,jdbcType=VARCHAR},",
          "USER_IP = #{userIp,jdbcType=VARCHAR},",
          "SERVER_IP = #{serverIp,jdbcType=VARCHAR},",
          "GAME_ID = #{gameId,jdbcType=INTEGER}",
        "where COIN_ROW_ID = #{coinRowId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TFCUserCoinChangeDetail record);
}