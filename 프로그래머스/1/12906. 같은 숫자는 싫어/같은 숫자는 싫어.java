
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]); // 연속된 값인지를 비교하기 위해 스택 최상단에 배열의 첫 값을 저장
        for(int i = 1; i<arr.length; i++){
            // 스택의 최상단 값과 현재 배열의 값을 비교하여 같지 않다면 연속된 값이 아니므로 스택에 추가
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        answer = new int[stack.size()];
        for(int i = answer.length - 1; i >= 0; i--){
            answer[i] = stack.pop(); 
        }
        return answer;
    }
}
