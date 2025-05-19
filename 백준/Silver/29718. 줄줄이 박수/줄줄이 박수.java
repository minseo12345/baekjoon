import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][] arr = new int [N][M];

        for(int i = 0; i< N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j< M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int K = Integer.parseInt(br.readLine());

        int[] colSum = new int[M];
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                colSum[j] += arr[i][j];
            }
        }
        
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += colSum[i];
        }

        int max = sum;
        
        for (int i = K; i < M; i++) {
            sum = sum - colSum[i - K] + colSum[i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
