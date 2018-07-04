package com.bgb.logger.spring;

public class Cat
{
	private String name;
	private Integer age; 
	private Float weight;
	
	

	public Cat(String name, Integer age, Float weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;

		System.out.println("Cat....有参构造器");
	}

	public Cat()
	{
		System.out.println("Cat....无参构造器");
	}
	
	public void run()
	{
		System.out.println("Cat....正在跑");
	}
	
	public void init()
	{
		System.out.println("Cat....初始化");
	}
	
	public void destroy()
	{
		System.out.println("Cat....销毁");
	}

	public String getName()
	{
		System.out.println("Cat....getName()");
		return name;
	}

	public void setName(String name)
	{
		System.out.println("Cat....setName()");
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

	
	public Float getWeight()
	{
		return weight;
	}

	public void setWeight(Float weight)
	{
		this.weight = weight;
	}

	@Override
	public String toString()
	{
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}


}
