import java.util.*;

public class Main {

    static int N;
    static int[][] graph, dist;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = 1;

        while (true){
            N = sc.nextInt();
            if (N == 0) break;

            graph = new int [N][N];
            dist = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    graph[i][j] = sc.nextInt();
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }

            System.out.println("Problem " + testCase++ + ": " + dijkstra());
        }
    }

    static int dijkstra(){
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        pq.add(new int[]{0,0, graph[0][0]});
        dist[0][0] = graph[0][0];

        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int x = cur[0];
            int y = cur[1];
            int cost = cur[2];

            if (x == N - 1 && y == N - 1) return cost;

            for(int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && nx < N && ny >=0 && ny<N){
                    int nextCost = cost + graph[nx][ny];

                    if(nextCost < dist[nx][ny]){
                        dist[nx][ny] = nextCost;
                        pq.offer(new int[]{nx, ny, nextCost});
                    }
                }
            }
        }
        return -1;
    }
}
