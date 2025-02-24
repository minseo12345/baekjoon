import java.io.*;
import java.util.*;

public class Main {

    static int N, Q;
    static String S;
    static List<Integer> rq = new ArrayList<>();
    static List<Integer> bq = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());
        S = br.readLine();

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'R') {
                rq.add(i);
            } else if (S.charAt(i) == 'B') {
                bq.add(i);
            }
        }

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            int aIdx = lowerBound(rq, l);
            if (aIdx == rq.size() || rq.get(aIdx) >= r) {
                sb.append("-1\n");
                continue;
            }
            int a = rq.get(aIdx);

            int bIdx = aIdx + 1;
            if (bIdx >= rq.size() || rq.get(bIdx) >= r) {
                sb.append("-1\n");
                continue;
            }
            int b = rq.get(bIdx);

            int cIdx = lowerBound(bq, b + 1);
            if (cIdx == bq.size() || bq.get(cIdx) > r) {
                sb.append("-1\n");
                continue;
            }
            int c = bq.get(cIdx);

            int dIdx = cIdx + 1;
            if (dIdx >= bq.size() || bq.get(dIdx) > r) {
                sb.append("-1\n");
                continue;
            }
            int d = bq.get(dIdx);

            sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    static int lowerBound(List<Integer> list, int target) {
        int left = 0, right = list.size();
        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
