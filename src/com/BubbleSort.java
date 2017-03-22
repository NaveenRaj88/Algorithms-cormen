package com;

import com.utils.ArrayGenerator;

import java.util.Arrays;

/**
 * Created by anandran on 3/22/17.
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {

    }

    public static void main(String[] args) {
        int[] arr = ArrayGenerator.generateArray(10);
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
