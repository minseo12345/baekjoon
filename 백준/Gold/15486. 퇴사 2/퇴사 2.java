import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] Ti = new int[N + 1];
        int[] Pi = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            Ti[i] = scanner.nextInt();
            Pi[i] = scanner.nextInt();
        }

        int[] dp = new int[N + 2];

        for (int i = N; i >= 1; i--) {
            if (i + Ti[i] > N + 1) {
                dp[i] = dp[i + 1];
            } else {
                dp[i] = Math.max(dp[i + 1], Pi[i] + dp[i + Ti[i]]);
            }
        }

        System.out.println(dp[1]);
    }
}
