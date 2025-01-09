import java.util.*;

public class Main {
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int [] arr = new int[N+1];

        for(int i = 1; i <= N; i++){
            arr[i] = sc.nextInt();
        }
               int [] dp = new int[N+1];

        System.out.println(dp(N,arr,dp));

    }
    private static int dp(int n ,int [] arr , int [] dp){
        if(n == 1){
            return arr[1];
        }
        if (n == 2) {
            return arr[1] + arr[2];
        }
        dp[1] = arr[1];
        if (N >= 2) dp[2] = arr[1] + arr[2];
        if (N >= 3) dp[3] = Math.max(arr[1] + arr[3], arr[2] + arr[3]);

        for(int i = 4; i <= N; i++){
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);
        }

        return dp[n];
    }

}
