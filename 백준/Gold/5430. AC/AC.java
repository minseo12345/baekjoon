import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            String method = sc.nextLine();
            int N = sc.nextInt();
            sc.nextLine();

            String input = sc.nextLine();
            input = input.replaceAll("[^0-9,]", "");

            Deque<Integer> deque = new ArrayDeque<>();
            if (!input.isEmpty()) {
                String[] stringArray = input.split(",");
                for (int i = 0; i < N; i++) {
                    deque.add(Integer.parseInt(stringArray[i]));
                }
            }

            boolean reverse = false;
            boolean error = false;

            for (char cmd : method.toCharArray()) {
                if (cmd == 'R') {
                    reverse = !reverse;
                } else if (cmd == 'D') {
                    if (deque.isEmpty()) {
                        System.out.println("error");
                        error = true;
                        break;
                    }
                    if (reverse) {
                        deque.removeLast();
                    } else {
                        deque.removeFirst();
                    }
                }
            }

            if (!error) {
                printDeque(deque, reverse);
            }
        }
    }

    static void printDeque(Deque<Integer> deque, boolean reverse) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (!deque.isEmpty()) {
            sb.append(reverse ? deque.removeLast() : deque.removeFirst());
            if (!deque.isEmpty()) sb.append(",");
        }
        sb.append("]");
        System.out.println(sb);
    }
}
