import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] arr = new int[N];
        Integer [] arr2 = new Integer[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(arr2, Collections.reverseOrder());

        int sum = 0;

        for(int i = 0; i < N; i++){
            sum += arr[i] * arr2[i];
        }

        System.out.println(sum);
    }
}
