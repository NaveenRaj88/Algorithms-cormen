package com.utils;

import java.util.Random;

/**
 * Created by anandran on 3/21/17.
 */
public class ArrayGenerator {

    static Random random = new Random();

    public static int[] generateArray(int size){
        int[] arr = new int[size];
        for (int j = 0; j <size; j++) {
            arr[j] =random.nextInt(1000);
        }
        return arr;
    }


    public static int[] generateArray(int size,int bound){
        int[] arr = new int[size];
        for (int j = 0; j <size; j++) {
            arr[j] =random.nextInt(bound);
        }
        return arr;
    }

}
