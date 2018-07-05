package com.bgb.logger.spring.aop;

/**
 * 作者Email:fengminbiao@126.com<br/>
 * 创建时间：2018年7月5日下午2:07:32<br/>
 * 类说明：验证类，判断用户名和密码是否正确(username=admin,password=123456)
 */
public class Auth
{
	private String username = "admin";
	private String password = "123";
	
	public Auth()
	{
		System.out.println("Auth....无参构造器");
	}
	
	/**
	 * 判断用户是否存在
	 * @return
	 */
	public void isUserExist()
	{
		if ("admin".equals(username) && "123456".equals(password))
		{
			//放行
			System.out.println("亲，登录成功");
		}
		else
		{
			System.out.println("亲，登录失败");
		}
	}
	

}
