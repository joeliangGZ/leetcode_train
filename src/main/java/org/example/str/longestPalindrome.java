package org.example.str;

public class longestPalindrome {

    public String longestPalindrome(String s) {
        
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i+1);

            int len = Math.max(len1, len2);

            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public String longestPalindromeInDP(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }

        boolean[][] dp = new boolean[n][n];
        int maxLength = 1;
        int start = 0;

        // 初始化：所有长度为 1 的子串都是回文子串
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // 填充 dp 数组
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                } else {
                    dp[i][j] = false;
                }

                // 更新最长回文子串的起始位置和长度
                if (dp[i][j] && j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                    start = i;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
}
