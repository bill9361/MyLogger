package com.bgb.logger.model.pojo;

/**
 * 地址
 * @author Bill
 *
 */
@SuppressWarnings("serial")
public class Address extends BaseModel {
	private String type;	//类型
	private String name;	//名称
	private Integer leaf;	//是否叶子
	private String parentId;//父ID	
	private String path;	//路径
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getLeaf() {
		return leaf;
	}
	public void setLeaf(Integer leaf) {
		this.leaf = leaf;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Address [type=" + type + ", name=" + name + ", leaf=" + leaf + ", parentId=" + parentId + ", path="
				+ path + ", toString()=" + super.toString() + "]";
	}
	
}
