package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems;
	private double totalAmountOwed;
	
	
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	public double getAveragePricePerItem() {
//		(double)totalAmountOwed / (double)totalNumberOfItems;
//		return averagePricePerItem;
		return (double)totalAmountOwed / (double)totalNumberOfItems;
	}
	public void addItems(int numberOfItems, double pricePerItem) {
		totalNumberOfItems = numberOfItems;
		totalAmountOwed = pricePerItem * numberOfItems;
	}
	public void empty() {
		totalNumberOfItems = 0;
		totalAmountOwed = 0;
	}
	
}
