package com.chap2;

import com.utils.ArrayGenerator;

import java.util.Arrays;

/**
 * Created by anandran on 3/22/17.
 */
public class SelectionSort {

    public static void selectionSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int index = i;
            int min = arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            if(index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = ArrayGenerator.generateArray(10);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
