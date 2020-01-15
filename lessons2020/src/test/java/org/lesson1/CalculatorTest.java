package org.lesson1;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Calculator calculator;

    @Before
    public void init() {
        System.out.println("before");
        calculator = new Calculator();
    }

    @Test
    public void calcShouldReturnSumWhen1Plus2() {
        System.out.println("test1");
        final int actual = calculator.calc(1, "+", 2);
        final int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void calcShouldReturnSumWhen3Plus2() {
        System.out.println("test2");
        final int actual = calculator.calc(2, "+", 3);
        final int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void calcShouldReturnMinusWhen1Plus2() {
        final int actual = calculator.calc(1, "-", 2);
        final int expected = -1;

        assertEquals(expected, actual);
    }

    @Test
    public void calcShouldReturnMultWhen2Mult3() {
        final int actual = calculator.calc(2, "*", 3);
        final int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void calcShouldReturnDivWhen2And3() {
        final int actual = calculator.calc(2, "/", 3);
        final int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void calcShouldThrowIllegalArgumentExceptionWhenOperatorIsNull() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Operator is null");
        calculator.calc(1, null, 3);
    }

    @Test
    public void calcShouldThrowIllegalArgumentExceptionWhenOperatorIsNotExpected() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Operator is not expected");
        calculator.calc(1, "%", 3);
    }
}