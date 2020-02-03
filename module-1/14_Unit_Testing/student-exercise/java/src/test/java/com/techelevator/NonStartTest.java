package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class NonStartTest {

	NonStart start;
	
	@Before
	public void startup() {
		start = new NonStart();
	}

	@Test
	public void testGetPartialString() {
		Assert.assertEquals (start.getPartialString("Hello", "There"), "ellohere");
		Assert.assertEquals (start.getPartialString("java", "code"), "avaode");
		Assert.assertEquals (start.getPartialString("shotl", "java"), "hotlava");
		
	}
}
