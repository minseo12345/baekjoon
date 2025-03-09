import java.util.*;

public class Main {
    static int N, M;
    static int [] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];

        int minTime = Integer.MAX_VALUE;

        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
            minTime = Math.min(minTime, arr[i]);
        }

        long left = minTime;
        long right = (long) minTime * M;

        while (left < right) {
            long mid = (left + right) / 2;

            if (sol(mid)) {
                right = mid;  
            } else {
                left = mid + 1; 
            }
        }

        System.out.println(left);
    }

    static boolean sol(long time) {
        long count = 0;
        for (int t : arr) {
            count += time / t;
            if (count >= M) return true; 
        }
        return count >= M;
    }
}
