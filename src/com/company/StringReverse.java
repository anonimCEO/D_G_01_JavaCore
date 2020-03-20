package com.company;

public class StringReverse {

    public static String stReverse(String input){
        if (input == null){
            return null;
        }
        StringBuilder output = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
        return output.toString();
    }
}
