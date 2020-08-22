package com.careerit.sc.lc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService  {
		
			@Autowired
			private EmployeeService employeeService;
	
			public ReportService() {
				System.out.println("ReportService object created...");
			}
			
			public void generateReport() {
				System.out.println(employeeService.getAllEmployeeNames());
			}

			@PreDestroy
			public void destroy() throws Exception {
				System.out.println("Destory.....");
			}

			@PostConstruct
			public void afterPropertiesSet() throws Exception {
				System.out.println("After property set...");
				
			}
			
			
	
}
