package com.learn.BinarySearch.questions;

// Ques 2 - Floor of Number
// Ceiling -> find the biggest element in array which is smaller or equal to target number.
// ex - arr = { 2,3 4, 5, 15, 16, 18 ,22, 45}, target = 17
// for this question ceiling number should be 16

public class Q2_FloorOfNumber {

    public static void main(String[] args) {
        int[] arr = { 2,3, 4, 5, 15, 16, 18 ,22, 45};
        int target = 17;
        System.out.println(floorOfNumber(arr, target));
    }


    static int floorOfNumber(int arr[], int target){
        int start = 0;
        int end = arr.length -1;



        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }

        return end;
    }
}
