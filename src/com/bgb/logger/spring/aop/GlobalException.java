package com.bgb.logger.spring.aop;

/**
 * 作者Email:fengminbiao@126.com<br/>
 * 创建时间：2018年7月6日下午3:16:33<br/>
 * 类说明：统一异常处理
 */
public class GlobalException
{
	
	public void handleException(Throwable ex)
	{
		System.out.println("GlobalException....哎呀，我出错啦");
	}

}
