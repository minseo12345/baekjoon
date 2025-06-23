class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = n/7;
        int b = n%7;
        
        if(b == 0) answer = a;
        else answer = a + 1;
        return answer;
    }
}