package com.company;

public class CountLettersSpacesNumbersCharacters {

    public static int count (String s){
        int digits = 0;
        int letters = 0;
        int spaces = 0;
        int others = 0;
        char[] c = s.toCharArray();
        for(int i=0;i<s.length();i++) {
            if (Character.isLetter(c[i])) {
                letters++;
            } else if (Character.isDigit(c[i])) {
                digits++;
            } else if (Character.isSpaceChar(c[i])) {
                spaces++;
            } else {
                others++;
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Digits : " + digits);
        System.out.println("Spaces : " + spaces);
        System.out.println("Other : " + others);

        // needed for tests
        String sLetters = Integer.toString(letters);
        String sDigits = Integer.toString(digits);
        String sSpaces = Integer.toString(spaces);
        String sOthers = Integer.toString(others);
        return Integer.parseInt(sLetters + sDigits + sSpaces + sOthers);

    }


}
