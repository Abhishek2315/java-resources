package com.learn.BinarySearch.questions;

public class OrderAgnosticBS {

    public static void main(String[] args) {
//        int[] nums = {-19, -2, 0, 4, 5, 9, 44, 85, 99, 101, 146};
        int[] nums = {100, 57, 44, 31, 20, 11, 8, 5, 2, -18, -45, -54};
        int target = 8;
        System.out.println(orderAgnosticBS(nums, target));

    }

    static int orderAgnosticBS(int[] arr, int targetValue){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            // int midValue = (start + end) / 2;
            // use this to avoid range of int
            int midValue = start + (end - start) / 2;

            if(arr[midValue] == targetValue){
                return midValue;
            }

            if(isAsc){
                if(arr[midValue] < targetValue){
                    start = midValue + 1;
                } else {
                    end = midValue - 1;
                }
            } else {
                if(arr[midValue] > targetValue){
                    start = midValue + 1;
                } else {
                    end = midValue - 1;
                }
            }
        }

        return -1;

    }

}


