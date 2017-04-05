package com.chap4;

import com.utils.ArrayGenerator;
import com.utils.ArrayPrinter;

import java.util.Arrays;

/**
 * Created by Naveen on 02-04-2017.
 */
public class MatrixMultiplicationBF {

    public static void multiplyMatrix(int[][] a, int[][] b){
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < b[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        ArrayPrinter.printMatrix(c);
    }

    public static void main(String[] args) {
        int[][] a = ArrayGenerator.generateMatrixArray(5,5);
        int[][] b = ArrayGenerator.generateMatrixArray(5,5);

         a =new int[][] {{1,3},{7,5}};
         b = new int[][] {{6,8},{4,2}};

        ArrayPrinter.printMatrix(a);
        ArrayPrinter.printMatrix(b);

        multiplyMatrix(a,b);

    }
}
