package org.example.str;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. 罗马数字转整数 Easy
 */
public class romanToInt {

    public int romanToInt(String s) {

        Map<Character, Integer> charMap = new HashMap<>();
        charMap.put('M', 1000);
        charMap.put('D', 500);
        charMap.put('C', 100);
        charMap.put('L', 50);
        charMap.put('X', 10);
        charMap.put('V', 5);
        charMap.put('I', 1);

        int result = 0, pre = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer num = charMap.get(c);
            result += num;
            if (pre < num) {
                result -= (2 * pre);
            }

            pre = num;
        }

        return result;
    }
}
