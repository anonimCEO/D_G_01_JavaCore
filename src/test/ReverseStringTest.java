package test;
import static org.junit.Assert.*;
import com.company.StringReverse;
import org.junit.Test;


public class ReverseStringTest {

    @Test
    public void whenReverseIsCalled_ThenCorrectStringIsReturned() {
        String reversed = StringReverse.stReverse("cat");
        String reversedCapitalString = StringReverse.stReverse("WATER");
        String reversedDigits = StringReverse.stReverse("1125");
        String reversedSentenceWithSpaces = StringReverse.stReverse("Hello world !");
        String reversedSpecialCharacters = StringReverse.stReverse("!@#$");

        assertEquals("tac", reversed);
        assertEquals("RETAW", reversedCapitalString);
        assertEquals("5211", reversedDigits);
        assertEquals("! dlrow olleH", reversedSentenceWithSpaces);
        assertEquals("$#@!", reversedSpecialCharacters);
        assertNull(null);
    }
}
