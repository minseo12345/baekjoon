import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set= new HashSet<>();
        for(int a : nums){
            set.add(a);
        }

        return Math.min(set.size(),nums.length/2);
    }
}