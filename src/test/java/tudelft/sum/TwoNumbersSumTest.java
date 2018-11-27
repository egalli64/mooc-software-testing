package tudelft.sum;

import javafx.beans.binding.IntegerBinding;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TwoNumbersSumTest {

    private static TwoNumbersSum adder = new TwoNumbersSum();

    @Test
    void simple() {
        List<Integer> lhs = Arrays.asList(4, 2);
        List<Integer> rhs = Arrays.asList(1, 2);

        List<Integer> result = adder.addTwoNumbers(lhs, rhs);

        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(5, (int) result.get(0));
        Assertions.assertEquals(4, (int) result.get(1));
    }

    @Test
    void carryWhenDifferentlySized() {
        List<Integer> lhs = Arrays.asList(4, 2);
        List<Integer> rhs = Arrays.asList(8);

        List<Integer> result = adder.addTwoNumbers(lhs, rhs);

        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(5, (int) result.get(0));
        Assertions.assertEquals(0, (int) result.get(1));
    }

    @Test
    void carryExtra() {
        List<Integer> lhs = Arrays.asList(9, 2);
        List<Integer> rhs = Arrays.asList(8);

        List<Integer> result = adder.addTwoNumbers(lhs, rhs);

        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals(1, (int) result.get(0));
        Assertions.assertEquals(0, (int) result.get(1));
        Assertions.assertEquals(0, (int) result.get(1));
    }
}
