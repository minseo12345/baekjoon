import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0, end = 0, sum = 0, maxSum = Integer.MIN_VALUE;

        while (end < K) {
            sum += arr[end++];
        }
        maxSum = sum;

        while (end < N) {
            sum += arr[end++] - arr[start++];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}
