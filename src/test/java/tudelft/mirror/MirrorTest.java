package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MirrorTest {
    @ParameterizedTest(name = "input={0}, result={1}")
    @CsvSource({"abXYZba,ab", "abca,a", "aba,aba"})
    void mirrorEndsExamples(String input, String expected) {
        String result = Mirror.mirrorEnds(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void evenPalindrome() {
        Assertions.assertEquals("abba", Mirror.mirrorEnds("abba"));
    }
}
