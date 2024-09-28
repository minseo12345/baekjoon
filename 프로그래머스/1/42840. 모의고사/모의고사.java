import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];

        int [] a = {1,2,3,4,5};
        int [] b = {2,1,2,3,2,4,2,5};
        int [] c = {3,3,1,1,2,2,4,4,5,5};

        int [] count = new int[3];

        for(int i =0; i<answers.length; i++){
            if(answers[i] == a[i%5]) count[0]++;
            if(answers[i] == b[i%8]) count[1]++;
            if(answers[i] == c[i%10]) count[2]++;
        }

        int max = Math.max(count[0],Math.max(count[1],count[2]));

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i =0; i<count.length; i++){

            if(max == count[i]){
                arrayList.add(i+1);
            }
        }
        answer = new int[arrayList.size()];

        for(int i =0; i< answer.length; i++){
            answer[i] = arrayList.get(i);
        }
        return answer;

    }
}