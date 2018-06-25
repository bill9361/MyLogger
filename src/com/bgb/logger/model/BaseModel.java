package com.bgb.logger.model;

import java.io.Serializable;

/**
 * 
 * @author Bill
 *
 */
@SuppressWarnings("serial")
public class BaseModel implements Serializable
{
	private Long id;
	private String createTime;
	private String createBy;
	private String updateTime;
	private String updateBy;
	
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getCreateTime()
	{
		return createTime;
	}
	public void setCreateTime(String createTime)
	{
		this.createTime = createTime;
	}
	public String getCreateBy()
	{
		return createBy;
	}
	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}
	public String getUpdateTime()
	{
		return updateTime;
	}
	public void setUpdateTime(String updateTime)
	{
		this.updateTime = updateTime;
	}
	public String getUpdateBy()
	{
		return updateBy;
	}
	public void setUpdateBy(String updateBy)
	{
		this.updateBy = updateBy;
	}

}
