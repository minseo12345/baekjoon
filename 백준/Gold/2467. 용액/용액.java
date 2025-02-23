import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int bestSum = Integer.MAX_VALUE;
        int answerLeft = 0, answerRight = 0;

        int left = 0, right = N - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (Math.abs(sum) < Math.abs(bestSum)) {
                bestSum = sum;
                answerLeft = arr[left];
                answerRight = arr[right];
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(answerLeft + " " + answerRight);
    }
}
