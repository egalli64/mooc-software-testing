package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GettingStartedTest {

    @Test
    void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25, result);
    }

    @Test
    void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15, result);
    }
}
