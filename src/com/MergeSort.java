package com;

import java.util.Arrays;

/**
 * Created by Naveen on 19-12-2016.
 */
public class MergeSort {

    static int[] temp;
    public static void merge(int[] a, int start, int mid, int end){
        for (int i = start; i <end ; i++) {
            temp[i]=a[i];
        }
        int midIndex = mid+1;
        while(start<=mid && midIndex <= end){
            if(temp[start] <= temp[midIndex]){
                a[start]=temp[start++];
            }else{
                a[start] = temp[midIndex++];
            }
        }
        while(start <= mid ){

        }

    }

    public static void sort(int[] a, int st,int end){
        if(st< end){
            int  mid = (end+st)/2;
            sort(a,st,mid);
            sort(a,mid+1,end);
            merge(a,st,mid,end);
        }

    }

    public static void main(String[] args) {
        int[] a = {6,1,9,3,0,2,5};
        System.out.println(Arrays.toString(a));
        temp = new int[a.length];
        sort(a,0,a.length-1);
        System.out.println(a);
    }
}