package com.lwl.jdbc.util;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public enum ConnectionUtil {
	dbutil;

	private Properties properties;
	{
		properties = new Properties();
		try {
			properties.load(ConnectionUtil.class.getResourceAsStream("/db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(properties.getProperty("url"), properties);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void close(Statement st, Connection conn) {
		try {
			if (st != null) {
				st.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("While closing resources:" + e);
		}
	}

	public void close(ResultSet rs, Statement st, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("While closing resources:" + e);
		}
	}

	public void close(PreparedStatement pst, Connection conn) {
		try {
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("While closing resources:" + e);
		}
	}

	public void close(ResultSet rs, PreparedStatement pst, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("While closing resources:" + e);
		}
	}

	public void close(CallableStatement cst, Connection conn) {
		try {
			if (cst != null) {
				cst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("While closing resources:" + e);
		}
	}

	public void close(ResultSet rs, CallableStatement cst, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (cst != null) {
				cst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("While closing resources:" + e);
		}
	}

}
