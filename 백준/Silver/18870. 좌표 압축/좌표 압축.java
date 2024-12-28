import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] original = new int[N];
        for (int i = 0; i < N; i++) {
            original[i] = sc.nextInt();
        }

        int[] sorted = Arrays.copyOf(original, N);
        Arrays.sort(sorted);

        int[] unique = Arrays.stream(sorted).distinct().toArray();

        StringBuilder sb = new StringBuilder();
        for (int num : original) {
            int res = binarySearch(unique, num);
            sb.append(res).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    private static int binarySearch(int[] arr, int target) {
        int st = 0;
        int en = arr.length - 1;

        while (st <= en) {
            int mid = (st + en) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                en = mid - 1;
            }
        }

        return -1;
    }
}
