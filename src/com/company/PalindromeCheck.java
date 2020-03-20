package com.company;

public class PalindromeCheck {

    public static boolean isPalindrome(String palindromeNumber){

        String s = palindromeNumber.toLowerCase().replaceAll("\\s","");

        // System.out.println(palindromeNumber + " - is a palindrome");
        // System.out.println(palindromeNumber + " - is not a palindrome");
        if (!s.matches("^([a-z0-9]+)?$")) {
            //System.out.println(palindromeNumber + " - is not a palindrome");
            return false;
        }else return s.equals(StringReverse.stReverse(s));

    }
}
