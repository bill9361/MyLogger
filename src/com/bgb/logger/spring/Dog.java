package com.bgb.logger.spring;

public class Dog
{
	private String name;
	private Integer age; 

	public Dog()
	{
		System.out.println("Dog....无参构造器");
	}
	
	public void run()
	{
		System.out.println("Dog....正在跑");
	}
	
	public void init()
	{
		System.out.println("Dog....初始化");
	}
	
	public void destroy()
	{
		System.out.println("Dog....销毁");
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
		return "Dog [name=" + name + ", age=" + age + "]";
	}

}
