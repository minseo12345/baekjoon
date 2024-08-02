import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long [] a = new long[n];
        long [] b = new long[m];
        long answer = 0;
        a[0] = sc.nextInt();

        for(int i = 1; i<n; i++){
            a[i] = a[i-1] + sc.nextInt();
        }


   

        for(int i =0; i<n; i++){
            int r= (int)(a[i]%m);
            if( r ==0){
                answer++;

            }
            b[r]++;
        }

        for(int i =0; i<m; i++){
            if(b[i]>1){
                answer = answer + (b[i]*(b[i]-1)/2);
            }
        }
        System.out.println(answer);

    }
}
