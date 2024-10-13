import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i : scoville){
            queue.add(i);
        }
        if(queue.isEmpty()){
            return 0;
        }

        while (true){
            if(queue.peek() >= K) {
                break;
            }
            if(queue.size() <=1){
                return -1;
            }
                answer++;
            int a = queue.poll();
            int b = queue.poll();
            int  total = 0;
            total += a+(b*2);
            
            
                queue.add(total);
            
        }
        return answer;
    }
}
