package com.bgb.logger.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 作者Email:fengminbiao@126.com<br/>
 * 创建时间：2018年7月5日下午2:07:32<br/>
 * 类说明：验证类，判断用户名和密码是否正确(username=admin,password=123456)
 */
public class Auth
{
	private String username = "admin";
	private String password = "123456";
	
	public Auth()
	{
		System.out.println("Auth....无参构造器");
	}
	
	/**
	 * 判断用户是否存在
	 * @return
	 * @param pjp 是由框架传过来的，
	 * @throws Throwable 
	 */
	public void isUserExist(ProceedingJoinPoint pjp) throws Throwable
	{
		if ("admin".equals(username) && "123456".equals(password))
		{
			System.out.println("亲，登录成功");
			//放行(执行目标方法，然后往下继续执行)
			//通过反射执行切入点的方法
			pjp.proceed();
		}
		else
		{
			System.out.println("亲，登录失败");
			//没有pjp.proceed();不会执行目标方法
		}
	}
	

}
