package com.chap4;

import java.util.Arrays;

/**
 * Created by anandran on 3/29/17.
 */
public class MaxSubArrDivAndConq {


    private static int[] findMaxSubArr(int[] arr, int low, int high) {
        if (low == high) {
            return new int[]{low, high, arr[low]};
        }
        int mid = (high + low) / 2;
        int[] leftTuple = findMaxSubArr(arr, low, mid);
        int[] rightTuple = findMaxSubArr(arr, mid + 1, high);
        int[] crossTuple = findMaxCrossingSubArr(arr, low, mid, high);
        if (leftTuple[2] > rightTuple[2] && leftTuple[2] > crossTuple[2]) {
            return leftTuple;
        } else if (rightTuple[2] > leftTuple[2] && rightTuple[2] > crossTuple[2]) {
            return rightTuple;
        } else {
            return crossTuple;
        }
    }

    private static int[] findMaxCrossingSubArr(int[] arr, int low, int mid, int high) {
        int leftSum = 0;
        int maxLeft = Integer.MIN_VALUE;
        int leftindex = mid;
        for (int i = mid; i >= 0; i--) {
            leftSum += arr[i];
            if (leftSum > maxLeft) {
                maxLeft = leftSum;
                leftindex = i;
            }
        }
        int rightSum = 0;
        int maxRight = Integer.MIN_VALUE;
        int rightIndex = mid + 1;
        for (int i = mid + 1; i <= high; i++) {
            rightSum += arr[i];
            if (rightSum > maxRight) {
                maxRight = rightSum;
                rightIndex = i;
            }
        }
        return new int[]{leftindex, rightIndex, maxLeft + maxRight};
    }

    public static void main(String[] args) {
        int[] priceArr = {100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94, 90, 97};
        int[] changeArr = new int[priceArr.length];
        for (int i = 1; i < priceArr.length; i++) {
            changeArr[i] = priceArr[i] - priceArr[i - 1];
        }
        System.out.println(Arrays.toString(findMaxSubArr(changeArr, 0, changeArr.length - 1)));
    }
}
