package com.akozachenko.calculator;

public interface Calculator {
    int sum(int a, int b);
    int minus(int a, int b);
    int multiplication(int a, int b);
    double divide(int a, int b) throws ArithmeticException;
    double getPercent(double number, double persent);
    int pow(double a, double n);
}
