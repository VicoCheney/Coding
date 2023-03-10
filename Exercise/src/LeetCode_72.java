public class LeetCode_72 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m * n == 0) {
            return m + n;
        }
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j < n + 1; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                int temp1 = dp[i][j - 1] + 1;
                int temp2 = dp[i - 1][j] + 1;
                int temp3 = dp[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    temp3 += 1;
                }
                dp[i][j] = Math.min(temp1, Math.min(temp2, temp3));
            }
        }
        return dp[m][n];
    }
}
