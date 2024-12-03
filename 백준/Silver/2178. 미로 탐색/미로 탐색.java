import java.util.*;

public class Main {
    static int N, M;
    static int [][] arr;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N][M];

        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for(int j = 0; j < M; j++){
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        int result = bfs(0,0);

        System.out.println(result);

    }

    static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y,1});
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int a = cur[0];
            int b = cur[1];
            int distance = cur[2];

            if(a == N-1 && b == M-1){
                return distance;
            }

            for(int i=0;i<4;i++){
                int na = a+dx[i];
                int nb = b+dy[i];

                if(na >=0 && na <N && nb >=0 && nb < M &&arr[na][nb] == 1){
                    arr[na][nb] = 0;
                    q.offer(new int[]{na,nb,distance+1});
                }
            }

        }
        return -1;
    }
}
