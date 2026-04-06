package com.learn;

import java.util.Scanner;

public class topic4_TypeCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        float num = input.nextFloat(); // we can gave int value to this
//        int num1 = input.nextInt();    // but we cannot gave float value to it
//        System.out.println(num);

        // type casting
//        int n = (int)(67.56f);
//        System.out.println(n);

//        automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // byte only range upto 256
//        System.out.println(b); // this will print 1 because 257 % 256 = 1
//        Because byte can store values only in the range -128 to +127.
//        When you assign a bigger number, Java performs modulo 256 (2^8) operation internally to fit it in 1 byte.



//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = ( a * b )/ c; // this return 20
        //  a * b = 2000 so how byte should perform this out of range calculation
        //  because of int d, when u use *,/ type expression in byte it should be return integer
        // like b =  c * a -----> error
//        System.out.println(d);



        int number = 'A';
        System.out.println(number); // it prints 65 ASCI value

        // java uses unicode values for all characters like eng, hindi, chines etc.
//        System.out.println("नमस्ते");
//        System.out.println("你好"); // chines


        byte b = 42;
        char c= 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        // float - int + double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);
    }
    
}
