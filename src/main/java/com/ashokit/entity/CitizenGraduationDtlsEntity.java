package com.ashokit.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CitizenGraduationDtlsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int graduationId;
	private int caseNumber;
	private String highest_degree;
	private int graduationYearId;
	private String university;
	
	
	private Date createdDate;
	private Date updatedDate;
	private String createdBy;
	private String updatedBy;
	public int getGraduationId() {
		return graduationId;
	}
	public void setGraduationId(int graduationId) {
		this.graduationId = graduationId;
	}
	public int getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getHighest_degree() {
		return highest_degree;
	}
	public void setHighest_degree(String highest_degree) {
		this.highest_degree = highest_degree;
	}
	public int getGraduationYearId() {
		return graduationYearId;
	}
	public void setGraduationYearId(int graduationYearId) {
		this.graduationYearId = graduationYearId;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
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
		return "CitizenGraduationDtlsEntity [graduationId=" + graduationId + ", caseNumber=" + caseNumber
				+ ", highest_degree=" + highest_degree + ", graduationYearId=" + graduationYearId + ", university="
				+ university + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", createdBy="
				+ createdBy + ", updatedBy=" + updatedBy + "]";
	}
	public CitizenGraduationDtlsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
