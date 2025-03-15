import java.util.*;

public class Main {
    static int N, M, K;
    static int[] parent;
    static List<Integer>[] parties;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        parent = new int[N + 1];
        parties = new ArrayList[M];

        for (int i = 1; i <= N; i++) parent[i] = i;
        for (int i = 0; i < M; i++) parties[i] = new ArrayList<>();

        List<Integer> truthPeople = new ArrayList<>();
        for (int i = 0; i < K; i++) truthPeople.add(sc.nextInt());


        for (int i = 0; i < M; i++) {
            int num = sc.nextInt();
            if (num == 0) continue;

            int first = sc.nextInt();
            parties[i].add(first);

            for (int j = 1; j < num; j++) {
                int person = sc.nextInt();
                parties[i].add(person);
                union(first, person);
            }
        }

        Set<Integer> truthGroups = new HashSet<>();
        for (int person : truthPeople) {
            truthGroups.add(find(person));
        }

        int lieCount = 0;
        for (List<Integer> party : parties) {
            boolean canLie = true;
            for (int person : party) {
                if (truthGroups.contains(find(person))) {
                    canLie = false;
                    break;
                }
            }
            if (canLie) lieCount++;
        }

        System.out.println(lieCount);
    }


    static int find(int a) {
        if (parent[a] == a) return a;
        return parent[a] = find(parent[a]);
    }


    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) parent[b] = a;
    }
}
