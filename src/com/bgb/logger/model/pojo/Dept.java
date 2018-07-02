package com.bgb.logger.model.pojo;

import java.util.List;

/**
 * 作者Email:fengminbiao@126.com
 * 创建时间：2018年7月2日下午2:46:00
 * 类说明：部门表
 */
@SuppressWarnings("serial")
public class Dept extends BaseModel
{
	private String name;//名称
	private String companyRootId;//公司总部Id
	private Integer leaf;//是否叶子
	private String parentId;//父ID
	private String path;//路径
	
	private List<Post> postList;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getCompanyRootId()
	{
		return companyRootId;
	}
	public void setCompanyRootId(String companyRootId)
	{
		this.companyRootId = companyRootId;
	}
	public Integer getLeaf()
	{
		return leaf;
	}
	public void setLeaf(Integer leaf)
	{
		this.leaf = leaf;
	}
	public String getParentId()
	{
		return parentId;
	}
	public void setParentId(String parentId)
	{
		this.parentId = parentId;
	}
	public String getPath()
	{
		return path;
	}
	public void setPath(String path)
	{
		this.path = path;
	}
	
	public List<Post> getPostList()
	{
		return postList;
	}
	public void setPostList(List<Post> postList)
	{
		this.postList = postList;
	}
	@Override
	public String toString()
	{
		return "Dept [name=" + name + ", companyRootId=" + companyRootId + ", leaf=" + leaf + ", parentId=" + parentId
				+ ", path=" + path + ", postList=" + postList + "]";
	}
	
}
