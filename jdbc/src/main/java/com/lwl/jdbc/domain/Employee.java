package com.lwl.jdbc.domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

		private int empno;
		private String ename;
		private String job;
		private int mgr;
		private LocalDate hiredate;
		private float sal;
		private float comm;
		private int deptno;
}
