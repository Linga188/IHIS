package com.ashokit.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.binding.PlanForm;
import com.ashokit.entity.PlanEntity;
import com.ashokit.repo.PlansRepo;
@Service
public class IPlanMgmtServiceImpl implements IPlanManagement {
     @Autowired
	private PlansRepo repo;
	
	
	@Override
	public String createPlan(PlanForm form) {
		PlanEntity entity=new PlanEntity();
		BeanUtils.copyProperties(form, entity);
		
		entity.setActiveSwitch(true);
		entity.setCreatedBy("Linga");
		entity.setUpdatedBy("Lingaa");
		
		repo.save(entity);
		return "Account Created Successfully";
	}

	@Override
	public List<PlanEntity> viewPlans() {
	return	repo.findAll();
		
	}
	@Override
	public PlanEntity editPlan(Integer accountId, PlanEntity entity) {
		PlanEntity planEntity = repo.findById(accountId).get();
		planEntity.setPlanName(entity.getPlanName());
		
		planEntity.setPlanStartDate(entity.getPlanStartDate());
		planEntity.setPlanEndDate(entity.getPlanEndDate());
		return repo.save(planEntity);
	}

	@Override
	public void deletePlan(int planId) {
		repo.deleteById(planId);

	}

	@Override
	public String softDelete(int planId) {
		PlanEntity planEntity = repo.findById(planId).get();
		planEntity.setActiveSwitch(false);
		return "Account is deactivated";
	}

}
