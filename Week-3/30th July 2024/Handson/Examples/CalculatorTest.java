package com.mphasis.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAddition() {
		int result = Calculator.add(2, 3);
		assertEquals(5, result);
	}

	@Test
	public void testSubtraction() {
		int result = Calculator.subtract(5, 3);
		assertEquals(2, result);
	}

	
	@Test
	public void testMultiplication() {
		int result = Calculator.multiply(2, 3);
		assertEquals(6, result);
	}

	
	@Test(expected = IllegalArgumentException.class)
	public void testDivisionByZero() {
		Calculator.divide(5, 0);
	}
}
