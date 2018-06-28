package com.bgb.logger.model.pojo;

@SuppressWarnings("serial")
public class Address extends BaseModel {
	private String id;		//名称
	private String type;	//类型
	private Integer leaf;	//是否叶子
	private String parentId;//父ID	
	private String path;	//路径
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	@Override
	public String toString() {
		return "Address [id=" + id + ", type=" + type + ", leaf=" + leaf + ", parentId=" + parentId + ", path=" + path
				+ ", toString()=" + super.toString() + "]";
	}
	
}
