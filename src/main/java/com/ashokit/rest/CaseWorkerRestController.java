package com.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.CWAccountForm;
import com.ashokit.entity.CaseWorkEntity;
import com.ashokit.service.IAccountMgmt;

@RestController
public class CaseWorkerRestController {
	
	@Autowired
	private IAccountMgmt service;
	
	
	@PostMapping("/saveWoker")
	public String createAcc(@RequestBody   CWAccountForm form) {
		
		service.createAccountCaseWorker(form);
		return "CASE WORKER ACCOUNT CREATED SUCCESSFULLY";
		
	}
	
	@DeleteMapping("/delete/{accountId}")
	public String deleteCaseWorker(@PathVariable("accountId") int accountId) {
		 service.deleteAccountCaseWorker(accountId);
		return "CaseWorker Account deleted Successfully";
	}
	
	@GetMapping("/getAccounts")
	public List<CaseWorkEntity> getAllCaseAccounts(){
		return service.getCaseWorkerAccounts();
	}
	
	@PutMapping("/softDelete/{id}")
	public String softDelete(@PathVariable("id")  int accountId) {
		 service.inActiveCaseWorkerAccount(accountId);
		 return "CASE WORKER ACCOUNT IN ACTIVATED SUCCESSFULLY";
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
