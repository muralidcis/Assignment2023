package com.altonInterview.examples.lambda;

import java.util.function.Function;

public class lambda {
	@FunctionalInterface
	interface LetSumNumbers {
		int sum(int a, int b);
	}
	
	@FunctionalInterface
	interface Sayable{
		String say(String message);
	}

	public static class lambdaExample{
		public static void main(String args[]) {
			LetSumNumbers letSumNumbers=(a,b)->(a+b);
			System.out.println(letSumNumbers.sum(50,60));
			
			Sayable person =(message)->{
				String st1="say hello to the world! ";
				String st2=st1+message;
				return st2;
				
			}; 
			System.out.println(person.say(" First message!"));
			
			
			  int n = 33;
			    System.out.println("Number: " + n);

			    Function < Integer, String > convertToBinary = num -> Integer.toBinaryString(num);
			    String binaryRepresentation = convertToBinary.apply(n);
			    System.out.println("Binary representation: " + binaryRepresentation);
			    n = 747;
			    System.out.println("\nNumber: " + n);
			    convertToBinary = num -> Integer.toBinaryString(num);
			    binaryRepresentation = convertToBinary.apply(n);
			    System.out.println("Binary representation: " + binaryRepresentation);
		}
	}
}