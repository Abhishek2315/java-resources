package com.learn.LinearSearch;

public class LinearSearchExp {

    public static void main(String[] args) {

        int[] nums = {1, 92,33, 13, 12, 19, 11, 33, 99};
        int target = 19;
        int result = linerSearch(nums, target);
        System.out.println(result);
    }

    // search int the array: return index if item found
    // otherwise if item not found return -1
    static int linerSearch(int[] arr , int target){

        if (arr.length ==0)
            return -1;

        for(int i =0; i <= arr.length ; i++){
            int element = arr[i];
            if( element== target){
                return i;
            }
        }
        // Hence no value found in the array so it returns this
        return -1;
    }
}
