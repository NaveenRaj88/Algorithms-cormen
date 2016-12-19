package com;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Naveen on 19-12-2016.
 */
public class InsertionSort {

    public static void main(String[] args) {

        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            intArr.add(i);
        }
        intArr.add(10);

        int[] a = {5,1,8,3,6,4};
        System.out.println(Arrays.toString(a));
        for (int i = 1; i <a.length ; i++) {
            for (int j = i; j>0 && a[j]<a[j-1] ; j--) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
