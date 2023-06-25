package com.ashokit.service;

import java.util.List;

import com.ashokit.binding.CWAccountForm;
import com.ashokit.entity.CaseWorkEntity;

public interface IAccountMgmt {
	//api for creating account
	public String createAccountCaseWorker(CWAccountForm form);
	
	
	//api for edit account 
	
	public CaseWorkEntity editAccountCaseWorker(Integer accountId,CaseWorkEntity  entity);
		
	//api for delete account 
	public String deleteAccountCaseWorker(int  accountId);
	
	
	//api for getting caseworker entity
	
	public List<CaseWorkEntity> getCaseWorkerAccounts();
	
	
	// api for soft delete
  
	public String inActiveCaseWorkerAccount(int accountId );
	
	//api for mail Sending

}
