package com.sage.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.sage.entity.EligibilityDetails;
import com.sage.repo.EligibilityDetailsRepo;

@Component
public class AppRunner implements ApplicationRunner{

	@Autowired
	EligibilityDetailsRepo repo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		EligibilityDetails entity1 = new EligibilityDetails();
		entity1.setEligId(1);
		entity1.setName("John");
		entity1.setMobile(1234566l);
		entity1.setGender('M');
		entity1.setSsn(7878734223l);
		entity1.setPlanName("SNAP");
		entity1.setPlanStatus("Approved");
		
		repo.save(entity1); 
		
		EligibilityDetails entity2 = new EligibilityDetails();
		entity2.setEligId(2);
		entity2.setName("Smith");
		entity2.setMobile(1234566l);
		entity2.setGender('M');
		entity2.setSsn(7878734223l);
		entity2.setPlanName("SNAP");
		entity2.setPlanStatus("Approved");
		
		repo.save(entity2); 
		
		EligibilityDetails entity3 = new EligibilityDetails();
		entity3.setEligId(3);
		entity3.setName("Robert");
		entity3.setMobile(1234566l);
		entity3.setGender('M');
		entity3.setSsn(7878734223l);
		entity3.setPlanName("Medicaid");
		entity3.setPlanStatus("Denied");
		
		repo.save(entity3); 
		
		EligibilityDetails entity4 = new EligibilityDetails();
		entity4.setEligId(4);
		entity4.setName("Mike");
		entity4.setMobile(1234566l);
		entity4.setGender('M');
		entity4.setSsn(7878734223l);
		entity4.setPlanName("SNAP");
		entity4.setPlanStatus("Approved");
		
		repo.save(entity4);
		
		EligibilityDetails entity5 = new EligibilityDetails();
		entity5.setEligId(5);
		entity5.setName("Rocky");
		entity5.setMobile(1234566l);
		entity5.setGender('M');
		entity5.setSsn(7878734223l);
		entity5.setPlanName("CCAP");
		entity5.setPlanStatus("Closed");
		
		repo.save(entity5); 
		
	}

}
