package com.company;

public class Main {

    static boolean IsPrime(int number) {
        for(int j = 2; j < number; j++) {
            if (number % j == 0 ) {
                return false;
            }
        }
        return true;
    }

    static void findPrimeNumbers(int[] array) {
        if(array.length == 0) {
            return;
        }

        for (int i = 0, number = array[i]; i < array.length - 1; i++, number = array[i]) {
            if(IsPrime(number)) {
                System.out.println(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        findPrimeNumbers(array);
    }
}
