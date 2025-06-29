import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        if (!wordSet.contains(target)) return 0;

        Queue<String> queue = new LinkedList<>();
        Queue<Integer> depth = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(begin);
        depth.offer(0);
        visited.add(begin);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int step = depth.poll();

            if (current.equals(target)) {
                return step;
            }

            for (String word : words) {
                if (!visited.contains(word) && canConvert(current, word)) {
                    queue.offer(word);
                    depth.offer(step + 1);
                    visited.add(word);
                }
            }
        }

        return 0;
    }

    private boolean canConvert(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) diff++;
            if (diff > 1) return false;
        }
        return diff == 1;
    }
}
