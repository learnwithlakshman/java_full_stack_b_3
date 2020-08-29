package com.careerit.ipl.coursestat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private String name;
	private String batch;
	private String qualification;
	private String completed;
	private String placed;
	private double score;
}
