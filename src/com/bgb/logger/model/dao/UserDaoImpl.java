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
		Map<String,Object> userMap = sqlSession.selectOne("com.bgb.logger.model.dao.UserDaoImpl.queryUserByCondition2",params);
		
		System.out.println(userMap);
	}
	

	@Test
	public void queryUserByCondition3() throws Exception
	{
		Map<String, Object> params= new HashMap<>();
		params.put("username", "1001");
		params.put("password", "123456");
		params.put("isLock", 1);
		Map<String,Object> userMap = sqlSession.selectOne("com.bgb.logger.model.dao.UserDaoImpl.queryUserByCondition3",params);
		
		System.out.println(userMap);
	}

	
	@Test
	public void queryUserByLike() throws Exception
	{
		Map<String, Object> params= new HashMap<>();
		params.put("username", "10");
		List<Map<String,Object>> userListMap = sqlSession.selectList("com.bgb.logger.model.dao.UserDaoImpl.queryUserByLike",params);
		
		for (Map<String, Object> map : userListMap)
		{
			System.out.println(map);
		}
	}
	

	@Test
	public void queryUserByLike2() throws Exception
	{
		Map<String, Object> params= new HashMap<>();
		params.put("username", "10");
		List<Map<String,Object>> userListMap = sqlSession.selectList("com.bgb.logger.model.dao.UserDaoImpl.queryUserByLike2",params);
		
		for (Map<String, Object> map : userListMap)
		{
			System.out.println(map);
		}
	}
	

	@Test
	public void queryDynamic1() throws Exception
	{
		Map<String, Object> params= new HashMap<>();
		/*params.put("username", "10");
		params.put("password", "123456");
		params.put("fullname", "张");*/
		List<Map<String,Object>> userListMap = sqlSession.selectList("com.bgb.logger.model.dao.UserDaoImpl.queryDynamic1",params);
		
		for (Map<String, Object> map : userListMap)
		{
			System.out.println(map);
		}
	}
	

	@Test
	public void queryDynamic2() throws Exception
	{
		Map<String, Object> params= new HashMap<>();
		/*params.put("username", "10");*/
		params.put("password", "123456");
		params.put("fullname", "张");
		List<Map<String,Object>> userListMap = sqlSession.selectList("com.bgb.logger.model.dao.UserDaoImpl.queryDynamic2",params);
		
		for (Map<String, Object> map : userListMap)
		{
			System.out.println(map);
		}
	}
	
	
	@Test
	public void queryDynamic3() throws Exception
	{
		Map<String, Object> params= new HashMap<>();
		/*params.put("username", "10");
		params.put("password", "123456");
		params.put("fullname", "张");*/
		List<Map<String,Object>> userListMap = sqlSession.selectList("com.bgb.logger.model.dao.UserDaoImpl.queryDynamic3",params);
		
		for (Map<String, Object> map : userListMap)
		{
			System.out.println(map);
		}
	}

	@Test
	public void queryUserByChoose() throws Exception
	{
		Map<String, Object> params= new HashMap<>();
		params.put("type", 3);
		params.put("username", "10");
		List<Map<String,Object>> userListMap = sqlSession.selectList("com.bgb.logger.model.dao.UserDaoImpl.queryUserByChoose",params);
		
		for (Map<String, Object> map : userListMap)
		{
			System.out.println(map);
		}
	}
	
	@Test
	public void updateUserById() throws Exception
	{
		Map<String, Object> params= new HashMap<>();
		//params.put("id", "000000000000000000000000000000000000");
		//params.put("password", "333444");
		//params.put("fullname", "666666");
		int flag = sqlSession.update("com.bgb.logger.model.dao.UserDaoImpl.updateUserById", params);
		sqlSession.commit();
		System.out.println(flag);
	}
	

	@Test
	public void updateUserByUNP() throws Exception
	{
		Map<String, Object> params= new HashMap<>();
		/*params.put("username", "root");
		params.put("password", "333444");
		params.put("email", "991724847@qq.com");*/
		int flag = sqlSession.update("com.bgb.logger.model.dao.UserDaoImpl.updateUserByUNP", params);
		sqlSession.commit();
		System.out.println(flag);
	}
	

	@Test
	public void one2one() throws Exception
	{
		Map<String, Object> params= new HashMap<>();
		params.put("id", "4b3daafd-8e6b-4ca9-bed1-6828e66a6d5b");
		List<User> userList = sqlSession.selectList("com.bgb.logger.model.dao.UserDaoImpl.one2one",params);
		
		for (User user : userList)
		{
			System.out.println(user);
		}
	}
	
	
}
