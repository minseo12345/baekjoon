import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<String> stack = new Stack<>();

        /**
         * 문자열이 닫는 괄호로 시작하면 false 리턴
         */
        if(s.charAt(0) == ')'){
            return false;
        }

        /**
         * 문자열의 각 인덱스를 접근하여 '('이면 스택에 넣고
         * ')' 이면 스택에서 꺼내어 괄호의 짝을 맞춘다.
         */
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(String.valueOf(s.charAt(i)));
            }else if(s.charAt(i) == ')'){
                if (stack.isEmpty()) {
                    return false; // 닫는 괄호가 남아있다는 뜻
                }
                stack.pop();
            }
        }

        /**
         * 스택이 비어있지 않다면 괄호의 짝이 맞지 않았단 것으로 판별하여 false 리턴.
         */
        if(!stack.isEmpty()){
            answer = false;
        }else{
            answer = true;
        }
        return answer;
    }
}