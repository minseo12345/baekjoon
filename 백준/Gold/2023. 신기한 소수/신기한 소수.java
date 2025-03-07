import java.util.*;

public class Main {
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            if (isPrime(i)) {
                backTracking(1, String.valueOf(i));
            }
        }
    }

    static void backTracking(int depth, String num) {
        if (depth == N) {
            System.out.println(num);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            String n = num + i;
            if (isValidPrime(n)) {
                backTracking(depth + 1, n);
            }
        }
    }

    static boolean isValidPrime(String num) {
        for (int i = 1; i <= num.length(); i++) {
            if (!isPrime(Integer.parseInt(num.substring(0, i)))) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
