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
        for (int i = start; i < end ; i++) {
            if(start >= mid){
                a[i] = temp[mid++];
            }else if(mid>end){
                a[i] = temp[start++];
            }else if(temp[start]< temp[mid]){
                a[i] = temp[start++];
            }else{
                a[i] = temp[mid++];
            }
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
        sort(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }
}