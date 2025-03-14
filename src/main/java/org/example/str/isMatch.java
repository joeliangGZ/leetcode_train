package org.example.str;

/**
 * 10. 正则表达式匹配 Hard
 *
 * dp[i][j] 为 true 表示 s 的前 i 个字符（即 s[0...i-1]）和 p 的前 j 个字符（即 p[0...j-1]）是匹配的。
 * dp[i][j] 为 false 表示 s 的前 i 个字符和 p 的前 j 个字符不匹配。
 *
 * 假设 s = "aab"，p = "c*a*b"，我们可以构建如下的 dp 表格：
 *          c	*	a	*	b
 *      0	1	2	3	4	5
 * 0	T	F	T	F	T	F
 * 1	F	F	T	T	T	F
 * 2	F	F	F	T	T	F
 * 3	F	F	F	F	T	T
 *
 * dp[0][0] 为 true，表示空字符串和空模式是匹配的。
 * dp[1][2] 为 true，表示 s 的前1个字符（"a"）和 p 的前2个字符（"c*"）是匹配的，因为 * 可以匹配零个 c。
 *
 */
public class isMatch {

    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        /**
         * 状态转移：
         *
         * 如果 p[j-1] 是 *，则有两种情况：
         *      * 代表零个前面的字符：dp[i][j] = dp[i][j-2]
         *      * 代表一个或多个前面的字符：dp[i][j] = dp[i-1][j]，且 s[i-1] 与 p[j-2] 匹配（即 s[i-1] == p[j-2] 或 p[j-2] == '.'）。
         * 如果 p[j-1] 不是 *，
         *      则 dp[i][j] = dp[i-1][j-1] 且 s[i-1] 与 p[j-1] 匹配（即 s[i-1] == p[j-1] 或 p[j-1] == '.'）。
         */
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.'));
                } else {
                    dp[i][j] = dp[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.');
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        isMatch isMatch = new isMatch();
        isMatch.isMatch("abb", ".*");
    }
}
