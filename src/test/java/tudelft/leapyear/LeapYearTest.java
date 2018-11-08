package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void leapYearsThatAreNonCenturialYears() {
        boolean result = LeapYear.isLeapYear(2016);
        Assertions.assertTrue(result);
    }

    @Test
    public void leapCenturialYears() {
        Assertions.assertTrue(LeapYear.isLeapYear(2000));
    }

    @Test
    public void nonLeapCenturialYears() {
        Assertions.assertFalse(LeapYear.isLeapYear(1500));
    }

    @Test
    public void nonLeapYears() {
        Assertions.assertFalse(LeapYear.isLeapYear(2017));
    }
}
