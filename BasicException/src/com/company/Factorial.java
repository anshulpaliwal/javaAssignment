package com.company;

public class Factorial {
    public static int getFactorial(int number) throws InvalidInputException, FactorialException {
        int factorial = 2;
        if (number < 2) {
            throw new InvalidInputException("Number is less than 2 hence throwing exception.");
        } else {
            for (int i = number; i > 2; i--) {
                factorial = factorial * i;
                if (factorial > Integer.MAX_VALUE) {
                    throw new FactorialException("Factorial exceeds the range");
                }
            }
        }
        return factorial;
    }

    static class InvalidInputException extends Throwable {
        public InvalidInputException(String exception) {
            super(exception);
        }
    }

    static class FactorialException extends Throwable {
        public FactorialException(String exception) {
            super(exception);
        }
    }
}
