package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class StringBitsTest {
	
	StringBits string;
	
	@Before
	public void setup() {
		string = new StringBits();
	}

	@Test
	public void testGetBits() {
		Assert.assertEquals("Hlo", string.getBits("Hello"));
		Assert.assertEquals("H", string.getBits("Hi"));
		Assert.assertEquals("Hello", string.getBits("Heeololeo"));
	}

}
