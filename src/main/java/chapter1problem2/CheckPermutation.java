package chapter1problem2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shaknata (Natalia Shakirova)
 */
public class CheckPermutation {

    public boolean isPermutation(String s1, String s2) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (!charMap.containsKey(c)) {
                charMap.put(c, 1);
            } else {
                charMap.put(c, charMap.get(c) + 1);
            }
        }
//        for (char c : s1.toCharArray()) {
//            charMap.put(c, charMap.getOrDefault(c, charMap.get(c)+1 + 1));
//        }
// Не понимаю

        for (char c : s2.toCharArray()) {
            if (!charMap.containsKey(c)) {
                return false;
            } else {
                charMap.put(c, charMap.get(c) - 1);
            }
        }

        for (char c : charMap.keySet()) {
            if (charMap.get(c) != 0) {
                return false;
            }
        }

        return true;
    }
}
