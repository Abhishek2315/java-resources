package com.learn.BinarySearch.questions;

// https://leetcode.com/problems/split-array-largest-sum/
public class SplitArray {
    public static void main(String[] args) {

        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums, m));

    }

    static int splitArray(int[] nums , int m){
        int start = 0;
        int end = 0;

        for(int i= 0; i< nums.length ; i++){
            start  = Math.max(start, nums[i]); // in the end of the loop this will contains max value of array
            end = end + nums[i]; // and this will contain addition of all element in array
        }

        // binary search

        while(start < end){ // here we not add = because it will be infinite loop
            // try middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this with that max sum
            int sum =0;
            int pieces = 1;

            for (int num : nums){
                if(sum + num > mid){
                    // you cannot add this in this subArray , make new one
                    // say you add this num in new subArray, sum = num
                    sum = num;
                    pieces ++;
                } else{
                    sum = sum + num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            } else {
                end = mid;
            }

        }

        return end; // here start == end
    }
}
