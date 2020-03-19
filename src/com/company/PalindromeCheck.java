package com.company;

public class PalindromeCheck {

    public static String isPalindrome(String palindromeNumber){

        String s = palindromeNumber.replaceAll("\\s","");

        if (s.equals(StringReverse.stReverse(s))){
            System.out.println(palindromeNumber + " - is a palindrome");
        }else {
            System.out.println(palindromeNumber + " - is not a palindrome");
        }
        return palindromeNumber;
    }


}
