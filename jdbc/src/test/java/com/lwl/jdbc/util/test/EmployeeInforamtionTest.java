package com.lwl.jdbc.util.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lwl.jdbc.dto.EmpBasicInfoDTO;
import com.lwl.jdbc.util.ConnectionUtil;

public class EmployeeInforamtionTest {

	ConnectionUtil conutil = ConnectionUtil.dbutil;

	@Test
	void getEmployeeBasicInformation() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		List<EmpBasicInfoDTO> list=new ArrayList<EmpBasicInfoDTO>();
		try {
			conn = conutil.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select empno,ename,job,sal from emp");

			while (rs.next()) {
				EmpBasicInfoDTO emp = convert(rs);
				list.add(emp);
			}
			
			list.stream().forEach(System.out::println);
			
			Assertions.assertEquals(14, list.size());

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conutil.close(rs, st, conn);
		}

	}

	private EmpBasicInfoDTO convert(ResultSet rs) throws SQLException {
		int empno = rs.getInt("empno");
		String ename = rs.getString("ename");
		String job = rs.getString("job");
		float salary = rs.getFloat("sal");
		EmpBasicInfoDTO emp = EmpBasicInfoDTO.builder().empno(empno).ename(ename).job(job).salary(salary).build();
		return emp;
	}
}
