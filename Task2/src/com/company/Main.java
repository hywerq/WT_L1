package com.company;

public class Main {

    static boolean checkPoint(double x, double y) {
        if(y >= 0 && y <= 5 && Math.abs(x) <= 4) {
            return true;
        }
        if(y < 0 && y >= -3 && Math.abs(x) <= 6) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.print(checkPoint(5, 0));
    }
}
