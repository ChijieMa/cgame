package onight.tfg.ordbgens.act.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.transaction.annotation.Transactional;

import onight.tfg.ordbgens.act.entity.TActInterest;
import onight.tfg.ordbgens.act.entity.TActInterestExample;
import onight.tfg.ordbgens.act.entity.TActInterestExample.Criteria;
import onight.tfg.ordbgens.act.entity.TActInterestKey;
import onight.tfg.ordbgens.act.mapper.TActInterestMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;


@Data
@Tab(name="T_ACT_INTEREST")
public class TActInterestDao extends ExtendDaoSupper<TActInterest, TActInterestExample, TActInterestKey>{

	private TActInterestMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(TActInterestExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TActInterestExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(TActInterestKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(TActInterest record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TActInterest record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<TActInterest> records) throws Exception
			 {
		for(TActInterest record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<TActInterest> records) throws Exception
			 {
		for(TActInterest record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<TActInterest> selectByExample(TActInterestExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public TActInterest selectByPrimaryKey(TActInterestKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<TActInterest> findAll(List<TActInterest> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new TActInterestExample());
		}
		List<TActInterest> list = new ArrayList();
		for(TActInterest record : records){
			TActInterest result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(TActInterest record, TActInterestExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TActInterest record, TActInterestExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TActInterest record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TActInterest record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(TActInterestExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new TActInterestExample());
	}

	@Override
	public TActInterestExample getExample(TActInterest record) {
		TActInterestExample example = new TActInterestExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getInstLogid()!=null){
				criteria.andInstLogidEqualTo(record.getInstLogid());
				}
				if(record.getInterestDate()!=null){
				criteria.andInterestDateEqualTo(record.getInterestDate());
				}
				if(record.getFundNo()!=null){
				criteria.andFundNoEqualTo(record.getFundNo());
				}
				if(record.getActNo()!=null){
				criteria.andActNoEqualTo(record.getActNo());
				}
				if(record.getInterestType()!=null){
				criteria.andInterestTypeEqualTo(record.getInterestType());
				}
				if(record.getInterestAmount()!=null){
				criteria.andInterestAmountEqualTo(record.getInterestAmount());
				}
				if(record.getGmtCreate()!=null){
				criteria.andGmtCreateEqualTo(record.getGmtCreate());
				}
				if(record.getGmtModify()!=null){
				criteria.andGmtModifyEqualTo(record.getGmtModify());
				}
				if(record.getTradeDate()!=null){
				criteria.andTradeDateEqualTo(record.getTradeDate());
				}
				if(record.getRateValue()!=null){
				criteria.andRateValueEqualTo(record.getRateValue());
				}
				if(record.getUnitNo()!=null){
				criteria.andUnitNoEqualTo(record.getUnitNo());
				}

		}
		return example;
	}
	
	public TActInterest selectOneByExample(TActInterestExample example)
			 {
		example.setLimit(1);
		List<TActInterest> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<TActInterest> records) throws Exception {
		if(records.size()<=0)return 0;
		SqlSession session=sqlSessionFactory.openSession();
		Connection conn = session.getConnection();
		Statement st = null;
		int result=0;
		try {
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			StringBuffer sb=new StringBuffer();
			sb.append("INSERT INTO T_ACT_INTEREST(INST_LOGID,INTEREST_DATE,FUND_NO,ACT_NO,INTEREST_TYPE,INTEREST_AMOUNT,GMT_CREATE,GMT_MODIFY,TRADE_DATE,RATE_VALUE,UNIT_NO) values");
			int i=0;
			for (TActInterest record : records) {
				if(i>0){
					sb.append(",");
				}
				i++;
				
			
				sb.append("(");
			
				if(record.getInstLogid()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getInstLogid()+"'");
				}
			
				sb.append(",");
			
				if(record.getInterestDate()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getInterestDate()+"'");
				}
			
				sb.append(",");
			
				if(record.getFundNo()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getFundNo()+"'");
				}
			
				sb.append(",");
			
				if(record.getActNo()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getActNo()+"'");
				}
			
				sb.append(",");
			
				if(record.getInterestType()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getInterestType()+"'");
				}
			
				sb.append(",");
			
				if(record.getInterestAmount()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getInterestAmount()+"'");
				}
			
				sb.append(",");
			
				if(record.getGmtCreate()==null){
//						sb.append("'"+"CURRENT_TIMESTAMP"+"'");
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(new java.util.Date())+"'");
						
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getGmtCreate())+"'");
				}
			
				sb.append(",");
			
				if(record.getGmtModify()==null){
//						sb.append("'"+"0000-00-00 00:00:00"+"'");
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(new java.util.Date())+"'");
						
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getGmtModify())+"'");
				}
			
				sb.append(",");
			
				if(record.getTradeDate()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getTradeDate()+"'");
				}
			
				sb.append(",");
			
				if(record.getRateValue()==null){
						sb.append("null");
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getRateValue()+"'");
				}
			
				sb.append(",");
			
				if(record.getUnitNo()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getUnitNo()+"'");
				}
							sb.append(")");
			
			}
			result=st.executeUpdate(sb.toString());
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw e;
		}finally{
			if(st!=null){
				try {
					st.close();
				} catch (Exception est) {
					est.printStackTrace();
				}
			}
			session.close();
		}
		return result;
	}
	
	
}
