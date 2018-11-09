package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest(name = "input={0}, result={1}")
    @CsvSource({"xxggxx,true", "xxgxx,false", "xxggyygxx,false"})
    public void gHappyExamples(String input, boolean expected) {
        boolean result = new GHappy().gHappy(input);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "input={0}, result={1}")
    @CsvSource({"g,false", "gg,true", "gx,false", "ggx,true", "gxg,false"})
    public void gHappyShort(String input, boolean expected) {
        boolean result = new GHappy().gHappy(input);
        Assertions.assertEquals(expected, result);
    }
}
