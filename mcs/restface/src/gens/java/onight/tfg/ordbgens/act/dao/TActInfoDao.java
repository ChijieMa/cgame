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

import onight.tfg.ordbgens.act.entity.TActInfo;
import onight.tfg.ordbgens.act.entity.TActInfoExample;
import onight.tfg.ordbgens.act.entity.TActInfoExample.Criteria;
import onight.tfg.ordbgens.act.entity.TActInfoKey;
import onight.tfg.ordbgens.act.mapper.TActInfoMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;


@Data
@Tab(name="T_ACT_INFO")
public class TActInfoDao extends ExtendDaoSupper<TActInfo, TActInfoExample, TActInfoKey>{

	private TActInfoMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(TActInfoExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TActInfoExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(TActInfoKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(TActInfo record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TActInfo record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<TActInfo> records) throws Exception
			 {
		for(TActInfo record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<TActInfo> records) throws Exception
			 {
		for(TActInfo record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<TActInfo> selectByExample(TActInfoExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public TActInfo selectByPrimaryKey(TActInfoKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<TActInfo> findAll(List<TActInfo> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new TActInfoExample());
		}
		List<TActInfo> list = new ArrayList();
		for(TActInfo record : records){
			TActInfo result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(TActInfo record, TActInfoExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TActInfo record, TActInfoExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TActInfo record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TActInfo record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(TActInfoExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new TActInfoExample());
	}

	@Override
	public TActInfoExample getExample(TActInfo record) {
		TActInfoExample example = new TActInfoExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getActNo()!=null){
				criteria.andActNoEqualTo(record.getActNo());
				}
				if(record.getActName()!=null){
				criteria.andActNameEqualTo(record.getActName());
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
				if(record.getChannelId()!=null){
				criteria.andChannelIdEqualTo(record.getChannelId());
				}
				if(record.getCatalog()!=null){
				criteria.andCatalogEqualTo(record.getCatalog());
				}
				if(record.getActYinitBal()!=null){
				criteria.andActYinitBalEqualTo(record.getActYinitBal());
				}
				if(record.getActDinitBal()!=null){
				criteria.andActDinitBalEqualTo(record.getActDinitBal());
				}
				if(record.getActCurBal()!=null){
				criteria.andActCurBalEqualTo(record.getActCurBal());
				}
				if(record.getActStat()!=null){
				criteria.andActStatEqualTo(record.getActStat());
				}
				if(record.getActMaxodAmt()!=null){
				criteria.andActMaxodAmtEqualTo(record.getActMaxodAmt());
				}
				if(record.getActCtrlBal()!=null){
				criteria.andActCtrlBalEqualTo(record.getActCtrlBal());
				}
				if(record.getActBalWarnFlag()!=null){
				criteria.andActBalWarnFlagEqualTo(record.getActBalWarnFlag());
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
				if(record.getMemo()!=null){
				criteria.andMemoEqualTo(record.getMemo());
				}

		}
		return example;
	}
	
	public TActInfo selectOneByExample(TActInfoExample example)
			 {
		example.setLimit(1);
		List<TActInfo> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<TActInfo> records) throws Exception {
		if(records.size()<=0)return 0;
		SqlSession session=sqlSessionFactory.openSession();
		Connection conn = session.getConnection();
		Statement st = null;
		int result=0;
		try {
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			StringBuffer sb=new StringBuffer();
			sb.append("INSERT INTO T_ACT_INFO(ACT_NO,ACT_NAME,CUST_ID,MCHNT_ID,ACT_TYPE,MNY_SMB,CHANNEL_ID,CATALOG,ACT_YINIT_BAL,ACT_DINIT_BAL,ACT_CUR_BAL,ACT_STAT,ACT_MAXOD_AMT,ACT_CTRL_BAL,ACT_BAL_WARN_FLAG,CREATE_TIME,UPDATE_TIME,MODIFY_ID,MEMO) values");
			int i=0;
			for (TActInfo record : records) {
				if(i>0){
					sb.append(",");
				}
				i++;
				
			
				sb.append("(");
			
				if(record.getActNo()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getActNo()+"'");
				}
			
				sb.append(",");
			
				if(record.getActName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getActName()+"'");
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
			
				if(record.getChannelId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChannelId()+"'");
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
			
				if(record.getActYinitBal()==null){
//						sb.append("'"+"0.00000000"+"'");
						sb.append("'"+"0.00000000"+"'");
						
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getActYinitBal()+"'");
				}
			
				sb.append(",");
			
				if(record.getActDinitBal()==null){
//						sb.append("'"+"0.00000000"+"'");
						sb.append("'"+"0.00000000"+"'");
						
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getActDinitBal()+"'");
				}
			
				sb.append(",");
			
				if(record.getActCurBal()==null){
//						sb.append("'"+"0.00000000"+"'");
						sb.append("'"+"0.00000000"+"'");
						
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getActCurBal()+"'");
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
			
				if(record.getActMaxodAmt()==null){
//						sb.append("'"+"0.00000000"+"'");
						sb.append("'"+"0.00000000"+"'");
						
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getActMaxodAmt()+"'");
				}
			
				sb.append(",");
			
				if(record.getActCtrlBal()==null){
//						sb.append("'"+"0.00000000"+"'");
						sb.append("'"+"0.00000000"+"'");
						
				}else{
				// java type==BigDecimal
						sb.append("'"+record.getActCtrlBal()+"'");
				}
			
				sb.append(",");
			
				if(record.getActBalWarnFlag()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getActBalWarnFlag()+"'");
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
			
				sb.append(",");
			
				if(record.getMemo()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getMemo()+"'");
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
