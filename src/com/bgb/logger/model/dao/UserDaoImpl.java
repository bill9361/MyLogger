package com.bgb.logger.model.dao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.bgb.logger.model.pojo.User;

/**
 * 用户Dao实现类
 * @author fengm
 *
 */
public class UserDaoImpl 
{
	private SqlSession sqlSession;
	
	@Before
	public void init() throws Exception
	{
		//启动Mybatis框架
		//Sqlsession-->SqlSessionFactory-->SqlSessionFactoryBuilder
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		//将mybatis.xml文件转化成流
		InputStream ins = Resources.getResourceAsStream("configuration/mybatis.xml");
		SqlSessionFactory ssf = sfb.build(ins);
		sqlSession = ssf.openSession();
	}
	
	@Test
	public void getAllUser() throws Exception
	{
		List<User> userList = sqlSession.selectList("com.bgb.logger.model.dao.UserDaoImpl.getAllUser");
		
		for (User user : userList)
		{
			System.out.println(user);
		}
	}
	

	@Test
	public void getAllUser2() throws Exception
	{
		List<Map<String,Object>> userListMap = sqlSession.selectList("com.bgb.logger.model.dao.UserDaoImpl.getAllUser2");
		
		for (Map<String, Object> map : userListMap)
		{
			System.out.println(map);
		}
	}
	

	@Test
	public void queryUserByCondition() throws Exception
	{
		Map<String, Object> params= new HashMap<>();
		params.put("username", "1001");
		params.put("password", "123456");
		List<Map<String,Object>> userListMap = sqlSession.selectList("com.bgb.logger.model.dao.UserDaoImpl.queryUserByCondition",params);
		
		for (Map<String, Object> map : userListMap)
		{
			System.out.println(map);
		}
	}

	
	@Test
	public void queryUserByCondition2() throws Exception
	{
		Map<String, Object> params= new HashMap<>();
		params.put("username", "1001");
		params.put("password", "123456");
		List<Map<String,Object>> userListMap = sqlSession.selectList("com.bgb.logger.model.dao.UserDaoImpl.queryUserByCondition2",params);
		
		for (Map<String, Object> map : userListMap)
		{
			System.out.println(map);
		}
	}
	
}
