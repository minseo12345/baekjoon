import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        Set<Integer> set = new HashSet<>();

        for (int len = 1; len <= n; len++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;

    
                for (int i = 0; i < len; i++) {
                    sum += elements[(start + i) % n];
                }

                set.add(sum);
            }
        }

        return set.size();
    }
}
