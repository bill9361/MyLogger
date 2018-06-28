package com.bgb.logger.model.dao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

/**
 * 地址Dao实现类
 * @author fengm
 *
 */
public class AddressDaoImpl 
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
	public void addAddress() throws Exception
	{
		Map<String, Object> params = new HashMap<>();
		params.put("id", "d1fb442c-48d2-4660-8b96-b4dc8fcd0793");
		params.put("name", "番禺区");
		params.put("type", "county");
		params.put("leaf", 1);
		params.put("parent_id", "89379c17-8382-494d-8db1-ee0f3558db5b");
		params.put("path", "0.5a4b3d60-8d9e-4a3d-ad6b-aa70e6507ba9.9e207ec5-8d4d-4f2e-905a-890389d8daf8.89379c17-8382-494d-8db1-ee0f3558db5b.d1fb442c-48d2-4660-8b96-b4dc8fcd0793.");
		int flag = sqlSession.insert("com.bgb.logger.model.dao.AddressDaoImpl.addAddress", params);
		//提交事务
		sqlSession.commit();
		System.out.println("flag:"+flag);
	}
}
