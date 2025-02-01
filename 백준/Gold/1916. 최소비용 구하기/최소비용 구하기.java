import java.util.*;

public class Main {

    static class Node implements Comparable<Node> {
        int n, w;

        public Node(int n, int w) {
            this.n = n;
            this.w = w;
        }

        @Override
        public int compareTo(Node node) {
            return Integer.compare(this.w, node.w);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Node>> graph = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int w = sc.nextInt();

            graph.get(n).add(new Node(m, w));
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int now = current.n;
            int cost = current.w;

            if (cost > dist[now]) continue;

            for (Node next : graph.get(now)) {
                int weightNew = dist[now] + next.w;
                if (weightNew < dist[next.n]) {
                    dist[next.n] = weightNew;
                    pq.offer(new Node(next.n, weightNew));
                }
            }
        }

        System.out.println(dist[end]);
        sc.close();
    }
}
