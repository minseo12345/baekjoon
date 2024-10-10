import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i =0; i< commands.length; i++){
            int a = commands[i][0]-1;
            int b = commands[i][1];
            int c = commands[i][2]-1;

            int[] d = Arrays.copyOfRange(array, a, b);

            Arrays.sort(d);

            answer[i] = d[c];
        }

        return answer;
    }
}
