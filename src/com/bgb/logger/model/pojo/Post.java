package com.bgb.logger.model.pojo;

/**
 * 作者Email:fengminbiao@126.com 
 * 创建时间：2018年7月2日下午2:46:34 
 * 类说明：职位表
 */
@SuppressWarnings("serial")
public class Post extends BaseModel
{
	private String name; // 名称
	private String deptId; // 部门Id
	private Integer leaf; // 是否叶子
	private String parentId; // 父ID
	private String path; // 路径

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDeptId()
	{
		return deptId;
	}

	public void setDeptId(String deptId)
	{
		this.deptId = deptId;
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

	@Override
	public String toString()
	{
		return "Post [name=" + name + ", deptId=" + deptId + ", leaf=" + leaf + ", parentId=" + parentId + ", path="
				+ path + "]";
	}

}
