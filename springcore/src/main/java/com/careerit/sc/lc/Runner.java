package com.careerit.sc.lc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({"com.careerit.sc.lc"})
public class Runner {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class)) {
			
			ReportService rs = context.getBean(ReportService.class);
			rs.generateReport();
			
			CodingQuestionService cqs = context.getBean(CodingQuestionService.class);
			System.out.println(cqs.biggest(new int[] {-1,-2,-3,-4,-5,-6,0}));
		}
	}
}
