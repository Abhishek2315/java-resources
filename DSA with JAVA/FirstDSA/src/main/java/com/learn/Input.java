package com.learn;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        // here System.in represent in means keyboard and System mean Computer
        Scanner input = new Scanner(System.in);

//        System.out.print("Please enter some input: ");
//        int rollno = input.nextInt();
//        System.out.println("Your roll number is " + rollno);

        // Here 10 is called as litrals and a is Identifier
        // Identifier is like class name, package name, method name, variable name
        int a = 10;

        int b = 234_000_000; // it will print 234000000 because underscore will be ignored;
        System.out.println(b);

        // String name = input.next();
        // System.out.println(name);
        // float marks = input.nextFloat();
        // System.out.println(marks);

    }
}
