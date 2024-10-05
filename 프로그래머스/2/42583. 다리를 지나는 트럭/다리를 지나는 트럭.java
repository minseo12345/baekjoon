import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int weightOnBridge = 0; // 다리 위에 있는 트럭들의 총 무게를 저장
        int index = 0;      // 다리를 기다리고 있는 트럭의 인덱스를 나타냄
        Queue<Integer> queue = new LinkedList<>();

        // 처음엔 다리 위에 트럭이 없으므로 다리 길이만큼 큐를 0으로 채움
        for(int i =0; i<bridge_length; i++){
            queue.add(0);   // 다리 길이 만큼 큐테 0을 추가 (트럭이 없음)
        }


        while (!queue.isEmpty()){
            answer++;
            weightOnBridge -= queue.poll(); // 맨 앞 트럭의 무게를 저장

            // 대기 중인 트럭이 있는지 확인
            if(index<truck_weights.length){
                // 다음 트럭을 다리에 올렸을 때 무게 제한을 넘지 않으면
                if(weightOnBridge + truck_weights[index] <= weight){
                    queue.add(truck_weights[index]);    // 트럭을 다리에 추가
                    weightOnBridge += truck_weights[index]; // 다리 위의 총 무게를 최신화
                    index++;
                }else {
                    // 다리에 트럭을 올릴 수 없는 경우 0을 추가하여 빈 공간임을 표시
                    queue.add(0);
                }
            }



        }
        return answer;
    }
}