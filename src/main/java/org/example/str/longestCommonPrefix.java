package org.example.str;

/**
 * 14. 最长公共前缀 Easy
 */
public class longestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        longestCommonPrefix lcp = new longestCommonPrefix();
        lcp.longestCommonPrefix(new String[]{"dog","racecar","car"});
    }
}
