package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class Less20Test {
	
	Less20 less;
	
	@Before
	public void setup() {
		less = new Less20();
	}
	
	@Test
	public void testisLessThanMultipleOf20() {
		
		Assert.assertEquals(true, less.isLessThanMultipleOf20(18));
		Assert.assertEquals(true, less.isLessThanMultipleOf20(19));
		Assert.assertEquals(false, less.isLessThanMultipleOf20(20));
}
}
