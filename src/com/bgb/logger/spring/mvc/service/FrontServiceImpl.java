package com.bgb.logger.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bgb.logger.spring.mvc.dao.FrontDaoImpl;

//@Component("frontServiceImpl")
//业务层
@Service
public class FrontServiceImpl
{
	@Autowired
	private FrontDaoImpl frontDaoImpl;

	public FrontServiceImpl()
	{
		System.out.println("FrontServiceImpl....无参构造器");
	}

	public void addFront()
	{
		frontDaoImpl.addFront();
	}
}
