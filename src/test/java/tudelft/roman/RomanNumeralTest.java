package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        this.roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void badNull() {
        int result = roman.convert(null);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void badEmpty() {
        int result = roman.convert("");
        Assertions.assertEquals(0, result);
    }


    @Test
    public void badFour() {
        int result = roman.convert("IIII");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void badChar() {
        int result = roman.convert("KI");
        Assertions.assertEquals(0, result);
    }

}
