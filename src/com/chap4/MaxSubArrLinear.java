package com.chap4;

/**
 * Created by anandran on 3/29/17.
 */
public class MaxSubArrLinear {

    public static int printMaxSubArr(int[] changeArr){
        int maxSoFar = changeArr[0];
        int maxEndingHere = changeArr[0];
        for (int i = 1; i <changeArr.length ; i++) {
            maxEndingHere = Math.max(changeArr[i], maxEndingHere+changeArr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] priceArr = {100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94, 90, 97};
        int[] changeArr = new int[priceArr.length];
        for (int i = 1; i < priceArr.length; i++) {
            changeArr[i] = priceArr[i] - priceArr[i - 1];
        }
        System.out.println(printMaxSubArr(changeArr));

        System.out.println(printMaxSubArr(priceArr));
    }
}
