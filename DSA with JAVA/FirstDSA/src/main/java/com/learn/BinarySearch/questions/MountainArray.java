package com.learn.BinarySearch.questions;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class MountainArray {

    public static void main(String[] args) {
        int[]  arr = {0,10,5,2};
        System.out.println(search(arr));
    }

    static int search(int[] arr){

        int start = 0;
        int end = arr.length -1 ;

        while (start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                // You are in the decreasing order of array
                // this may be answered but look at left
                // this is why we are not used end = mid -1
                end  = mid ;
            } else {
                // You are in the ascending order of array
                start = mid + 1; // because we know that mid + 1 element > mid element
            }
            // in the end , start == end and pointing to the largest number because of 2 checks above
            // start and end are always trying to check max element in above two checks
            // hence they are pointing to one element that is max element
        }

        return start; // or return end
    }

}
