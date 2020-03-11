package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

				
			//create a scanner object to obtain user input
			Scanner input = new Scanner(System.in);
						
						
				System.out.print("enter a decimal integer for conversion to Binary:  ");
				int decimalInput = input.nextInt();
					String binaryOutput="";
						
					if (decimalInput < 0) {
						System.out.println("Please Enter a number greater than Zero");
					}else if (decimalInput == 0) {
						System.out.println("0");
					}else {
						while (decimalInput > 0) {
							binaryOutput=(decimalInput%2)+binaryOutput;
							decimalInput = decimalInput/2;
								
					}
						
					System.out.println("Binary is: "+binaryOutput);
					} 
					System.exit(0);
							
		}			

	}


