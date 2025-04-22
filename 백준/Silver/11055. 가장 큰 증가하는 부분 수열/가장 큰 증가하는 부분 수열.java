import java.io.*;
import java.util.*;

public class Main {

    static int[] arr;
    static int N;
    static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp = new int[N][N + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        int result = back(0, -1);
        System.out.println(result);
    }

    static int back(int idx, int prevIdx) {

        if (idx == N) return 0;

        if (dp[idx][prevIdx + 1] != -1) return dp[idx][prevIdx + 1];

        int exclude = back(idx + 1, prevIdx);

        int include = 0;

        if (prevIdx == -1 || arr[idx] > arr[prevIdx]) {
            include = arr[idx] + back(idx + 1, idx);
        }

        return dp[idx][prevIdx + 1] = Math.max(include, exclude);
    }
}
