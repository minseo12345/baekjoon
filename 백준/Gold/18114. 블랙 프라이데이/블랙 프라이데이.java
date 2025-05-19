import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int [] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left = 0;
        int right = N-1;

        // 하나만 고르는 경우
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == C){
                System.out.println(1);
                return;
            }
        }

        // 2개만 고르는 경우
        while (left < right) {

            int sum = arr[left] + arr[right];

            if(sum == C){
                System.out.println(1);
                return;
            }else if (sum < C){
                left++;
            }else{
                right--;
            }
        }
        
        // 3개 고르는 경우
        for(int i = 0; i<arr.length; i++){
            int a = arr[i];
            int l = i+1;
            int r = N - 1;

            while (l<r) {
                int sum = a + arr[l] + arr[r] ;
               if(sum == C) {
                    System.out.println(1);
                    return;
               }else if(sum < C){
                    l++;
               }else{
                    r--;
               }
            }
        }

        System.out.println(0);
    }
}
