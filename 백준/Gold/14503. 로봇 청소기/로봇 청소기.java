import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[][] rooms;
    static int cleanCount;
    static int r, c, d;
    
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        rooms = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                rooms[i][j] = sc.nextInt();
            }
        }

        cleanRoom(r, c, d);
        System.out.println(cleanCount);
    }

    static void cleanRoom(int r, int c, int d) {

        if (rooms[r][c] == 0) {
            rooms[r][c] = 2; // 청소 완료 표시 (2로 설정)
            cleanCount++;
        }
        
        for (int i = 0; i < 4; i++) {

            d = (d + 3) % 4;
            int nx = r + dx[d];
            int ny = c + dy[d];
            
            if (nx >= 0 && nx < N && ny >= 0 && ny < M && rooms[nx][ny] == 0) {
                cleanRoom(nx, ny, d);
                return;
            }
        }
        
        int backDir = (d + 2) % 4;
        int backX = r + dx[backDir];
        int backY = c + dy[backDir];
        
        if (backX >= 0 && backX < N && backY >= 0 && backY < M && rooms[backX][backY] != 1) {
            cleanRoom(backX, backY, d);
        }
    }
}
