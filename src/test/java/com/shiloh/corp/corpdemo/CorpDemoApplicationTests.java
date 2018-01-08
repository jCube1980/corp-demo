package com.shiloh.corp.corpdemo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shiloh.corp.repo.CompanyRepo;
import com.shiloh.domain.Company;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CorpDemoApplicationTests {

	@Autowired
	private CompanyRepo companyRepo;
	
	@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void shouldFetchCompanies() {
		List<Company> companies = companyRepo.fetchAllCompanies();
	}

}
