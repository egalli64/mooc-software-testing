package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {
    @ParameterizedTest(name = "input={0}, result={1}")
    @CsvSource({"abXYZba,ab", "abca,a", "aba,aba"})
    public void mirrorEndsExamples(String input, String expected) {
        String result = new Mirror().mirrorEnds(input);
        Assertions.assertEquals(expected, result);
    }
}
