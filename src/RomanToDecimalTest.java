import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("X"), 10);
        assertEquals(RomanToDecimal.romanToDecimal("IVIV"), -2);
        assertEquals(RomanToDecimal.romanToDecimal("IXIX"), -2);
        assertEquals(RomanToDecimal.romanToDecimal("JOIN TAYLOR SWIFT CLUB"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("ALSO JOIN XC AND TRACK!!!!"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("M"), 1000);
        assertEquals(RomanToDecimal.romanToDecimal("LI"), 51);
        assertEquals(RomanToDecimal.romanToDecimal("XX"), 20);
        assertEquals(RomanToDecimal.romanToDecimal("XXXXXXXXXX"), -2);
        assertEquals(RomanToDecimal.romanToDecimal("Ideally this doesn't work but you know..."), -1);
        assertEquals(RomanToDecimal.romanToDecimal("CMV"), 905);
        assertEquals(RomanToDecimal.romanToDecimal("BABY ITS COLD OUTSIDE..."), -1);
        assertEquals(RomanToDecimal.romanToDecimal("ANNA JUST SAID CRUEL SUMMER IS MID LOL"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("VVVVVVVVVVV"), -2);
        assertEquals(RomanToDecimal.romanToDecimal("XXI"), 21);
        assertEquals(RomanToDecimal.romanToDecimal("LL"), -2);
        assertEquals(RomanToDecimal.romanToDecimal("C"), 100);

        assertNotEquals(RomanToDecimal.romanToDecimal("XXXXXX"), 60);
        assertNotEquals(RomanToDecimal.romanToDecimal("HEHE"), 12);
        assertNotEquals(RomanToDecimal.romanToDecimal("XX"), -1);
    }
}