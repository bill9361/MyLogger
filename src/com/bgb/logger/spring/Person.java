package com.bgb.logger.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person
{
	private String name;
	private Cat cat;
	private List<String> listStr;
	private List<Object> listObj;
	private Set<String> set;
	private Map<String, Object> map;
	private Properties props;

	public Person()
	{
		System.out.println("Person....无参构造器");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Cat getCat()
	{
		return cat;
	}

	public void setCat(Cat cat)
	{
		this.cat = cat;
	}

	public List<String> getListStr()
	{
		return listStr;
	}

	public void setListStr(List<String> listStr)
	{
		this.listStr = listStr;
	}

	public Set<String> getSet()
	{
		return set;
	}

	public void setSet(Set<String> set)
	{
		this.set = set;
	}

	public Map<String, Object> getMap()
	{
		return map;
	}

	public void setMap(Map<String, Object> map)
	{
		this.map = map;
	}

	public Properties getProps()
	{
		return props;
	}

	public void setProps(Properties props)
	{
		this.props = props;
	}
	

	public List<Object> getListObj()
	{
		return listObj;
	}

	public void setListObj(List<Object> listObj)
	{
		this.listObj = listObj;
	}

	@Override
	public String toString()
	{
		return "Person [name=" + name + ", cat=" + cat + ", listStr=" + listStr + ", listObj=" + listObj + ", set="
				+ set + ", map=" + map + ", props=" + props + "]";
	}

	
}
