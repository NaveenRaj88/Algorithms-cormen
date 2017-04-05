package com.chap6;

import com.utils.ArrayGenerator;

import java.util.Arrays;

/**
 * Created by Naveen on 04-04-2017.
 */
public class HeapSort {

    public static void maxHeapify(int[] a, int i, int n){
        int left = 2*i;
        int right = 2*i+1;
        int largest = i;
        if(left< n && a[left] > a[largest]){
            largest = left;
        }
        if(right < n && a[right] > a[largest]){
            largest = right;
        }
        if(largest != i) {
            int temp = a[largest];
            a[largest] = a[i];
            a[i] = temp;
            maxHeapify(a, largest, n);
        }
    }

    public static void buildMaxHeap(int[] a){
        for (int i = a.length/2; i >0 ; i--) {
            maxHeapify(a,i, a.length);
        }
    }

    public static void heapSort(int[] a){
        buildMaxHeap(a);
        System.out.println("Heap Array "+Arrays.toString(a));
        int heapSize = a.length;
        for (int i = a.length-1; i >1 ; i--) {
            int temp = a[i];
            a[i] = a[1];
            a[1]= temp;
            heapSize--;
            maxHeapify(a,1, heapSize);
        }
    }
    public static void main(String[] args) {
        int[] a = ArrayGenerator.generateArray(11, 50);
        a[0] = 0;
        System.out.println(Arrays.toString(a));
        heapSort(a);
        System.out.println(Arrays.toString(a));
    }
}
