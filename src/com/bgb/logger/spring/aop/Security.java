package com.bgb.logger.spring.aop;

/**
 * 环境检测--->银行业务--->日志记录--->清空缓存
 * 作者Email:fengminbiao@126.com
 * 创建时间：2018年7月5日上午10:24:25
 * 类说明：环境检测（切面）前置通知
 */
public class Security
{

	public Security()
	{
		System.out.println("Security....无参构造器");
	}
	
	public void isSecurity()
	{
		System.out.println("Security....isSecurity()....环境安全");
	}

}
