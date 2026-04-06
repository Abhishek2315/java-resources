package com.learn.BinarySearch.questions;

public class MountainArrayHard {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,3,1};
        int targetValue = 3;

        System.out.println(search(arr, targetValue));

    }

    static int search(int[] arr, int targetValue){
        int peak = peakMountain(arr);
        int firstTry = OrderAgnosticBs(arr, targetValue, 0, peak);

        if(firstTry != -1){
            return firstTry;
        }
        return OrderAgnosticBs(arr, targetValue, peak, arr.length -1);
    }

    static int peakMountain(int[] arr){

        int start = 0 ;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }


        }

        return start;
    }

    static int OrderAgnosticBs(int[] arr, int targetValue, int start, int end){

        boolean isAsc = arr[start] < arr[end] ;

        while (start <= end){
            int mid = start + (end - start) /2 ;

            if(arr[mid] == targetValue){
                return mid;
            }

            if(isAsc){

                if(arr[mid] < targetValue){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(arr[mid] > targetValue){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}






