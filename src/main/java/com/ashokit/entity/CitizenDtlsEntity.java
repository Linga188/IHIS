package com.ashokit.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CitizenDtlsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int childId;
	private int caseNumber;
	private String childName;
	private Date childDob;
	private int childSsn;
	private Date createdDate;
	private Date updatedDate;
	private String createdBy;
	private String updatedBy;
	public int getChildId() {
		return childId;
	}
	public void setChildId(int childId) {
		this.childId = childId;
	}
	public int getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public Date getChildDob() {
		return childDob;
	}
	public void setChildDob(Date childDob) {
		this.childDob = childDob;
	}
	public int getChildSsn() {
		return childSsn;
	}
	public void setChildSsn(int childSsn) {
		this.childSsn = childSsn;
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
		return "CitizenDtlsEntity [childId=" + childId + ", caseNumber=" + caseNumber + ", childName=" + childName
				+ ", childDob=" + childDob + ", childSsn=" + childSsn + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}
	public CitizenDtlsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	


}
