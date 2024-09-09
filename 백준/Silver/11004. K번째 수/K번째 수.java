import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(a, 0, n - 1);
        System.out.println(a[k - 1]);
    }

    public static void quickSort(int[] a, int start, int end) {
        if (start >= end) return;  // 정렬할 구간이 없으면 종료

        int x = a[(start + end) / 2];  // 중간값을 피봇으로 선택
        int left = start;
        int right = end;

        while (left <= right) {
            while (a[left] < x) left++;     // 피봇보다 큰 값을 왼쪽에서 찾음
            while (a[right] > x) right--;   // 피봇보다 작은 값을 오른쪽에서 찾음

            if (left <= right) {            // 값 교환 후 포인터 이동
                swap(a, left, right);
                left++;
                right--;
            }
        }

        // 재귀 호출: 피봇을 기준으로 나눈 두 부분을 각각 정렬
        quickSort(a, start, right);   // 왼쪽 부분
        quickSort(a, left, end);      // 오른쪽 부분
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
