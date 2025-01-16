import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            list.add(a);
        }
        Collections.sort(list, Collections.reverseOrder());

        int count = 0;
        int sum = 0;

        while (sum < K && !list.isEmpty()) {
            int current = list.get(0);
            if (current > K) {
                list.remove(0);
                continue;
            }

            if (sum + current <= K) {
                sum += current;
                count++;
            } else {
                list.remove(0);
            }
        }
        System.out.println(count);
    }
}
