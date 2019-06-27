package com.lti.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.lti.Junit.Calculator;

public class CalculatorTest {

	private Calculator c;
	
	@Before 
	public void init() {
		c = new Calculator();
	}
	@Test
	public void testIfAddMethodWorks() {
		int actualResult = c.add(10,20);
		int expectedResult =30;
		assertEquals(expectedResult, actualResult);
	}
	public void testIfSubMethodWorks() {
		int actualResult = c.sub(10,20);
		int expectedResult = 10;
		assertEquals(expectedResult, actualResult);
	}
	
}
