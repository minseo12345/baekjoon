import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long [] a = new long[N];

        for(int i =0; i<N; i++){
            a[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(a);
        int result = 0;

        for(int k =0; k<N; k++){
            long find = a[k];
            int i = 0;
            int j = N-1;

            while (i<j){
                if(a[i] + a[j] == find){
                    if(i !=k && j != k){
                       result++;
                       break;
                    } else if (i == k) {
                        i++;
                    } else if (j ==k) {
                        j--;
                    }
                } else if (a[i] + a[j] < find) {
                    i++;
                }else{
                    j--;
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}
