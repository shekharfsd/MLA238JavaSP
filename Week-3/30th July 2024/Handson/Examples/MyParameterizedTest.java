package com.mphasis.junit;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MyParameterizedTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {1, 2, 3},  // Row 1
            {4, 5, 9},  // Row 2
            {7, 8, 16}  // Row 3
        });
    }

    private int a;
    private int b;
    private int sum;

    public MyParameterizedTest(int a, int b, int sum) {
        this.a = a;
        this.b = b;
        this.sum = sum;
    }

    @Test
    public void testAddition() {
        //System.out.println(sum);
    	//System.out.println(a);
       // System.out.println(b);
        assertEquals(sum, a + b);
    }
}
