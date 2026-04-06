package com.learn.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>>  list = new ArrayList<>();

        // initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

        String s = "A man, a plan, a canal: Panama";
        System.out.println(s.replace(" ", "").toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));
        System.out.print(s.length());
        System.out.print(s.charAt(1));

    }
}
