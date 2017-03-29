package com.chap4;

import java.util.Arrays;

/**
 * Created by anandran on 3/27/17.
 */
public class MaxSubArrBruteForce {

    private static void printMaxSubarrayIndex(int[] priceArr){
        int[] changeArr = new int[priceArr.length];
        for(int i =1; i<changeArr.length; i++){
            changeArr[i] = priceArr[i]-priceArr[i-1];
        }
        int stIndex = 0;
        int endIndex = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i <changeArr.length-1 ; i++) {
            int currentSum = changeArr[i];
            for (int j = i+1; j < changeArr.length; j++) {
                currentSum += changeArr[j];
                if(currentSum > maxValue){
                    maxValue = currentSum;
                    stIndex = i;
                    endIndex = j;
                }
            }
        }
        System.out.println(Arrays.toString(changeArr));
        System.out.println("Max SubArray = "+stIndex +" to "+endIndex);
    }

    public static void main(String[] args) {
         int[] priceArr = {100,113,110,85,105,102,86,63,81,101,94,106,101,79,94,90,97};
         printMaxSubarrayIndex(priceArr);
    }


}
