import java.util.*;
import java.io.*;

public class Main {
    static final int SIZE = 501;
    static final int INF = Integer.MAX_VALUE;

    static int[][] map = new int[SIZE][SIZE];
    static int[][] dist = new int[SIZE][SIZE];
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < SIZE; i++)
            Arrays.fill(map[i], 0);

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            fillZone(x1, y1, x2, y2, 1); 
        }

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            fillZone(x1, y1, x2, y2, -1);
        }

        int result = bfs();
        System.out.println(result);
    }

    static void fillZone(int x1, int y1, int x2, int y2, int zone) {
        for (int i = Math.min(x1, x2); i <= Math.max(x1, x2); i++) {
            for (int j = Math.min(y1, y2); j <= Math.max(y1, y2); j++) {
                map[i][j] = zone;
            }
        }
    }

    static int bfs() {
        for (int i = 0; i < SIZE; i++)
            Arrays.fill(dist[i], INF);

        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[]{0, 0});
        dist[0][0] = 0;

        while (!deque.isEmpty()) {
            int[] cur = deque.pollFirst();
            int x = cur[0], y = cur[1];


            if (x == 500 && y == 500) return dist[x][y];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d], ny = y + dy[d];

                if (nx < 0 || nx >= SIZE || ny < 0 || ny >= SIZE) continue;
                if (map[nx][ny] == -1) continue;

                int cost = (map[nx][ny] == 1) ? 1 : 0;

                if (dist[nx][ny] > dist[x][y] + cost) {
                    dist[nx][ny] = dist[x][y] + cost;

                    if (cost == 0) {
                        deque.addFirst(new int[]{nx, ny});
                    } else {
                        deque.addLast(new int[]{nx, ny});
                    }
                }
            }
        }

        return -1;
    }
}
