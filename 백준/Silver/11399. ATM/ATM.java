import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] s = new int[n];
        int [] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i =0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

    for(int i =1; i<a.length; i++){
        int target = a[i];
        int j = i-1;

        while (j>=0 && target<a[j]){
            a[j+1] = a[j];
            j--;
        }

        a[j+1] = target;
    }
        int sum = 0;
        s[0] = a[0];

        for(int i =1; i<a.length; i++){
            s[i] = s[i-1] + a[i];
        }

        for(int i =0 ; i<a.length;i++){
            sum = sum + s[i];
        }
        System.out.println(sum);
    }


}
