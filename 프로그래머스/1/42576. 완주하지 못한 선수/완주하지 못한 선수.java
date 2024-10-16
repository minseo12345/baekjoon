import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String,Integer> hashMap = new HashMap<>();

        for(String i : participant){
            hashMap.put(i, hashMap.getOrDefault(i,0)+1);
        }

        for(String i : completion){
            hashMap.put(i,hashMap.get(i)-1);
        }

        for(String i : hashMap.keySet()){
            if(hashMap.get(i) !=0){
                answer = i;
            }
        }
        return  answer;
    }
}