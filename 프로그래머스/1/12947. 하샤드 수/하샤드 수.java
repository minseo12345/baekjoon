import java.util.Scanner;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int a =0;
        int b = x;
        while (x > 0){
            a += x %10;
            x = x/10;
        }
        if(b%a ==0){
            answer = true;
        }else answer = false;

        return  answer;

    }
}