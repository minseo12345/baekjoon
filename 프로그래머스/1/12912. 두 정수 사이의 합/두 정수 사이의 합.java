import java.util.Scanner;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int tmp= 0;
        if(a == b){
            return  a;
        } else if (a>b) {
            tmp = a;
            a= b;
            b =tmp;
        } 

        
            for(int i = a; i <= b; i++){
                answer += i;
            }
        

        return answer;

    }
}