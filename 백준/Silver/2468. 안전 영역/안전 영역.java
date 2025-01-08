import java.util.*;

public class Main {
    static int N; 
    static int[][] map; 
    static boolean[][] visited; 
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];

        int maxHeight = 0; 
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
                maxHeight = Math.max(maxHeight, map[i][j]);
            }
        }

        int maxSafeZones = 0;

        for (int h = 0; h <= maxHeight; h++) {
            visited = new boolean[N][N];
            int safeZones = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && map[i][j] > h) {
                        dfs(i, j, h);
                        safeZones++;
                    }
                }
            }

            maxSafeZones = Math.max(maxSafeZones, safeZones);
        }

        System.out.println(maxSafeZones);
    }

    static void dfs(int x, int y, int height) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (!visited[nx][ny] && map[nx][ny] > height) {
                    dfs(nx, ny, height);
                }
            }
        }
    }
}
