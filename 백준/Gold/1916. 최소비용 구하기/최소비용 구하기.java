import java.io.*;
import java.util.*;
class Node implements Comparable<Node> {
    int index;
    int cost;

    public Node(int index, int cost) {
        this.index = index;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(cost, o.cost);
    }
}

public class Main {
    static int N,M;
    static ArrayList<ArrayList<Node>> list;
    static int [] dist;
    static int [] visited;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        dist = new int[N+1];
        visited = new int[N+1];

        Arrays.fill(dist, Integer.MAX_VALUE);

        for(int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i <M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            list.get(start).add(new Node(end, cost));
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        bw.write(dijkstra(start, end) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int dijkstra(int start, int end){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[N+1];
        pq.offer(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()){
            Node curNode = pq.poll();
            int cur = curNode.index;

            if(!visited[cur]){
                visited[cur] = true;

                for(Node node : list.get(cur)){
                    if (!visited[node.index] && dist[node.index] > dist[cur] + node.cost){
                        dist[node.index] = dist[cur] + node.cost;
                        pq.add(new Node(node.index, dist[node.index]));
                    }
                }
            }
        }

        return dist[end];
    }
}
