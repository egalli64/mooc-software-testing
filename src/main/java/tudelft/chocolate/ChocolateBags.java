package tudelft.chocolate;

public class ChocolateBags {

    public int calculate(int small, int big, int total) {
        int maxBigBoxes = total / 5;
        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
        total -= (bigBoxesWeCanUse * 5);

        if (small < total)
            return -1;
        return total;

    }

    public int makeChocolate(int small, int big, int goal) {
        int maxBigBoxes = goal / 5;
        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
        goal -= (bigBoxesWeCanUse * 5);
        if (small < goal)
            return -1;
        return goal;
    }

    public String mirrorEnds(String string) {
        String mirror = "";
        int begin = 0;
        int end = string.length() - 1;
        for (; begin < end; end--) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror += String.valueOf(string.charAt(end));
                begin += 1;
            } else {
                break;
            }
        }
        return begin == end ? string : mirror;
    }
}
