package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class DateFashionTest {
	
	DateFashion date;
	
	@Before
	public void setup() {
		date = new DateFashion();
	}
	
	@Test
	public void testGetATable() {
		
		Assert.assertEquals(2, date.getATable(5, 10));
		Assert.assertEquals(0, date.getATable(5, 2));
		Assert.assertEquals(1, date.getATable(5, 5));
}
}
