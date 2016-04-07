package onight.tfg.ordbgens.tlt.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.transaction.annotation.Transactional;

import onight.tfg.ordbgens.tlt.entity.TLTIssue;
import onight.tfg.ordbgens.tlt.entity.TLTIssueExample;
import onight.tfg.ordbgens.tlt.entity.TLTIssueExample.Criteria;
import onight.tfg.ordbgens.tlt.entity.TLTIssueKey;
import onight.tfg.ordbgens.tlt.mapper.TLTIssueMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;


@Data
@Tab(name="TLT_ISSUE")
public class TLTIssueDao extends ExtendDaoSupper<TLTIssue, TLTIssueExample, TLTIssueKey>{

	private TLTIssueMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(TLTIssueExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TLTIssueExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(TLTIssueKey key) {
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(TLTIssue record)  {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TLTIssue record)  {
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<TLTIssue> records)
			 {
		for(TLTIssue record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<TLTIssue> records)
			 {
		for(TLTIssue record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<TLTIssue> selectByExample(TLTIssueExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public TLTIssue selectByPrimaryKey(TLTIssueKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<TLTIssue> findAll(List<TLTIssue> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new TLTIssueExample());
		}
		List<TLTIssue> list = new ArrayList();
		for(TLTIssue record : records){
			TLTIssue result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(TLTIssue record, TLTIssueExample example)  {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TLTIssue record, TLTIssueExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TLTIssue record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TLTIssue record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(TLTIssueExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  {
		mapper.deleteByExample(new TLTIssueExample());
	}

	@Override
	public TLTIssueExample getExample(TLTIssue record) {
		TLTIssueExample example = new TLTIssueExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getIssueId()!=null){
				criteria.andIssueIdEqualTo(record.getIssueId());
				}
				if(record.getLtype()!=null){
				criteria.andLtypeEqualTo(record.getLtype());
				}
				if(record.getIssueNo()!=null){
				criteria.andIssueNoEqualTo(record.getIssueNo());
				}
				if(record.getLotteryNo()!=null){
				criteria.andLotteryNoEqualTo(record.getLotteryNo());
				}
				if(record.getIssueDate()!=null){
				criteria.andIssueDateEqualTo(record.getIssueDate());
				}
				if(record.getPreStime()!=null){
				criteria.andPreStimeEqualTo(record.getPreStime());
				}
				if(record.getPreEtime()!=null){
				criteria.andPreEtimeEqualTo(record.getPreEtime());
				}
				if(record.getSaleStime()!=null){
				criteria.andSaleStimeEqualTo(record.getSaleStime());
				}
				if(record.getSaleEtime()!=null){
				criteria.andSaleEtimeEqualTo(record.getSaleEtime());
				}
				if(record.getRealStime()!=null){
				criteria.andRealStimeEqualTo(record.getRealStime());
				}
				if(record.getRealEtime()!=null){
				criteria.andRealEtimeEqualTo(record.getRealEtime());
				}
				if(record.getCancelLtime()!=null){
				criteria.andCancelLtimeEqualTo(record.getCancelLtime());
				}
				if(record.getCloseshareDate()!=null){
				criteria.andCloseshareDateEqualTo(record.getCloseshareDate());
				}
				if(record.getRebateStatus()!=null){
				criteria.andRebateStatusEqualTo(record.getRebateStatus());
				}
				if(record.getWinStatus()!=null){
				criteria.andWinStatusEqualTo(record.getWinStatus());
				}
				if(record.getSendStatus()!=null){
				criteria.andSendStatusEqualTo(record.getSendStatus());
				}
				if(record.getAutobetStatus()!=null){
				criteria.andAutobetStatusEqualTo(record.getAutobetStatus());
				}
				if(record.getLockStatus()!=null){
				criteria.andLockStatusEqualTo(record.getLockStatus());
				}
				if(record.getProcessStatus()!=null){
				criteria.andProcessStatusEqualTo(record.getProcessStatus());
				}
				if(record.getCreateTime()!=null){
				criteria.andCreateTimeEqualTo(record.getCreateTime());
				}
				if(record.getModifyTime()!=null){
				criteria.andModifyTimeEqualTo(record.getModifyTime());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}

		}
		return example;
	}
	
	public TLTIssue selectOneByExample(TLTIssueExample example)
			 {
		example.setLimit(1);
		List<TLTIssue> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<TLTIssue> records) {
		SqlSession session=sqlSessionFactory.openSession();
		Connection conn = session.getConnection();
		Statement st = null;
		int result=0;
		try {
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			StringBuffer sb=new StringBuffer();
			sb.append("INSERT INTO TLT_ISSUE() values");
			int i=0;
			for (TLTIssue record : records) {
				if(i>0){
					sb.append(",");
				}
				i++;
				
			
				sb.append("(");
			
				if(record.getIssueId()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getIssueId()+"'");
				}
			
				sb.append(",");
			
				if(record.getLtype()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getLtype()+"'");
				}
			
				sb.append(",");
			
				if(record.getIssueNo()==null){
						sb.append("'"+""+"'");						
				}else{
					sb.append("'"+record.getIssueNo()+"'");
				}
			
				sb.append(",");
			
				if(record.getLotteryNo()==null){
						sb.append("'"+""+"'");						
				}else{
					sb.append("'"+record.getLotteryNo()+"'");
				}
			
				sb.append(",");
			
				if(record.getIssueDate()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getIssueDate()+"'");
				}
			
				sb.append(",");
			
				if(record.getPreStime()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getPreStime()+"'");
				}
			
				sb.append(",");
			
				if(record.getPreEtime()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getPreEtime()+"'");
				}
			
				sb.append(",");
			
				if(record.getSaleStime()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getSaleStime()+"'");
				}
			
				sb.append(",");
			
				if(record.getSaleEtime()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getSaleEtime()+"'");
				}
			
				sb.append(",");
			
				if(record.getRealStime()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getRealStime()+"'");
				}
			
				sb.append(",");
			
				if(record.getRealEtime()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getRealEtime()+"'");
				}
			
				sb.append(",");
			
				if(record.getCancelLtime()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getCancelLtime()+"'");
				}
			
				sb.append(",");
			
				if(record.getCloseshareDate()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getCloseshareDate()+"'");
				}
			
				sb.append(",");
			
				if(record.getRebateStatus()==null){
						sb.append("'"+"0"+"'");						
				}else{
					sb.append("'"+record.getRebateStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getWinStatus()==null){
						sb.append("'"+"0"+"'");						
				}else{
					sb.append("'"+record.getWinStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getSendStatus()==null){
						sb.append("'"+"0"+"'");						
				}else{
					sb.append("'"+record.getSendStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getAutobetStatus()==null){
						sb.append("'"+"0"+"'");						
				}else{
					sb.append("'"+record.getAutobetStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getLockStatus()==null){
						sb.append("'"+"0"+"'");						
				}else{
					sb.append("'"+record.getLockStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getProcessStatus()==null){
						sb.append("'"+"0"+"'");						
				}else{
					sb.append("'"+record.getProcessStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getCreateTime()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getCreateTime()+"'");
				}
			
				sb.append(",");
			
				if(record.getModifyTime()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getModifyTime()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
						sb.append("'"+"1"+"'");						
				}else{
					sb.append("'"+record.getStatus()+"'");
				}
							sb.append(")");
			
			}
			result=st.executeUpdate(sb.toString());
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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