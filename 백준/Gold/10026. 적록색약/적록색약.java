import java.util.*;

public class Main {
    static int N;
    static char [][] arr;
    static boolean[][] visited;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next().toCharArray();
        }

        System.out.println(nomal() + " " + colorBlind());
    }


    private static int nomal() {

        for (int i = 0; i < N; i++) {
            Arrays.fill(visited[i], false);
        }

        int regions = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    char color = arr[i][j];
                    dfs(i, j, color, false);
                    regions++;
                }
            }
        }
        return regions;
    }

    private static int colorBlind() {

        for (int i = 0; i < N; i++) {
            Arrays.fill(visited[i], false);
        }

        int regions = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    char color = arr[i][j];
                    if (color == 'R' || color == 'G') {
                        dfs(i, j, 'R', true);
                    } else {
                        dfs(i, j, 'B', true);
                    }
                    regions++;
                }
            }
        }
        return regions;
    }

    private static void dfs(int x, int y, char color, boolean colorBlindMode) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 0 && newX < arr.length && newY >= 0 && newY < arr.length) {
                if (colorBlindMode) {
                    if (!visited[newX][newY] && (arr[newX][newY] == 'R' || arr[newX][newY] == 'G') && (arr[newX][newY] == color || color == 'R')) {
                        dfs(newX, newY, 'R', true);
                    } else if (!visited[newX][newY] && arr[newX][newY] == 'B' && arr[newX][newY] == color) {
                        dfs(newX, newY, 'B', true);
                    }
                } else {
                    if (!visited[newX][newY] && arr[newX][newY] == color) {
                        dfs(newX, newY, color, false);
                    }
                }
            }
        }
    }
}
