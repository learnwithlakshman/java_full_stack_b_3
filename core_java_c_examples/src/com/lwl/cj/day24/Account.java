package com.lwl.cj.day24;

public class Account {

		private int accnum;
		private String name;
		private double balance;
		
		
		
		public Account(int accnum, String name, double balance) {
			this.accnum = accnum;
			this.name = name;
			this.balance = balance;
		}

		public void withDraw(double amount)throws InsufficientBalanceException {
			if(amount < 0) {
				throw new IllegalArgumentException();
			}
			if(amount < balance) {
				this.balance -= amount;
			}
			throw new InsufficientBalanceException();
		}
		
		public int getAccnum() {
			return accnum;
		}
		public void setAccnum(int accnum) {
			this.accnum = accnum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		@Override
		public String toString() {
			return "Account [accnum=" + accnum + ", name=" + name + ", balance=" + balance + "]";
		}
		
		
}
