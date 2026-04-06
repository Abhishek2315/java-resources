package com.learn.LinearSearch;

public class SearchInString {

    public static void main(String[] args) {
        String str1 = "Abhishek Dixit";
        char target = 'e';
        boolean result = searchCharInString(str1,target);

        System.out.println(result);
    }

    static boolean searchCharInString(String str, char target){

        if(str.length() == 0){
            return false;
        }

//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if(c == target){
//                return true;
//            }
//        }

        // enhanced way
        for( char c : str.toCharArray()){
            return c== target;
        }

        return false;
    }
}
