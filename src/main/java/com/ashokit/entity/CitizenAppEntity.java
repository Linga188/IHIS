package com.ashokit.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CitizenAppEntity {
	@Id
	private int caseNumber;
	private String fullName;
	private String email;
	private Integer mobileNumber;
	private String gender;
	private Date dob;
	private boolean isActive;
	private Date createdDate;
	private Date updatedDate;
	private String createdBy;
	private String updatedBy;
	public int getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
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
		return "CitizenAppEntity [caseNumber=" + caseNumber + ", fullName=" + fullName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", dob=" + dob + ", isActive=" + isActive
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + "]";
	}
	public CitizenAppEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
