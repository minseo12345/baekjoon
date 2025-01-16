import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new int[]{start, end});
        }

        list.sort((a, b) -> {
            if (a[1] == b[1]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        int count = 0;
        int lastEndTime = 0;

        for (int[] arr : list) {
            if (arr[0] >= lastEndTime) {
                lastEndTime = arr[1];
                count++;
            }
        }

        System.out.println(count);
    }
}
