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

import onight.tfg.ordbgens.tlt.entity.TLTLtype;
import onight.tfg.ordbgens.tlt.entity.TLTLtypeExample;
import onight.tfg.ordbgens.tlt.entity.TLTLtypeExample.Criteria;
import onight.tfg.ordbgens.tlt.entity.TLTLtypeKey;
import onight.tfg.ordbgens.tlt.mapper.TLTLtypeMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;


@Data
@Tab(name="TLT_LTYPE")
public class TLTLtypeDao extends ExtendDaoSupper<TLTLtype, TLTLtypeExample, TLTLtypeKey>{

	private TLTLtypeMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(TLTLtypeExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TLTLtypeExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(TLTLtypeKey key) {
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(TLTLtype record)  {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TLTLtype record)  {
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<TLTLtype> records)
			 {
		for(TLTLtype record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<TLTLtype> records)
			 {
		for(TLTLtype record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<TLTLtype> selectByExample(TLTLtypeExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public TLTLtype selectByPrimaryKey(TLTLtypeKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<TLTLtype> findAll(List<TLTLtype> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new TLTLtypeExample());
		}
		List<TLTLtype> list = new ArrayList();
		for(TLTLtype record : records){
			TLTLtype result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(TLTLtype record, TLTLtypeExample example)  {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TLTLtype record, TLTLtypeExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TLTLtype record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TLTLtype record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(TLTLtypeExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  {
		mapper.deleteByExample(new TLTLtypeExample());
	}

	@Override
	public TLTLtypeExample getExample(TLTLtype record) {
		TLTLtypeExample example = new TLTLtypeExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getLtype()!=null){
				criteria.andLtypeEqualTo(record.getLtype());
				}
				if(record.getGroupType()!=null){
				criteria.andGroupTypeEqualTo(record.getGroupType());
				}
				if(record.getCnName()!=null){
				criteria.andCnNameEqualTo(record.getCnName());
				}
				if(record.getEnName()!=null){
				criteria.andEnNameEqualTo(record.getEnName());
				}
				if(record.getCodeList()!=null){
				criteria.andCodeListEqualTo(record.getCodeList());
				}
				if(record.getCodeLen()!=null){
				criteria.andCodeLenEqualTo(record.getCodeLen());
				}
				if(record.getSort()!=null){
				criteria.andSortEqualTo(record.getSort());
				}
				if(record.getEnable()!=null){
				criteria.andEnableEqualTo(record.getEnable());
				}
				if(record.getRemark()!=null){
				criteria.andRemarkEqualTo(record.getRemark());
				}
				if(record.getDelayTime()!=null){
				criteria.andDelayTimeEqualTo(record.getDelayTime());
				}
				if(record.getCatchCodeCount()!=null){
				criteria.andCatchCodeCountEqualTo(record.getCatchCodeCount());
				}
				if(record.getCatchCodeInterval()!=null){
				criteria.andCatchCodeIntervalEqualTo(record.getCatchCodeInterval());
				}
				if(record.getMinLeft()!=null){
				criteria.andMinLeftEqualTo(record.getMinLeft());
				}
				if(record.getMinSpread()!=null){
				criteria.andMinSpreadEqualTo(record.getMinSpread());
				}
				if(record.getIssueNoFmt()!=null){
				criteria.andIssueNoFmtEqualTo(record.getIssueNoFmt());
				}
				if(record.getClearYmd()!=null){
				criteria.andClearYmdEqualTo(record.getClearYmd());
				}
				if(record.getLotteryCycle()!=null){
				criteria.andLotteryCycleEqualTo(record.getLotteryCycle());
				}
				if(record.getCloseStime()!=null){
				criteria.andCloseStimeEqualTo(record.getCloseStime());
				}
				if(record.getCloseEtime()!=null){
				criteria.andCloseEtimeEqualTo(record.getCloseEtime());
				}
				if(record.getRebate()!=null){
				criteria.andRebateEqualTo(record.getRebate());
				}
				if(record.getDeloRebate()!=null){
				criteria.andDeloRebateEqualTo(record.getDeloRebate());
				}

		}
		return example;
	}
	
	public TLTLtype selectOneByExample(TLTLtypeExample example)
			 {
		example.setLimit(1);
		List<TLTLtype> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<TLTLtype> records) {
		SqlSession session=sqlSessionFactory.openSession();
		Connection conn = session.getConnection();
		Statement st = null;
		int result=0;
		try {
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			StringBuffer sb=new StringBuffer();
			sb.append("INSERT INTO TLT_LTYPE() values");
			int i=0;
			for (TLTLtype record : records) {
				if(i>0){
					sb.append(",");
				}
				i++;
				
			
				sb.append("(");
			
				if(record.getLtype()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getLtype()+"'");
				}
			
				sb.append(",");
			
				if(record.getGroupType()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getGroupType()+"'");
				}
			
				sb.append(",");
			
				if(record.getCnName()==null){
						sb.append("'"+""+"'");						
				}else{
					sb.append("'"+record.getCnName()+"'");
				}
			
				sb.append(",");
			
				if(record.getEnName()==null){
						sb.append("'"+""+"'");						
				}else{
					sb.append("'"+record.getEnName()+"'");
				}
			
				sb.append(",");
			
				if(record.getCodeList()==null){
						sb.append("'"+"0,1,2,3,4,5,6,7,8,9"+"'");						
				}else{
					sb.append("'"+record.getCodeList()+"'");
				}
			
				sb.append(",");
			
				if(record.getCodeLen()==null){
						sb.append("'"+"0"+"'");						
				}else{
					sb.append("'"+record.getCodeLen()+"'");
				}
			
				sb.append(",");
			
				if(record.getSort()==null){
						sb.append("'"+"0"+"'");						
				}else{
					sb.append("'"+record.getSort()+"'");
				}
			
				sb.append(",");
			
				if(record.getEnable()==null){
						sb.append("'"+"0"+"'");						
				}else{
					sb.append("'"+record.getEnable()+"'");
				}
			
				sb.append(",");
			
				if(record.getRemark()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getRemark()+"'");
				}
			
				sb.append(",");
			
				if(record.getDelayTime()==null){
						sb.append("'"+"0"+"'");						
				}else{
					sb.append("'"+record.getDelayTime()+"'");
				}
			
				sb.append(",");
			
				if(record.getCatchCodeCount()==null){
						sb.append("'"+"0"+"'");						
				}else{
					sb.append("'"+record.getCatchCodeCount()+"'");
				}
			
				sb.append(",");
			
				if(record.getCatchCodeInterval()==null){
						sb.append("'"+"0"+"'");						
				}else{
					sb.append("'"+record.getCatchCodeInterval()+"'");
				}
			
				sb.append(",");
			
				if(record.getMinLeft()==null){
						sb.append("'"+"0.000"+"'");						
				}else{
					sb.append("'"+record.getMinLeft()+"'");
				}
			
				sb.append(",");
			
				if(record.getMinSpread()==null){
						sb.append("'"+"0.000"+"'");						
				}else{
					sb.append("'"+record.getMinSpread()+"'");
				}
			
				sb.append(",");
			
				if(record.getIssueNoFmt()==null){
						sb.append("'"+"yyyymmdd-nnn"+"'");						
				}else{
					sb.append("'"+record.getIssueNoFmt()+"'");
				}
			
				sb.append(",");
			
				if(record.getClearYmd()==null){
						sb.append("'"+"Y,M,D"+"'");						
				}else{
					sb.append("'"+record.getClearYmd()+"'");
				}
			
				sb.append(",");
			
				if(record.getLotteryCycle()==null){
						sb.append("'"+"1,2,3,4,5,6,7"+"'");						
				}else{
					sb.append("'"+record.getLotteryCycle()+"'");
				}
			
				sb.append(",");
			
				if(record.getCloseStime()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getCloseStime()+"'");
				}
			
				sb.append(",");
			
				if(record.getCloseEtime()==null){
						sb.append("null");
				}else{
					sb.append("'"+record.getCloseEtime()+"'");
				}
			
				sb.append(",");
			
				if(record.getRebate()==null){
						sb.append("'"+"0.0"+"'");						
				}else{
					sb.append("'"+record.getRebate()+"'");
				}
			
				sb.append(",");
			
				if(record.getDeloRebate()==null){
						sb.append("'"+"0.0"+"'");						
				}else{
					sb.append("'"+record.getDeloRebate()+"'");
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