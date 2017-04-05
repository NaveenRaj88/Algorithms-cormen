package com.chap2;

import java.util.Arrays;

/**
 * Created by anandran on 3/23/17.
 */
public class InversionsWithMergeSort {

    static int[] temp;


    private static int merge(int[] a, int st, int mid, int end) {
        int invCount = 0;
        for (int i = st; i <= end; i++) {
            temp[i] = a[i];
        }
        int i = st;
        int j = mid;
        int k = st;
        while (i <= mid && j <= end) {
            if (temp[i] <= temp[j]) {
                a[k++] = temp[i++];
            } else {
                invCount += (mid - i);
                a[k++] = temp[j++];
            }
        }

        while (i < mid) {
            a[k++] = temp[i++];
        }
        while (j < end) {
            a[k++] = temp[j++];
        }
        return invCount;
    }

    public static int mergeSort(int[] a, int st, int end) {
        int invCount = 0;
        if (st < end) {
            int mid = (end + st) / 2;
            invCount = mergeSort(a, st, mid);
            invCount += mergeSort(a, mid + 1, end);
            invCount += merge(a, st, mid + 1, end);
        }
        return invCount;
    }

    public static void main(String[] args) {
        int invCount = 0;

        int[] a = {8, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(a));
        temp = new int[a.length];
        invCount = mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
        System.out.println("  total inversions  " + invCount);


        a = new int[]{2, 3, 8, 6, 1};
        System.out.println(Arrays.toString(a));
        temp = new int[a.length];
        invCount = mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
        System.out.println("  total inversions  " + invCount);
    }
}
