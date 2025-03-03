import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] lis = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int len = 0; 
        for (int i = 0; i < N; i++) {
            int pos = binarySearch(lis, 0, len, arr[i]);
            lis[pos] = arr[i];

            if (pos == len) {
                len++;
            }
        }
        System.out.println(len);
    }

    static int binarySearch(int[] lis, int l, int r, int target) {
        while (l < r) {
            int mid = (l + r) / 2;
            if (lis[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
