class Solution {
    int maxCount = 0;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;

        boolean [] visited = new boolean[dungeons.length];
        int count = 0;
      answer =  dfs(k,visited,count,dungeons);

        return answer;
    }
    public int dfs(int k, boolean[] visited ,int count ,int[][] dungeons){

        maxCount = Math.max(maxCount, count);

        for(int i = 0; i<dungeons.length; i++){
                if(k >= dungeons[i][0] && !visited[i]){
                    visited[i] = true;
                    dfs(k-dungeons[i][1],visited,count+1,dungeons);
                    visited[i] = false;
                }

        }
        return maxCount;
    }
}