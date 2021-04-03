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
        boolean hasCharsWithOddCount = false;
        for (char c : charMap.keySet()) {
            if (charMap.get(c) % 2 == 1) {
                if (input.length() % 2 == 0 || hasCharsWithOddCount) {
                    return false;
                }
                hasCharsWithOddCount = true;
            }
        }
        return true;
    }
}

