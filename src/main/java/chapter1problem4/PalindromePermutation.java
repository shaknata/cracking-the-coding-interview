package chapter1problem4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shaknata (Natalia Shakirova)
 */
public class PalindromePermutation {
    public boolean isPermutation(String input) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        if (input.length() % 2 == 0) {
            for (char c : charMap.keySet()) {
                if (charMap.get(c) % 2 != 0) {
                    return false;
                }
            }
        }
        if (input.length() % 2 == 1) {
            int countOfOdd = 0;
            for (char c : charMap.keySet()) {
                if (charMap.get(c) % 2 != 0) {
                    countOfOdd++;
                }
                if (countOfOdd > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}

