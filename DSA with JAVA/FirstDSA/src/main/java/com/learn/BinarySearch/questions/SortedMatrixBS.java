package com.learn.BinarySearch.questions;

import java.util.Arrays;

public class SortedMatrixBS {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target =11;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix , int target){
        int rows = matrix.length;
        int cols = matrix[0].length -1;

        if (rows == 1){
            return binarySearch(matrix, 0, 0, cols -1, target);
        }


        int rowStart = 0;
        int rowEnd = rows -1;
        int columnMid = cols / 2;

        // run the loop until 2 rows should remain
        while (rowStart < (rowEnd -1)) { // while this will true it will have more than 2 rows

            int mid = rowStart + (rowEnd - rowStart) / 2;

            if(matrix[mid][columnMid] == target){
                return new int[]{mid, columnMid};
            }

            if( matrix[mid][columnMid] < target){
                rowStart = mid ;
            } else {
                rowEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the column of 2 rows

        if(matrix[rowStart][columnMid] == target){
            return new int[]{rowStart, columnMid};
        }

        if(matrix[rowStart + 1][columnMid] == target){
            return new int[]{rowStart +1, columnMid};
        }

        // search in the first half
        if(target <= matrix[rowStart][columnMid -1]){
            return binarySearch(matrix, rowStart, 0, columnMid -1, target);
        }

        // search in the first half
        if(target >= matrix[rowStart][columnMid +1] && target <= matrix[rowStart][cols -1]){
            return binarySearch(matrix, rowStart, columnMid +1, cols -1, target);
        }

        // search in the first half
        if(target >= matrix[rowStart + 1][columnMid -1]){
            return binarySearch(matrix, rowStart + 1, 0, columnMid -1, target);
        } else {
            return binarySearch(matrix, rowStart + 1, columnMid +1, cols -1, target);
        }

    }

    // search in the row provided between columns provided
    static int[] binarySearch(int[][] matrix, int row, int startColumn, int endColumn, int target){

        while (startColumn <= endColumn){
            int mid = startColumn + (endColumn - startColumn) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }

            if(matrix[row][mid] < target){
                startColumn = mid + 1;
            } else {
                endColumn = mid -1;
            }
        }
        return new int[]{-1, -1};
    }
}
