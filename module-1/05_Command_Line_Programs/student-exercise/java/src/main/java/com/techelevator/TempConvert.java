package com.techelevator;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
	    Scanner in = new Scanner(System.in);
	    
	  
	    System.out.println("Enter temperature: ");
	    double f = in.nextInt();
	    double c = (f - 32) / 1.8;
	    System.out.println("Temperature in Celcius: " + c);
	  }
	}