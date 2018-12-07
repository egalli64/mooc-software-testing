package tudelft.mirror;

public class Mirror {

    public static String mirrorEnds(String input) {
        String mirror = "";

        int begin = 0;
        int end = input.length() - 1;
        for (; begin < end; begin++, end--) {
            if (input.charAt(begin) == input.charAt(end)) {
                mirror += String.valueOf(input.charAt(end));
            } else {
                break;
            }
        }

        return begin >= end ? input : mirror;
    }
}
