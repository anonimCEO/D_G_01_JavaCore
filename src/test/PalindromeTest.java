package test;

import com.company.PalindromeCheck;
import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest extends PalindromeCheck{



    @Test
    public void whenPalindromeIsCalling_ThenPalindromeIsReturned() {

        assertTrue(isPalindrome("121"));
        assertTrue(isPalindrome("Top spot"));
        assertTrue(isPalindrome("02022020"));
        assertTrue(isPalindrome("Was it a cat i saw"));
        assertTrue(isPalindrome("No Lemon NO MELon"));
        assertFalse(isPalindrome("-121"));
        assertFalse(isPalindrome(",121"));
        assertFalse(isPalindrome("@##@"));

    }
}
