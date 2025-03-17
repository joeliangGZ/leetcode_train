package org.example.z_practise;

/**
 * @author lhh
 * @date 2025/3/16
 */
public class isMatch2 {

    public boolean isMatch(String s, String p) {

        int m = s.length();
        int n = p.length();

        // initial
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;

        for (int j = 1; j <= n; j++) {
            if (p.charAt(j-1) == '*') {
                dp[0][j] = dp[0][j-2];
            }
        }

        // state change
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j-1) == '*') {
                    // match zero / one or more character
                    dp[i][j] = dp[i][j-2] || (dp[i-1][j] && (s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.'));
                } else {
                    // equal or pattern is .
                    dp[i][j] = dp[i-1][j-1] && (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.');
                }
            }
        }

        return dp[m][n];
    }
}
