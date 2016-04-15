package onight.tfg.ordbgens.tfg.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.transaction.annotation.Transactional;

import onight.tfg.ordbgens.tfg.entity.TFGUserInfo;
import onight.tfg.ordbgens.tfg.entity.TFGUserInfoExample;
import onight.tfg.ordbgens.tfg.entity.TFGUserInfoExample.Criteria;
import onight.tfg.ordbgens.tfg.entity.TFGUserInfoKey;
import onight.tfg.ordbgens.tfg.mapper.TFGUserInfoMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;


@Data
@Tab(name="TFG_USER_INFO")
public class TFGUserInfoDao extends ExtendDaoSupper<TFGUserInfo, TFGUserInfoExample, TFGUserInfoKey>{

	private TFGUserInfoMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(TFGUserInfoExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TFGUserInfoExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(TFGUserInfoKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(TFGUserInfo record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TFGUserInfo record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<TFGUserInfo> records) throws Exception
			 {
		for(TFGUserInfo record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<TFGUserInfo> records) throws Exception
			 {
		for(TFGUserInfo record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<TFGUserInfo> selectByExample(TFGUserInfoExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public TFGUserInfo selectByPrimaryKey(TFGUserInfoKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<TFGUserInfo> findAll(List<TFGUserInfo> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new TFGUserInfoExample());
		}
		List<TFGUserInfo> list = new ArrayList();
		for(TFGUserInfo record : records){
			TFGUserInfo result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(TFGUserInfo record, TFGUserInfoExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TFGUserInfo record, TFGUserInfoExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TFGUserInfo record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TFGUserInfo record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(TFGUserInfoExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new TFGUserInfoExample());
	}

	@Override
	public TFGUserInfoExample getExample(TFGUserInfo record) {
		TFGUserInfoExample example = new TFGUserInfoExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getNickname()!=null){
				criteria.andNicknameEqualTo(record.getNickname());
				}
				if(record.getParentId()!=null){
				criteria.andParentIdEqualTo(record.getParentId());
				}
				if(record.getRecommendId()!=null){
				criteria.andRecommendIdEqualTo(record.getRecommendId());
				}
				if(record.getUserType()!=null){
				criteria.andUserTypeEqualTo(record.getUserType());
				}
				if(record.getSecurityEmail()!=null){
				criteria.andSecurityEmailEqualTo(record.getSecurityEmail());
				}
				if(record.getRealName()!=null){
				criteria.andRealNameEqualTo(record.getRealName());
				}
				if(record.getStatus()!=null){
				criteria.andStatusEqualTo(record.getStatus());
				}
				if(record.getIdNo()!=null){
				criteria.andIdNoEqualTo(record.getIdNo());
				}
				if(record.getUpdateTime()!=null){
				criteria.andUpdateTimeEqualTo(record.getUpdateTime());
				}
				if(record.getCreateTime()!=null){
				criteria.andCreateTimeEqualTo(record.getCreateTime());
				}
				if(record.getQqId()!=null){
				criteria.andQqIdEqualTo(record.getQqId());
				}
				if(record.getWechatId()!=null){
				criteria.andWechatIdEqualTo(record.getWechatId());
				}
				if(record.getMobile()!=null){
				criteria.andMobileEqualTo(record.getMobile());
				}
				if(record.getEmail()!=null){
				criteria.andEmailEqualTo(record.getEmail());
				}
				if(record.getRenren()!=null){
				criteria.andRenrenEqualTo(record.getRenren());
				}
				if(record.getWeibo()!=null){
				criteria.andWeiboEqualTo(record.getWeibo());
				}
				if(record.getFace()!=null){
				criteria.andFaceEqualTo(record.getFace());
				}
				if(record.getFaceUrl()!=null){
				criteria.andFaceUrlEqualTo(record.getFaceUrl());
				}
				if(record.getGender()!=null){
				criteria.andGenderEqualTo(record.getGender());
				}
				if(record.getBirthday()!=null){
				criteria.andBirthdayEqualTo(record.getBirthday());
				}
				if(record.getCountry()!=null){
				criteria.andCountryEqualTo(record.getCountry());
				}
				if(record.getProvince()!=null){
				criteria.andProvinceEqualTo(record.getProvince());
				}
				if(record.getCity()!=null){
				criteria.andCityEqualTo(record.getCity());
				}
				if(record.getHomeAddress()!=null){
				criteria.andHomeAddressEqualTo(record.getHomeAddress());
				}
				if(record.getWorkAddress()!=null){
				criteria.andWorkAddressEqualTo(record.getWorkAddress());
				}
				if(record.getMobile1()!=null){
				criteria.andMobile1EqualTo(record.getMobile1());
				}
				if(record.getMobile2()!=null){
				criteria.andMobile2EqualTo(record.getMobile2());
				}
				if(record.getMobile3()!=null){
				criteria.andMobile3EqualTo(record.getMobile3());
				}
				if(record.getMobilehis()!=null){
				criteria.andMobilehisEqualTo(record.getMobilehis());
				}
				if(record.getRemark()!=null){
				criteria.andRemarkEqualTo(record.getRemark());
				}
				if(record.getRegTime()!=null){
				criteria.andRegTimeEqualTo(record.getRegTime());
				}
				if(record.getRegIp()!=null){
				criteria.andRegIpEqualTo(record.getRegIp());
				}

		}
		return example;
	}
	
	public TFGUserInfo selectOneByExample(TFGUserInfoExample example)
			 {
		example.setLimit(1);
		List<TFGUserInfo> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<TFGUserInfo> records) throws Exception {
		if(records.size()<=0)return 0;
		SqlSession session=sqlSessionFactory.openSession();
		Connection conn = session.getConnection();
		Statement st = null;
		int result=0;
		try {
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			StringBuffer sb=new StringBuffer();
			sb.append("INSERT INTO TFG_USER_INFO(USER_ID,NICKNAME,PARENT_ID,RECOMMEND_ID,USER_TYPE,SECURITY_EMAIL,REAL_NAME,STATUS,ID_NO,UPDATE_TIME,CREATE_TIME,QQ_ID,WECHAT_ID,MOBILE,EMAIL,RENREN,WEIBO,FACE,FACE_URL,GENDER,BIRTHDAY,COUNTRY,PROVINCE,CITY,HOME_ADDRESS,WORK_ADDRESS,MOBILE1,MOBILE2,MOBILE3,MOBILEHIS,REMARK,REG_TIME,REG_IP) values");
			int i=0;
			for (TFGUserInfo record : records) {
				if(i>0){
					sb.append(",");
				}
				i++;
				
			
				sb.append("(");
			
				if(record.getUserId()==null){
						sb.append("null");
				}else{
				// java type==Long
						sb.append("'"+record.getUserId()+"'");
				}
			
				sb.append(",");
			
				if(record.getNickname()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getNickname()+"'");
				}
			
				sb.append(",");
			
				if(record.getParentId()==null){
						sb.append("null");
				}else{
				// java type==Long
						sb.append("'"+record.getParentId()+"'");
				}
			
				sb.append(",");
			
				if(record.getRecommendId()==null){
						sb.append("null");
				}else{
				// java type==Long
						sb.append("'"+record.getRecommendId()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserType()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getUserType()+"'");
				}
			
				sb.append(",");
			
				if(record.getSecurityEmail()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getSecurityEmail()+"'");
				}
			
				sb.append(",");
			
				if(record.getRealName()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getRealName()+"'");
				}
			
				sb.append(",");
			
				if(record.getStatus()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getIdNo()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getIdNo()+"'");
				}
			
				sb.append(",");
			
				if(record.getUpdateTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getUpdateTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getCreateTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getCreateTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getQqId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getQqId()+"'");
				}
			
				sb.append(",");
			
				if(record.getWechatId()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getWechatId()+"'");
				}
			
				sb.append(",");
			
				if(record.getMobile()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getMobile()+"'");
				}
			
				sb.append(",");
			
				if(record.getEmail()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getEmail()+"'");
				}
			
