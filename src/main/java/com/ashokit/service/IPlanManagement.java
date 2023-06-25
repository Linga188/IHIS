package com.ashokit.service;

import java.util.List;

import com.ashokit.binding.PlanForm;
import com.ashokit.entity.PlanEntity;

public interface IPlanManagement {
	
	
//	public String createPlan();
	//public String 

	
	// api for creating plan
	
	public String createPlan(PlanForm form);
	
	//api for view the plan
	
	
	public List<PlanEntity> viewPlans();
	
	
	//api for edit the plan
	
	public PlanEntity editPlan(Integer accountId,PlanEntity  entity);
	
	
	//api for delete the plan
	public void deletePlan(int planId);
	
	// api for soft delete
	
	public String softDelete(int planId);
}
