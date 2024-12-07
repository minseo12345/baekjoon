import java.util.*;

public class Main {
    static int N, M;
    static int[][] arr;
    static int[][] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N][M];
        memo = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
                memo[i][j] = -1; // 메모 배열 초기화
            }
        }

        System.out.println(dfs(0, 0));
    }

    static int dfs(int i, int j) {
        if (i == N - 1 && j == M - 1) {
            return arr[i][j];
        }

        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        int maxCandy = 0;

        if (i + 1 < N) {
            maxCandy = Math.max(maxCandy, dfs(i + 1, j));
        }

        if (j + 1 < M) {
            maxCandy = Math.max(maxCandy, dfs(i, j + 1));
        }

        if (i + 1 < N && j + 1 < M) {
            maxCandy = Math.max(maxCandy, dfs(i + 1, j + 1));
        }

        memo[i][j] = arr[i][j] + maxCandy;
        return memo[i][j];
    }
}