				sb.append(",");
			
				if(record.getRenren()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getRenren()+"'");
				}
			
				sb.append(",");
			
				if(record.getWeibo()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getWeibo()+"'");
				}
			
				sb.append(",");
			
				if(record.getFace()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getFace()+"'");
				}
			
				sb.append(",");
			
				if(record.getFaceUrl()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getFaceUrl()+"'");
				}
			
				sb.append(",");
			
				if(record.getGender()==null){
						sb.append("null");
				}else{
				// java type==Integer
						sb.append("'"+record.getGender()+"'");
				}
			
				sb.append(",");
			
				if(record.getBirthday()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getBirthday())+"'");
				}
			
				sb.append(",");
			
				if(record.getCountry()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getCountry()+"'");
				}
			
				sb.append(",");
			
				if(record.getProvince()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getProvince()+"'");
				}
			
				sb.append(",");
			
				if(record.getCity()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getCity()+"'");
				}
			
				sb.append(",");
			
				if(record.getHomeAddress()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getHomeAddress()+"'");
				}
			
				sb.append(",");
			
				if(record.getWorkAddress()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getWorkAddress()+"'");
				}
			
				sb.append(",");
			
				if(record.getMobile1()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getMobile1()+"'");
				}
			
				sb.append(",");
			
				if(record.getMobile2()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getMobile2()+"'");
				}
			
				sb.append(",");
			
				if(record.getMobile3()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getMobile3()+"'");
				}
			
				sb.append(",");
			
				if(record.getMobilehis()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getMobilehis()+"'");
				}
			
				sb.append(",");
			
				if(record.getRemark()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getRemark()+"'");
				}
			
				sb.append(",");
			
				if(record.getRegTime()==null){
						sb.append("null");
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getRegTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getRegIp()==null){
						sb.append("null");
				}else{
				// java type==String
						sb.append("'"+record.getRegIp()+"'");
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
