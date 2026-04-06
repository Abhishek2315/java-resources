package com.learn.BinarySearch.questions;

public class FirstAndLastNumber {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int [] ans = searchRange(nums, target);
        System.out.println("start");
        System.out.println(ans);
        System.out.println("end");
        
    }

    public static int[] searchRange(int[] arr, int targetValue) {

        int[] ans = {-1,-1};
        int start =  search(arr, targetValue , true);
        int end = search(arr, targetValue , false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }


    // will return index of target value
    // return -1 if value not present
    static int search(int arr[], int targetValue, boolean startIndex){

        int ans = -1;
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
                // Potential answer found
                ans = midValue;
                if(startIndex){
                    end = midValue -1;
                } else {
                    start = midValue + 1;
                }
            }
        }

        return ans;
    }
}
