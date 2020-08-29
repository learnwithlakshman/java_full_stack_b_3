package com.careerit.ipl.coursestat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseStatController {

	@Autowired
	private CourseStatService courseStatService;

	@GetMapping("/course/count")
	public CountDTO countOfStudent() {
		int count = courseStatService.getStudentCount();
		CountDTO obj = new CountDTO();
		obj.setName("count");
		obj.setCount(count);
		return obj;
	}
}
