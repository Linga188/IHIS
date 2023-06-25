package com.ashokit.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.introspector.PropertyUtils;

import com.ashokit.binding.CWAccountForm;
import com.ashokit.entity.CaseWorkEntity;
import com.ashokit.repo.CaseWorkerRepo;

@Service
public class IAccountMgmtServiceImpl implements IAccountMgmt{
	@Autowired
	private CaseWorkerRepo caseWorkerRepo;

	

	@Override
	public CaseWorkEntity editAccountCaseWorker(Integer accountId,CaseWorkEntity  entity) {
		CaseWorkEntity caseWorkEntity = caseWorkerRepo.findById(accountId).get();
		caseWorkEntity.setFullName(entity.getFullName());
		caseWorkEntity.setGender(entity.getGender());
		caseWorkEntity.setDob(entity.getDob());
		caseWorkEntity.setGender(entity.getGender());
		caseWorkEntity.setSsn(entity.getSsn());
		
		return	caseWorkerRepo.save(caseWorkEntity);
		
		
		
		 
	}

	@Override
	public String deleteAccountCaseWorker(int accountId) {
		caseWorkerRepo.deleteById(accountId);
		System.out.println("deleted sccessfully");
		return "Account deleted successfully";
		
	}

	@Override
	public List<CaseWorkEntity> getCaseWorkerAccounts() {
		List<CaseWorkEntity> findAll = caseWorkerRepo.findAll();
		return findAll;
	}

	@Override
	public String inActiveCaseWorkerAccount(int accountId) {
		Optional<CaseWorkEntity> entity = caseWorkerRepo.findById(accountId);
		CaseWorkEntity caseWorkEntity = entity.get();
		caseWorkEntity.setActive("INACTIVE");
		
		return null;
	}

	@Override
	public String createAccountCaseWorker(CWAccountForm form) {
		CaseWorkEntity caseWorker=new CaseWorkEntity();
		BeanUtils.copyProperties(form, caseWorker);
		caseWorker.setActive("INACTIVE");
		caseWorker.setPassword(generateRandomString(6));
		
		caseWorkerRepo.save(caseWorker);
		return "CaseWorker Account Created Successfully";
	}
	
	
	
private  String generateRandomString(int length) {
		
		
		final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(6);
        
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }
        
        return sb.toString();
	}

	}
	
	
	


