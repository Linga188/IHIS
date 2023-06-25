package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.CitizenAppEntity;

public interface CitizenRepo extends JpaRepository<CitizenAppEntity, Integer> {

}
