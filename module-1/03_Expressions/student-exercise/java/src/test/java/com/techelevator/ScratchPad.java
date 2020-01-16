package com.techelevator;

public class ScratchPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 1;
		
		//simple if statement
		if (age > 1) {
			System.out.println("Age: " + age);
		}
		
		else {
			System.out.println("OK");
		}
		
		//loop
		for (int i = 0; i<10; i++) {
			System.out.println(i);
		}
//Array Review
		//declares an integer array, called 'ages'
	// ages = 7,3,4,7,0
		int size = 10;
		
		//I can set my array to a size already declared
		int[] ages = new int [size];
		//ignore
		
		//int [] ages = new int [5];
		ages[0] = 7;
		ages[3] = 3;
		
		double [] scores = new double[] {5.0, 4.5, 3.45, 2.34};
		float[] floaties = new float[4];
		//setting first element in Array to 7
		ages[0] = 7;
		ages[1] = ages[0] + 1;
		System.out.println("age at zero element: " + ages[2]);
		int sum = ages[0] + ages[2];
		
		/*/declaring Arrays Ex
		int [] weights = new int[7];
		double [] gpas = new double[15];
		int [] ages = new int [8];
		/*/
		int mySize = ages.length;
		System.out.println("size: " + mySize);
		int lastElement = ages[ages.length - 1];
		
		//
	}

}
