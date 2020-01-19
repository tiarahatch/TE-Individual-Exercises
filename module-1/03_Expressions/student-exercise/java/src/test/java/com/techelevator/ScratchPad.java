//package com.techelevator;
//
//public class ScratchPad {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int age = 1;
//		
//	//simple if statement
//		if (age > 1) {
//			System.out.println("Age: " + age);
//		}
//		
//		else {
//			System.out.println("OK");
//		}
//		
//		//loop written in code
//		for (int i = 0; i<10; i++) {
//			if (i % 2 ==0) {
//				System.out.println("Even: " + i);	
//			}
//			else {
//				System.out.println("Odd: " + i);
//			}
//			
//		for (int i = 10; i >0; i --) {
//			if (i % 2 == 0) {
//				System.out.println("Even: " + i);	
//			}
//			else {
//				System.out.println("Odd: " + i);
//			}
//	//Example of looping backwards & finding the sum of even numbers
//		int sum = 0;
//		for (int i = 10; i > 0; i --) {
//			if (i % 2== 0) {
//				sum = sum + i;
//				System.out.println("Even: " + i);
//			}
//			else {
//				//System.out.println("Odd: " + i);
//			}
//		}
//		System.out.println("Sum: " + sum);
//		
//		
//		}
////Array Review
//		//declares an integer array, called 'ages'
//	// ages = 7,3,4,7,0
//		int size = 10;
//		
//		//I can set my array to a size already declared
//		int [] ages = new int [size];
//		
//		for (int i =0; i < ages.length; i++) {
//			System.out.println("Element: " + i + " " + ages[i]);
//		}
//		
//		//int [] ages = new int [5];
//		ages[0] = 7;
//		ages[3] = 3;
//		
//		double [] scores = new double[] {5.0, 4.5, 3.45, 2.34};
//		float[] floaties = new float[4];
//		//setting first element in Array to 7
//		ages[0] = 7;
//		ages[1] = ages[0] + 1;
//		System.out.println("age at zero element: " + ages[2]);
//		int sum = ages[0] + ages[2];
//		
//		/*/declaring Arrays Ex
//		int [] weights = new int[7];
//		double [] gpas = new double[15];
//		int [] ages = new int [8];
//		/*/
//		int mySize = ages.length;
//		System.out.println("size: " + mySize);
//		int lastElement = ages[ages.length - 1];
//		
//		//
//	}
//
//}
		//Scanner Example
		import java.util.Scanner;
		
		public class AreWeThereYet {
			public static void main (String[] args) {
				
				boolean there = false; 
				try (Scanner in = new Scanner(System.in)) {
					
					while(!there) {

						System.out.println("Bart: Are we there yet? (Enter 'Y' of 'N'");
						
						String answer = in.nextLine();
						
						if (answer.equalsIgnoreCase("Y")) {
							System.out.println("Yayyy");
							there = true;
						
						}
						else {
							System.out.println("Gross");
						}
						System.out.println("The value of answer: " + answer);
					}
					
			
				}
			}
		}
