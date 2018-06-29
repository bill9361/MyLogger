package com.bgb.logger.model.pojo;

/**
 * 公司组织架构
 * @author Bill
 *
 */
@SuppressWarnings("serial")
public class CompanyOrganization extends BaseModel {
	private String type;	//类型(type=main_root（主公司_总部）,type=main_child（主公司_子公司）,type=supplier(供应商))
	private String name;	//名称
	private String addressId;//地址Id
	private String addressDetail;//地址详情
	private Integer leaf;	//是否叶子
	private String parentId;//父ID	
	private String path;	//路径
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddressId()
	{
		return addressId;
	}
	public void setAddressId(String addressId)
	{
		this.addressId = addressId;
	}
	public String getAddressDetail()
	{
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail)
	{
		this.addressDetail = addressDetail;
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
		return "CompanyOrganization [type=" + type + ", name=" + name + ", addressId=" + addressId + ", addressDetail="
				+ addressDetail + ", leaf=" + leaf + ", parentId=" + parentId + ", path=" + path + ", toString()="
				+ super.toString() + "]";
	}
	
}
