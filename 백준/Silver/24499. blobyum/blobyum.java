import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] original = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            original[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr = new int[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            arr[i] = original[i % N];
        }

        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }

        int max = sum;

        for (int i = K; i < N + K; i++) {
            sum = sum - arr[i - K] + arr[i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
