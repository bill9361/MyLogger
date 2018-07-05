package com.bgb.logger.spring.aop;

/**
 * 环境检测--->银行业务--->日志记录--->清空缓存
 * 作者Email:fengminbiao@126.com
 * 创建时间：2018年7月5日上午10:33:38
 * 类说明：清空缓存（切面）后置通知
 */
public class Clean
{

	public Clean()
	{
		System.out.println("Clean....无参构造器");
	}
	
	public void clear()
	{
		System.out.println("Clean....clear()....清空缓存");
	}

}
