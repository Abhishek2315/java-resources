package com.learn.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

    public static void main(String[] args) {

        // Syntax
        ArrayList<Integer> list = new ArrayList<>( 10);
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);

        list.set(0 , 99); // it will update the ArrayList
        list.remove(2); // remove value from index 2
        System.out.println(list); // it will use their own toString to print this list

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // list[i] will not work here
        }


        // Question is how ArrayList have no limit and it will store any number of element

        // Answer
        // Size is fixed internally but
        // when array list will be filled to some amount then
        // it will create a new Array list of double the size and put all element of previous list to
        // new list and deleted previous list


    }
}
