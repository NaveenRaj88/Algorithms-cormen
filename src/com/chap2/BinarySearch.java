package com.chap2;

import com.utils.ArrayGenerator;

import java.util.Arrays;

/**
 * Created by anandran on 3/22/17.
 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                start = mid;
            }else{
                end = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = ArrayGenerator.generateArray(10);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, arr[6]));
    }
}
