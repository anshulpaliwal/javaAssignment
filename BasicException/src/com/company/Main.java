package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            int fact = Factorial.getFactorial(11243245);
            System.out.println("Factorial = " + fact);
        }
        catch(Factorial.InvalidInputException e) {
            System.out.println(e.getMessage());
        }
        catch(Factorial.FactorialException e) {
            System.out.println(e.getMessage());
        }
    }
}

