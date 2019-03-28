package com.akozachenko.calculator;

public class CalculatorDecimalImpl implements Calculator {
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public double divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

    @Override
    public double getPercent(double number, double percent) {
        return (number/100)*percent;
    }

    @Override
    public int pow(double a, double n) {
        return new Double(Math.pow(a, n)).intValue();
    }
}
