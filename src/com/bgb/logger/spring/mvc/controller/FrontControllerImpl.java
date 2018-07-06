package com.bgb.logger.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bgb.logger.spring.mvc.service.FrontServiceImpl;

@Component("frontControllerImpl")
public class FrontControllerImpl
{
	//自动捆绑
	@Autowired
	private FrontServiceImpl frontServiceImpl;

	public FrontControllerImpl()
	{
		System.out.println("FrontServiceImpl....无参构造器");
	}
	
	public void addFront()
	{
		frontServiceImpl.addFront();
	}

}
