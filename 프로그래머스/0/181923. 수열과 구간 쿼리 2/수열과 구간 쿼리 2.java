import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int value = queries[i][2];
            int minValue = Integer.MAX_VALUE;
            boolean found = false;

            // 범위 내에서 value보다 큰 최소값 찾기
            for (int j = start; j <= end; j++) {
                if (arr[j] > value) {
                    minValue = Math.min(minValue, arr[j]);
                    found = true;
                }
            }

            // 결과 리스트에 추가
            if (found) {
                result.add(minValue);
            } else {
                result.add(-1);
            }
        }

        // 리스트를 배열로 변환하여 반환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}