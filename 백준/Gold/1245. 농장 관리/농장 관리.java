import java.util.*;

public class Main {
    static int N, M;
    static int [][] arr ;
    static boolean[][] visited;
    static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
    static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
    static boolean isPeak;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(!visited[i][j]) {
                    isPeak = true;
                    dfs(i, j, arr[i][j]);
                    if(isPeak) count++;
                }
            }
        }
        System.out.println(count);
    }

    static void dfs(int x, int y, int height) {
        visited[x][y] = true;

        for(int i = 0; i < 8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >=N || ny >= M) continue;

            if(arr[nx][ny] > height) {
                isPeak = false; 
            }

            if(!visited[nx][ny] && arr[nx][ny] == height) dfs(nx, ny, height);
        }
    }
}
