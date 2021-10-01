package com.company;

public class Main {

    static int countNumbersToDelete(int[] array) {
        int counter = 0, number;

        for(int i = 0; i < array.length - 1; i++) {
            number = array[i];
            
            if(number > array[i+1]) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
	    int[] array = new int[] { 4, 1, 3, 5, 2, 6, 2, 8};

        System.out.println(countNumbersToDelete(array));
    }
}
