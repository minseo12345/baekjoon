import java.util.*;

public class Main { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            HashMap<Long, Integer> map = new HashMap<>();
            int max = 0;
            long idx = 0;

            for (int j = 0; j < t; j++) {
                long num = sc.nextLong();

                map.put(num, map.getOrDefault(num, 0) + 1);

                if (map.get(num) > max) {
                    max = map.get(num);
                    idx = num;
                }
            }

            if (max > t / 2) {
                System.out.println(idx);
            } else {
                System.out.println("SYJKGW");
            }

            map.clear();
        }

        sc.close();
    }
}
