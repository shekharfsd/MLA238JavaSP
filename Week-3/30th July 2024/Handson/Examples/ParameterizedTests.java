package com.mphasis.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTests {
	private int input;
	private int expected;

	public ParameterizedTests(int input, int expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1, 2 }, { 2, 4 }, { 3, 6 } });
	}

	@Test
	public void testMultiplication() {
		assertEquals(expected, input * 2);
	}
}