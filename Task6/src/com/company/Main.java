package com.company;

public class Main {

    static void shiftArray(int[] array) {
        int temp = array[0];

        for (int j = 0; j < array.length - 1; j++) {
            array[j] = array[j+1];
        }

        array[array.length-1] = temp;
    }

    static void fillMatrix(int[] array) {
        if(array.length == 0) {
            return;
        }

        int[][] newArray = new int[array.length][array.length];

        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                newArray[i][j] = array[j];

                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();

            shiftArray(array);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};

        fillMatrix(array);
    }
}
