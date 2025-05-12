import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        boolean[] isBroken = new boolean[N + 1];


        for (int i = 0; i < B; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            isBroken[a] = true;
        }

        int brokenCount = 0;

        for(int i = 1; i <=K; i++) {
            if(isBroken[i]) brokenCount++;
        }

        int minFix = brokenCount;

        for(int i = K+1; i <=N; i++) {
            if(isBroken[i-K]) brokenCount--;
            if(isBroken[i]) brokenCount++;
            minFix = Math.min(minFix, brokenCount);
        }

        System.out.println(minFix);

    }

}
