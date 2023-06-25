package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.PlanEntity;

public interface AppPlanRepo extends JpaRepository<PlanEntity, Integer> {

}
