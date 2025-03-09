import java.util.*;

public class Main {
    static int N, M;
    static int[] cost;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        cost = new int[N];

        int left = 0, right = 0; 
        for (int i = 0; i < N; i++) {
            cost[i] = sc.nextInt();
            left = Math.max(left, cost[i]); 
            right += cost[i];               
        }
        
        int answer = right;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canWithdraw(mid)) { 
                answer = mid;
                right = mid - 1; 
            } else {
                left = mid + 1;  
            }
        }

        System.out.println(answer);
    }

    
    static boolean canWithdraw(int K) {
        int count = 1; 
        int current = K;

        for (int i = 0; i < N; i++) {
            if (current < cost[i]) { 
                count++;
                current = K; 
            }
            current -= cost[i]; 

            if (count > M) return false; 
        }

        return count <= M;
    }
}
