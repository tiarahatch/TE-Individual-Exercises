package com.techelevator;

public class KataFizzBuzz {
	
	public static String fizzBuzz(int num) {
			
			if(num % 3 == 0 && num % 5 == 0) {
				return "FizzBuzz";
			}
			else if (Integer.toString(num).contains("3, 5") || (num % 3 == 0 && num % 5 == 0)) {
				return "FizzBuzz";
			}
			else if (num % 3 == 0) {
				return "Fizz";
			}
			else if (Integer.toString(num).contains("3") || num % 3 == 0) {
				return "Fizz";
			}
			else if (num % 5 ==0) {
				return "Buzz";
			}
			else if (Integer.toString(num).contains("5") || num % 5 == 0) {
				return "Buzz";
			}
			else if (num >=1 || num <= 100) {
				return Integer.toString(num);
			}
			else if (num < 1 || num > 100 ){
				
				return " ";
			}
		return Integer.toString(num);
		
	}

}
