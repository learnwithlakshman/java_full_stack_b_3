package com.lwl.dateexamples;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
@interface Author {
	public String name() default "Krish";
}

public class DateExamples {
	

    @Author(name = "Ganesh")
	public int biggest(int... agrs) {
		
		return 0;
	}
    
    @Override
    public String toString() {
    	return "Hello";
    }

	public static void main(String[] args) {
		
		DateExamples obj = new DateExamples();
		System.out.println(obj);

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate date1 = LocalDate.of(1984, Month.AUGUST, 6);
		System.out.println(date1);

		LocalDate date2 = date1.plusYears(36);
		System.out.println(date2);

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getDayOfYear());
		System.out.println(ldt.toLocalDate().isLeapYear());

		System.out.println(LocalDate.now().getYear() - date1.getYear());

		String str = "Jul-07-2020";
		DateTimeFormatter p = DateTimeFormatter.ofPattern("MMM-d-yyyy");
		LocalDate d = LocalDate.parse(str, p);
		System.out.println(d);

	}
}
