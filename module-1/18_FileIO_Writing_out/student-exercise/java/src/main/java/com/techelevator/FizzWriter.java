package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) throws IOException {

		
		
		
		File fizzBuzz = new File("fizzBuzz");
		fizzBuzz.createNewFile();
		String fileName = "FizzBuzz.txt";
		File newFile = new File("../java/" + fileName);
		
		String numValue = " ";
		try (PrintWriter writer = new PrintWriter(fizzBuzz)) {
			for (Integer i = 1; i <= 300; i++) {
				numValue = i.toString();
				if ((i % 3 == 0) && (i % 5 == 0)) {
					writer.println(i + "|" + "FizzBuzz");
				} else if (i % 5 == 0) {
					writer.println(i + "|" + "Buzz");
				} else if (i % 3 == 0) {
					writer.println(i + "|" + "Fizz");
				} else {
					writer.println(i + "|" + "num");
				}
	
			}
	}
		System.out.println("FizzBuzz.txt has been created.");

	}
}



