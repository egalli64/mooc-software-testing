package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountLettersTest {

    @Test
    void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    void singleEndingByR() {
        int words = new CountLetters().count("car");
        Assertions.assertEquals(1, words);
    }

    @Test
    void coupleLastEndingByRSingle() {
        int words = new CountLetters().count("cat|car");
        Assertions.assertEquals(1, words);
    }

    @Test
    void coupleFirstEndingByR() {
        int words = new CountLetters().count("car|cat");
        Assertions.assertEquals(1, words);
    }
}