import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [] arr = new int[n];
        int [] arr2 = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<m; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

         int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();

            while (i < n && j < m) {
            if (arr[i] <= arr2[j]) {
                sb.append(arr[i++]).append(" ");
            } else {
                sb.append(arr2[j++]).append(" ");
            }
        }
        while (i < n) sb.append(arr[i++]).append(" ");
        while (j < m) sb.append(arr2[j++]).append(" ");

        System.out.println(sb.toString());
        
    }
}
