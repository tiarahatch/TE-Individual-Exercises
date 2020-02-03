package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class Lucky13Test {
	
	Lucky13 lucky;
	
	@Before
	public void setup() {
		lucky = new Lucky13();
	}

	@Test
	public void testGetLucky() {
		Assert.assertEquals(true, lucky.getLucky(new int [] {0, 2, 4}));
		Assert.assertEquals(false, lucky.getLucky(new int [] {1, 2, 3}));
		Assert.assertEquals(false, lucky.getLucky(new int [] {1, 2, 4}));
		
	}

}
