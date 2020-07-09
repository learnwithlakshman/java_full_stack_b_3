package com.lwl.cbook;

public class Contact {

		private int cid;
		private String name;
		private String email;
		private String mobile;
		
		public Contact() {
		}
		public Contact(String name, String email, String mobile) {
			this.name = name;
			this.email = email;
			this.mobile = mobile;
		}
		
		public Contact(int cid, String name, String email, String mobile) {
			this.cid = cid;
			this.name = name;
			this.email = email;
			this.mobile = mobile;
		}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		
}
