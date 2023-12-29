package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    void add_TwoNumbers_Test() {
        int result = calc.add(2, 2);

        assertEquals(4, result);
    }

}