package com.learn.LinearSearch;

public class findMinAndMax {
    public static void main(String[] args) {
        int[] nums = { 92,33, 13, 12, 19, 11, 33, 99};

        System.out.println(min(nums));
        System.out.println(max(nums));
    }


    static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }
}
