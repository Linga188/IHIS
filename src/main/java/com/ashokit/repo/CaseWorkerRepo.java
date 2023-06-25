package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.CaseWorkEntity;

public interface CaseWorkerRepo extends JpaRepository<CaseWorkEntity, Integer> {
	
	
	//public String findByInActive(int accountId);

}
