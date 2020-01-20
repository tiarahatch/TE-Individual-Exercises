package com.techelevator;
import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		double feet, meters;
		try (Scanner in = new Scanner(System.in)) {
			
			System.out.println("Enter Length: ");
			String value = in.nextLine();
			
			feet = Double.parseDouble(value);
			meters = Double.parseDouble(value);
			
			System.out.println("Enter (f) for feet, or (m) for meters: ");
			String value2 = in.nextLine();
			
			
			if (value2.equals("f")) {
				 meters = feet * 0.3048d;
				 System.out.println(meters + "meters");
			}
						
			else {
				feet = meters * 3.2808399;
				System.out.println(feet + "feet");
			}

		}
	}
}
