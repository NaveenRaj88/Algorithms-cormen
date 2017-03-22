package com.utils;

import java.util.Random;

/**
 * Created by anandran on 3/21/17.
 */
public class ArrayGenerator {

    static Random random = new Random();

    public static int[] generateArray(int i){
        int[] arr = new int[i];
        for (int j = 0; j <i; j++) {
            arr[j] =random.nextInt(1000);
        }
        return arr;
    }
}
