import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.length() == 6) continue; // 1.000과 같은 경우
            A[i] = (s.charAt(0) - '0') * 1000 + Integer.parseInt(s.substring(2, 5));
        }

        for (int k = 1; k <= 10000; k++) {
            boolean ok = true;
            for (int i = 0; i < N; i++) {
                int L = 0, R = k * 10;
                boolean found = false;

                while (L <= R) {
                    int mid = (L + R) / 2;
                    int val = 0;
                    int temp = mid;

                    for (int d = 0; d < 4; d++) {
                        val = val * 10 + temp / k;
                        temp %= k;
                        temp *= 10;
                    }

                    if (val == A[i]) {
                        found = true;
                        break;
                    } else if (val < A[i]) {
                        L = mid + 1;
                    } else {
                        R = mid - 1;
                    }
                }

                if (!found) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                System.out.println(k);
                return;
            }
        }
    }
}
