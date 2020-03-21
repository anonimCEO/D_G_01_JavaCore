package test;

import com.company.CountLettersSpacesNumbersCharacters;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountLettersSpacesNumbersCharactersTest {

    @Test
    public void count() {
        int digit = CountLettersSpacesNumbersCharacters.count("2222");
        int letter = CountLettersSpacesNumbersCharacters.count("l");
        int space = CountLettersSpacesNumbersCharacters.count("   ");
        int other = CountLettersSpacesNumbersCharacters.count("@#$");
        int combined = CountLettersSpacesNumbersCharacters.count("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        assertEquals(400,digit);
        assertEquals(1000,letter);
        assertEquals(30,space);
        assertEquals(3,other);
        assertEquals(231096,combined);

    }
}