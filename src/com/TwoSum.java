package com;

import com.utils.ArrayGenerator;

import java.util.Arrays;

/**
 * Created by anandran on 3/22/17.
 * <p>
 * Describe a ‚.n lg n/-time algorithm that, given a set S of n integers and another
 * integer x, determines whether or not there exist two elements in S whose sum is
 * exactly x.
 */
public class TwoSum {

    public static boolean twoSum(int[] arr, int sum) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int curSum = arr[i] + arr[j];
            if (sum == curSum) {
                return true;
            } else if (sum > curSum) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = ArrayGenerator.generateArray(100);
        Arrays.sort(arr);
        System.out.println(twoSum(arr, arr[50] + arr[52]));
    }
}
