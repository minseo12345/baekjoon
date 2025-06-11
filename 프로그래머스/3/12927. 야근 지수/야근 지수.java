import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int work : works) {
            pq.offer(work);
        }
        
        for(int i = 0; i< n; i++){
            if (pq.isEmpty() || pq.peek() == 0) break;
            int maxWork = pq.poll();
            pq.offer(maxWork - 1);
            
        }
        
        while(!pq.isEmpty()){
            int work = pq.poll();
            answer += (long) work * work;
            
        }
        
        return answer;
    }
}