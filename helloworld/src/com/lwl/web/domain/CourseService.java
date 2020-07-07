package com.lwl.web.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CourseService {

	private List<Course> courseList;

	public CourseService() {
		courseList = Stream
				.of(new Course("1001", "Python", 60, 10000), new Course("1002", "AWS", 30, 10000),
						new Course("1003", "Java", 120, 10000), new Course("1004", "DevOps", 30, 10000))
				.collect(Collectors.toList());
	}

	public List<Course> getCourses() {
		return courseList;
	}
}
