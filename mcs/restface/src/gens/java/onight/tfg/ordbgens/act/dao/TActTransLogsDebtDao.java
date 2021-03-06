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

import onight.tfg.ordbgens.act.entity.TActTransLogsDebt;
import onight.tfg.ordbgens.act.entity.TActTransLogsDebtExample;
import onight.tfg.ordbgens.act.entity.TActTransLogsDebtExample.Criteria;
import onight.tfg.ordbgens.act.entity.TActTransLogsDebtKey;
import onight.tfg.ordbgens.act.mapper.TActTransLogsDebtMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;


@Data
@Tab(name="T_ACT_TRANS_LOGS_DEBT")
public class TActTransLogsDebtDao extends ExtendDaoSupper<TActTransLogsDebt, TActTransLogsDebtExample, TActTransLogsDebtKey>{

	private TActTransLogsDebtMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(TActTransLogsDebtExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TActTransLogsDebtExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(TActTransLogsDebtKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(TActTransLogsDebt record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TActTransLogsDebt record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<TActTransLogsDebt> records) throws Exception
			 {
		for(TActTransLogsDebt record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<TActTransLogsDebt> records) throws Exception
			 {
		for(TActTransLogsDebt record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<TActTransLogsDebt> selectByExample(TActTransLogsDebtExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public TActTransLogsDebt selectByPrimaryKey(TActTransLogsDebtKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<TActTransLogsDebt> findAll(List<TActTransLogsDebt> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new TActTransLogsDebtExample());
		}
		List<TActTransLogsDebt> list = new ArrayList();
		for(TActTransLogsDebt record : records){
			TActTransLogsDebt result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(TActTransLogsDebt record, TActTransLogsDebtExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TActTransLogsDebt record, TActTransLogsDebtExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TActTransLogsDebt record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TActTransLogsDebt record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(TActTransLogsDebtExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new TActTransLogsDebtExample());
	}

	@Override
	public TActTransLogsDebtExample getExample(TActTransLogsDebt record) {
		TActTransLogsDebtExample example = new TActTransLogsDebtExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getLogUuid()!=null){
				criteria.andLogUuidEqualTo(record.getLogUuid());
				}
				if(record.getFromFundNo()!=null){
				criteria.andFromFundNoEqualTo(record.getFromFundNo());
				}
				if(record.getToFundNo()!=null){
				criteria.andToFundNoEqualTo(record.getToFundNo());
				}
				if(record.getFlagCancel()!=null){
				criteria.andFlagCancelEqualTo(record.getFlagCancel());
				}
				if(record.getRelatedTransId()!=null){
				criteria.andRelatedTransIdEqualTo(record.getRelatedTransId());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}
				if(record.getCreateTime()!=null){
				criteria.andCreateTimeEqualTo(record.getCreateTime());
				}
				if(record.getUpdateTime()!=null){
				criteria.andUpdateTimeEqualTo(record.getUpdateTime());
				}

		}
		return example;
	}
	
	public TActTransLogsDebt selectOneByExample(TActTransLogsDebtExample example)
			 {
		example.setLimit(1);
		List<TActTransLogsDebt> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<TActTransLogsDebt> records) throws Exception {
		if(records.size()<=0)return 0;
		SqlSession session=sqlSessionFactory.openSession();
		Connection conn = session.getConnection();
		Statement st = null;
		int result=0;
		try {
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			StringBuffer sb=new StringBuffer();
			sb.append("INSERT INTO T_ACT_TRANS_LOGS_DEBT(LOG_UUID,FROM_FUND_NO,TO_FUND_NO,FLAG_CANCEL,RELATED_TRANS_ID,STATUS,CREATE_TIME,UPDATE_TIME) values");
			int i=0;
			for (TActTransLogsDebt record : records) {
				if(i>0){
					sb.append(",");
				}
				i++;
				
			
				sb.append("(");
			
				if(record.getLogUuid()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getLogUuid()+"'");
				}
			
				sb.append(",");
			
				if(record.getFromFundNo()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getFromFundNo()+"'");
				}
			
				sb.append(",");
			
				if(record.getToFundNo()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getToFundNo()+"'");
				}
			
				sb.append(",");
			
				if(record.getFlagCancel()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getFlagCancel()+"'");
				}
			
				sb.append(",");
			
				if(record.getRelatedTransId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getRelatedTransId()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
//						sb.append("'"+"0000"+"'");
						sb.append("'"+"0000"+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getStatus()+"'");
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
