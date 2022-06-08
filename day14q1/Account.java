package com.day14q1;

public class Account {

	String accountNumber;
	double Balance; 
	
	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		Balance = balance;
	}
	
	void deposit(double amount) {
		Balance = Balance + amount;
	}
	double withdraw(double amount) throws InsufficientFundsException{
		if(amount>Balance)
		{
			throw new InsufficientFundsException("Insufficient Fund");
		}
		else
		{
			Balance = Balance-amount;
			System.out.println("Withdrawn amount is : "+amount);
			return Balance;
		}
	}
	
}
