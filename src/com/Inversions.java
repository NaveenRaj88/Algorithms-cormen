package com;

/**
 * Created by anandran on 3/23/17.
 */
public class Inversions {

    public static void printInversions(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    k++;
                    System.out.print("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
        System.out.println("  total number of inversions  " + k);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 8, 6, 1};
        printInversions(arr);


        arr = new int[]{8, 6, 5, 4, 3, 2, 1};
        printInversions(arr);

    }
}
