package chapter1problem5;

import static java.lang.Math.abs;

/**
 * @author shaknata (Natalia Shakirova)
 */
public class OneAway {
    public static boolean checkEdit(String s1, String s2) {
        if (abs(s1.length() - s2.length()) > 1) {
            return false;
        }
        int i = 0;
        int j = 0;
        int diff = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) != s2.charAt(j)) {
                diff++;
                if (i + 1 < s1.length() && s1.charAt(i + 1) == s2.charAt(j)) {
                    i++;
                }
                if (j + 1 < s2.length() && s1.charAt(i) == s2.charAt(j + 1)) {
                    j++;
                }
            }
            i++;
            j++;
        }
        if (diff > 1) {
            return false;
        }
        if (diff == 0) {
            return true;
        } else {
            if (diff == 1) {
                if (i < s1.length() || j < s2.length()) {
                    return false;
                }
            }
        }
        return true;
    }
}
