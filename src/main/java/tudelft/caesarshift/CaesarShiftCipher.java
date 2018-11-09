package tudelft.caesarshift;

public class CaesarShiftCipher {

    public static String encode(String message, int shift) {
        if(message == null || message.isEmpty())
            return message;

        StringBuilder sb = new StringBuilder();
        int length = message.length();

        shift %= 26;

        for (int i = 0; i < length; i++) {
            char cur = message.charAt(i);

            if (cur > 'z' || cur < 'a') {
                return "invalid";
            } else if ((char) (cur + shift) > 'z') {
                cur = (char) (cur - 26);
            } else if ((char) (cur + shift) < 'a') {
                cur = (char) (cur + 26);
            }
            sb.append((char) (cur + shift));
        }

        return sb.toString();
    }
}
