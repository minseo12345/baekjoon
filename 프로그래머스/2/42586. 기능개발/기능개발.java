import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> progressQueue = new LinkedList<>();
        Queue<Integer> speedQueue = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            progressQueue.add(progresses[i]);
            speedQueue.add(speeds[i]);
        }

        int count = 0; // 하루에 완료되는 작업 수
        int day = 1; // 일자 초기화

        while (!progressQueue.isEmpty()) {
            int progress = progressQueue.peek(); // 작업의 현재 진행률
            int speed = speedQueue.peek(); // 작업의 속도

            // 작업이 완료되었는지 확인
            if (progress + (speed * day) >= 100) {
                count++; // 완료된 작업 수 증가
                progressQueue.poll(); // 완료된 작업 제거
                speedQueue.poll(); // 속도 제거
            } else {
                if (count > 0) { // 배포 가능한 작업이 있는 경우
                    answer.add(count); // 배포된 작업 수 저장
                    count = 0; // 카운트 초기화
                }
                day++; // 다음 날로 진행
            }
        }


        // 마지막 배포가 남아있을 경우 처리
        if (count > 0) {
            answer.add(count);
        }

        // 결과 출력 및 배열로 변환
        return answer.stream().mapToInt(a -> a).toArray();
    }
}
