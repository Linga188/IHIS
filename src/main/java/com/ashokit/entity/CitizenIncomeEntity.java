package com.ashokit.entity;

import java.util.Date;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CitizenIncomeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer incomeId;
	private int caseNumber;
	
	private double salaryIncome;
	private double rentIncome;
	
	private Date createdDate;
	private Date updatedDate;
	private String createdBy;
	private String updatedBy;
	public Integer getIncomeId() {
		return incomeId;
	}
	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
	}
	public int getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}
	public double getSalaryIncome() {
		return salaryIncome;
	}
	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}
	public double getRentIncome() {
		return rentIncome;
	}
	public void setRentIncome(double rentIncome) {
		this.rentIncome = rentIncome;
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
		return "CitizenIncomeEntity [incomeId=" + incomeId + ", caseNumber=" + caseNumber + ", salaryIncome="
				+ salaryIncome + ", rentIncome=" + rentIncome + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}
	public CitizenIncomeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
