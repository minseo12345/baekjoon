import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < N; i++) {
                int importance = sc.nextInt();
                queue.add(new int[]{i, importance});
                priorityQueue.add(importance);
            }

            int printOrder = 0;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                if (current[1] == priorityQueue.peek()) {

                    printOrder++;
                    priorityQueue.poll();
                    if (current[0] == M) {
                        System.out.println(printOrder);
                        break;
                    }
                } else {

                    queue.add(current);
                }
            }
        }
    }
}
