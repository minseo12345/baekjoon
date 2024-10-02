import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        int success = 100;
        int i = 0;
        while (i<progresses.length){
            while (progresses[i] < success){
                progresses[i] += speeds[i];
                count++;
            }
            if(progresses[i] >= success){
                queue.add(count);
                count =0;
                i++;
            }

        }

        while (!queue.isEmpty()){
            int c = queue.poll();
            count = 1;

            while(!queue.isEmpty() && queue.peek()<= c){
                count++;
                queue.poll();
            }
            answer.add(count);
        }
        
            return  answer.stream().mapToInt(a -> a).toArray();
        }
}