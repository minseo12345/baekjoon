import java.util.*;

import java.util.Scanner;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set= new HashSet<>();
        for(int a : nums){
            set.add(a);
        }

        int max = nums.length/2;


        return Math.min(set.size(),max);
    }
}