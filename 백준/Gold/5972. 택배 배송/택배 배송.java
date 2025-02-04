import java.util.*;

public class Main {

    static class Node implements Comparable<Node> {
        int m,w;

        Node(int m, int w) {
            this.m = m;
            this.w = w;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.w, o.w);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Node>> graph = new ArrayList<>();

        for(int i = 0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int w = sc.nextInt();

            graph.get(a).add(new Node(b,w));
            graph.get(b).add(new Node(a,w));
        }

        int [] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(1, 0));

        while(!pq.isEmpty()){
            Node cur = pq.poll();
            int now = cur.m;
            int weight = cur.w;

            if(dist[now] < weight) continue;

            for(int i = 0; i< graph.get(now).size(); i++){
                Node next = graph.get(now).get(i);
                int nowWeight = next.w+dist[now];

                if(dist[next.m] > nowWeight){
                    dist[next.m] = nowWeight;
                    pq.offer(new Node(next.m, nowWeight));
                }
            }
        }

        System.out.println(dist[N]);
    }
}
