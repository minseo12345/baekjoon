import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        int to, weight;

        public Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.weight, o.weight);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int D = sc.nextInt();

        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= D; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < D; i++) {
            graph.get(i).add(new Node(i + 1, 1));
        }

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int cost = sc.nextInt();

            if (end <= D) {
                graph.get(start).add(new Node(end, cost));
            }
        }

        int[] dist = new int[D + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(0, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int now = cur.to;
            int cost = cur.weight;

            if (dist[now] < cost) continue;

            for (Node next : graph.get(now)) {
                int weightNow = cost + next.weight;

                if (dist[next.to] > weightNow) {
                    dist[next.to] = weightNow;
                    pq.offer(new Node(next.to, weightNow));
                }
            }
        }

        System.out.println(dist[D]);
    }
}
