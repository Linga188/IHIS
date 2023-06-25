package com.ashokit.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EligibilityDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eligId;
	
	private int caseNumber;
	private String planName;
	private String planStatus;
	private Date startDate;
	private Date endDate;
	private double benfitAmt;
	public int getEligId() {
		return eligId;
	}
	public void setEligId(int eligId) {
		this.eligId = eligId;
	}
	public int getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getBenfitAmt() {
		return benfitAmt;
	}
	public void setBenfitAmt(double benfitAmt) {
		this.benfitAmt = benfitAmt;
	}
	@Override
	public String toString() {
		return "EligibilityDetailsEntity [eligId=" + eligId + ", caseNumber=" + caseNumber + ", planName=" + planName
				+ ", planStatus=" + planStatus + ", startDate=" + startDate + ", endDate=" + endDate + ", benfitAmt="
				+ benfitAmt + "]";
	}
	public EligibilityDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
