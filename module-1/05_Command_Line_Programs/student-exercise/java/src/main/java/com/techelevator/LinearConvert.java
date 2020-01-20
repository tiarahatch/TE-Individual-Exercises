package com.techelevator;
import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			
			System.out.println("Enter Length: ");
			String value = in.nextLine();
			
			double toFeet = Double.parseDouble(value);
			double toMeters = Double.parseDouble(value);
			
			System.out.println("Enter (f) for feet, or (m) for meters: ");
			String value2 = in.nextLine();
			
			
			if (value2.equals("f")) {
				double feet = value * 3.2808399d;
				System.out.println(feet);
			}
						
			else {
				double meters = feet * 0.3048d;
				System.out.println(meters);
			}

		}
	}
}
