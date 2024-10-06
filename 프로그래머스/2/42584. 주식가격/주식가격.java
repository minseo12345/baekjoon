class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        // prices 배열을 순차적으로 탐색
        for (int i = 0; i < prices.length; i++) {
            // 현재 시점에서 이후 시점까지 가격이 유지되는 시간을 계산
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;  // 시간 1초 경과
                // 만약 현재 가격이 이후 가격보다 크다면, 가격이 떨어진 것이므로 중단
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }

        return answer;  // 계산된 결과를 반환
    }
}