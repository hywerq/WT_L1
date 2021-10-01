package com.company;

public class Main {

    static void sortArray(double[] unsortedArray) {
        double temp;
        for(int j = 0; j < unsortedArray.length / 2; j++) {
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    temp = unsortedArray[i + 1];
                    unsortedArray[i + 1] = unsortedArray[i];
                    unsortedArray[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
	    double[] array = new double[] {0.1, 1, 0.2, 3, 0.4, 5, 0.2};

	    sortArray(array);

	    for(double number : array) {
	        System.out.println(number);
        }
    }
}
