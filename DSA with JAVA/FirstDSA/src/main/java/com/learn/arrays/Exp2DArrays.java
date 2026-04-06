package com.learn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exp2DArrays {

    public static void main(String[] args) {

        /*
            1 2 3
            4 5 6
            7 8 9
        */

        int[][] arr = new int[3][];
        // number of column is not necessary to define but defining number of rows is necessary


        // this also a way to define 2D array
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        int[][] arr2 = {
                {1, 2}, //0th index
                {4, 5, 6}, // 1st index
                {7, 8, 9, 10}, // 2nd index ----> arr2[3] = {7,8,9,10}
        };

        // In heap memory it will store as array of arrays like this
        // [
        //      [1,2,3],
        //      [4,5,6],
        //      [7,8,9]
        // ]


        System.out.println(arr2[2][1]); // 8
        System.out.println(Arrays.toString(arr2[2])); // [7, 8, 9, 10]

        Scanner in = new Scanner(System.in);
        int[][] arr3 = new int[3] [3];
        System.out.println(arr3.length); // no of rows
        // input
        for (int row = 0; row < arr3.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr3[row].length; col++) {
                arr3[row][col] = in.nextInt();
            }
        }

        // output
        for (int row = 0; row < arr3.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr3[row].length; col++) {
                System.out.print(arr3[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(arr3)); // wrong way to print 2D array
        // output new way
        for (int row = 0; row < arr3.length; row++) {
            System.out.println(Arrays.toString(arr3[row])); // that is a right way
        }
        // enhanced way
        for (int[] ints : arr3) {
            System.out.println(Arrays.toString(ints)); // that is a right way
        }


    }
}
