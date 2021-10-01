package com.company;

public class Main {

    static double getResult(double x, double y) {
        return ((1 + Math.sin(x + y) * Math.sin(x + y)) /
                (2 + Math.abs(x - (2 * x) / (1 + x * x + y * y))) + x);
    }

    public static void main(String[] args) {
        try
        {
            System.out.println("Result: " + getResult(0, 0));
        }
        catch (ArithmeticException e)
        {
            System.out.println("Attempted to divide by zero.");
        }
    }
}
