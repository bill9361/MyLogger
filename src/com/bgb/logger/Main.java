package com.bgb.logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bgb.logger.spring.aop.BankServiceImpl;

/**
 * 作者Email:fengminbiao@126.com
 * 创建时间：2018年7月4日上午11:44:39
 * 类说明：主入口
 */
public class Main
{

	public static void main(String[] args)
	{
		//启动框架，appContext代表Spring容器
		ApplicationContext appContext = new ClassPathXmlApplicationContext("conf/applicationContext.xml");
		//获取Spring容器中创建的对象(通过Id)
		/*Cat catA = (Cat) appContext.getBean("cat1");
		Cat catB = (Cat) appContext.getBean("cat1");
		System.out.println(catA == catB);*/
		//关闭appContext容器，并且效果容器中所有对象
		/*((ClassPathXmlApplicationContext)appContext).close();*/
		/*Cat catA = (Cat) appContext.getBean("cat2");
		System.out.println(catA);*/
		
		BankServiceImpl bankServiceImpl = (BankServiceImpl) appContext.getBean("bankServiceImpl");
		//bankServiceImpl.zhuanMoney();
		//bankServiceImpl.getMoney();
		bankServiceImpl.invest();
	}

	
}
