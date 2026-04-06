package com.learn.BinarySearch.questions;



// Ques 1 - Ceiling of Number
// Ceiling -> find the smallest element in array which is greater or equal to target number.
// ex - arr = { 2,3 4, 5, 15, 16, 18 ,22, 45}, target = 17
// for this question ceiling number should be 18


public class Q1_CeilingNumber {

    public static void main(String[] args) {
        int[] nums = {-19, -2, 0, 4, 5, 9, 44, 85, 99, 101, 146};
        int target = -20;
        System.out.println(ceilingNumber(nums, target));

        System.out.println(2%4);

    }


    static int ceilingNumber(int[] arr, int targetValue){

        int start = 0;
        int end = arr.length -1;

        // but what if the target is greater than the greatest number in the array
        if(targetValue > arr[arr.length-1]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == targetValue){
                return arr[mid];
            }

            if(arr[mid] < targetValue){
                start = mid + 1;
            } else {
                end = mid -1;
            }

        }

        return arr[start];
    }

}
