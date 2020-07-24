package com.lwl.jdbc.dao;

import java.util.List;

import com.lwl.jdbc.dto.DeptSalSatDTO;
import com.lwl.jdbc.dto.EmpBasicInfoDTO;

public interface EmployeeDao {

	
		public List<DeptSalSatDTO> getSalStatOfAllDept();
		public List<EmpBasicInfoDTO> getEmpByDeptno(int deptno);
		public double totalSayByDname(String deptno);
}
