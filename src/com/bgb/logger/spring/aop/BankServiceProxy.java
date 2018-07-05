package com.bgb.logger.spring.aop;

/**
 * 作者Email:fengminbiao@126.com<br/>
 * 创建时间：2018年7月5日上午11:30:24<br/>
 * 类说明：代理类
 */
public class BankServiceProxy
{
	private Security security = new Security();
	private BankServiceImpl bankServiceImpl = new BankServiceImpl();
	private Logger logger = new Logger();
	private Clean clean = new Clean();
	
	
	public void getMoney()
	{
		security.isSecurity();
		bankServiceImpl.getMoney();
		logger.log();
		clean.clear();
	}
	
	public void zhuanMoney()
	{
		security.isSecurity();
		bankServiceImpl.zhuanMoney();
		logger.log();
		clean.clear();
	}

	public void invest()
	{
		security.isSecurity();
		bankServiceImpl.invest();
		logger.log();
		clean.clear();
	}
	
}
