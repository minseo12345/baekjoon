import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
       
        Arrays.sort(citations);

        int n = citations.length;

        // H-Index 찾기
        for (int i = 0; i < n; i++) {
            int h = n - i; // 현재 인덱스 이후의 논문 수
            if (citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }
}
