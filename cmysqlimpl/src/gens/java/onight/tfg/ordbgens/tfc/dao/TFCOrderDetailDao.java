package onight.tfg.ordbgens.tfc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.transaction.annotation.Transactional;

import onight.tfg.ordbgens.tfc.entity.TFCOrderDetail;
import onight.tfg.ordbgens.tfc.entity.TFCOrderDetailExample;
import onight.tfg.ordbgens.tfc.entity.TFCOrderDetailExample.Criteria;
import onight.tfg.ordbgens.tfc.entity.TFCOrderDetailKey;
import onight.tfg.ordbgens.tfc.mapper.TFCOrderDetailMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;


@Data
@Tab(name="TFC_ORDER_DETAIL")
public class TFCOrderDetailDao extends ExtendDaoSupper<TFCOrderDetail, TFCOrderDetailExample, TFCOrderDetailKey>{

	private TFCOrderDetailMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(TFCOrderDetailExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TFCOrderDetailExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(TFCOrderDetailKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(TFCOrderDetail record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TFCOrderDetail record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<TFCOrderDetail> records) throws Exception
			 {
		for(TFCOrderDetail record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<TFCOrderDetail> records) throws Exception
			 {
		for(TFCOrderDetail record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<TFCOrderDetail> selectByExample(TFCOrderDetailExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public TFCOrderDetail selectByPrimaryKey(TFCOrderDetailKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<TFCOrderDetail> findAll(List<TFCOrderDetail> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new TFCOrderDetailExample());
		}
		List<TFCOrderDetail> list = new ArrayList();
		for(TFCOrderDetail record : records){
			TFCOrderDetail result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(TFCOrderDetail record, TFCOrderDetailExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TFCOrderDetail record, TFCOrderDetailExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TFCOrderDetail record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TFCOrderDetail record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(TFCOrderDetailExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new TFCOrderDetailExample());
	}

	@Override
	public TFCOrderDetailExample getExample(TFCOrderDetail record) {
		TFCOrderDetailExample example = new TFCOrderDetailExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getRowId()!=null){
				criteria.andRowIdEqualTo(record.getRowId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getHandleTime()!=null){
				criteria.andHandleTimeEqualTo(record.getHandleTime());
				}
				if(record.getHanldeStatus()!=null){
				criteria.andHanldeStatusEqualTo(record.getHanldeStatus());
				}
				if(record.getNumBefore()!=null){
				criteria.andNumBeforeEqualTo(record.getNumBefore());
				}
				if(record.getChangeNum()!=null){
				criteria.andChangeNumEqualTo(record.getChangeNum());
				}
				if(record.getNumAfter()!=null){
				criteria.andNumAfterEqualTo(record.getNumAfter());
				}
				if(record.getNote()!=null){
				criteria.andNoteEqualTo(record.getNote());
				}

		}
		return example;
	}
	
	public TFCOrderDetail selectOneByExample(TFCOrderDetailExample example)
			 {
		example.setLimit(1);
		List<TFCOrderDetail> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<TFCOrderDetail> records) throws Exception {
		if(records.size()<=0)return 0;
		SqlSession session=sqlSessionFactory.openSession();
		Connection conn = session.getConnection();
		Statement st = null;
		int result=0;
		try {
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			StringBuffer sb=new StringBuffer();
			sb.append("INSERT INTO TFC_ORDER_DETAIL(ROW_ID,USER_ID,HANDLE_TIME,HANLDE_STATUS,NUM_BEFORE,CHANGE_NUM,NUM_AFTER,NOTE) values");
			int i=0;
			for (TFCOrderDetail record : records) {
				if(i>0){
					sb.append(",");
				}
				i++;
				
			
				sb.append("(");
			
				if(record.getRowId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getRowId()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserId()==null){
						sb.append("null");
				}else{
				// java type==Long
						sb.append("'"+record.getUserId()+"'");
				}
			
				sb.append(",");
			
				if(record.getHandleTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getHandleTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getHanldeStatus()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getHanldeStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getNumBefore()==null){
						sb.append("null");
				}else{
				// java type==Long
						sb.append("'"+record.getNumBefore()+"'");
				}
			
				sb.append(",");
			
				if(record.getChangeNum()==null){
						sb.append("null");
				}else{
				// java type==Long
						sb.append("'"+record.getChangeNum()+"'");
				}
			
				sb.append(",");
			
				if(record.getNumAfter()==null){
						sb.append("null");
				}else{
				// java type==Long
						sb.append("'"+record.getNumAfter()+"'");
				}
			
				sb.append(",");
			
				if(record.getNote()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getNote()+"'");
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
