package com;

import com.utils.ArrayGenerator;

import java.util.Arrays;

/**
 * Created by Naveen on 19-12-2016.
 */
public class MergeSort {

    static int[] temp;

    private static void merge(int[] a, int st, int mid, int end) {
        for (int i = st; i <= end; i++) {
            temp[i] = a[i];
        }
        int i = st;
        int j = mid + 1;
//        int k = st;
//
//        while(i<= mid && j <= end){
//            if(temp[i] <= temp[j]){
//                a[k++] = temp[i++];
//            }else{
//                a[k++] = temp[j++];
//            }
//        }
//
//        while(i<= mid){
//            a[k++] = temp[i++];
//        }
//        while(j<= end){
//            a[k++] = temp[j++];
//        }

        for (int k = st; k <= end; k++) {
            if (i > mid) {
                a[k] = temp[j++];
            } else if (j > end) {
                a[k] = temp[i++];
            } else if (temp[i] < temp[j]) {
                a[k] = temp[i++];
            } else {
                a[k] = temp[j++];
            }
        }
    }

    public static void mergeSort(int[] a, int st, int end) {
        if (st < end) {
            int mid = st + (end - st) / 2;
            mergeSort(a, st, mid);
            mergeSort(a, mid + 1, end);
            merge(a, st, mid, end);
        }

    }

    public static void main(String[] args) {
        int[] a = ArrayGenerator.generateArray(10, 5);
        System.out.println(Arrays.toString(a));
        temp = new int[a.length];
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}