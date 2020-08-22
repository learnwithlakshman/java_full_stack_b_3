package com.careerit.sc.scope;

import java.util.List;


public class ContactDaoImpl implements ContactDao {
	
	private DbConnectionUtil dbConnectionUtil;

	
	public ContactDaoImpl(DbConnectionUtil dbConnectionUtil) {
		this.dbConnectionUtil = dbConnectionUtil;
		System.out.println("Object is created: " + this.getClass().getName());
	}

	public DbConnectionUtil getDbConnectionUtil() {
		return dbConnectionUtil;
	}

	public void setDbConnectionUtil(DbConnectionUtil dbConnectionUtil) {
		this.dbConnectionUtil = dbConnectionUtil;
		System.out.println("Setter method  of ContactDaoImpl is called");
	}

	@Override
	public List<String> getContactNames() {
		System.out.println(dbConnectionUtil.dbVersion());
		return List.of("Rajesh", "Phani");
	}

}
