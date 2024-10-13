import java.util.Collections;
import java.util.PriorityQueue;


class Solution {
    public int[] solution(String[] operations) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0; i<operations.length; i++){
            String a = operations[i].split(" ")[0];
            String b = operations[i].split(" ")[1];
            if(a.equals("I")){
                minHeap.add(Integer.valueOf(b));
                maxHeap.add(Integer.valueOf(b));
            } else if(a.equals("D")) {
                if(b.equals("1") && !maxHeap.isEmpty()){
                    int max = maxHeap.poll();
                    minHeap.remove(max);
                }else if(b.equals("-1") && !minHeap.isEmpty()){
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                }
            }
        }

        if (minHeap.isEmpty() || maxHeap.isEmpty()){
            return new int[] {0,0};
        }
        return new int[] {maxHeap.peek(),minHeap.peek()};
    }
}