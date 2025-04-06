import java.util.*;

public class Main {
    static int N, M;
    static int[][] arr;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int[] reflect = {1, 0, 3, 2};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        List<String> answer = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            answer.add(search(i, 0, 1));
        }

        for (int i = 0; i < M; i++) {
            answer.add(search(N - 1, i, 0));
        }

        for (int i = N - 1; i >= 0; i--) {
            answer.add(search(i, M - 1, 3));
        }

        for (int i = M - 1; i >= 0; i--) {
            answer.add(search(0, i, 2));
        }

        System.out.println(String.join(" ", answer));
    }

    static String search(int x, int y, int dir) {
        while (x >= 0 && x < N && y >= 0 && y < M) {
            if (arr[x][y] == 1) {
                dir = reflect[dir];
            }
            x += dx[dir];
            y += dy[dir];
        }
        return String.valueOf(exit(x, y));
    }

    static int exit(int x, int y) {
        if (x == -1) {
            return 2 * N + 2 * M - y;
        } else if (y == -1) {
            return x + 1;
        } else if (x == N) {
            return N + y + 1;
        } else {
            return 2 * N + M - x;
        }
    }
}
