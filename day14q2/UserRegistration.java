package com.day14q2;

import java.util.Scanner;

import com.day14q2.InvalidCountryException;

public class UserRegistration {

	String username;
	String userCountry;

	void registerUser(String username,String userCountry) throws InvalidCountryException{
		if(userCountry.equalsIgnoreCase("India"))
		{
			System.out.println("User registration done successfully");
			
		}
		else
		{
			throw new InvalidCountryException("User Outside India cannot be registered");
			
		}
	
	}
	
	
	
	public UserRegistration(String username, String userCountry) {
		super();
		this.username = username;
		this.userCountry = userCountry;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name = sc.next();
		
		System.out.println("Enter Your Country : ");
		String country = sc.next();
		
		UserRegistration u1 = new UserRegistration(name,country);
		try {
			u1.registerUser(name, country);
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		

	}

}
