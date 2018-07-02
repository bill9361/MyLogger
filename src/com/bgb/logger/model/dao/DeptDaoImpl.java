package com.bgb.logger.model.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.bgb.logger.model.pojo.Dept;

/**
 * 作者Email:fengminbiao@126.com
 * 创建时间：2018年7月2日下午2:48:14
 * 类说明：部门Dao实现类
 */
public class DeptDaoImpl 
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
	public void one2Many() throws Exception
	{
		List<Dept> deptList = sqlSession.selectList("com.bgb.logger.model.dao.DeptDaoImpl.one2Many");
		
		for (Dept dept : deptList)
		{
			System.out.println(dept);
		}
	}
	
	
}
