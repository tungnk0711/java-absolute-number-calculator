package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int res = AbsoluteNumberCalculator.findAbsolute(number);

        assertEquals(expected,res);


    }

    @Test
    void testFindAbsolute1(){
        int number = 1;
        int expected = 1;

        int res = AbsoluteNumberCalculator.findAbsolute(number);

        assertEquals(expected, res);
    }

    @Test
    void testFindAbsoluteNegative1(){
        int number = -1;
        int expected = 1;

        int res = AbsoluteNumberCalculator.findAbsolute(number);

        assertEquals(expected, res);
    }
}