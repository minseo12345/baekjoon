class Solution {
    private int[][] triangle;
    private int[][] dp;

    public int solution(int[][] triangle) {
        int n = triangle.length;
        this.triangle = triangle;
        this.dp = new int[n][n];

        return dfs(0, 0);
    }

    private int dfs(int i, int j) {
       
        if (i == triangle.length - 1) {
            return triangle[i][j];
        }

        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        int left = dfs(i + 1, j);
        int right = dfs(i + 1, j + 1);

        dp[i][j] = Math.max(left, right) + triangle[i][j];
        return dp[i][j];
    }
}
