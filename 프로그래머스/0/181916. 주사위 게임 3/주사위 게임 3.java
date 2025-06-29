import java.util.*;

public class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] nums = {a, b, c, d};
        Map<Integer, Integer> countMap = new HashMap<>();


        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        int size = countMap.size();

        if (size == 1) {
            return 1111 * a;
        }


        if (size == 2) {
            for (int key : countMap.keySet()) {
                int cnt = countMap.get(key);
                if (cnt == 3) {
                    int p = key;
                    int q = getOtherNumber(countMap, p);
                    return (int) Math.pow(10 * p + q, 2);
                } else if (cnt == 2) {
  
                    List<Integer> keys = new ArrayList<>(countMap.keySet());
                    int p = keys.get(0);
                    int q = keys.get(1);
                    return (p + q) * Math.abs(p - q);
                }
            }
        }


        if (size == 3) {
            int same = 0;
            List<Integer> others = new ArrayList<>();
            for (int key : countMap.keySet()) {
                if (countMap.get(key) == 2) {
                    same = key;
                } else {
                    others.add(key);
                }
            }
            return others.get(0) * others.get(1);
        }


        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    private int getOtherNumber(Map<Integer, Integer> map, int exclude) {
        for (int key : map.keySet()) {
            if (key != exclude) return key;
        }
        return -1;
    }
}
