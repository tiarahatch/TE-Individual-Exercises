package com.techelevator;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			boolean loop = true;
			while (loop){
				System.out.println("Please enter the temperature: ");
				String input = scanner.nextLine();
					double tempInput = Integer.parseInt(input);
					System.out.println("Is the temperature in (C)celcius, or (F)farenheit? ");
					String unitOfMeasure = scanner.nextLine();

					if ( unitOfMeasure.equals("F") || unitOfMeasure.equals("f")) {
						double C = (tempInput - 32) / 1.8;
						System.out.println(tempInput + " F  is " + C +"C.");
					}
					else if ( unitOfMeasure.equals("C") || unitOfMeasure.equals("c")) {
						double F = tempInput * 1.8 +32;
						System.out.println(tempInput + " C  is " + F +"F.");
					}
					else {
						System.out.println("please enter a valid input");
					}

			}
		}	
	}	
}
	