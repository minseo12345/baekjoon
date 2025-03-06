import java.util.*;

public class Main {

    static int R, C, K;
    static char[][] map;
    static boolean [][] visited;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        C = sc.nextInt();
        K = sc.nextInt();
        sc.nextLine();
        map = new char[R][C];
        visited = new boolean [R][C];

        for (int i = 0; i < R; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        visited[R - 1][0] = true;

        dfs(R-1,0,1);
        System.out.println(count);
    }

    private static void dfs(int x, int y, int dir) {
        if(x == 0 && y == C-1){
            if(dir == K){
                count++;
            }
            return;
        }

        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny] && map[nx][ny] != 'T'){
                visited[nx][ny] = true;
                dfs(nx,ny,dir+1);
                visited[nx][ny] = false;
            }
        }
    }
}
