package org.lesson1;

public class Calculator {

    private static final String PLUS = "+";
    private static final String MULT = "*";
    private static final String DIV = "/";
    private static final String MINUS = "-";

    public int calc(int a, String operator, int b) {
        if (operator == null) {
            throw new IllegalArgumentException("Operator is null");
        }

        switch (operator) {
            case PLUS:
                return a + b;
            case MULT:
                return a * b;
            case DIV:
                return a / b;
            case MINUS:
                return a - b;
            default:
                throw  new IllegalArgumentException("Operator is not expected");
        }
    }
}
