import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> dq = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            dq.add(i);
        }

        int [] targets = new int[M];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<M; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
        }

        int total = 0;

        for(int target : targets ) {
            int idx = 0;

            for (int num : dq) {
                if (num == target) break;
                idx++;
            }

            int halfIdx;

            if (dq.size() % 2 == 0) {
                halfIdx = dq.size() / 2 - 1;
            } else {
                halfIdx = dq.size() / 2;
            }

            if (idx <= halfIdx) {
                for (int i = 0; i < idx; i++) {
                    dq.addLast(dq.pollFirst());
                    total++;
                }
            }

            else {
                for (int i = 0; i < dq.size() - idx; i++) {
                    dq.addFirst(dq.pollLast());
                    total++;
                }
            }

            dq.pollFirst();
        }
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();

    }
}
