package com.nickolss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {
    @Test
    void testFactorialOfZero() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(0);
        Assertions.assertEquals(1, result);
    }

    @Test
    void testFactorialOfThree() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(3);
        Assertions.assertEquals(6, result); // 3! = 6;
    }
}
