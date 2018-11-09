package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "input={0}, shift={1}, result={2}")
    @CsvSource({"abc,3,def", "xyz,3,abc"})
    public void providedExample(String input, int shift, String expected) {
        String result = CaesarShiftCipher.encode(input, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "input={0}, shift={1}, result={2}")
    @CsvSource({",3,", "'',3,''"})
    public void noMessage(String input, int shift, String expected) {
        String result = CaesarShiftCipher.encode(input, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "input={0}, shift={1}, result={2}")
    @CsvSource({"a,3,d", "y,3,b"})
    public void shortMessage(String input, int shift, String expected) {
        String result = CaesarShiftCipher.encode(input, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "input={0}, shift={1}, result={2}")
    @CsvSource({"message,0,message", "message,26,message", "abc,29,def", "def,-3,abc"})
    public void shifting(String input, int shift, String expected) {
        String result = CaesarShiftCipher.encode(input, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "input={0}, shift={1}, result={2}")
    @CsvSource({"aA,3,invalid", "*,3,invalid"})
    public void sillyMessage(String input, int shift, String expected) {
        String result = CaesarShiftCipher.encode(input, shift);
        Assertions.assertEquals(expected, result);
    }
}
