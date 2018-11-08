package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    private boolean invalid(String s) {
        if (s == null || s.isEmpty())
            return true;

        char prev = s.charAt(0);
        if (!map.containsKey(prev))
            return true;

        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!map.containsKey(cur))
                return true;
            if (cur == prev) {
                if (count == 3) {
                    return true;
                }
                count += 1;
            } else {
                count = 1;
            }

        }
        return false;
    }

    public int convert(String s) {
        // TODO: throwing an exception?
        if (invalid(s))
            return 0;

        int convertedNumber = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            int next = i + 1 < s.length() ? map.get(s.charAt(i + 1)) : 0;

            if (currentNumber >= next)
                convertedNumber += currentNumber;
            else
                convertedNumber -= currentNumber;
        }

        return convertedNumber;
    }
}
