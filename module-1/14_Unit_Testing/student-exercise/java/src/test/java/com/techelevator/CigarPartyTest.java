package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
;

public class CigarPartyTest {

	CigarParty cigars;
	
	@Before
	public void setup() {
		cigars = new CigarParty();
	}
	
	@Test
	public void testHaveParty() {
	
		Assert.assertEquals(false, cigars.haveParty(30, false));
		Assert.assertEquals(true, cigars.haveParty(50, false));
		Assert.assertEquals(true, cigars.haveParty(70, true));
	}
}
