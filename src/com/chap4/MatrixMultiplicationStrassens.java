package com.chap4;

import com.utils.ArrayGenerator;

/**
 * Created by Naveen on 02-04-2017.
 */
public class MatrixMultiplicationStrassens {

    public static int[][] matrixMultiply(int[][] a, int[][] b){
        int n = a.length;
        int[][] c = new int[n][n];
        if(n == 1){
            c[0][0] = a[0][0] * b[0][0];
        }else{

        }
        return c;
    }

    public static void main(String[] args) {
        int[][] a = ArrayGenerator.generateMatrixArray(5,5);
        int[][] b = ArrayGenerator.generateMatrixArray(5,5);


    }


}

