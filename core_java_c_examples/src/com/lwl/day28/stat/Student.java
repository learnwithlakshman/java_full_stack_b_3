package com.lwl.day28.stat;


public class Student {

	private String name;
	private String batch;
	private Status cStatus;
	private Status pStatus;
	private String degree;
	private float score;
	
	
	public Student() {
		super();
	}
	public Student(String name, String batch, Status cStatus, Status pStatus, String degree, float score) {
		this.name = name;
		this.batch = batch;
		this.cStatus = cStatus;
		this.pStatus = pStatus;
		this.degree = degree;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public Status getcStatus() {
		return cStatus;
	}
	public void setcStatus(Status cStatus) {
		this.cStatus = cStatus;
	}
	public Status getpStatus() {
		return pStatus;
	}
	public void setpStatus(Status pStatus) {
		this.pStatus = pStatus;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	
}
