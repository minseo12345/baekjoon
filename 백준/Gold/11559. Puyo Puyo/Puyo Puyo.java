import java.util.*;

public class Main {
    static char[][] field = new char[12][6];
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            String line = sc.next();
            field[i] = line.toCharArray();
        }

        int combo = 0;

        while (true) {
            boolean isPopped = false;
            boolean[][] visited = new boolean[12][6];
            List<int[]> toPop = new ArrayList<>();

            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 6; j++) {
                    if (field[i][j] != '.' && !visited[i][j]) {
                        List<int[]> group = new ArrayList<>();
                        find(i, j, field[i][j], group, visited);
                        if (group.size() >= 4) {
                            isPopped = true;
                            toPop.addAll(group);
                        }
                    }
                }
            }

            if (!isPopped) break;


            for (int[] pos : toPop) {
                field[pos[0]][pos[1]] = '.';
            }

            gravity();

            combo++;
        }

        System.out.println(combo);
    }

    static void find(int x, int y, char color, List<int[]> group, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int px = pos[0], py = pos[1];
            group.add(pos);

            for (int d = 0; d < 4; d++) {
                int nx = px + dx[d], ny = py + dy[d];
                if (nx >= 0 && nx < 12 && ny >= 0 && ny < 6 && !visited[nx][ny] && field[nx][ny] == color) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }

    static void gravity() {
        for (int col = 0; col < 6; col++) {
            for (int row = 11; row >= 0; row--) {
                if (field[row][col] == '.') {
                    for (int k = row - 1; k >= 0; k--) {
                        if (field[k][col] != '.') {
                            field[row][col] = field[k][col];
                            field[k][col] = '.';
                            break;
                        }
                    }
                }
            }
        }
    }
}
