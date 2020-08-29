package com.careerit.ipl.coursestat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CourseStatService {

			@Autowired
			private JdbcTemplate jdbcTemplate;
			
			public int getStudentCount() {
				return jdbcTemplate.queryForObject("select count(*) from course",Integer.class);
			}
			
}
