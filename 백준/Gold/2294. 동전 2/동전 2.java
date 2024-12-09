import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, K;
    static int[] arr; 
    static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        arr = new int[N];
        memo = new int[K + 1]; 
        
        Arrays.fill(memo, -1);

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = dp(K);

        if (result == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }

    static int dp(int k) {
        if (k == 0) {
            return 0;
        }

        if (memo[k] != -1) {
            return memo[k];
        }

        int result = Integer.MAX_VALUE;  

        for (int i = 0; i < N; i++) {
            if (k - arr[i] >= 0) {
                int subResult = dp(k - arr[i]);
                if (subResult != Integer.MAX_VALUE) {
                    result = Math.min(result, subResult + 1); 
                }
            }
        }
        
        memo[k] = result;
        return result;
    }
}
