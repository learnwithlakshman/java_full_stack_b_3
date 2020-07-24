package com.lwl.jdbc.util.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.lwl.jdbc.domain.Dept;
import com.lwl.jdbc.util.ConnectionUtil;

public class ConnectionUtilTest {

	ConnectionUtil conUtil = ConnectionUtil.dbutil;

	// @Test
	void testGetDeptData() {
		final String DEPT_QUERY = "select deptno,dname,location from dept";

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		List<Dept> deptList = new ArrayList<Dept>();

		try {
			conn = conUtil.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(DEPT_QUERY);

			while (rs.next()) {

				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String location = rs.getString("location");

				Dept dept = Dept.builder().deptno(deptno).dname(dname).location(location).build();
				deptList.add(dept);
			}
			deptList.stream().forEach(System.out::println);
		} catch (SQLException e) {
			System.out.println("While getting dept details:" + e);
		} finally {
			conUtil.close(rs, st, conn);
		}
	}

	// @Test
	void addDeptData() {
		final String ADD_DEPT = "insert into dept(deptno,dname,location) values(?,?,?)";

		int deptno = 50;
		String dname = "UI&UX";
		String location = "MUMBAI";
		Dept dept = Dept.builder().deptno(deptno).dname(dname).location(location).build();

		Connection conn = null;
		PreparedStatement pst = null;

		try {
			conn = conUtil.getConnection();
			pst = conn.prepareStatement(ADD_DEPT);

			pst.setInt(1, dept.getDeptno());
			pst.setString(2, dept.getDname());
			pst.setString(3, dept.getLocation());

			int res = pst.executeUpdate();
			System.out.println("Added :" + res + " records");

		} catch (SQLException e) {
			System.out.println("While getting dept details:" + e);
		} finally {
			conUtil.close(pst, conn);
		}
	}

	// @Test
	void getDeptByName() {
		final String inputdname = "SALES";

		final String DEPT_BY_DNAME = "select deptno,dname,location from dept where dname=?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			conn = conUtil.getConnection();
			pst = conn.prepareStatement(DEPT_BY_DNAME);
			pst.setString(1, inputdname);
			rs = pst.executeQuery();

			if (rs.next()) {

				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String location = rs.getString("location");

				Dept dept = Dept.builder().deptno(deptno).dname(dname).location(location).build();
				System.out.println(dept);
			}
		} catch (SQLException e) {
			System.out.println("While getting dept details:" + e);
		} finally {
			conUtil.close(rs, pst, conn);
		}
	}

	@Test
	void getTotalSalByDeptno() {

		int deptno = 10;
		Connection conn = null;
		CallableStatement cst = null;

		try {
			conn = conUtil.getConnection();
			cst = conn.prepareCall("{call total_sal_of_dept(?,?,?)}");
			cst.registerOutParameter(1, Types.VARCHAR);
			cst.registerOutParameter(2, Types.FLOAT);
			cst.setInt(3, deptno);

			cst.execute();

			System.out.println(
					"Deptno :" + deptno + " Dname :" + cst.getString(1) + " Total Amount:  " + cst.getFloat(2));

		} catch (SQLException e) {
			System.out.println("While getting dept details:" + e);
		} finally {
			conUtil.close(cst, conn);
		}
	}

}
