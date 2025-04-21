import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] tokens = br.readLine().split(" ");
        int[] arr = new int[N];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(tokens[i]);
            arr[i] = num;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int answer = 0;
        List<Integer> keys = new ArrayList<>(map.keySet());

        for (int i = 0; i < keys.size(); i++) {
            int a = keys.get(i);
            for (int j = (map.get(a) > 1 ? i : i + 1); j < keys.size(); j++) {
                int b = keys.get(j);
                int mul = a * b;
                
                int t = 0;
                while (mul > 0) {
                    t += mul % 10;
                    mul /= 10;
                }

                answer = Math.max(answer, t);
            }
        }

        System.out.println(answer);
    }
}
