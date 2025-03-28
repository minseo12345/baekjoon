import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        int[] targets = new int[M];
        for (int i = 0; i < M; i++) {
            targets[i] = sc.nextInt();
        }

        int totalOperations = 0;

        for (int target : targets) {
            int index = deque.indexOf(target);
            int leftMoves = index;
            int rightMoves = deque.size() - index;

            if (leftMoves <= rightMoves) { 
                for (int i = 0; i < leftMoves; i++) {
                    deque.addLast(deque.pollFirst());
                }
                totalOperations += leftMoves;
            } else {
                for (int i = 0; i < rightMoves; i++) {
                    deque.addFirst(deque.pollLast());
                }
                totalOperations += rightMoves;
            }

            deque.pollFirst();
        }

        System.out.println(totalOperations);
    }
}
