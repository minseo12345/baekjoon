import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        long [] array = new long[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            array[i] = Long.parseLong(br.readLine());
            max = Math.max(max, array[i]);
        }

        long str = 1;
        long en = max;
        long result = 0;

        while(str <= en){
            long mid = (str + en)/2;
            long count = 0;

            for(long b : array){
                count += b/mid;
            }

            if(count >= N){
                result = mid;
                str = mid + 1;
            }
            else{
                en = mid - 1;
            }
        }

        System.out.println(result);


    }

}
