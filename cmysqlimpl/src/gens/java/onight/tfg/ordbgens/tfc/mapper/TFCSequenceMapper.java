package onight.tfg.ordbgens.tfc.mapper;

import java.util.List;
import onight.tfg.ordbgens.tfc.entity.TFCSequence;
import onight.tfg.ordbgens.tfc.entity.TFCSequenceExample;
import onight.tfg.ordbgens.tfc.entity.TFCSequenceKey;
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

public interface TFCSequenceMapper extends StaticTableDaoSupport<TFCSequence, TFCSequenceExample, TFCSequenceKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @SelectProvider(type=TFCSequenceSqlProvider.class, method="countByExample")
    int countByExample(TFCSequenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @DeleteProvider(type=TFCSequenceSqlProvider.class, method="deleteByExample")
    int deleteByExample(TFCSequenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Delete({
        "delete from TFC_SEQUENCE",
        "where NAME = #{name,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(TFCSequenceKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Insert({
        "insert into TFC_SEQUENCE (NAME, CURRENT_VALUE, ",
        "_INCREMENT)",
        "values (#{name,jdbcType=VARCHAR}, #{currentValue,jdbcType=BIGINT}, ",
        "#{increment,jdbcType=INTEGER})"
    })
    int insert(TFCSequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @InsertProvider(type=TFCSequenceSqlProvider.class, method="insertSelective")
    int insertSelective(TFCSequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @SelectProvider(type=TFCSequenceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CURRENT_VALUE", property="currentValue", jdbcType=JdbcType.BIGINT),
        @Result(column="_INCREMENT", property="increment", jdbcType=JdbcType.INTEGER)
    })
    List<TFCSequence> selectByExample(TFCSequenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Select({
        "select",
        "NAME, CURRENT_VALUE, _INCREMENT",
        "from TFC_SEQUENCE",
        "where NAME = #{name,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CURRENT_VALUE", property="currentValue", jdbcType=JdbcType.BIGINT),
        @Result(column="_INCREMENT", property="increment", jdbcType=JdbcType.INTEGER)
    })
    TFCSequence selectByPrimaryKey(TFCSequenceKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @UpdateProvider(type=TFCSequenceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TFCSequence record, @Param("example") TFCSequenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @UpdateProvider(type=TFCSequenceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TFCSequence record, @Param("example") TFCSequenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @UpdateProvider(type=TFCSequenceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TFCSequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Update({
        "update TFC_SEQUENCE",
        "set CURRENT_VALUE = #{currentValue,jdbcType=BIGINT},",
          "_INCREMENT = #{increment,jdbcType=INTEGER}",
        "where NAME = #{name,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TFCSequence record);
}