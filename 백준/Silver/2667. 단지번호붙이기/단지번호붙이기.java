import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int[][] arr = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        ArrayList<Integer> countList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    countList.add(dfs(i, j, visited, dx, dy, arr));
                }
            }
        }

        System.out.println(countList.size());
        Collections.sort(countList);
        for (int count : countList) {
            System.out.println(count);
        }
    }

    public static int dfs(int x, int y, boolean[][] visited, int[] dx, int[] dy, int[][] arr) {
        visited[x][y] = true;
        int count = 1;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 0 && newY >= 0 && newX < arr.length && newY < arr[0].length) {
                if (!visited[newX][newY] && arr[newX][newY] == 1) {
                    count += dfs(newX, newY, visited, dx, dy, arr);
                }
            }
        }

        return count;
    }
}
