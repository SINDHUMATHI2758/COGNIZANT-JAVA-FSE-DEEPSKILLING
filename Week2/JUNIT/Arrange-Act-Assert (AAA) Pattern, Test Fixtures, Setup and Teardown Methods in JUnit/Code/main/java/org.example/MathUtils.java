package org.example;

public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        return a / b; // Will throw ArithmeticException if b == 0
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
