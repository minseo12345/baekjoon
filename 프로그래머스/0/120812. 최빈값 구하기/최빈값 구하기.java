import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();


        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mode = -1;
        boolean duplicate = false;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                mode = value;
                duplicate = false;
            } else if (count == maxCount) {
                duplicate = true;
            }
        }

        return duplicate ? -1 : mode;
    }
}
