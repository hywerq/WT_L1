package com.company;

public class Main {

    static void findFunc(double a, double b, double h) {
        for(double i = a; i <= b; i += h) {
            showTable(i, Math.tan(i));
        }
    }

    static void showTable(double x, double result) {
        System.out.println(x + " " + result);
    }

    public static void main(String[] args) {
        findFunc(1, 2, 0.5);
    }
}
