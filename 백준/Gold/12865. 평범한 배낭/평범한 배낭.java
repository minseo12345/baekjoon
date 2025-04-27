import java.util.Scanner;

public class Main {
    static int N, K;
    static int[] W, V;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        W = new int[N];
        V = new int[N];
        dp = new int[N][K + 1];

        for (int i = 0; i < N; i++) {
            W[i] = sc.nextInt();
            V[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= K; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(back(0, K));
    }

    static int back(int idx, int weight) {
        
        if (idx == N) {
            return 0;
        }
        
        if (dp[idx][weight] != -1) {
            return dp[idx][weight];
        }
        
        int result = back(idx + 1, weight);
        
        if (weight >= W[idx]) {
            result = Math.max(result, back(idx + 1, weight - W[idx]) + V[idx]);
        }

        dp[idx][weight] = result;
        return result;
    }
}
