package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Exercises {

	/*
	 * Map Exercises
	 */

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		
		animalName = animalName.toLowerCase();
		
			Map<String, String> allAnimalNames = new TreeMap<String, String>();
			
		allAnimalNames.put("rhino", "Crash");
		allAnimalNames.put("giraffe", "Tower");
		allAnimalNames.put("elephant" , "Herd");
		allAnimalNames.put("lion", "Pride");
		allAnimalNames.put("crow", "Murder");
		allAnimalNames.put("pigeon" , "Kit");
		allAnimalNames.put("flamingo", "Pat");
		allAnimalNames.put("deer" , "Herd");
		allAnimalNames.put("dog", "Pack");
		allAnimalNames.put("crocodile" , "Float");
				
		if(!allAnimalNames.containsKey(animalName)) {
				return "unknown";
			}
		else {
			return allAnimalNames.get(animalName);
		}

	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public Double isItOnSale(String itemNumber) {
		
		Double result = 0.00;
		itemNumber = itemNumber.toUpperCase();
		Map<String, Double> discountPercentage = new HashMap<String, Double>();
		
		discountPercentage.put("KITCHEN4001" , 0.20);
		discountPercentage.put("GARAGE1070" , 0.15);
		discountPercentage.put("LIVINGROOM" , 0.10);
		discountPercentage.put("KITCHEN6073" , 0.40);
		discountPercentage.put("BEDROOM3434" , 0.60);
		discountPercentage.put("BATH0073" , 0.15);
		
		if(discountPercentage.containsKey(itemNumber.toUpperCase())) {
			 result = discountPercentage.get(itemNumber.toUpperCase());
			
		}
		return result;
	}
		

	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		
		int peterMoney = peterPaul.get("Peter");
		int paulMoney = peterPaul.get("Paul");
		
		if (peterMoney > 0 && paulMoney < 1000) {
			int half = peterMoney / 2;
			paulMoney = paulMoney+ half;
			peterPaul.put("Paul", paulMoney);
			peterMoney = peterMoney - half;
			peterPaul.put("Peter", peterMoney);
			
			}
		return peterPaul;
		}

    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		
		
		int peterMoney = peterPaul.get("Peter");
		int paulMoney = peterPaul.get("Paul");
		
		if (peterMoney >= 5000 && paulMoney >=10000) {
			int quarterPaul = paulMoney / 4;
			paulMoney = paulMoney - quarterPaul;
			int quarterPeter = peterMoney / 4;
			peterMoney = peterMoney - quarterPeter;
			int total = quarterPaul + quarterPeter;
			
			peterPaul.put("Peter", peterMoney);
			peterPaul.put("Paul", paulMoney);
			peterPaul.put("PeterPaulPartnership", total);
			return peterPaul;
		}
		return peterPaul;
	}

	

	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		
		Map<String, String> myMap = new HashMap<String, String>();
		
		for (String chars  : words) {
			myMap.put(chars.substring(0, 1), chars.substring(chars.length() -1));
		}
		return myMap;
	}

	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the
	 * number of times that string appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		
		Map<String, Integer> myCounts = new HashMap<>();
		
			for (String word : words) {
				if(myCounts.containsKey(word)) {
					int currentCount = myCounts.get(word);
					currentCount++;
					myCounts.put(word,  currentCount) ;
				} else {
					myCounts.put(word, 1);
				}			
			}			
			return myCounts;
		}
	

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		
		Map<Integer, Integer> myCount = new HashMap<>();
		
			for (int integerCheck : ints) {
				if(myCount.containsKey(integerCheck)) {
					int currentCount = myCount.get(integerCheck);
					currentCount++;
					myCount.put(integerCheck, currentCount) ;
				} else {
					myCount.put(integerCheck, 1);
				}	
			}					
			return myCount;
	}
	
	
	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		
	Map<String, Boolean> wordMultiple = new HashMap<>();//return this map after feeding in Integer count results
	Map<String, Integer> trueTwoOrMore = new HashMap<>();//use this map to run count
	
	for  (String multipleTimes : words ) {
					
		if(trueTwoOrMore.containsKey(multipleTimes)) {
			int currentCount = trueTwoOrMore.get(multipleTimes);
			currentCount++;
			if (currentCount > 1){
			wordMultiple.put(multipleTimes, true);
			}else{ wordMultiple.put(multipleTimes, false);					 
			}
		} else { 
			trueTwoOrMore.put(multipleTimes, 1);
			wordMultiple.put(multipleTimes, false);					 
		}
		} 
	return wordMultiple;
	}


	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2,
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 *
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		
		   Map<String, Integer> inventoryMap = new HashMap<>();
		    
		    for (String name : mainWarehouse.keySet()){
		        if(remoteWarehouse.containsKey(name)){
		            inventoryMap.put(name, (mainWarehouse.get(name) + remoteWarehouse.get(name)));
		        } else {
		        	inventoryMap.put(name, mainWarehouse.get(name));
		        }
		    }
		    for (String name : remoteWarehouse.keySet()) {
		    	if (!(mainWarehouse.containsKey(name))) {
		    		inventoryMap.put(name, remoteWarehouse.get(name));
		    	}
		    }
		    return inventoryMap;        
		}
		
	

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1.
	 *
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
	
		Map<String, Integer> keyCount = new HashMap<>();
		
		
		for (String key : words) {
			if (words.length <= 2) {
				keyCount.put(key, 0);
				keyCount.put(key + 1, 0);
			}
		}
		
		return keyCount;
	}
	

		
	
	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		List<String> myList = new ArrayList<String>();
		Set<String> mySet = new HashSet<String>();
		
		
		
		return null;
	}

}
