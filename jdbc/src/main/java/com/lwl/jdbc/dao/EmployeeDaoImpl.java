package com.lwl.jdbc.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.lwl.jdbc.dto.DeptSalSatDTO;
import com.lwl.jdbc.dto.EmpBasicInfoDTO;
import com.lwl.jdbc.util.ConnectionUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	private ConnectionUtil conUtil = ConnectionUtil.dbutil;
	private static final String DEPT_SAL_SAT = "select e.deptno,d.dname,sum(e.sal) as tsal,sum(ifnull(e.comm,0)) as tcomm from"
			+ " emp e inner join dept d on e.deptno = d.deptno group by e.deptno;";

	@Override
	public List<DeptSalSatDTO> getSalStatOfAllDept() {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		List<DeptSalSatDTO> list = new ArrayList<>();
		try {
			conn = conUtil.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(DEPT_SAL_SAT);
			while (rs.next()) {
				DeptSalSatDTO emp = convert(rs);
				list.add(emp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conUtil.close(rs, st, conn);
		}

		return list;
	}

	private DeptSalSatDTO convert(ResultSet rs) throws SQLException {
		int deptno = rs.getInt("deptno");
		String dname = rs.getString("dname");
		double tsal = rs.getDouble("tsal");
		double tcomm = rs.getDouble("tcomm");

		DeptSalSatDTO obj = DeptSalSatDTO.builder().deptno(deptno).dname(dname).totalSal(tsal).totalComm(tcomm).build();

		return obj;
	}

	@Override
	public List<EmpBasicInfoDTO> getEmpByDeptno(int deptno) {

		return null;
	}

	@Override
	public double totalSayByDname(String dname) {

		Connection conn = null;
		CallableStatement cst = null;
		double tsal = 0;
		try {

			conn = conUtil.getConnection();
			cst = conn.prepareCall("{call total_sal_by_dname(?,?)}");

			cst.setString(2, dname);
			cst.registerOutParameter(1, Types.DOUBLE);
			cst.execute();

			tsal = cst.getDouble(1);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conUtil.close(cst, conn);
		}
		return tsal;
	}

}
