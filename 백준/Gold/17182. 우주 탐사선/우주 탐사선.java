import java.io.*;
import java.util.*;

public class Main {

    static int N, K;
    static int[][] arr;
    static boolean[] visited;
    static int minTime = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (arr[i][j] > arr[i][k] + arr[k][j]) {
                        arr[i][j] = arr[i][k] + arr[k][j];
                    }
                }
            }
        }

        visited[K] = true;
        dfs(K, 1, 0);
        System.out.println(minTime);
    }

    static void dfs(int current, int count, int total) {
        if (total >= minTime) return;

        if (count == N) {
            minTime = Math.min(minTime, total);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i, count + 1, total + arr[current][i]);
                visited[i] = false;
            }
        }
    }
}
