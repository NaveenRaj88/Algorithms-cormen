package com;

import com.utils.ArrayGenerator;

import java.util.Arrays;

/**
 * Created by anandran on 3/22/17.
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = arr.length; i > 0; i--) {

        }
    }

    public static void main(String[] args) {
        int[] arr = ArrayGenerator.generateArray(10, 5);
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
