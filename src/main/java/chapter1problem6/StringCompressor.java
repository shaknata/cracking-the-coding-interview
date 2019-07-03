package chapter1problem6;

/**
 * @author shaknata (Natalia Shakirova)
 */
public class StringCompressor {

    public static String stringCompress(String input) {
        if (input.length() == 1) {
            return input;
        }
        if (input.length() == 0) {
            return input;
        }

        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                count++;
                stringBuilder.append(input.charAt(i));
                stringBuilder.append(count);
                count = 0;
            }
        }
        stringBuilder.append(input.charAt(input.length() - 1));
        stringBuilder.append(count + 1);
        if (stringBuilder.toString().length() >= input.length()) {
            return input;
        } else {
            return stringBuilder.toString();
        }
    }

}
