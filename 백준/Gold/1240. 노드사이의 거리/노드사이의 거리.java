import java.util.*;

public class Main {
    static int N, M;
    static List<int[]>[] graph;
    static boolean[] visited;
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int dist = sc.nextInt();

            graph[from].add(new int[]{to, dist});
            graph[to].add(new int[]{from, dist});
        }

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            visited = new boolean[N + 1];
            result = -1;
            dfs(start, end, 0);
            System.out.println(result);
        }
    }

    static void dfs(int now, int target, int dist) {
        if (now == target) {
            result = dist;
            return;
        }

        visited[now] = true;

        for (int[] next : graph[now]) {
            int nextNode = next[0];
            int cost = next[1];

            if (!visited[nextNode]) {
                dfs(nextNode, target, dist + cost);
            }
        }
    }
}
