package com.shuka.calculator;

import junit.junit.Test;
import static junit.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }
}
