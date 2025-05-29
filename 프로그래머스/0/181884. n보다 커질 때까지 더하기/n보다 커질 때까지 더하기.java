class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for(int a : numbers){
            answer += a;
            if(answer > n){
                return answer;
            }
        }
        return answer;
    }
}