package com.chap7;

import com.utils.ArrayGenerator;

import java.util.Arrays;

/**
 * Created by Naveen on 04-04-2017.
 */
public class Quicksort {

    public static int partition(int[] a, int start, int end){
        int pivot = a[end];
        int pindex = start;
        for(int i=start; i <end; i++){
            if(a[i] <= pivot){
                int temp = a[i];
                a[i] = a[pindex];
                a[pindex] = temp;
                pindex++;
            }
        }
        a[end] = a[pindex];
        a[pindex] = pivot;
        return pindex;
    }

    public static void quickSort(int[] a, int start, int end){
        if(start < end){
            int pIndex  = partition(a, start, end);
            quickSort(a,start,pIndex-1);
            quickSort(a,pIndex+1, end);
        }
    }

    public static void main(String[] args) {
        int[] a = ArrayGenerator.generateArray(10, 50);
        System.out.println(Arrays.toString(a));
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
