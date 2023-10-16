package com.altonInterview.examples.customErrorHandling;

public class TestAge {

	public static void verify(int age) throws InvalidAge{
		
		if(age<18) {
			throw new InvalidAge("Not eligible to vote!");
		}else {
			System.out.println("You are eligible to vote!");
		}
		
	}
	
	public static void main(String args[]) {
		try {
			verify(14);
		}catch (InvalidAge e) {
			System.out.println("Caught the error Exception: "+e.getMessage());
			
		}
	}
}
