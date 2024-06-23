class Solution {
    public int solution(int n) {
        int answer = 0;

        // 숫자를 자릿수별로 분리해서 더하기
        while (n > 0) {
            answer += n % 10; // 마지막 자릿수를 더함
            n /= 10; // 마지막 자릿수를 제거함
        }

        return answer;
    }
}
