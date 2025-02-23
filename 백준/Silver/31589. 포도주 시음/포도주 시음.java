import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        Arrays.sort(t);

        long ans = t[n - 1];
        int lo = 0, hi = n - 2, cnt = k - 1;
        while (cnt > 1) {
            ans += t[hi--] - t[lo++];
            cnt -= 2;
        }

        System.out.println(ans);
        sc.close();
    }
}
