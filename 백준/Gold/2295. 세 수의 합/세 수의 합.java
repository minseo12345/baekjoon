import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static ArrayList<Integer> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);

        list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                list.add(array[i] + array[j]);
            }
        }
        Collections.sort(list);

        for (int k = N - 1; k >= 0; k--) {
            for (int i = 0; i < N; i++) {
                int target = array[k] - array[i];
                if (binarySearch(target)) {
                    System.out.println(array[k]);
                    return;
                }
            }
        }
    }

    static boolean binarySearch(int x) {
        int st = 0;
        int en = list.size() - 1;

        while (st <= en) {
            int mid = (st + en) / 2;

            if (list.get(mid) < x) {
                st = mid + 1;
            } else if (list.get(mid) > x) {
                en = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
