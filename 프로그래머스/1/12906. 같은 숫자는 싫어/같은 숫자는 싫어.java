
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        
        for(int num : arr){
          // 스택의 값이 비어있거나 , 스택의 최상단 값이 배열의 원소와 같지 않으면 연속한 값이 아니므로 스택에 push함
            if( stack.isEmpty() || stack.peek() != num){
                stack.push(num);
            }
        }
        answer = new int[stack.size()];
        for(int i = answer.length - 1; i >= 0; i--){
            answer[i] = stack.pop();

        }
        return answer;
    }
}
