package com.akozachenko.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorDecimalImplTest {

    private Calculator calculator;

    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("BeforeClass CalculatorDecimalImplTest.class");
    }

    @Before
    public void setUp() throws Exception {
        calculator = new CalculatorDecimalImpl();
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void sum() {
        assertEquals(4, calculator.sum(2,2));
    }

    @Test
    public void minus() {
        assertEquals(2, calculator.minus(6,4));
    }

    @Test
    public void multiplication() {
        assertEquals(4, calculator.multiplication(2,2));
    }

    @Test
    public void dividePositive() {
        assertEquals(125, calculator.divide(500,4), 0);
    }

    @Test
    public void divideNegative() {
        assertNotEquals(125, calculator.divide(500,2), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divideException() {
        assertEquals(125, calculator.divide(500,0), 0);
    }

    @Test
    public void getPercent() {
        assertEquals(1, calculator.getPercent(100,1),0);
    }

    @Test
    public void pow() {
        assertEquals(4, calculator.pow(2,2));

    }

    @AfterClass
    public static void afterClassMethod(){
        System.out.println("AfterClass CalculatorDecimalImplTest.class");
    }
}