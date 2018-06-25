package com.bgb.logger.model;

import java.io.Serializable;

/**
 * @author Bill
 *
 */
@SuppressWarnings("serial")
public class User extends BaseModel implements Serializable 
{
    private String username;
    private String password;
    private String fullname;
    private String idNumber;
    private java.util.Date dateOfBirth;
    private String type;
    private int isLock;
    private int workingStatus;
    private String picture;
    private java.util.Date validityStartDate;
    private java.util.Date validityEndDate;
    private String deptId;
    private String postId;
    private String tel;
    private String email;
    private String qq;
    private String wechat;
    private String roleId;
    private String userGroupId;
    
    
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getFullname()
	{
		return fullname;
	}
	public void setFullname(String fullname)
	{
		this.fullname = fullname;
	}
	public String getIdNumber()
	{
		return idNumber;
	}
	public void setIdNumber(String idNumber)
	{
		this.idNumber = idNumber;
	}
	public java.util.Date getDateOfBirth()
	{
		return dateOfBirth;
	}
	public void setDateOfBirth(java.util.Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public int getIsLock()
	{
		return isLock;
	}
	public void setIsLock(int isLock)
	{
		this.isLock = isLock;
	}
	public int getWorkingStatus()
	{
		return workingStatus;
	}
	public void setWorkingStatus(int workingStatus)
	{
		this.workingStatus = workingStatus;
	}
	public String getPicture()
	{
		return picture;
	}
	public void setPicture(String picture)
	{
		this.picture = picture;
	}
	public java.util.Date getValidityStartDate()
	{
		return validityStartDate;
	}
	public void setValidityStartDate(java.util.Date validityStartDate)
	{
		this.validityStartDate = validityStartDate;
	}
	public java.util.Date getValidityEndDate()
	{
		return validityEndDate;
	}
	public void setValidityEndDate(java.util.Date validityEndDate)
	{
		this.validityEndDate = validityEndDate;
	}
	public String getDeptId()
	{
		return deptId;
	}
	public void setDeptId(String deptId)
	{
		this.deptId = deptId;
	}
	public String getPostId()
	{
		return postId;
	}
	public void setPostId(String postId)
	{
		this.postId = postId;
	}
	public String getTel()
	{
		return tel;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getQq()
	{
		return qq;
	}
	public void setQq(String qq)
	{
		this.qq = qq;
	}
	public String getWechat()
	{
		return wechat;
	}
	public void setWechat(String wechat)
	{
		this.wechat = wechat;
	}
	public String getRoleId()
	{
		return roleId;
	}
	public void setRoleId(String roleId)
	{
		this.roleId = roleId;
	}
	public String getUserGroupId()
	{
		return userGroupId;
	}
	public void setUserGroupId(String userGroupId)
	{
		this.userGroupId = userGroupId;
	}
	
	@Override
	public String toString()
	{
		return "User [username=" + username + ", password=" + password + ", fullname=" + fullname + ", idNumber="
				+ idNumber + ", dateOfBirth=" + dateOfBirth + ", type=" + type + ", isLock=" + isLock
				+ ", workingStatus=" + workingStatus + ", picture=" + picture + ", validityStartDate="
				+ validityStartDate + ", validityEndDate=" + validityEndDate + ", deptId=" + deptId + ", postId="
				+ postId + ", tel=" + tel + ", email=" + email + ", qq=" + qq + ", wechat=" + wechat + ", roleId="
				+ roleId + ", userGroupId=" + userGroupId + ", getId()=" + getId() + ", getCreateTime()="
				+ getCreateTime() + ", getCreateBy()=" + getCreateBy() + ", getUpdateTime()=" + getUpdateTime()
				+ ", getUpdateBy()=" + getUpdateBy() + "]";
	}
    
	
	
}
