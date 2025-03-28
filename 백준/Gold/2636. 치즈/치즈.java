import java.util.*;

public class Main {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] board;
    static int n, m;
    static int cheese;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        board = new int[n][m];
        cheese = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                board[i][j] = scan.nextInt();
                if(board[i][j] == 1) cheese++;
            }
        }

        int cheeseCount = 0;
        int time = 0;
        while(cheese != 0) {
            cheeseCount = cheese;
            time++;
            visited = new boolean[n][m];
            bfs();
        }
        System.out.println(time);
        System.out.println(cheeseCount);
    }

    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0, 0});
        visited[0][0] = true;

        while(!q.isEmpty()) {
            int[] current = q.poll();

            for(int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if(nx >= 0 && ny >= 0 && nx < n && ny < m && visited[nx][ny] == false) {
                    visited[nx][ny] = true;
                    if(board[nx][ny] == 0) {
                        q.offer(new int[] {nx, ny});
                    } else {
                        cheese--;
                        board[nx][ny] = 0;
                    }
                }
            }
        }
    }
}