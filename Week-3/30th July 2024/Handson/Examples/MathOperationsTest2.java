package com.mphasis.junit;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathOperationsTest2 {

    private static MathOperations2 mathOperations;

    @BeforeClass
    public static void setUpBeforeClass() {
        // Initialize MathOperations object once before any test methods are run
        System.out.println("Before all tests");
        mathOperations = new MathOperations2();
    }

    @AfterClass
    public static void tearDownAfterClass() {
        // Cleanup resources or finalize operations once after all test methods have run
        System.out.println("After all tests");
        mathOperations = null;
    }

    @Before
    public void setUp() {
        // Setup code before each test method
        System.out.println("Before each test");
    }

    @After
    public void tearDown() {
        // Cleanup code after each test method
        System.out.println("After each test");
    }

    @Test
    public void testAdd() {
        // Test addition method
        System.out.println("Running testAdd");
        assertEquals(5, mathOperations.add(2, 3));
        assertEquals(0, mathOperations.add(-1, 1));
    }

    @Test
    public void testMultiply() {
        // Test multiplication method
        System.out.println("Running testMultiply");
        assertEquals(6, mathOperations.multiply(2, 3));
        assertEquals(-6, mathOperations.multiply(-2, 3));
    }
}
