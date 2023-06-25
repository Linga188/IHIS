package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.PlanCatregoryEntity;
@Repository
public interface PlanCategoryRepo extends JpaRepository<PlanCatregoryEntity, Integer> {

}
