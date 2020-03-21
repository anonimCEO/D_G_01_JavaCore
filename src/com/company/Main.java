package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

        /*Scanner scanner = new Scanner(System.in);
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
        CountLettersSpacesNumbersCharacters.count(countLettersNumbersSpacesCharacters);*/

        //Write two functions:
        //Write a function reverse (arr, k) that reverses the order of the first k elements in the array arr.

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayReverseSort.reverse(arr,5);
        for (int value : arr) System.out.print(value + " ");
        System.out.println("\nSorted array");

        //Write a function sort (arr) that sorts and return the input array. You are allowed to use only the function
        // above in the step a in order to make changes in the array.

        int[] newArr = {5, 2, 8, 4, 3, 6, 7, 1};
        int[] result = ArrayReverseSort.sort(newArr);
        for (int v : result) System.out.print(v + " ");

        //Write a Java method that takes as parameter array of different objects (string, char, int, long, Person –
        // need to create Person class with fields Name, Age, Gender), method must concatenate all strings and
        // characters, sum all numbers, make separate array with persons only.

    }

}
