package com.learn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrograms {

    public static void main(String[] args) {

        // syntax
        // datatype [] variable_name = new datatype [size];

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // actually here object is being created in the memory (heap|)

        int[] arr                                                   = new int[10];
        // this part will save on stack memory on compile time &    this part of code will create object on runtime in heap memory(Dynamic memory Allocations)


        // Imp points
        // 1. Array Objects are in heap
        // 2. heap Objects are not Continous stored in memory
        // 3. ArraysPrograms are continous but in java it will not continuous because dependent on JVM.

        // array of primitive datatypes
        int[] aer = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(aer));

        // In Java, All primitive are stored in stack memory and objects are stored in heap memory

        // for Array, All elements of arrays are stored in heap memory and their ref variable like arr[0], arr[1], etc.


        Scanner in = new Scanner(System.in);

        // Array of Objects
        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] =  in.next();
        }
        System.out.println(Arrays.toString(str));


    }
}
