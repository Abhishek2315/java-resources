package com.learn.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {

        int[] nums = {1, 92,33, 13, 12, 19, 11, 33, 99};
        int target = 19;
        int start = 1;
        int end = 3;
        int result = linerSearchInRange(nums, target, start, end);
    }

    // search int in the array between range: return index if item found
    // otherwise if item not found return -1
    // start and end are index
    static int linerSearchInRange(int[] arr , int target, int start, int end){

        if (arr.length ==0)
            return -1;

        for(int i =start; i <= end ; i++){
            int element = arr[i];
            if( element== target){
                return i;
            }
        }
        // Hence no value found in the array so it returns this
        return -1;
    }
}
