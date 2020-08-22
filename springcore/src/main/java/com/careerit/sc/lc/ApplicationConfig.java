package com.careerit.sc.lc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lwl.ccquestions.ArrayQuestions;
import com.lwl.ccquestions.StringQuestions;

@Configuration
public class ApplicationConfig {

	@Bean
	public ArrayQuestions arrayQuestions() {
		return new ArrayQuestions();
	}
	
	@Bean
	public StringQuestions stringQuestions() {
		return new StringQuestions();
	}
}
