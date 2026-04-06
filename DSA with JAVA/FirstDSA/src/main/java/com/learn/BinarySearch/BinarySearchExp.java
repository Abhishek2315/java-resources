package com.learn.BinarySearch;

public class BinarySearchExp {

    public static void main(String[] args) {
        int[] nums = {-19, -2, 0, 4, 5, 9, 44, 85, 99, 101, 146};
        int target = -20;
        System.out.println(binarySearch(nums, target));
    }

    // will return index of target value
    // return -1 if value not present
    static int binarySearch(int arr[], int targetValue){

        if(arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            // int midValue = (start + end) / 2;
            // use this to avoid range of int
            int midValue = start + (end - start) / 2;

            if( arr[midValue] < targetValue){
                start = midValue + 1;
            } else if (arr[midValue] > targetValue) {
                end = midValue - 1;
            } else {
                return midValue;
            }
        }

        return -1;
    }

}
