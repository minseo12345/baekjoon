import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> memo = new HashMap<>();
        System.out.println(createOne(n, memo));
    }

    public static int createOne(int n, Map<Integer, Integer> memo) {
        if (n == 1) {
            return 0;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int min = Integer.MAX_VALUE;

        if (n % 3 == 0) {
            min = Math.min(min, createOne(n / 3, memo) + 1);
        }

        if (n % 2 == 0) {
            min = Math.min(min, createOne(n / 2, memo) + 1);
        }

        min = Math.min(min, createOne(n - 1, memo) + 1);

        memo.put(n, min);
        return min;
    }
}
