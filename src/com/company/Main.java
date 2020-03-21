package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number between 0 an 1000 : ");
        int number = scanner.nextInt();
        System.out.println("The sum of all digits in " + number + " is :" + GetSum.getSumOfAllDigits(number));


        // Write a Java program to reverse a string. (Do not use any default java methods)

        Scanner string = new Scanner(System.in);
        System.out.println("Insert a string to reverse it");
        String sentence = string.nextLine();
        System.out.println("Reversed string is: " + StringReverse.stReverse(sentence));


        // Write a program / method that checks if a number is palindrome.

        Scanner palindromeCheck = new Scanner(System.in);
        System.out.println("Insert a number/word/sentence to check if it is palindrome");
        String palindromeNumber = palindromeCheck.nextLine();
        boolean isTrueFalse = PalindromeCheck.isPalindrome(palindromeNumber);
        System.out.println(isTrueFalse);

        // Write a Java program to count the letters, spaces, numbers and other characters of an input string.

        Scanner count = new Scanner(System.in);
        System.out.println("Insert letters, numbers, spaces, characters to count  them");
        String countLettersNumbersSpacesCharacters = count.nextLine();
        CountLettersSpacesNumbersCharacters.count(countLettersNumbersSpacesCharacters);
        System.out.println(CountLettersSpacesNumbersCharacters.count("qwerty"));

    }

}
