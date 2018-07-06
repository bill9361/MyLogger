package com.bgb.logger.spring.annotation;

import org.springframework.stereotype.Component;

@Component("cat1")
public class Cat1
{
	private String name = "大肥猫";
	private Integer age = 20;

	public Cat1()
	{
		System.out.println("Cat1....无参构造器");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Cat1 [name=" + name + ", age=" + age + "]";
	}
	
}
