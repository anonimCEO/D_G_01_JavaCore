package com.company;

public class StringReverse {

    public static String stReverse(String input){
        if (input == null){
            return input;
        }
        StringBuilder output = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
            //output = output + input.charAt(i);
            //output = String.format("%s%s", output, input.charAt(i));
           // output = output.concat(String.valueOf(input.charAt(i)));
        }
        return output.toString();
    }
}
