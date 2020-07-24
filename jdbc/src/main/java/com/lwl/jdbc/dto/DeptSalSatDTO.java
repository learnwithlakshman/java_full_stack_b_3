package com.lwl.jdbc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeptSalSatDTO {

	private int deptno;
	private String dname;
	private double totalSal;
	private double totalComm;
}
