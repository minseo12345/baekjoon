import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 접시의 수
        int d = Integer.parseInt(st.nextToken());   // 초밥의 가짓수
        int k = Integer.parseInt(st.nextToken());   // 연속해서 먹는 접시의 수
        int c = Integer.parseInt(st.nextToken());   // 쿠폰 번호

        int [] arr = new int[N];
        int [] count = new int[d+1];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int kind = 0;

        for(int i = 0; i < k; i++){
            if(count[arr[i]] == 0) kind++;
            count[arr[i]]++;
        }

        int max = (count[c] == 0) ? kind + 1 : kind;

        for(int i = 1; i < N; i++){
            int remove = arr[(i-1) % N];
            int add = arr[(i+k-1) % N];

            count[remove]--;
            if(count[remove] == 0) kind--;

            if(count[add] == 0) kind++;
            count[add]++;

            int tot = (count[c] == 0) ? kind + 1 : kind;
            max = Math.max(max, tot);
        }

        System.out.println(max);
    }
}
