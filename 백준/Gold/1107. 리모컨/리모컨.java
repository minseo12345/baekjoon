import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[] broken = new boolean[10];
        for (int i = 0; i < M; i++) {
            broken[sc.nextInt()] = true;
        }

        int result = Math.abs(N - 100);

        for (int i = 0; i <= 999999; i++) {
            String channel = String.valueOf(i);
            if (isValid(channel, broken)) {
                int pressCount = channel.length() + Math.abs(N - i);
                result = Math.min(result, pressCount);
            }
        }

        System.out.println(result);
    }

    private static boolean isValid(String channel, boolean[] broken) {
        for (int i = 0; i < channel.length(); i++) {
            if (broken[channel.charAt(i) - '0']) {
                return false;
            }
        }
        return true;
    }
}
