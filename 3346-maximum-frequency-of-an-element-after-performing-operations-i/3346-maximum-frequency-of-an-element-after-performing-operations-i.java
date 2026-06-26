class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        int M = 0;
        for (int i : nums) {
            M = Math.max(M, i);
        }
        int[] dp = new int[M + 1];
        int prev = 0, ans = 0;

        for (int i : nums) {
            dp[i]++;
        }
        int curr = 0;
        for (int i = 0; i < k && i <= M; i++) {
            curr += dp[i];
        }
        for (int i = 0; i <= M; i++) {
            curr -= dp[i];
            if (i + k <= M) {
                curr += dp[i + k];
            }
            if (i > 0) {
                prev += dp[i - 1];
            }
            if (i > k + 1) {
                prev -= dp[i - k - 1];
            }
            ans = Math.max(ans, dp[i] + Math.min(numOperations, prev + curr));
        }
        return ans;
    }
}