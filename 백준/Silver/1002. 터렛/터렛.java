import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int dx = x1 - x2;
            int dy = y1 - y2;
            double distance = Math.sqrt(dx * dx + dy * dy);

            int result;

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                result = -1;
            } else if (distance == Math.abs(r1 - r2) || distance == r1 + r2) {
                result = 1;
            } else if (Math.abs(r1 - r2) < distance && distance < r1 + r2) {
                result = 2;
            } else {
                result = 0;
            }

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
