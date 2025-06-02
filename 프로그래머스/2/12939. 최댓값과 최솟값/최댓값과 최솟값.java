import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" "); 
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < strArr.length; i++) {
            int num = Integer.parseInt(strArr[i]);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return min + " " + max;
    }
}
