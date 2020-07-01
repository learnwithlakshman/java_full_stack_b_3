package com.lwl.cj.day17;

final class AccountIdGen {
	private static int id = 1001;

	private AccountIdGen() {
	}

	public static int newId() {
		return id++;
	}
}

class Account {

	int accNum;
	String name;
	double balance;

	public Account(String name, double balance) {
		super();
		this.accNum = AccountIdGen.newId();
		this.name = name;
		this.balance = balance;
	}

	public void withDraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Current balance :" + balance);
		} else {
			System.out.println("You don't have sufficient balance, you have balance:" + balance);
		}
	}

	public void desposit(double amount) {
		balance += amount;
		System.out.println("Current balance :" + balance);
	}

	public double getBalanceInfo() {
		return balance;
	}

	public void showInfo() {
		System.out.println(String.format("Account number : %d, name : %s and balance : %f", accNum, name, balance));
	}

}

class SavingsAccount extends Account {
	private double minBalance;

	public SavingsAccount(String name, double balance, double minBalance) {
		super(name, balance);
		this.minBalance = minBalance;
	}

	@Override
	public void withDraw(double amount) {
		if (balance >= amount + minBalance) {
			balance -= amount;
			System.out.println("Current balance :" + balance);
		} else {
			System.out.println("You don't have sufficient balance, you have balance:" + balance);
			System.out.println("Min balance should be : " + minBalance + " maintained");
		}
	}

	public void taxInformation() {

	}

}

class CurrentAccount extends Account {
	private double overDrartAmount;

	public CurrentAccount(String name, double balance, double overDraftAmount) {
		super(name, balance);
		this.overDrartAmount = overDraftAmount;
	}

	@Override
	public void withDraw(double amount) {
		if (balance >= amount - overDrartAmount) {
			balance -= amount;
			System.out.println("Current balance :" + balance);
		} else {
			System.out.println("You don't have sufficient balance, you have balance:" + balance);
		}
	}
}

public class Manager {
	public static void main(String[] args) {

		Account acc1 = new Account("Krish", 45000);
		Account acc2 = new SavingsAccount("Tanvi", 10000, 500);
		Account acc3 = new CurrentAccount("Tanvi", 10000, 500);
		Account acc = new Account("Krish", 45000);
		Account obj1 = new SavingsAccount("Tanvi", 10000, 500);
		Account obj2 = new CurrentAccount("Tanvi", 10000, 500);

		Account[] arr = new Account[] { acc1, acc2, acc3, acc, obj1, obj2 };
		int sb, cb, ac;
		sb = cb = ac = 0;
		for (Account accObj : arr) {
			if(accObj instanceof SavingsAccount){
				sb++;
			} else if (accObj instanceof CurrentAccount) {
				cb++;
			} else if (accObj instanceof Account) {
				ac++;
			}
		}
		System.out.println("Savings account count:"+sb);
		System.out.println("Current account count:"+cb);
		System.out.println("Normal account count:"+ac);

	}
}