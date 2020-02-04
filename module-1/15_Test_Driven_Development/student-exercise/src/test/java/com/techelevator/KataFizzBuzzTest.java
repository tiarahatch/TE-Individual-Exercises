package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	KataFizzBuzz FizzBuzz;
	KataFizzBuzz Fizz;
	KataFizzBuzz Buzz;
	KataFizzBuzz num;
	
	@Before
	public void setup() {
		FizzBuzz = new KataFizzBuzz();
		Fizz = new KataFizzBuzz();
		Buzz = new KataFizzBuzz();
		num = new KataFizzBuzz();
	}
	@Test
	public void testWhenDivisibleBy3And5() {
		Assert.assertEquals("FizzBuzz", num.fizzBuzz(15));
	}
	
	@Test
	public void testWhenDivisibleBy3() {
		Assert.assertEquals("Fizz", num.fizzBuzz(3));
	}
	
	@Test
	public void testWhenDivisibleBy5() {
		Assert.assertEquals("Buzz", num.fizzBuzz(5));
	}
	@Test
	public void testWhenDivisibleBy5AndContains5() {
		Assert.assertEquals("Buzz", num.fizzBuzz(5));
		Assert.assertEquals("Buzz", num.fizzBuzz(51));
	}
	@Test
	public void testWhenDivisibleBy3AndContains3() {
		Assert.assertEquals("Fizz", num.fizzBuzz(3));
		Assert.assertEquals("Fizz", num.fizzBuzz(13));
	}
	@Test
	public void testWhenDivisibleBy5And3OrContains5nd3() {
		Assert.assertEquals("FizzBuzz", num.fizzBuzz(35));
		Assert.assertEquals("FizzBuzz", num.fizzBuzz(53));
	}

}
