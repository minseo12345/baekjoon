class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];

        if (s < n) {
            return new int[] {-1};
        }
        
        int quotient = s / n;
        int remainder = s % n;
        
        // 모든 요소에 quotient를 넣어 초기화
        for (int i = 0; i < n; i++) {
            answer[i] = quotient;
        }
        
        for (int i = n - 1; i >= n - remainder; i--) {
            answer[i]++;
        }
        
        return answer;
    }
}
