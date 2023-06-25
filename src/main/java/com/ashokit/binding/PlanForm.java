package com.ashokit.binding;

import java.time.LocalDate;

public class PlanForm {
	
	
	private String planName;
	
	private LocalDate palnStartDate;
	
	
	private LocalDate planEndDate;
	
	private String planCategory;

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public LocalDate getPalnStartDate() {
		return palnStartDate;
	}

	public void setPalnStartDate(LocalDate palnStartDate) {
		this.palnStartDate = palnStartDate;
	}

	public LocalDate getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}

	public String getPlanCategory() {
		return planCategory;
	}

	public void setPlanCategory(String planCategory) {
		this.planCategory = planCategory;
	}

	public PlanForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
