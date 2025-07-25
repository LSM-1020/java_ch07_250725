package com.LSM.ch07_3_Quiz;

public class BankAccount {

	private double balance;

	public double getBalane() {
		return balance;
	}

	public void setBalane(double balance) {
		if(balance>0) {	
			this.balance = balance;
		}
	}
	
	
}
