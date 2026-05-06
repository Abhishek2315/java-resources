package com.learn;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        ;
//        System.out.println(input.next());
        System.out.println(firstBadVersion(5));
    }

    public static int firstBadVersion(int n) {

         int start = 1;
         int end = n ;


         while(start < n){
             int mid = start + (end - start) / 2;

             if( mid == 4 || mid == 5){
                 end = mid;
             } else {
                 start = mid + 1;
             }
         }

             return start;
    }
}