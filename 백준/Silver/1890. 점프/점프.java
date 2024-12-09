import java.util.*;

public class Main {
    static int N;
    static int[][] arr;
    static long[][] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][N];
        memo = new long[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            Arrays.fill(memo[i], -1);
        }

        System.out.println(dp(0, 0));
    }

    static long dp(int i, int j) {
        if (i >= N || j >= N) {
            return 0;
        }
        if (i == N - 1 && j == N - 1) {
            return 1;
        }
        if (arr[i][j] == 0) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        int jump = arr[i][j];
        long right = dp(i, j + jump);
        long down = dp(i + jump, j);
        memo[i][j] = right + down;

        return memo[i][j];
    }
}
