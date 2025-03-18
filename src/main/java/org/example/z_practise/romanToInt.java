package org.example.z_practise;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lhh
 * @date 2025/3/18
 */
public class romanToInt {

    public int romanToInt(String s) {

        if (s == null) {
            return 0;
        }

        Map<Character, Integer> characterMap = new HashMap<>();
        characterMap.put('I', 1);
        characterMap.put('V', 5);
        characterMap.put('X', 10);
        characterMap.put('L', 50);
        characterMap.put('C', 100);
        characterMap.put('D', 500);
        characterMap.put('M', 1000);

        int result = 0;
        int pre = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer digit = characterMap.get(s.charAt(i));
            result += digit;
            if (digit > pre) result -= (2 * pre);
            pre = digit;
        }
        return result;
    }
}
