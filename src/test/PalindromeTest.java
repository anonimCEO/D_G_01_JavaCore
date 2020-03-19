package test;

import com.company.PalindromeCheck;
import com.company.StringReverse;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PalindromeTest {


    @Test
    public void whenPalindromeIsCalling_ThenPalindromeIsReturned() {
        String palindromeWord = PalindromeCheck.isPalindrome("121");
        String palindromeSentenceTwoWords = PalindromeCheck.isPalindrome("top spot");
        String palindromeSentenceManyWords = PalindromeCheck.isPalindrome("was it a cat i saw");
        String palindromeSentenceCapitalLetters = PalindromeCheck.isPalindrome("NO LEMON NO MELON");
        String palindromeNumbers = PalindromeCheck.isPalindrome("02 02 2020");
        String palindromeNumbersWithMinus = PalindromeCheck.isPalindrome("-121");


        assertEquals("121", palindromeWord);
        assertEquals("top spot", palindromeSentenceTwoWords);
        assertEquals("was it a cat i saw", palindromeSentenceManyWords);
        assertEquals("NO LEMON NO MELON", palindromeSentenceCapitalLetters);
        assertEquals("02 02 2020", palindromeNumbers);
        assertEquals("-121", palindromeNumbersWithMinus);



    }
}
