package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		File inputFile = getInputFileFromUser();
		String word = wordToSearch();
		searchWord(inputFile, word);

	}

	private static File getInputFileFromUser() {
		@SuppressWarnings("resource")
		Scanner fileInput = new Scanner(System.in);
		System.out.println("Enter file path:");
		String path = fileInput.nextLine();

		File inputFile = new File(path);
		if (!inputFile.exists()) {
			System.out.println(path + " Does not exist");
			System.exit(1);

		} else if (!inputFile.isFile()) {
			System.out.println(path + " is not a file");
			System.exit(1);

		}
		return inputFile;
	}

	public static String wordToSearch() {
		@SuppressWarnings("resource")
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Search word: ");
		String searchWord = userInput.nextLine();

		return searchWord;

	}

	public static String searchWord(File inputFile, String searchWord) {
		
		Scanner caseSensitive = new Scanner(System.in);
		System.out.println("Would you like your search to be case sensitive? (Y) or (N) ");
		String yesOrNo = caseSensitive.nextLine().toLowerCase();

		try (Scanner input = new Scanner(inputFile)) {
			int i = 0;
			
			while (input.hasNextLine()) {
				if (yesOrNo.equals("n")) {
					i++;
					String line = input.nextLine();
					if (line.toLowerCase().contains(searchWord.toLowerCase())) {
						System.out.println(i + line);
				} 
					else {
					String line1 = input.nextLine();
					}
					if (line.contains(searchWord)) {
						System.out.println(i  + line);
					}
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("Your file doesn't exist");
		}
		return "";

	}

}
