package com.careerit.sc.lc;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

		public EmployeeService() {
			System.out.println("Employee service object is created");
		}
		
		public List<String> getAllEmployeeNames(){
			return List.of("Krish","Ganesh","Manoj");
		}
}
