import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String word) {
        int answer = 0;
        char [] words = {'A','E','I','O','U'};
        ArrayList<String> a = new ArrayList<>();
        dfs("",words,a);
        answer = a.indexOf(word);
        return answer+1;
    }
    public void dfs(String word,char[] words ,ArrayList<String> a ){
        if(word.length()>5){
            return;
        }

        if(!word.isEmpty()){
            a.add(word);
        }
        for(char c : words){
            dfs(word + c ,words,a);
        }
    }


}