import java.util.*;

import java.util.Scanner;

class Solution {
    public int[] solution(long n) {

        List<Integer> a = new ArrayList<>();
        while (n>0){
            a.add((int) (n%10));
            n/=10;
        }
        for(int c : a){
            System.out.println(c);
        }
        int[] answer = new int[a.size()];
        for(int i = 0; i<a.size(); i++){
            answer[i] = a.get(i);
        }
        return answer;
    }
}