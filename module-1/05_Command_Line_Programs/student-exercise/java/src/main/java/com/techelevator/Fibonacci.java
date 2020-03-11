package com.techelevator;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		
		//create a scanner object for user input.
		Scanner input = new Scanner(System.in);
		
		boolean continueLoop = true;	
		
		while (continueLoop) {
			System.out.println("Please enter the Fibonacci Number: ");
			while (!input.hasNextInt()) {
				System.out.println("That's not an Integer. Please enter an integer value");
				input.next();
			}
			System.out.print("Enter the Fibonacci Number: ");
			int maxFibNumber = input.nextInt();
		
			
			int maxNumber1 = maxFibNumber;
			int previousNumber = 0; 
			int nextNumber = 1;
		
			System.out.print("Fibonacci series of "+ maxNumber1 +" numbers: ");
			int sum = 0;
			//for (int i = 1; i <= maxNumber; ++i) {
			for (int i = 1 ;sum < maxNumber1; i++) {
				
				System.out.println(sum + " ");
				sum = previousNumber + nextNumber;
				previousNumber = nextNumber;
				nextNumber = sum;
				
				
			}
			
			System.out.println("Do you want to do continue (Y/N)");
			Scanner checkStatus = new Scanner(System.in);
			String status = checkStatus.nextLine();
			
			if (status.equalsIgnoreCase("N")) {
				continueLoop = false;
				System.out.println("Thank you");
				System.exit(0);
			}else if (status.equalsIgnoreCase("Y") ) {
				continueLoop = true;
			}else {
				System.out.println("Please enter Y or N");
			}
		
		}
	}
}

