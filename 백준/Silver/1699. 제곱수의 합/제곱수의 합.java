import java.io.*;

public class Main {

    static int N;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            dp[i] = -1;
        }

        dp[0] = 0;

        int result = back(N);

        System.out.println(result);
    }

    public static int back(int n) {

        if (dp[n] != -1) {
            return dp[n];
        }

        int minCount = Integer.MAX_VALUE;


        for (int i = 1; i * i <= n; i++) {
            minCount = Math.min(minCount, back(n - i * i) + 1);
        }

        dp[n] = minCount;
        return dp[n];
    }
}
