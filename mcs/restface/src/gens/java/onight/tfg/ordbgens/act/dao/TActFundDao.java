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

import onight.tfg.ordbgens.act.entity.TActFund;
import onight.tfg.ordbgens.act.entity.TActFundExample;
import onight.tfg.ordbgens.act.entity.TActFundExample.Criteria;
import onight.tfg.ordbgens.act.entity.TActFundKey;
import onight.tfg.ordbgens.act.mapper.TActFundMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;


@Data
@Tab(name="T_ACT_FUND")
public class TActFundDao extends ExtendDaoSupper<TActFund, TActFundExample, TActFundKey>{

	private TActFundMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(TActFundExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TActFundExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(TActFundKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(TActFund record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TActFund record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<TActFund> records) throws Exception
			 {
		for(TActFund record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<TActFund> records) throws Exception
			 {
		for(TActFund record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<TActFund> selectByExample(TActFundExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public TActFund selectByPrimaryKey(TActFundKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<TActFund> findAll(List<TActFund> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new TActFundExample());
		}
		List<TActFund> list = new ArrayList();
		for(TActFund record : records){
			TActFund result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(TActFund record, TActFundExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TActFund record, TActFundExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TActFund record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TActFund record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(TActFundExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new TActFundExample());
	}

	@Override
	public TActFundExample getExample(TActFund record) {
		TActFundExample example = new TActFundExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getFundNo()!=null){
				criteria.andFundNoEqualTo(record.getFundNo());
				}
				if(record.getActNo()!=null){
				criteria.andActNoEqualTo(record.getActNo());
				}
				if(record.getCustId()!=null){
				criteria.andCustIdEqualTo(record.getCustId());
				}
				if(record.getMchntId()!=null){
				criteria.andMchntIdEqualTo(record.getMchntId());
				}
				if(record.getActType()!=null){
				criteria.andActTypeEqualTo(record.getActType());
				}
				if(record.getMnySmb()!=null){
				criteria.andMnySmbEqualTo(record.getMnySmb());
				}
				if(record.getCatalog()!=null){
				criteria.andCatalogEqualTo(record.getCatalog());
				}
				if(record.getChannelId()!=null){
				criteria.andChannelIdEqualTo(record.getChannelId());
				}
				if(record.getCurBal()!=null){
				criteria.andCurBalEqualTo(record.getCurBal());
				}
				if(record.getFreezeTotal()!=null){
				criteria.andFreezeTotalEqualTo(record.getFreezeTotal());
				}
				if(record.getIncomeTotal()!=null){
				criteria.andIncomeTotalEqualTo(record.getIncomeTotal());
				}
				if(record.getPayoutTotal()!=null){
				criteria.andPayoutTotalEqualTo(record.getPayoutTotal());
				}
				if(record.getFotbidAmount()!=null){
				criteria.andFotbidAmountEqualTo(record.getFotbidAmount());
				}
				if(record.getFotbidFlag()!=null){
				criteria.andFotbidFlagEqualTo(record.getFotbidFlag());
				}
				if(record.getActStat()!=null){
				criteria.andActStatEqualTo(record.getActStat());
				}
				if(record.getActBalWarnFlag()!=null){
				criteria.andActBalWarnFlagEqualTo(record.getActBalWarnFlag());
				}
				if(record.getUpdateActLogId()!=null){
				criteria.andUpdateActLogIdEqualTo(record.getUpdateActLogId());
				}
				if(record.getCreateTime()!=null){
				criteria.andCreateTimeEqualTo(record.getCreateTime());
				}
				if(record.getUpdateTime()!=null){
				criteria.andUpdateTimeEqualTo(record.getUpdateTime());
				}
				if(record.getModifyId()!=null){
				criteria.andModifyIdEqualTo(record.getModifyId());
				}

		}
		return example;
	}
	
	public TActFund selectOneByExample(TActFundExample example)
			 {
		example.setLimit(1);
		List<TActFund> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<TActFund> records) throws Exception {
		if(records.size()<=0)return 0;
		SqlSession session=sqlSessionFactory.openSession();
		Connection conn = session.getConnection();
		Statement st = null;
		int result=0;
		try {
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			StringBuffer sb=new StringBuffer();
			sb.append("INSERT INTO T_ACT_FUND(FUND_NO,ACT_NO,CUST_ID,MCHNT_ID,ACT_TYPE,MNY_SMB,CATALOG,CHANNEL_ID,CUR_BAL,FREEZE_TOTAL,INCOME_TOTAL,PAYOUT_TOTAL,FOTBID_AMOUNT,FOTBID_FLAG,ACT_STAT,ACT_BAL_WARN_FLAG,UPDATE_ACT_LOG_ID,CREATE_TIME,UPDATE_TIME,MODIFY_ID) values");
			int i=0;
			for (TActFund record : records) {
				if(i>0){
					sb.append(",");
				}
				i++;
				
			
				sb.append("(");
			
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
			
				if(record.getCustId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getCustId()+"'");
				}
			
				sb.append(",");
			
				if(record.getMchntId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getMchntId()+"'");
				}
			
				sb.append(",");
			
				if(record.getActType()==null){
//						sb.append("'"+"0"+"'");
						sb.append("'"+"0"+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getActType()+"'");
				}
			
				sb.append(",");
			
				if(record.getMnySmb()==null){
//						sb.append("'"+"CNY"+"'");
						sb.append("'"+"CNY"+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getMnySmb()+"'");
				}
			
				sb.append(",");
			
				if(record.getCatalog()==null){
//						sb.append("'"+"0"+"'");
						sb.append("'"+"0"+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getCatalog()+"'");
				}
			
				sb.append(",");
			
				if(record.getChannelId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChannelId()+"'");
				}
			
				sb.append(",");
			
				if(record.getCurBal()==null){
//						sb.append("'"+"0.00000000"+"'");
						sb.append("'"+"0.00000000"+"'");
						
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getCurBal()+"'");
				}
			
				sb.append(",");
			
				if(record.getFreezeTotal()==null){
//						sb.append("'"+"0.00000000"+"'");
						sb.append("'"+"0.00000000"+"'");
						
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getFreezeTotal()+"'");
				}
			
				sb.append(",");
			
				if(record.getIncomeTotal()==null){
//						sb.append("'"+"0.00000000"+"'");
						sb.append("'"+"0.00000000"+"'");
						
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getIncomeTotal()+"'");
				}
			
				sb.append(",");
			
				if(record.getPayoutTotal()==null){
//						sb.append("'"+"0.00000000"+"'");
						sb.append("'"+"0.00000000"+"'");
						
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getPayoutTotal()+"'");
				}
			
				sb.append(",");
			
				if(record.getFotbidAmount()==null){
//						sb.append("'"+"0.00000000"+"'");
						sb.append("'"+"0.00000000"+"'");
						
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getFotbidAmount()+"'");
				}
			
				sb.append(",");
			
				if(record.getFotbidFlag()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getFotbidFlag()+"'");
				}
			
				sb.append(",");
			
				if(record.getActStat()==null){
//						sb.append("'"+"0.0"+"'");
						sb.append("'"+"0.0"+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getActStat()+"'");
				}
			
				sb.append(",");
			
				if(record.getActBalWarnFlag()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getActBalWarnFlag()+"'");
				}
			
				sb.append(",");
			
				if(record.getUpdateActLogId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getUpdateActLogId()+"'");
				}
			
				sb.append(",");
			
				if(record.getCreateTime()==null){
//						sb.append("'"+"CURRENT_TIMESTAMP"+"'");
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(new java.util.Date())+"'");
						
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getCreateTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getUpdateTime()==null){
//						sb.append("'"+"0000-00-00 00:00:00"+"'");
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(new java.util.Date())+"'");
						
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getUpdateTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getModifyId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getModifyId()+"'");
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
