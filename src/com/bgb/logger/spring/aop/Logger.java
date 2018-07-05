package com.bgb.logger.spring.aop;

/**
 * 环境检测--->银行业务--->日志记录--->清空缓存
 * 作者Email:fengminbiao@126.com
 * 创建时间：2018年7月5日上午10:30:56
 * 类说明：日志类（切面）后置通知
 */
public class Logger
{

	public Logger()
	{
		System.out.println("Logger....无参构造器");
	}
	
	public void log()
	{
		System.out.println("Logger....log()....记录日志");
	}
	

/*	public void log1(int logData)
	{
		System.out.println("Logger....log1()....记录日志:logData:"+logData);
	}
*/

	public void log1(Object logData)
	{
		System.out.println("Logger....log1()....记录日志:logData:"+logData);
	}
}
