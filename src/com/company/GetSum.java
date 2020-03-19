package com.company;

public class GetSum {

    public static int getSumOfAllDigits(int number){
        int sumOfAllDigits = 0;

        while( number > 0 && number < 1001){
            sumOfAllDigits = sumOfAllDigits + number % 10;
            number = number / 10;
        }
        return sumOfAllDigits;

    }
}
