import java.util.*;

public class Main {
    static int N, C;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        C = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        for (int i = 0; i < N; i++) {

            if (arr[i] == C) {
                System.out.println(1);
                return;
            }

            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == C) {
                    System.out.println(1);
                    return;
                }
                
                int target = C - (arr[i] + arr[j]);
                if (binarySearch(arr, j + 1, N - 1, target)) {
                    System.out.println(1);
                    return;
                }
            }
        }

        System.out.println(0);
    }
    
    static boolean binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
