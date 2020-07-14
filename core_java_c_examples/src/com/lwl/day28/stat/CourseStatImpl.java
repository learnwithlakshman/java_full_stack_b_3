package com.lwl.day28.stat;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CourseStatImpl implements CourseStat {

	private String fileName = "resources/task_1/coursedata.txt";
	private List<Student> list;

	public CourseStatImpl() {
		try {
			list = FileReaderUtil.loadDataFromFile(new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> findByDegree(String degree) {
		return list.stream().filter(s -> s.getDegree().equalsIgnoreCase(degree)).collect(Collectors.toList());
	}

	@Override
	public int count(Predicate<Student> predicate) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CountStatDTO getPlacedAndNotPlacedCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> search(String str) {
		return list.stream().filter(s -> s.getName().toLowerCase().contains(str.toLowerCase()))
				.collect(Collectors.toList());
	}

	@Override
	public float avgSuccessRate(String batch) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> maxScroedStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllStudentNames() {
		return list.stream().map(Student::getName).collect(Collectors.toList());
	}

	@Override
	public Set<String> getAllBatchNames() {
		return list.stream().map(Student::getBatch).collect(Collectors.toSet());
	}

	@Override
	public List<StudentMinDetailsDTO> getStudentMinDetails() {
		return list.stream().map(e ->transform(e)).collect(Collectors.toList());
	}

	private StudentMinDetailsDTO transform(Student e) {

		StudentMinDetailsDTO obj = new StudentMinDetailsDTO();
		obj.setDegree(e.getDegree());
		obj.setName(e.getName());
		obj.setScore(e.getScore());
		return obj;
	}

}
