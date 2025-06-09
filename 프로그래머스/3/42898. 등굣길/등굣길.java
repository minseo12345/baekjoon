class Solution {
    private final long MOD = 1000000007;
    private int[][] dp;
    private boolean[][] puddleMap;
    private int m, n;
    
    public int solution(int m, int n, int[][] puddles) {
        this.m = m;
        this.n = n;
        dp = new int[m + 1][n + 1];
        puddleMap = new boolean[m + 1][n + 1];
        
         for (int[] puddle : puddles) {
            puddleMap[puddle[0]][puddle[1]] = true;
        }
        
        return dfs(1,1);
    }
    
    private int dfs(int i, int j){
        if( i > m || j >n){
            return 0;
        }
        
        
        if(puddleMap[i][j]){
            return 0;
        }
        
        if( i == m && j == n){
            return 1;
        }
        
         if (dp[i][j] != 0) {
            return dp[i][j];
        }
        
        int right = dfs(i + 1, j);
        int down = dfs(i, j + 1);
        
        dp[i][j] = (int)((long)(right + down) % MOD);
        return dp[i][j];

        
        
    }
}