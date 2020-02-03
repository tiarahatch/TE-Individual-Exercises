package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MaxEnd3Test {
	
	MaxEnd3 maxEnd;
	
	@Before
	public void setup() {
		maxEnd = new MaxEnd3();
	}

	@Test
	public void testMakeArray() {
		
		Assert.assertArrayEquals(maxEnd.makeArray(new int[] { 1, 2, 3 }), new int[] { 3, 3, 3 });
	    Assert.assertArrayEquals(maxEnd.makeArray(new int[] { 11, 5, 9 }), new int[] { 11, 11, 11 });
	    
	}
}
