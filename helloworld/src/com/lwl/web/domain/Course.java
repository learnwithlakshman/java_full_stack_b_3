package com.lwl.web.domain;

public class Course {

		private String id;
		private String name;
		private int duration;
		private int fee;
		
		
		public Course(String id, String name, int duration, int fee) {
			super();
			this.id = id;
			this.name = name;
			this.duration = duration;
			this.fee = fee;
		}
		public Course() {
			super();
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public int getFee() {
			return fee;
		}
		public void setFee(int fee) {
			this.fee = fee;
		}
		
}
