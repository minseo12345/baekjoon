import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        int [] result = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n; i++){

            a[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = n - 1; i >= 0; i--) {
            // 스택이 비지 않았고, 현재 원소보다 스택의 맨 위 원소가 작거나 같으면 스택 팝
            while (!stack.isEmpty() && stack.peek() <= a[i]) {
                stack.pop();
            }

            // 스택이 비어 있으면 -1, 그렇지 않으면 스택의 맨 위 원소가 오큰수
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // 현재 원소를 스택에 추가
            stack.push(a[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
