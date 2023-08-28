/*
    You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
        Example 1:
            Input: n = 2
            Output: 2
            Explanation: There are two ways to climb to the top.
            1. 1 step + 1 step
            2. 2 steps
        Example 2:
            Input: n = 3
            Output: 3
            Explanation: There are three ways to climb to the top.
            1. 1 step + 1 step + 1 step
            2. 1 step + 2 steps
            3. 2 steps + 1 step

    ==> we used dynamic programming for this problem
*/


class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n; // There are n ways for n = 1 and 2
        }

        int[] dp = new int[n + 1];
        dp[1] = 1; // One way to reach the first step
        dp[2] = 2; // Two ways to reach the second step

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
