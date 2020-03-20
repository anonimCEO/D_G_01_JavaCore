package test;

import com.company.PalindromeCheck;
import com.company.StringReverse;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest extends PalindromeCheck{



    @Test
    public void whenPalindromeIsCalling_ThenPalindromeIsReturned() {
//        boolean palindromeWord = PalindromeCheck.isPalindrome("121");
//        boolean palindromeSentenceTwoWords = PalindromeCheck.isPalindrome("top spot");
//        boolean palindromeSentenceManyWords = PalindromeCheck.isPalindrome("Was it a cat i saw");
//        boolean palindromeSentenceCapitalLetters = PalindromeCheck.isPalindrome("NO LEMON NO MELON");
//        boolean palindromeNumbers = PalindromeCheck.isPalindrome("02 02 2020");
//        boolean palindromeNumbersWithMinus = PalindromeCheck.isPalindrome("-121");



        assertTrue(isPalindrome("121"));
        assertFalse(isPalindrome("122"));
        assertTrue(isPalindrome("02022020"));
        assertFalse(isPalindrome("122"));
        assertFalse(isPalindrome("122"));
        assertFalse(isPalindrome("122"));
//        assertEquals("121", palindromeWord);
//        assertEquals("top spot", palindromeSentenceTwoWords);
//        assertEquals("Was it a cat i saw", palindromeSentenceManyWords);
//        assertEquals("NO LEMON NO MELON", palindromeSentenceCapitalLetters);
//        assertEquals("02 02 2020", palindromeNumbers);
//        assertEquals("-121", palindromeNumbersWithMinus);

//        Boolean palindromeCheckNumber = new PalindromeCheck().check("225");
//        assertTrue("225", true);



    }
}
