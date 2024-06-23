import java.util.*;

import java.util.Scanner;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s.toLowerCase();
        int sCount =0;
        int pCount = 0;
        
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'y' || c=='Y'){
                sCount++;
            }else if(c =='p' || c =='P'){
                pCount++;
            }
        }
        System.out.println(pCount);
        System.out.println(sCount);
        if(sCount == pCount){
            answer = true;
        }else {
            answer = false;
        }

        return answer;
    }
}