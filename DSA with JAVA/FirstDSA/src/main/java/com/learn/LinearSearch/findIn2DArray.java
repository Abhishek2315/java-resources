package com.learn.LinearSearch;

public class findIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 4, 1},
                {3,45 ,14 , 29},
                {4, 55, 91, 18, 27},
                {45, 12}
        };
        int target = 18;

        System.out.println(search(arr, target));
        System.out.println(max(arr));


    }

    static boolean search(int[][] arr, int target) {

        if(arr.length ==0){
            return false;
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        if(arr.length ==0){
            return Integer.MAX_VALUE;
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                     max = arr[i][j];
                }
            }
        }
        return max;
    }
}
