package com.utils;

import java.util.Arrays;

/**
 * Created by Naveen on 02-04-2017.
 */
public class ArrayPrinter {

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println();
    }
}
