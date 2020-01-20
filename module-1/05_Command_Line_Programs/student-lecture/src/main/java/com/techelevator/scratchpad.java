package com.techelevator;

public class scratchpad {

	public static void main(String[] args) {
		
		
		String name = "Tech Elevator";
		String name2 = new String("I am a string too");
		
		char c = name.charAt(5);
		System.out.println(c);
		
		//Example of comparing two strings
		int rs = name.compareTo(name2);
		System.out.println(rs);
		
		//Example of concat
		//String s = name.concat(name2);
		//System.out.println(s);
		
		name = name.concat(name2);
		
		
		//Example of common mistake
		//String s = name.concat(name2);
		
		System.out.println(name);
		
		//Example of name.contains
		
		if (name.contains("ch")) {
			System.out.println("yes");
		}
		else {
			System.out.println("Not Found");
		}
		
		//Example of name.endswith
		if (name.endsWith("ch")) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
		
		//Example of index
		int index = name.indexOf('I'); //Remember no double quotes
		System.out.println(index);
		
		//example of needing to return two last characters
		if (name.length() >= 2) {
			System.out.println();
		}
		
		//Example of a split
//		if (name.startsWith(Tues)) {
//			return Tuesday;
//		}
		
		//Example using substrings
		String firstPart = name.substring(8);
		System.out.println(firstPart);
		
		String middlePart = name.substring(5, 8);//8 is ending index - 1 so you don't blow past last char
		System.out.println(name);
		System.out.println(middlePart);
		
		//Example changing case size
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		//Example w/ trim
		String var1 =  "my user input: ";
		System.out.println("[" + var1 + "]");
		System.out.println("[" + var1.trim() + "]");
	}
}
