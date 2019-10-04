package com.codesignal;

public class Problem3 {
    //Given the string, check if it is a palindrome.
    public boolean checkPalindrome(String str){

        String reversed = new StringBuilder(str).reverse().toString().toLowerCase();

        return str.toLowerCase().equals(reversed);

    }
}
