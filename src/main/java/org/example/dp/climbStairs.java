package org.example.dp;

/**
 * @author lhh
 * @date 2024/10/30
 */
public class climbStairs {

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        climbStairs climbStairs = new climbStairs();
        System.out.println(climbStairs.climbStairs(4));
    }
}
