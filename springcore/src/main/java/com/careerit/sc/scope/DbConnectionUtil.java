package com.careerit.sc.scope;

public class DbConnectionUtil {

	public DbConnectionUtil() {
		System.out.println("Object is created: " + this.getClass().getName());
	}

	public String dbVersion() {
		return "Version-MySQL-8.0.2";
	}
}
