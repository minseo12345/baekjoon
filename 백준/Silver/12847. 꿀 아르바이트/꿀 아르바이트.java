import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (M == 0 || M > N) {
            System.out.println(0);
            return;
        }

        long sum = 0;
        for (int i = 0; i < M; i++) {
            sum += arr[i];
        }

        long max = sum;

        for (int i = M; i < N; i++) {
            sum = sum - arr[i - M] + arr[i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
