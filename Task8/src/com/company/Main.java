package com.company;

import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> findIndexToEnterArray (double[] array1, double[] array2){
        ArrayList<Integer> indexArray = new ArrayList<Integer>();

        for(int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length - 1; j++) {
                if (array1[j] < array2[i] && array1[j + 1] >= array2[i]) {
                    indexArray.add(j);
                }
            }
        }

        return indexArray;
    }

    static void ShowIndex(ArrayList<Integer> indexArray) {
        for(int index : indexArray) {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        double[] array1 = new double[] {1, 1.3, 2, 3.3, 4};
        double[] array2 = new double[] {0.5, 1.6, 2.5, 4.4};

        ShowIndex(findIndexToEnterArray(array1, array2));
    }
}
