package com.bgb.logger.spring.aop;

/**
 * 环境检测--->银行业务--->日志记录--->清空缓存
 * 作者Email:fengminbiao@126.com
 * 创建时间：2018年7月5日上午10:29:47
 * 类说明：银行业务类（核心类（目标类））
 */
public class BankServiceImpl
{

	public BankServiceImpl()
	{
		System.out.println("BankServiceImpl....无参构造器");
	}
	
	public int getMoney()
	{
		System.out.println("BankServiceImpl....getMoney()....余额500万");
		
		return 500;
	}
	
	public String zhuanMoney()
	{
		System.out.println("BankServiceImpl....zhuanMoney()....转账100万");
		
		return "转账成功啦";
	}

	public float invest()
	{
		System.out.println("BankServiceImpl....invest()....投资100万");
		
		return 3.14f;
	}
	
}
