package com.techelevator;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		
		
		try (Scanner scanner = new Scanner(System.in)) {
		
		int previousNum1 = 0;
		int previousNum2 = 1;
		int num = 50;
		
		System.out.println("Fibonacci numbers up to: " + num + "numbers");
		
		for (int i = 1; i < num; i++) {
			System.out.println(previousNum1 +" ");
			int sum = previousNum1 + previousNum2;
			previousNum1 = previousNum2;
			previousNum2 = sum;
		}
		}
	}
}

