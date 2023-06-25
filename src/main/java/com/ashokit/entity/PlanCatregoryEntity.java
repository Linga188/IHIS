package com.ashokit.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PLAN_CATEGORY_MASTER")
public class PlanCatregoryEntity {
	@Id 
	private int categoryId;
	private  String categoryName;
	private Date createdDate;
	private Date updatedDate;
	private String createdBy;
	private String updatedBy;
	
	@Override
	public String toString() {
		return "PlanCatregoryEntity [categoryId=" + categoryId + ", categoryName=" + categoryName + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy
				+ "]";
	}
	public PlanCatregoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	

}
