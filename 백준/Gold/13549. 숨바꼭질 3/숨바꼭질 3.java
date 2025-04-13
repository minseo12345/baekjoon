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
    static int N,K;
    static int [] dist;
    static final int MAX = 100001;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        dist = new int[MAX];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[N] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(N, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int pos = cur.index;
            int cost = cur.cost;

            if (pos == K) break;

            if (pos * 2 < MAX && dist[pos * 2] > cost) {
                dist[pos * 2] = cost;
                pq.offer(new Node(pos * 2, cost));
            }

            if (pos - 1 >= 0 && dist[pos - 1] > cost + 1) {
                dist[pos - 1] = cost + 1;
                pq.offer(new Node(pos - 1, cost + 1));
            }

            if (pos + 1 < MAX && dist[pos + 1] > cost + 1) {
                dist[pos + 1] = cost + 1;
                pq.offer(new Node(pos + 1, cost + 1));
            }

        }

        bw.write(dist[K] + "\n");
        bw.flush();                
        bw.close();
        br.close();
    }

}
