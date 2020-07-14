package com.lwl.day28.stat;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public interface CourseStat {

	public List<Student> findByDegree(String degree);

	public int count(Predicate<Student> predicate);

	public CountStatDTO getPlacedAndNotPlacedCount();

	public List<Student> search(String str);

	public float avgSuccessRate(String batch);

	public List<Student> maxScroedStudents();

	public List<String> getAllStudentNames();

	public Set<String> getAllBatchNames();

	public List<StudentMinDetailsDTO> getStudentMinDetails();

}
