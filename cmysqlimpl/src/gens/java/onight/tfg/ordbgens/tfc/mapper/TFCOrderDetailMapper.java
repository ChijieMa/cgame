package onight.tfg.ordbgens.tfc.mapper;

import java.util.List;
import onight.tfg.ordbgens.tfc.entity.TFCOrderDetail;
import onight.tfg.ordbgens.tfc.entity.TFCOrderDetailExample;
import onight.tfg.ordbgens.tfc.entity.TFCOrderDetailKey;
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

public interface TFCOrderDetailMapper extends StaticTableDaoSupport<TFCOrderDetail, TFCOrderDetailExample, TFCOrderDetailKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @SelectProvider(type=TFCOrderDetailSqlProvider.class, method="countByExample")
    int countByExample(TFCOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @DeleteProvider(type=TFCOrderDetailSqlProvider.class, method="deleteByExample")
    int deleteByExample(TFCOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @Delete({
        "delete from TFC_ORDER_DETAIL",
        "where ROW_ID = #{rowId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(TFCOrderDetailKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @Insert({
        "insert into TFC_ORDER_DETAIL (ROW_ID, USER_ID, ",
        "HANDLE_TIME, HANLDE_STATUS, ",
        "NUM_BEFORE, CHANGE_NUM, ",
        "NUM_AFTER, NOTE)",
        "values (#{rowId,jdbcType=VARCHAR}, #{userId,jdbcType=BIGINT}, ",
        "#{handleTime,jdbcType=TIMESTAMP}, #{hanldeStatus,jdbcType=INTEGER}, ",
        "#{numBefore,jdbcType=BIGINT}, #{changeNum,jdbcType=BIGINT}, ",
        "#{numAfter,jdbcType=BIGINT}, #{note,jdbcType=VARCHAR})"
    })
    int insert(TFCOrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @InsertProvider(type=TFCOrderDetailSqlProvider.class, method="insertSelective")
    int insertSelective(TFCOrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @SelectProvider(type=TFCOrderDetailSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ROW_ID", property="rowId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="HANDLE_TIME", property="handleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="HANLDE_STATUS", property="hanldeStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="NUM_BEFORE", property="numBefore", jdbcType=JdbcType.BIGINT),
        @Result(column="CHANGE_NUM", property="changeNum", jdbcType=JdbcType.BIGINT),
        @Result(column="NUM_AFTER", property="numAfter", jdbcType=JdbcType.BIGINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR)
    })
    List<TFCOrderDetail> selectByExample(TFCOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @Select({
        "select",
        "ROW_ID, USER_ID, HANDLE_TIME, HANLDE_STATUS, NUM_BEFORE, CHANGE_NUM, NUM_AFTER, ",
        "NOTE",
        "from TFC_ORDER_DETAIL",
        "where ROW_ID = #{rowId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ROW_ID", property="rowId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="HANDLE_TIME", property="handleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="HANLDE_STATUS", property="hanldeStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="NUM_BEFORE", property="numBefore", jdbcType=JdbcType.BIGINT),
        @Result(column="CHANGE_NUM", property="changeNum", jdbcType=JdbcType.BIGINT),
        @Result(column="NUM_AFTER", property="numAfter", jdbcType=JdbcType.BIGINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR)
    })
    TFCOrderDetail selectByPrimaryKey(TFCOrderDetailKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @UpdateProvider(type=TFCOrderDetailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TFCOrderDetail record, @Param("example") TFCOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @UpdateProvider(type=TFCOrderDetailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TFCOrderDetail record, @Param("example") TFCOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @UpdateProvider(type=TFCOrderDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TFCOrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
     *
     * @mbggenerated Sun Apr 10 15:45:37 CST 2016
     */
    @Update({
        "update TFC_ORDER_DETAIL",
        "set USER_ID = #{userId,jdbcType=BIGINT},",
          "HANDLE_TIME = #{handleTime,jdbcType=TIMESTAMP},",
          "HANLDE_STATUS = #{hanldeStatus,jdbcType=INTEGER},",
          "NUM_BEFORE = #{numBefore,jdbcType=BIGINT},",
          "CHANGE_NUM = #{changeNum,jdbcType=BIGINT},",
          "NUM_AFTER = #{numAfter,jdbcType=BIGINT},",
          "NOTE = #{note,jdbcType=VARCHAR}",
        "where ROW_ID = #{rowId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TFCOrderDetail record);
}