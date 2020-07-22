package com.lwl.jdbc.util.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lwl.jdbc.util.ConnectionUtil;

public class ConnectionUtilTest {

	ConnectionUtil conUtil = ConnectionUtil.dbutil;

	@Test
	public void testConnection() throws SQLException {

		Connection conn = conUtil.getConnection();
		Assertions.assertNotNull(conn, "Connection object can't be null");
		System.out.println(conn.getMetaData().getDriverName() + " " + conn.getMetaData().getDriverVersion());
	}
	
	@Test
	public void testGetDeptData() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = conUtil.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select deptno,dname,location from dept");
			
			while(rs.next()) {
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("location"));
				
			}
		}catch (SQLException e) {
			System.out.println("While getting dept details:"+e);
		}finally {
			conUtil.close(rs, st, conn);
		}
	}
}
