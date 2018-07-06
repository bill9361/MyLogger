package com.bgb.logger.spring.mvc.dao;

import org.springframework.stereotype.Repository;

//@Component("frontDaoImpl")
//表示dao层
@Repository
public class FrontDaoImpl
{

	public FrontDaoImpl()
	{
		System.out.println("FrontDaoImpl....无参构造器");
	}
	
	public void addFront()
	{
		System.out.println("FrontDaoImpl....添加Front成功");
	}

}
