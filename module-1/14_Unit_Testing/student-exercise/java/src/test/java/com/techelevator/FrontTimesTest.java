package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class FrontTimesTest {
	
	FrontTimes front;
	
	@Before
	public void setup() {
		front = new FrontTimes();
	}
	
	@Test
	public void testGenerateString() {
		
		Assert.assertEquals("ChoCho", front.generateString("Chocolate", 2));
		Assert.assertEquals("ChoChoCho", front.generateString("Chocolate", 3));
		Assert.assertEquals("AbcAbcAbc", front.generateString("Abc", 3));
}
}
