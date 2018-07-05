package com.bgb.logger.spring.aop;

/**
 * 作者Email:fengminbiao@126.com
 * 创建时间：2018年7月5日上午11:59:35
 * 类说明：
 */
public class AopMain
{

	public static void main(String[] args)
	{
		BankServiceProxy bankServiceProxy = new BankServiceProxy();
		bankServiceProxy.getMoney();
	}

}
