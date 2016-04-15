package onight.tfg.ordbgens.tfc.mapper;

import java.util.List;
import onight.tfg.ordbgens.tfc.entity.TFCGameSupportCoin;
import onight.tfg.ordbgens.tfc.entity.TFCGameSupportCoinExample;
import onight.tfg.ordbgens.tfc.entity.TFCGameSupportCoinKey;
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

public interface TFCGameSupportCoinMapper extends StaticTableDaoSupport<TFCGameSupportCoin, TFCGameSupportCoinExample, TFCGameSupportCoinKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_GAME_SUPPORT_COIN
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @SelectProvider(type=TFCGameSupportCoinSqlProvider.class, method="countByExample")
    int countByExample(TFCGameSupportCoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_GAME_SUPPORT_COIN
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @DeleteProvider(type=TFCGameSupportCoinSqlProvider.class, method="deleteByExample")
    int deleteByExample(TFCGameSupportCoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_GAME_SUPPORT_COIN
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Delete({
        "delete from TFC_GAME_SUPPORT_COIN",
        "where ROW_ID = #{rowId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(TFCGameSupportCoinKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_GAME_SUPPORT_COIN
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Insert({
        "insert into TFC_GAME_SUPPORT_COIN (ROW_ID, COIN_TYPE_ID, ",
        "GAME_ID)",
        "values (#{rowId,jdbcType=VARCHAR}, #{coinTypeId,jdbcType=VARCHAR}, ",
        "#{gameId,jdbcType=VARCHAR})"
    })
    int insert(TFCGameSupportCoin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_GAME_SUPPORT_COIN
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @InsertProvider(type=TFCGameSupportCoinSqlProvider.class, method="insertSelective")
    int insertSelective(TFCGameSupportCoin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_GAME_SUPPORT_COIN
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @SelectProvider(type=TFCGameSupportCoinSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ROW_ID", property="rowId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="COIN_TYPE_ID", property="coinTypeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="GAME_ID", property="gameId", jdbcType=JdbcType.VARCHAR)
    })
    List<TFCGameSupportCoin> selectByExample(TFCGameSupportCoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_GAME_SUPPORT_COIN
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Select({
        "select",
        "ROW_ID, COIN_TYPE_ID, GAME_ID",
        "from TFC_GAME_SUPPORT_COIN",
        "where ROW_ID = #{rowId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ROW_ID", property="rowId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="COIN_TYPE_ID", property="coinTypeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="GAME_ID", property="gameId", jdbcType=JdbcType.VARCHAR)
    })
    TFCGameSupportCoin selectByPrimaryKey(TFCGameSupportCoinKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_GAME_SUPPORT_COIN
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @UpdateProvider(type=TFCGameSupportCoinSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TFCGameSupportCoin record, @Param("example") TFCGameSupportCoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_GAME_SUPPORT_COIN
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @UpdateProvider(type=TFCGameSupportCoinSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TFCGameSupportCoin record, @Param("example") TFCGameSupportCoinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_GAME_SUPPORT_COIN
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @UpdateProvider(type=TFCGameSupportCoinSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TFCGameSupportCoin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_GAME_SUPPORT_COIN
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Update({
        "update TFC_GAME_SUPPORT_COIN",
        "set COIN_TYPE_ID = #{coinTypeId,jdbcType=VARCHAR},",
          "GAME_ID = #{gameId,jdbcType=VARCHAR}",
        "where ROW_ID = #{rowId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TFCGameSupportCoin record);
}