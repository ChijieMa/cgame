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

import onight.tfg.ordbgens.tfc.entity.TFCChannelProduct;
import onight.tfg.ordbgens.tfc.entity.TFCChannelProductExample;
import onight.tfg.ordbgens.tfc.entity.TFCChannelProductExample.Criteria;
import onight.tfg.ordbgens.tfc.entity.TFCChannelProductKey;
import onight.tfg.ordbgens.tfc.mapper.TFCChannelProductMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;


@Data
@Tab(name="TFC_CHANNEL_PRODUCT")
public class TFCChannelProductDao extends ExtendDaoSupper<TFCChannelProduct, TFCChannelProductExample, TFCChannelProductKey>{

	private TFCChannelProductMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(TFCChannelProductExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TFCChannelProductExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(TFCChannelProductKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(TFCChannelProduct record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TFCChannelProduct record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<TFCChannelProduct> records) throws Exception
			 {
		for(TFCChannelProduct record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<TFCChannelProduct> records) throws Exception
			 {
		for(TFCChannelProduct record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<TFCChannelProduct> selectByExample(TFCChannelProductExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public TFCChannelProduct selectByPrimaryKey(TFCChannelProductKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<TFCChannelProduct> findAll(List<TFCChannelProduct> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new TFCChannelProductExample());
		}
		List<TFCChannelProduct> list = new ArrayList();
		for(TFCChannelProduct record : records){
			TFCChannelProduct result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(TFCChannelProduct record, TFCChannelProductExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TFCChannelProduct record, TFCChannelProductExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TFCChannelProduct record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TFCChannelProduct record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(TFCChannelProductExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new TFCChannelProductExample());
	}

	@Override
	public TFCChannelProductExample getExample(TFCChannelProduct record) {
		TFCChannelProductExample example = new TFCChannelProductExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getRowId()!=null){
				criteria.andRowIdEqualTo(record.getRowId());
				}
				if(record.getGameId()!=null){
				criteria.andGameIdEqualTo(record.getGameId());
				}
				if(record.getChannelId()!=null){
				criteria.andChannelIdEqualTo(record.getChannelId());
				}
				if(record.getProductId()!=null){
				criteria.andProductIdEqualTo(record.getProductId());
				}
				if(record.getNote()!=null){
				criteria.andNoteEqualTo(record.getNote());
				}
				if(record.getAuthor()!=null){
				criteria.andAuthorEqualTo(record.getAuthor());
				}
				if(record.getRectime()!=null){
				criteria.andRectimeEqualTo(record.getRectime());
				}

		}
		return example;
	}
	
	public TFCChannelProduct selectOneByExample(TFCChannelProductExample example)
			 {
		example.setLimit(1);
		List<TFCChannelProduct> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<TFCChannelProduct> records) throws Exception {
		if(records.size()<=0)return 0;
		SqlSession session=sqlSessionFactory.openSession();
		Connection conn = session.getConnection();
		Statement st = null;
		int result=0;
		try {
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			StringBuffer sb=new StringBuffer();
			sb.append("INSERT INTO TFC_CHANNEL_PRODUCT(ROW_ID,GAME_ID,CHANNEL_ID,PRODUCT_ID,NOTE,AUTHOR,RECTIME) values");
			int i=0;
			for (TFCChannelProduct record : records) {
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
			
				if(record.getGameId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getGameId()+"'");
				}
			
				sb.append(",");
			
				if(record.getChannelId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getChannelId()+"'");
				}
			
				sb.append(",");
			
				if(record.getProductId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getProductId()+"'");
				}
			
				sb.append(",");
			
				if(record.getNote()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getNote()+"'");
				}
			
				sb.append(",");
			
				if(record.getAuthor()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getAuthor()+"'");
				}
			
				sb.append(",");
			
				if(record.getRectime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getRectime())+"'");
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
