import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  

        int[] hi = new int[N];
        int[] arc = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) hi[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) arc[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arc); 

        long hiWin = 0;
        long arcWin = 0;
        long draw = 0;

        for (int x : hi) {
            int lower = lowerBound(arc, x); 
            int upper = upperBound(arc, x); 

            hiWin += lower;
            draw += (upper - lower);
            arcWin += (M - upper);
        }

        System.out.println(hiWin + " " + arcWin + " " + draw);
    }

    
    static int lowerBound(int[] arr, int x) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < x) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    
    static int upperBound(int[] arr, int x) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= x) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
