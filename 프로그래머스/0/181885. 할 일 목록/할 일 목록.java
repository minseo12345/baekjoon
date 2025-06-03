import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> result = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                result.add(todo_list[i]);
            }
        }
        
        String[] answer = new String[result.size()];
        return result.toArray(answer);
    }
}
