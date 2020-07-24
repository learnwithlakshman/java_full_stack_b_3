package com.lwl.task1.dao;

import java.util.List;

import com.lwl.task1.domain.Student;

public interface StudentDao {
	
	
		 List<Student> getStudentByQualification(String qualification);
		 int getCountByQualificaation(String qualification);
}
