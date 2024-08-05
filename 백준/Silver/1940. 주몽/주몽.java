import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int count = 0;
        int sum =0;
        int i = 0;
        int j = N-1;

        int [] a = new int[N];

        for(int k = 0; k<N;k++){
            a[k] = sc.nextInt();
        }
        Arrays.sort(a);

        while(i<j){
            if(a[i] + a[j] > M){
                j--;
            }else if(a[i] + a[j] < M){
                i++;
            }else{
                i++;
                j--;
                count++;
            }
        }
        System.out.println(count);
    }
}
