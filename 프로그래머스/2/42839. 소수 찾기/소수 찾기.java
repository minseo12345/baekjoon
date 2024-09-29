import java.io.*;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        Set<Integer> nums = new HashSet<>();
        boolean[] visited = new boolean[numbers.length()];
        dfs(numbers, "", visited, nums);
        for (int a : nums) {
            if (primeNum(a)) {
                answer++;
            }
        }
        return answer;
    }

    public void dfs(String numbers, String s, boolean[] visited, Set<Integer> nums) {

        if (!s.equals("")) {
            nums.add(Integer.valueOf(s));
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(numbers, s + numbers.charAt(i), visited, nums);
                visited[i] = false;
            }
        }
    }

    public boolean primeNum(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
