import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] coords = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            coords[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coords);

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int x : coords) {
            if (x % 2 == 0) even.add(x);
            else odd.add(x);
        }

        int evenMin = Integer.MAX_VALUE;
        int oddMin = Integer.MAX_VALUE;

        for (List<Integer> group : List.of(even, odd)) {
            for (int i = 1; i < group.size(); i++) {
                evenMin = Math.min(evenMin, group.get(i) - group.get(i - 1));
            }
        }
        int i = 0, j = 0;
        while (i < even.size() && j < odd.size()) {
            int a = even.get(i);
            int b = odd.get(j);
            int dist = Math.abs(a - b);
            oddMin = Math.min(oddMin, dist);
          
            if (a < b) i++;
            else j++;
        }

        System.out.println((evenMin == Integer.MAX_VALUE ? -1 : evenMin) + " " +
                           (oddMin == Integer.MAX_VALUE ? -1 : oddMin));
    }
}
