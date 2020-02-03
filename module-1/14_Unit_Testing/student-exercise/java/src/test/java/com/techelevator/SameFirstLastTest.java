package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {
	
	SameFirstLast same;
	
	@Before
	public void setup() {
		same = new SameFirstLast();
	}

	@Test
	public void IsItTheSame() {
		Assert.assertEquals(false, same.isItTheSame(new int [] {1,2,3}));
		Assert.assertEquals(true, same.isItTheSame(new int [] {1,2,3,1}));
		Assert.assertEquals(true, same.isItTheSame(new int [] {1,2,1}));
	}

}
