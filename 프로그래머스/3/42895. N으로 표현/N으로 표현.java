import java.util.HashSet;
import java.util.Set;

class Solution {
    static int answer = Integer.MAX_VALUE;

    public int solution(int N, int number) {
        dfs(N, number, 0, 0);
        return answer > 8 ? -1 : answer;
    }

    private void dfs(int N, int number, int count, long current) {
        if (count > 8) return;
        if (current == number) {
            answer = Math.min(answer, count);
            return;
        }

        long tempN = 0;
        for (int i = 1; i <= 8 - count; i++) {
            tempN = tempN * 10 + N;
            dfs(N, number, count + i, current + tempN);
            dfs(N, number, count + i, current - tempN);
            dfs(N, number, count + i, current * tempN);
            if (tempN != 0) dfs(N, number, count + i, current / tempN);
        }
    }
}
