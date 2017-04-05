package com.chap2;

import com.utils.ArrayGenerator;

import java.util.Arrays;

/**
 * Created by Naveen on 19-12-2016.
 */
public class InsertionSort {

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && key < arr[j]){
                    arr[j+1] = arr[j];
                    j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = ArrayGenerator.generateArray(10);
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
