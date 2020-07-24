package com.lwl.jdbc.util.test;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lwl.jdbc.dao.EmployeeDao;
import com.lwl.jdbc.dao.EmployeeDaoImpl;
import com.lwl.jdbc.dto.DeptSalSatDTO;

public class EmployeeDaoTest {

	@Test
	void getDeptSalSatOfAllDeptTest() {
		EmployeeDao dao = new EmployeeDaoImpl();
		List<DeptSalSatDTO> list = dao.getSalStatOfAllDept();
		list.stream().forEach(System.out::println);
		Assertions.assertEquals(3, list.size());

	}

	@Test
	void totalSayByDnameTest() {
		String dname = "SALES";
		EmployeeDao dao = new EmployeeDaoImpl();
		double tsalary = dao.totalSayByDname(dname);
		System.out.println("Dname :"+dname+" and total salary :"+tsalary);
		Assertions.assertEquals(9400.00, tsalary);
	}
}
