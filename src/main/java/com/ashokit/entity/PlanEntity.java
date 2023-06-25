package com.ashokit.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PlanEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int planId;
	private String planName;
	private Date planStartDate;
	private Date planEndDate;

	private boolean ActiveSwitch;

	
	@CreationTimestamp
	private Date createdDate;
	@UpdateTimestamp
	private Date updatedDate;
	private String createdBy;
	private String updatedBy;
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Date getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(Date planStartDate) {
		this.planStartDate = planStartDate;
	}
	public Date getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}
	public boolean isActiveSwitch() {
		return ActiveSwitch;
	}
	public void setActiveSwitch(boolean activeSwitch) {
		ActiveSwitch = activeSwitch;
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
	@Override
	public String toString() {
		return "PlanEntity [planId=" + planId + ", planName=" + planName + ", planStartDate=" + planStartDate
				+ ", planEndDate=" + planEndDate + ", ActiveSwitch=" + ActiveSwitch + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}
	public PlanEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
