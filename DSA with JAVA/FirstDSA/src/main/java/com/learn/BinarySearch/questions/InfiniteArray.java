package com.learn.BinarySearch.questions;

public class InfiniteArray {

    public static void main(String[] args) {

        int[] arr = { 2,3,4,5,7,8,10,11,12,13,15,17, 18, 20, 23, 24, 26, 28, 30};
        int target = 23;
        System.out.println( ans(arr, target));


    }

    static int ans(int[] arr , int targetValue ){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(targetValue > arr[end]){
            int newStart = end + 1;
            // double the box value
            // end = previous end + sizeOfBox * 2
            end = end + (end - start + 1) * 2; // here we used old start value
            start = newStart;

        }

        return  binarySearch(arr , targetValue , start, end);
    }

    static int binarySearch(int arr[], int targetValue, int start, int end){

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
