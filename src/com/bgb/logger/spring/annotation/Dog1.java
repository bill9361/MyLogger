package com.bgb.logger.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dog1")
public class Dog1
{
	//@Resource(name="cat1")
	@Autowired
	private Cat1 cat1;

	public Dog1()
	{
		System.out.println("Dog1....无参构造器");
	}

	public void behavior()
	{
		System.out.println("Dog....behavior()");
		System.out.println("Dog....cat1:"+cat1);
	}
}
