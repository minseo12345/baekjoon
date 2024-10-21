import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> categoryCount = new HashMap<>();

        // 각 의상의 종류별로 개수를 세기
        for (String[] cloth : clothes) {
            String category = cloth[1];
            categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
        }

        // 조합 계산
        int combinations = 1;
        for (int count : categoryCount.values()) {
            combinations *= (count + 1); // 각 종류의 의상 개수 + 1 (그 종류의 의상을 입지 않을 경우)
        }

        // 최소 1개 이상의 의상은 착용해야 하므로, 1을 빼줌
        return combinations - 1;
    }
}