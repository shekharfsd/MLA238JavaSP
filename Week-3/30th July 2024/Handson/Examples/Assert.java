package com.mphasis.junit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Assert {

    @Test
    public void testEquality() {
        int expected = 42;
        int actual = 42;

        assertEquals(expected, actual);
    }

    @Test
    public void testTrueCondition() {
        int actual = 42;

        assertTrue(actual == 42);
    }

    @Test
    public void testFalseCondition() {
        int actual = 42;

        assertFalse(actual != 42);
    }

    @Test
    public void testNullValue() {
        String nullString = null;

        assertNull(nullString);
    }

    @Test
    public void testNotNullValue() {
        String notNullString = "Hello, JUnit!";

        assertNotNull(notNullString);
    }

/**
* In this example:

assertEquals: Compares two values for equality. If the values are not equal,
it will fail the test.

assertTrue: Checks that a given condition is true. If the condition is false, 
it will fail the test.

assertFalse: Checks that a given condition is false. If the condition is true,
it will fail the test.

assertNull: Checks that a value is null. If the value is not null,
it will fail the test.

assertNotNull: Checks that a value is not null. If the value is null, 
it will fail the test.
 */
    }

