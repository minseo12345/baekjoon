import java.util.*;

public class Main {
    static int N;
    static double [] arr;
    static boolean[][] visited;
    static int [] dx = {-1, 1, 0, 0};
    static int [] dy = {0, 0, -1, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        arr = new double[4];
        visited = new boolean[30][30];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt() / 100.0;
        }

        visited[15][15] = true;

        System.out.println(dfs(15,15,0));
    }
    static double dfs(int x, int y, int dep) {
        if (N == dep){
            return 1.0;
        }
        double prob = 0.0;

        for(int i =0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(!visited[nx][ny] && arr[i] >0){
                visited[nx][ny] = true;
                prob += arr[i] * dfs(nx, ny, dep+1);
                visited[nx][ny] = false;
            }
        }

        return prob;
    }
}
