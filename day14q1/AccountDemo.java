package com.day14q1;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Account a1 = new Account("5688656",10000);
			a1.withdraw(1000);
		}
		catch(InsufficientFundsException ie) {
			System.out.println(ie.getMessage());
		}
		
		
	}

}
