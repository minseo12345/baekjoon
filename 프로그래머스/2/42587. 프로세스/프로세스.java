import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> indexQueue = new LinkedList<>();

        // 우선순위 배열을 큐에 추가하고 인덱스를 추적하기 위한 큐도 추가
        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
            indexQueue.add(i);
        }

        int answer = 0;


        while (!queue.isEmpty()) {
            int current = queue.poll();
            int currentIndex = indexQueue.poll();

            // 남은 작업들 중 더 높은 우선순위가 있는지 확인
            boolean b = false;
            for (int priority : queue) {
                if (priority > current) {
                    b = true;
                    break;
                }
            }
            // 더 높은 우선순위가 있으면 다시 큐에 추가
            if (b) {
                queue.add(current);
                indexQueue.add(currentIndex);
            } else {
                answer++;  // 완료된 작업 수를 증가
                if (currentIndex == location) {
                    return answer;  // 찾고자 하는 index에 있는 작업이 완료되면 반환
                }
            }
        }

        return answer;
    }
}