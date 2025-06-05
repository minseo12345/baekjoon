import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); 
            } else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("baabaa")); 
        System.out.println(sol.solution("cdcd"));   
    }
}
